package com.example.di.demo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.di.demo.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest
{
	private static final String GREETING = "Hello from Contructor Injector";
	private ConstructorInjectedController controller;

	@Before
	public void setUp() throws Exception
	{
		GreetingServiceImpl greetingService = new GreetingServiceImpl(GREETING);
		ConstructorInjectedController controller = new ConstructorInjectedController(greetingService);
		this.controller = controller;
	}

	@Test
	public void testSayHello()
	{
		assertEquals(GREETING, controller.sayHello());
	}

}
