package com.ipz.vetclinic.services;

import com.ipz.vetclinic.dao.AccountDao;
import com.ipz.vetclinic.dao.ContactInfoDao;
import com.ipz.vetclinic.data.ContactInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	private AccountDao accountDao;


}
