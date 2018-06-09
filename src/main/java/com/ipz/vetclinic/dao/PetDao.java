package com.ipz.vetclinic.dao;

import com.ipz.vetclinic.data.ContactInfo;
import com.ipz.vetclinic.data.Pet;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class PetDao {

	public static final String TABLE_NAME = "pet";
	@PersistenceContext
	private EntityManager entityManager;

	public Pet getPetById(long id) {
		return entityManager.find(Pet.class, id);
	}

	public List loadPets() {
		return entityManager.createNativeQuery("SELECT * FROM " + TABLE_NAME).getResultList();
	}

	public void deletePet(long id) {
		Pet info = entityManager.find(Pet.class, id);
		entityManager.remove(info);
	}

	public void addNewPet(Pet pet, long ownerId) {
		entityManager.persist(pet);
	}

}
