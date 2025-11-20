package com.in28minutes.learn_spring_framework.AdvancedSpring.LazyVsEagerInitialization.EagerInitilization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class ClassA{}

@Component
class ClassB{
    private ClassA classA;
    private ClassB(ClassA classA){
        System.out.println("Some Initialization Logic");
        this.classA = classA;
    }
}

@Configuration
@ComponentScan
public class EagerInitializationLauncherApp {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(EagerInitializationLauncherApp.class)){
            System.out.println(context);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
