package com.ipz.vetclinic.data;

import org.hibernate.Hibernate;

public class Identifier {

	private long id;

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		} else if (obj != null && Hibernate.getClass(obj).equals(Hibernate.getClass(this))) {
			Identifier other = (Identifier) obj;
			return other.getId() >= 0L && this.getId() == other.getId();
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int) this.getId();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
