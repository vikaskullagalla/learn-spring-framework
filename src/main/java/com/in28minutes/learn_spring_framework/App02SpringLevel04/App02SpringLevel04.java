package com.in28minutes.learn_spring_framework.App02SpringLevel04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02SpringLevel04 {
    public static void main(String[] args){
        // 1. Launch a Spring Context
        var context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2. Configure the things that we want Spring to manage
        //GamingConfiguration - @Configuration
        //name() - @Bean

        // 3. Retrieve Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("personMethodCall"));//PgAddress() used
        System.out.println(context.getBean("personMethodParameter"));//@Qualifier("OfficeAddressQualifier") address is picked
        System.out.println(context.getBean("person3"));//@Qualifier("NativeAddressQualifier") address is picked
        System.out.println(context.getBean("NativeAddress"));//NativeAddress will be picked
        System.out.println(context.getBean(Address.class));//@Primary annotation is used
        System.out.println(context.getBean(Person.class));//Exception is fixed now using the @Primary annotation
    }
}
