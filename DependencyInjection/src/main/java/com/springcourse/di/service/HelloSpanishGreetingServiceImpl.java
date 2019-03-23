package com.springcourse.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
public class HelloSpanishGreetingServiceImpl implements GreetingService
{
    public static final String GREETING_SERVICE_IMPL_HELLO = "GreetingServiceImpl - Hello";

    public HelloSpanishGreetingServiceImpl()
    {
        System.out.println("HelloGreetingServiceImpl initialize");
    }

    @Override
    public String greet()
    {
        return GREETING_SERVICE_IMPL_HELLO;
    }
}
