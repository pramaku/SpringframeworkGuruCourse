package com.example.di.demo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.di.demo.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest
{
	private static final String GREETING = "Hello from property injector";
	private PropertyInjectedController controller;

	@Before
	public void setUp() throws Exception
	{
		this.controller = new PropertyInjectedController();
		this.controller.greetingService = new GreetingServiceImpl(GREETING);
	}

	@Test
	public void testSayHello()
	{
		assertEquals(GREETING, controller.sayHello());
	}

}
