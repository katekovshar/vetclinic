package com.ipz.vetclinic.dict;

public enum Gender {

	MALE ("Male"),
	FEMALE ("Female");

	private String caption;

	Gender(String caption) {
		this.caption = caption;
	}

}
