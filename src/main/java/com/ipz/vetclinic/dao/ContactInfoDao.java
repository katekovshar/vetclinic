package com.ipz.vetclinic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.ipz.vetclinic.data.ContactInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class ContactInfoDao {

	public static final String TABLE_NAME = "contactInfo";
	@PersistenceContext
	private EntityManager entityManager;

	public ContactInfo getContactInfoById(long id) {
		return entityManager.find(ContactInfo.class, id);
	}

	public List loadContactInfos() {
		return entityManager.createNativeQuery("SELECT * FROM " + TABLE_NAME).getResultList();
	}

	public void deleteContactInfo(long id) {
		ContactInfo info = entityManager.find(ContactInfo.class, id);
		entityManager.remove(info);
	}

	public void addNewContactInfo(String email, String phone) {
		ContactInfo contactInfo = new ContactInfo(email, phone);
		entityManager.getTransaction().begin();
		entityManager.persist(contactInfo);
		entityManager.getTransaction().commit();
	}

}
