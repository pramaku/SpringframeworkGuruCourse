package com.springcourse.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingServiceImpl implements GreetingService
{
    public static final String GREETING_SERVICE_IMPL_PRIMARY = "GrettingServiceImpl - German";

    @Override
    public String greet()
    {
        return GREETING_SERVICE_IMPL_PRIMARY;
    }

}
