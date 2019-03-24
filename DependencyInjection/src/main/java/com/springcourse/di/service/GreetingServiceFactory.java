package com.springcourse.di.service;

public class GreetingServiceFactory
{
    public GreetingService getPrimaryGreetingService(String lang)
    {
        switch (lang)
        {
        case "en":
            return new PrimaryGreetingServiceImpl();
        case "es":
            return new PrimarySpanishGreetingServiceImpl();
        case "de":
            return new PrimaryGermanGreetingServiceImpl();
        default:
            return new PrimaryGreetingServiceImpl();
        }
    }
}
