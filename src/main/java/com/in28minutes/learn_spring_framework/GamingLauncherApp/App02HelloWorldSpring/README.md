If we run an application, a JVM would be initialized
Inside JVM we would want to create a spring context, we want to manage "name" and we want spring framework to do that.

How to do that?
1. Launch a spring context
2. Configure the things that we want spring to manage - @Configuration






Inside JVM, a class loader would be initialized
Class loader would load the class files
Class loader would load the dependencies
Class loader would load the dependencies of the dependencies
This process would continue until all the dependencies are loaded
JVM would load the class files
JVM would execute the main method