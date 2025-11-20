package com.in28minutes.learn_spring_framework.AdvancedSpring.LazyVsEagerInitialization.LazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{}

@Component
@Lazy
class ClassB{
    private ClassA classA;
    private ClassB(ClassA classA){
        System.out.println("Some Initialization Logic");
        this.classA = classA;
    }
    public void doSomething(){
        System.out.println("Doing something");
    }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApp {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApp.class)){
            System.out.println("Initialization of context is completed");
            context.getBean(ClassB.class).doSomething();//Lazy initialization - ClassB initialization is delayed and only when it is required
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
