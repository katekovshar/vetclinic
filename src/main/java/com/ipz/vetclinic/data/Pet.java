package com.ipz.vetclinic.data;

import com.ipz.vetclinic.dict.Gender;
import com.ipz.vetclinic.dict.Kind;

import java.util.List;

public class Pet extends Identifier {

	private String name;
	private int age;
	private Kind kind;
	private Gender gender;
	private int weight;
	private Customer owner;
	private List<Diagnos> diseaseHistory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public List<Diagnos> getDiseaseHistory() {
		return diseaseHistory;
	}

	public void setDiseaseHistory(List<Diagnos> diseaseHistory) {
		this.diseaseHistory = diseaseHistory;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
