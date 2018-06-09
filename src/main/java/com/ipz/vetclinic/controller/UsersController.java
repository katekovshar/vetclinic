package com.ipz.vetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(UsersController.PATH)
public class UsersController {

	public static final String PATH = "/users";

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(ModelMap model, HttpServletRequest request) {
		return "";
	}

	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String refreshList(ModelMap model, HttpServletRequest request) {
		return "";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String createPost(ModelMap model, HttpServletRequest request) {
		return "";
	}

	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(ModelMap model, @RequestParam("id") long id, HttpServletRequest request) {
		return "";
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String edit(ModelMap model, @RequestParam("id") long id, HttpServletRequest request) {
		return "";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(ModelMap model, RedirectAttributes redirectAttrs) {
		return "";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(ModelMap model, @RequestParam("id") long id, HttpServletRequest request, RedirectAttributes redirectAttrs) {
		return "";
	}

}

