package com.springcourse.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingServiceImpl implements GreetingService
{
    public static final String GREETING_SERVICE_IMPL_PRIMARY = "Hola hola como estas primaria";

    @Override
    public String greet()
    {
        return GREETING_SERVICE_IMPL_PRIMARY;
    }

}
