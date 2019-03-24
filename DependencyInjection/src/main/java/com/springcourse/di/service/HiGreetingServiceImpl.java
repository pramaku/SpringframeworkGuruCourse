package com.springcourse.di.service;

import org.springframework.stereotype.Service;

@Service
public class HiGreetingServiceImpl implements GreetingService
{
    public static final String GREETING_SERVICE_IMPL_HELLO = "GreetingServiceImpl - Hi";

    public HiGreetingServiceImpl()
    {
        System.out.println("HiGreetingServiceImpl initialize");
    }

    @Override
    public String greet()
    {
        return GREETING_SERVICE_IMPL_HELLO;
    }
}
