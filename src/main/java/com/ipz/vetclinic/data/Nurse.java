package com.ipz.vetclinic.data;

import com.ipz.vetclinic.dict.TaskStatus;

import java.util.List;

public class Nurse extends Account {

	private List<Task> tasks;

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public void changeTaskStatus(Task task, TaskStatus status) {
		task.setTaskStatus(status);
	}
}
