package com.ipz.vetclinic.dao;

import com.ipz.vetclinic.data.Account;
import com.ipz.vetclinic.data.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class AccountDao<A extends Account> {

	@PersistenceContext
	private EntityManager entityManager;

	private final Class<A> clazz;

	public AccountDao(Class<A> clazz) {
		this.clazz = clazz;
	}

	public A getById(long id) {
		return entityManager.find(clazz, id);
	}

	public List<A> load() {
		CriteriaQuery<A> criteria = entityManager.getCriteriaBuilder().createQuery(clazz);
		criteria.select(criteria.from(clazz));
		return entityManager.createQuery(criteria).getResultList();
	}

	public void delete(long id) {
		A a = entityManager.find(clazz, id);
		entityManager.remove(a);
	}

	public void save(A a) {
		entityManager.persist(a);
	}
}
