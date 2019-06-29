package com.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.petclinic.services.OwnerService;

@Controller
public class OwnerController
{
	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService)
	{
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
	public String listOwners(Model model)
	{
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}

	@RequestMapping({"/owners/find", "/owners/find.html"})
	public String findOwner(Model model)
	{
		return "error";
	}
}
