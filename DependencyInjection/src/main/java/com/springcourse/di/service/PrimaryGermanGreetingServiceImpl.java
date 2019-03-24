package com.springcourse.di.service;

public class PrimaryGermanGreetingServiceImpl implements GreetingService
{
    public static final String GREETING_SERVICE_IMPL_PRIMARY = "GrettingServiceImpl - Primaty - German";

    @Override
    public String greet()
    {
        return GREETING_SERVICE_IMPL_PRIMARY;
    }

}
