package com.ipz.vetclinic.dict;

public enum Kind {

	DOG ("Dog"),
	CAT ("Cat"),
	HAMSTER ("Hamster"),
	BIRD ("Bird");

	private String caption;

	Kind(String caption) {
		this.caption = caption;
	}

}
