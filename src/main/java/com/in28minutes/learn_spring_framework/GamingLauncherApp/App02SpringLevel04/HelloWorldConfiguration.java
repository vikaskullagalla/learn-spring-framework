package com.in28minutes.learn_spring_framework.GamingLauncherApp.App02SpringLevel04;

import org.springframework.beans.factory.annotation.Qualifier;
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
    public Person personMethodParameter(String name, int age, @Qualifier("OfficeAddressQualifier") Address address){
        return new Person(name,age,address); //2. Method Parameter
    }

    @Bean(name="person3")
    public Person person3(String name, int age, @Qualifier("NativeAddressQualifier") Address address){
        return new Person(name,age,address); //2. Method Parameter
    }

    @Bean(name="OfficeAddress")
    @Qualifier("OfficeAddressQualifier")
    public Address OfficeAddress(){
        return new Address("Global Axis H-Block", "Bangalore");
    }

    @Primary
    @Bean(name="PgAddress")
    @Qualifier("PgAddressQualifier")
    public Address PgAddress(){
        return new Address("PG, Inner Valley", "Bangalore");
    }

    @Bean(name="NativeAddress")
    @Qualifier("NativeAddressQualifier")
    public Address address(){
        return new Address("Seetharaganipalli", "Andhra Pradesh");
    }
}
