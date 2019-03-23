package com.springcourse.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
public class HowAreYouSpanishGreetingServiceImpl implements GreetingService
{
    public static final String GREETING_SERVICE_IMPL_HELLO = "GreetingServiceImpl - HowAreYou";

    public HowAreYouSpanishGreetingServiceImpl()
    {
        System.out.println("HowAreYouGreetingServiceImpl initialize");
    }

    @Override
    public String greet()
    {
        return GREETING_SERVICE_IMPL_HELLO;
    }
}
