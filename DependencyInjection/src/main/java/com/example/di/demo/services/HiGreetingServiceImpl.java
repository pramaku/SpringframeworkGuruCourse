package com.example.di.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class HiGreetingServiceImpl implements GreetingService
{
	private String greeting;

	public HiGreetingServiceImpl()
	{
		this.greeting = "Hi Greeting";
	}

	public HiGreetingServiceImpl(String greeting)
	{
		this.greeting = greeting;
	}

	@Override
	public String sayGreeting()
	{
		return greeting;
	}

}
