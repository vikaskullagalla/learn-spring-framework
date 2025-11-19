package com.in28minutes.learn_spring_framework.GamingLauncherApp.App02SpringLevel03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){}
record Address(String firstLine, String city){}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Vikas";
    }

    @Bean
    public int age(){
        return 28;
    }

    @Bean
    @Primary
    public Person personMethodCall(){
        return new Person(name(),age(),PgAddress()); //1. Method Call
    }

    @Bean
    public Person personMethodParameter(String name, int age, Address address){
        return new Person(name,age,address); //2. Method Parameter
    }

    @Bean(name="OfficeAddress")
    public Address OfficeAddress(){
        return new Address("Global Axis H-Block", "Bangalore");
    }

    @Bean(name="PgAddress")
    public Address PgAddress(){
        return new Address("PG, Inner Valley", "Bangalore");
    }

    @Bean(name="NativeAddress")
    @Primary
    public Address address(){
        return new Address("Seetharaganipalli", "Andhra Pradesh");
    }
}
