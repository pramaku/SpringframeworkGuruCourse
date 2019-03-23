package com.springcourse.di.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor
{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println(beanName);
        if (beanName.equals("lifeCycleBeanGreetingService"))
        {
            LifeCycleBeanGreetingService myBean = (LifeCycleBeanGreetingService) bean;
            myBean.beforeInit();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println(beanName);
        if (beanName.equals("lifeCycleBeanGreetingService"))
        {
            LifeCycleBeanGreetingService myBean = (LifeCycleBeanGreetingService) bean;
            myBean.afterInit();
        }
        return bean;
    }
}
