package com.ipz.vetclinic.controller;

import com.ipz.vetclinic.dao.ContactInfoDao;
import com.ipz.vetclinic.dto.UserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {

	@Autowired
	ContactInfoDao contactInfoDao;

	@RequestMapping(
			value = "/initState",
			method = RequestMethod.GET)
	public String get(HttpServletRequest request) {
		return "{}";
	}

	@RequestMapping(value = "/login",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public String checkLogin(UserRequestDto user) {

		return "{}";
	}

	@RequestMapping(value = "/passwordChange", method = RequestMethod.POST)
	public String passwordChange() {
		return "";
	}

}
