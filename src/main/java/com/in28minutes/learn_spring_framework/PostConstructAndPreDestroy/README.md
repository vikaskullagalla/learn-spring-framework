@PostConstruct - This method is called after the bean is initialized
The PostConstruct annotation is used on a method that needs to be executed after dependency injection is done to perform any initialization. 
If we want to execute some initialization logic as soon as dependencies are ready, we can use @PostConstruct annotation.
For example, fetch some data from database or external service like that.


@PreDestroy - This method is called before the bean is destroyed
The PreDestroy annotation is used on a method as a callback notification to signal an instance that it is in the process of being removed by the container.
The PreDestroy typically used to release the resources used by the bean.
The PreDestroy annotation is used on a method that needs to be executed before the bean is destroyed to perform any cleanup. 
For example, close database connection or external service connection like that.
