package com.springcourse.di.service;

import org.springframework.stereotype.Service;

@Service
public class HelloGreetingServiceImpl implements GreetingService
{
    public static final String GREETING_SERVICE_IMPL_HELLO = "GreetingServiceImpl - Hello";

    public HelloGreetingServiceImpl()
    {
        System.out.println("HelloGreetingServiceImpl initialize");
    }

    @Override
    public String greet()
    {
        return GREETING_SERVICE_IMPL_HELLO;
    }
}
