package com.example.di.demo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.di.demo.services.GreetingServiceImpl;

public class SetterInjectedControllerTest
{
	private static final String GREETING = "Hello from Setter Injector";
	private SetterInjectedController controller;

	@Before
	public void setUp() throws Exception
	{
		GreetingServiceImpl greetingService = new GreetingServiceImpl(GREETING);
		controller = new SetterInjectedController();
		controller.setGreetingService(greetingService);
	}

	@Test
	public void testSayHello()
	{
		assertEquals(GREETING, controller.sayHello());
	}
}
