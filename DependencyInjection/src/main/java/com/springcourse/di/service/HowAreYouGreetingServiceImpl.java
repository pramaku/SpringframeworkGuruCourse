package com.springcourse.di.service;

import org.springframework.stereotype.Service;

@Service
public class HowAreYouGreetingServiceImpl implements GreetingService
{
    public static final String GREETING_SERVICE_IMPL_HELLO = "GreetingServiceImpl - HowAreYou";

    public HowAreYouGreetingServiceImpl()
    {
        System.out.println("HowAreYouGreetingServiceImpl initialize");
    }

    @Override
    public String greet()
    {
        return GREETING_SERVICE_IMPL_HELLO;
    }
}
