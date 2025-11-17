Use the name and age bean to create a person bean
Can be done in two ways
    1. Method Call
    2. Method Parameter

--> System.out.println(context.getBean(Person.class));
This will throw exception as there are multiple beans of type Person.
To fix this we can use @Primary && @Qualifier annotation on one of the beans.

Please see App02SpringLevel02
