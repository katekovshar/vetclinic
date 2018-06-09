package com.ipz.vetclinic.data;

import com.ipz.vetclinic.dict.Kind;

import java.util.List;

public class Doctor extends Account {

	private List<Kind> kindsSpecialisation;

	public List<Kind> getKindsSpecialisation() {
		return kindsSpecialisation;
	}

	public void setKindsSpecialisation(List<Kind> kindsSpecialisation) {
		this.kindsSpecialisation = kindsSpecialisation;
	}
}
