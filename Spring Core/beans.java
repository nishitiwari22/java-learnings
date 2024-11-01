@Bean
public Store store()
{
Store store = new Store();
store.set(item1());
return store;
}
We can also use XML for the same configuration of the beans:
<bean id="store" class="org.baeldung.store.Store">
<property name="item" ref="item1" />
</bean>
// Constructor-based and setter-based types of injection can be combined together for the same bean.
// The Spring documentation recommends using constructor-based injection for compulsory
// dependencies, and setter-based injection for optional ones.
// The setter-based D.I. is the method of injecting the dependencies of an object using the setter method.
// In setter injection, the Spring container uses set() of the Spring bean class to assign a dependent
// variable to the bean property from the bean configuration file. The setter method is more
// convenient to inject more dependencies since a large number of constructor arguments makes it
// clumsy.
// In the EmplServiceImpl.java class, you'll ind the following code:
public class EmplServiceImpl implements EmplService
{
private EmplDao emplDao;
public void setEmplDao(EmplDao emplDao)
{
this.emplDao = emplDao;
}
}
In the EmplDaoImpl.java class, we will find the following code:
public class EmplDaoImpl implements EmplDao
{
// ...

// }
// In the given pseudo-code, the EmplServiceImpl class defined the setEmplDao() method as the setter
// method where EmplDao is the property of this class. This method injects values of the emplDao
// bean from the bean configuration file before making the emplService bean available to the
// application.
// The Spring bean XML configuration tag <property> is used to configure properties. The ref attribute
// of property elements is used to specify the reference of another bean.
// In the beans.xml file, will have the following code:

<bean id="emplService" class="org.mitu.Spring.second.dependencyinjection.EmplServiceImpl">
<property name="emplDao" ref="emplDao" />
</bean>
<bean id="emplDao" class="org.mitu.Spring.second.dependencyinjection.EmplDaoImpl">
</bean>