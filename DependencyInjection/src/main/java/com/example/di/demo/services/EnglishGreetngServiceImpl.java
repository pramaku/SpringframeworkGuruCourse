package com.example.di.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class EnglishGreetngServiceImpl implements GreetingService
{
	private String greeting;
	
	public EnglishGreetngServiceImpl()
	{
		this.greeting = "Hello Gurus In English";
	}
	
	public EnglishGreetngServiceImpl(String greeting)
	{
		this.greeting = greeting;
	}
	
	
	@Override
	public String sayGreeting()
	{
		return greeting;
	}

}
