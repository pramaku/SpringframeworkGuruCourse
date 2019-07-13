package com.example.petclinic.controllers;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.petclinic.services.OwnerService;

class OwnerControllerTest
{
	OwnerController ownerController;

	MockMvc mockMvc;

	@Mock
	OwnerService ownerService;
	@BeforeEach
	void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
		ownerController = new OwnerController(ownerService);
		mockMvc= MockMvcBuilders.standaloneSetup(ownerController).build();
	}

	@Test
	void testListOwners() throws Exception
	{
		mockMvc.perform(get("/owners")).andExpect(status().isOk()).andExpect(view().name("owners/index"));
	}

	@Test
	void testFindOwner() throws Exception
	{
		mockMvc.perform(get("/owners/find")).andExpect(status().isOk()).andExpect(view().name("error"));
	}

}
