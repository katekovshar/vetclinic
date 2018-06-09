package com.ipz.vetclinic.services;

import com.ipz.vetclinic.data.Doctor;
import com.ipz.vetclinic.data.Identifier;
import com.ipz.vetclinic.data.Task;
import com.ipz.vetclinic.dict.TaskStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchedulerService extends Identifier {

	private List<Task> taskList;

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public List<Task> getTaskByStatus(TaskStatus status) {
		return taskList.stream().filter(task -> task.getTaskStatus().equals(status)).collect(Collectors.toList());
	}

	public List<Task> getTaskByResponsible(Doctor resposible) {
		return taskList.stream().filter(task -> task.getResponsible().equals(resposible)).collect(Collectors.toList());
	}


}
