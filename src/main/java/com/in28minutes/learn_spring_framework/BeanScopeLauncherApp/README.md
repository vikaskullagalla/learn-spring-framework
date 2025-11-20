Default scope is Singleton

@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
ConfigurableBeanFactory.SCOPE_PROTOTYPE = Singleton
    Singleton creates SINGLE INSTANCE of the bean and returns the same instance everytime you ask for it.
    Singleton has ONE INSTANCE per application context/IOC container
    Frequently used

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
ConfigurableBeanFactory.SCOPE_PROTOTYPE = Prototype
    Prototype creates NEW INSTANCE of the bean everytime you ask for it.
    Prototype has MANY INSTANCES per application context/IOC container
    Rarely used




