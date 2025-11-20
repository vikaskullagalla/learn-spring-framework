Default Initialization for Spring beans: Eager
By default, Spring beans are initialized eagerly.
This means that the bean is initialized as soon as the application context is created.

Eager initialization is recommended:
- Errors in the spring configuration are detected early at application startup

However, you can configure beans to be initialized lazily using @Lazy annotation
@Lazy can be used on 
- class level
- method level
- constructor level
- Where @Component and @Bean are used

Lazy initialization is recommended for 
- beans that are not used frequently
- beans that are expensive to initialize
- beans that are not used at all

Eager:
Initialization Time - Bean initialized at the startup of the application.
Default - Eager is Default
Code Snippet - @Lazy(value=false) OR (Absence of @Lazy) 
Errors in Initialization - Errors will prevent application from starting up
Memory Consumption - More memory is consumed as all beans are initialized at startup
Recommended for - Most of your beans

Lazy:
Initialization Time - Bean initialized when it is first made use of in the application.
Default - NOT DEFAULT
Code Snippet - @Lazy OR @Lazy(value=true)
Errors in Initialization - Errors will result in runtime exceptions
Memory Consumption - Less memory is consumed as beans are initialized on demand
Recommended for - Beans that are very rarely used in application
