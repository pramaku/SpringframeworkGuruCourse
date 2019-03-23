package com.springcourse.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
public class HiSpanishGreetingServiceImpl implements GreetingService
{
    public static final String GREETING_SERVICE_IMPL_HELLO = "GreetingServiceImpl - Hi";

    public HiSpanishGreetingServiceImpl()
    {
        System.out.println("HiGreetingServiceImpl initialize");
    }

    @Override
    public String greet()
    {
        return GREETING_SERVICE_IMPL_HELLO;
    }
}
