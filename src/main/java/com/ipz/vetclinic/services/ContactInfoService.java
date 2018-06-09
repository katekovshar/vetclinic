package com.ipz.vetclinic.services;

import com.ipz.vetclinic.dao.ContactInfoDao;
import com.ipz.vetclinic.data.ContactInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactInfoService  {

	@Autowired
	private ContactInfoDao contactInfoDao;

	public ContactInfo getContactInfoById(long id) {
		return contactInfoDao.getContactInfoById(id);
	}



}
