package com.ipz.vetclinic.controller;

import com.ipz.vetclinic.dao.ContactInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Autowired
	ContactInfoDao contactInfoDao;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String checkLogin() {
		System.out.println(contactInfoDao.getContactInfoById(1));
		return "";
	}

	@RequestMapping(value = "/passwordChange", method = RequestMethod.POST)
	public String passwordChange() {
		return "";
	}

}
