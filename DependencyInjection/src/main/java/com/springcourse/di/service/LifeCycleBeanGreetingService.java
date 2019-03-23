package com.springcourse.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBeanGreetingService implements GreetingService, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean
{
    private GreetingService greetingService;

    public LifeCycleBeanGreetingService(GreetingService greetingService)
    {
        System.out.println("-- Constructor --");
        this.greetingService = greetingService;
    }

    @Override
    public String greet()
    {
        return greetingService.greet();
    }

    @Override
    public void setBeanName(String name)
    {
        System.out.println(" -- Setting the bean name to " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {
        System.out.println(" -- Setting the beanFactory to " + beanFactory.toString());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        System.out.println(" -- Setting the applicationContext to " + applicationContext.toString());
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println(" -- After properties set -- ");

    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println(" -- destroying bean -- ");
    }

    @PostConstruct
    public void postContrcut()
    {
        System.out.println(" -- Post construct bean -- ");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("-- before destroying bean -- ");
    }

    public void beforeInit()
    {
        System.out.println("-- before init -- ");
    }

    public void afterInit()
    {
        System.out.println("-- after init -- ");
    }
}
