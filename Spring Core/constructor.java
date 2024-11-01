// Constructor-based Dependency Injection
// Using constructor-based dependency injection, the container will raise a constructor with arguments
// each representing a dependency that we want to fix.
// The Spring resolves each argument primarily by type, followed by name of the attribute and index for
// clarity. See the below example of the configuration of a bean and its dependencies using
// annotations:
@Configuration
public class Application {
@Bean
public Item item1() {
return new ItemImpl1();
}
@Bean
public Store store() {
return new Store(item1());
}
}
// The @Configuration annotation indicates that the class is a source of bean definitions. Also, it is
// possible to add it to multiple configuration classes.
// The @Bean annotation is used on a method for a bean definition. If we don‘t specify a custom name,
// the bean name will default to the method name.


// For a bean with the default singleton scope, Spring first checks if a cached instance of the bean
// already exists and only creates a new one if it is not existing. If we‘re using the prototype scope,
// the container returns a new bean instance for each of the method call.
// Following is one more way to create the configuration of the beans is through XML configuration:
<bean id="item1" class="org.baeldung.store.ItemImpl1" />
<bean id="store" class="org.baeldung.store.Store">
<constructor-arg type="ItemImpl1" index="0" name="item" ref="item1" />
</bean>
// Constructor Injection is the process of injecting the dependencies of an object through its constructor
// argument at the time of instantiating it. In other words, we can say that dependencies are supplied
// as an object through the object's own constructor. The bean definition can use a constructor with
// any number of arguments to initiate the bean, as shown here:
public class EmplServiceImpl implements EmplService
{
private EmplDao emplDao = null;
public EmplServiceImpl(EmplDao emplDao)
{
this.emplDao = emplDao;
}
}
// In the preceding code, the object of the EmplDao emplDao type is injected as a constructor argument
// to the EmplServiceImpl class. We need to configure bean definition in the configuration file that
// will do Constructor Injection. The Spring bean XML configuration tag <constructor-arg> is used
// for Constructor Injection:

...
<bean id="emplService"
class="org.mitu.Spring.second.dependencyinjection.EmplServiceImpl">
<constructor-arg ref="emplDao" />
</bean>
<bean id="emplDao"
class="org.mitu.Spring.second.dependencyinjection.EmplDaoImpl">
</bean>

// In the above pseudo-code, there is a Has-A relationship between the classes, which is
// EmplServiceImpl HAS-A EmplDao . Here, we inject a user-defined object as the source bean into

// a target bean using Constructor Injection. Once we have the emplDao bean to inject it into the
// target emplService bean, we need another attribute called ref —its value is the name of the ID
// attribute of the source bean, which in our case is "emplDao" .