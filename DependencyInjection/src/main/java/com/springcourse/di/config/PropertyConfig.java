package com.springcourse.di.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.springcourse.di.service.DataSource;
import com.springcourse.di.service.JmsSource;

@Configuration
@PropertySources({ @PropertySource("classpath:datasource.properties") })
public class PropertyConfig
{
    @Value("${data.JAVA_HOME}")
    String user;

    @Value("${data.password}")
    String password;

    @Value("${data.url}")
    String url;

    @Value("${jms.user}")
    String jmsUser;

    @Value("${jms.password}")
    String jmsPas;

    @Value("${jms.queue_name}")
    String jmsUri;

    @Autowired
    Environment env;

    @Bean
    public DataSource dataSource()
    {
        DataSource dataSource = new DataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        dataSource.setEnv(env.getProperty("JAVA_HOME"));
        return dataSource;
    }

    @Bean
    public JmsSource jmsSource()
    {
        JmsSource jmsSource = new JmsSource();
        jmsSource.setUser(jmsUser);
        jmsSource.setPassword(jmsPas);
        jmsSource.setQueueName(jmsUri);
        return jmsSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolder()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
