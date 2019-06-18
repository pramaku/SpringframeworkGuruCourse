package com.example.di.demo.services;

public class GreetingServiceFactory
{
	public GreetingService createGreetingService(String lang)
	{
		GreetingService result = null;
		switch(lang)
		{
		case "en":
			result = new EnglishGreetngServiceImpl();
			break;
		case "es":
			result = new SpanishGreetngServiceImpl();
			break;
		default:
			result = new HiGreetingServiceImpl();
			break;
		}
		return result;
	}
}
