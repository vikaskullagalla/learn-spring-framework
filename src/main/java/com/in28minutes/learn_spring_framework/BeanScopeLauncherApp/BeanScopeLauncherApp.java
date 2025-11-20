package com.in28minutes.learn_spring_framework.BeanScopeLauncherApp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{

}

@Configuration
@ComponentScan
public class BeanScopeLauncherApp {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext((BeanScopeLauncherApp.class))){
            //Normal class bean creates SINGLE INSTANCE of the bean and returns the same instance everytime you ask for it
            //Normal class has ONE INSTANCE per application context/IOC container
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            //Prototype class bean creates NEW INSTANCE of the bean everytime you ask for it
            //Prototype class has MANY INSTANCES per application context/IOC container
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
