package com.springcourse.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.springcourse.di.service.GreetingService;
import com.springcourse.di.service.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig
{
    @Bean
    public GreetingServiceFactory greetingServiceFactory()
    {
        return new GreetingServiceFactory();
    }

    @Bean
    @Primary
    @Profile("en")
    public GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.getPrimaryGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    public GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.getPrimaryGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    public GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.getPrimaryGreetingService("de");
    }
}
