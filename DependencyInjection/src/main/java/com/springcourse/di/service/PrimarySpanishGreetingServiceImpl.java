package com.springcourse.di.service;

public class PrimarySpanishGreetingServiceImpl implements GreetingService
{
    public static final String GREETING_SERVICE_IMPL_PRIMARY = "GrettingServiceImpl - Primaty - Spanish";

    @Override
    public String greet()
    {
        return GREETING_SERVICE_IMPL_PRIMARY;
    }
}
