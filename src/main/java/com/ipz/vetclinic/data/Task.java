package com.ipz.vetclinic.data;

import com.ipz.vetclinic.dict.TaskStatus;

import java.util.Date;

public class Task extends Identifier {

	private Doctor responsible;
	private Pet pet;
	private TaskStatus taskStatus;
	private Date date;

	public Doctor getResponsible() {
		return responsible;
	}

	public void setResponsible(Doctor responsible) {
		this.responsible = responsible;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public TaskStatus getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
