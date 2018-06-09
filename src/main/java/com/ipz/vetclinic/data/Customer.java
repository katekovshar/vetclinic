package com.ipz.vetclinic.data;

import java.util.List;

public class Customer extends Account {

	private List<Pet> petList;

	public List<Pet> getPetList() {
		return petList;
	}

	public void setPetList(List<Pet> petList) {
		this.petList = petList;
	}

}
