package com.ipz.vetclinic.dao;

import com.ipz.vetclinic.data.Customer;
import com.ipz.vetclinic.data.Pet;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class CustomerDao {

	public static final String TABLE_NAME = "customer";
	@PersistenceContext
	private EntityManager entityManager;

	public Customer getCustomerById(long id) {
		return entityManager.find(Customer.class, id);
	}

	public List loadCustomers() {
		return entityManager.createNativeQuery("SELECT * FROM " + TABLE_NAME).getResultList();
	}

	public void deleteCustomer(long id) {
		Customer info = entityManager.find(Customer.class, id);
		entityManager.remove(info);
	}

	public void addNewCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
	}
}
