package com.mitu;
public class Manager {
private String name;
private String address;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
}
// In this Java program, we are creating an instance of this class using new keyword but in Spring, there
// are different ways to create an instance of a bean class without using new. Although, using new
// keyword is permitted but is not recommended since injection of properties and Auto-wiring does
// not work if you create a bean using new.
// Following are the ways to create a bean in Spring.





public class Appl {
@SuppressWarnings("resource")
public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
Manager man = (Manager)context.getBean("manager");
System.out.println(man.getName());
System.out.println(man.getAddress());
}
}

// Lets get in to this code. The id attribute is not mandatory and is only required when you want to
// access this bean in application or provide this bean as a dependency to some other bean.
// The id of a bean should be unique otherwise we will get an error at start up like
// org.springframework.beans.factory.parsing.BeanDefinitionParsingException: Configuration
// problem: Bean name  ̳test‘ is already used in this <beans> element.
// The scope of bean will be singleton by default, which means every time the bean is referred, same
// instance will be given. The scope of the bean can be changed by adding a scopeattribute in bean
// declaration.
// Bean properties referred in the propertyelement should have valid setter methods otherwise following
// error will be received.
// Bean property  ̳name‘ is not writable or has an invalid setter method.
// Spring automatically performs the string to number conversion when the type of a class property is
// numeric while the values provided in XML configuration file are there in string format. But , we
// will get a java.lang.NumberFormatException if the property is not possible to get converted to
// number.










package com.mitu;
@Component

public class Manager {
private String name;
private String address;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
}
// Explanation:
// We need to instruct Spring container to find our beans and tell it about the package where it should
// find the beans, in order for a bean to be auto-discoverable and instantiated. Hence, for
// instantiating annotated beans, we require to add below declaration in our Spring XML
// configuration file :
// <context:component-scan base-package= ―com.mitu‖ />
// If the bean annotated with @Componentannotation is outside of the package given in base-package
// attribute of this above element, then it will not be scanned and instantiated and thus won‘t be
// found. This bean can also be used in the same way as the bean in the previous method. Thus, only
// bean declaration methods differs while the method of using them remains the same as of the first.
// @Component annotation can only be applied at the class level. Applying it to some other location
// such as above a field will result it in a compiler error. The annotation @Component is not allowed
// for this location.
// If a bean is referred and it has not been annotated with @Component or declared in XML
// configuration then we will get an exception as show below.

// org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type
// [com.mitu.Manager] is defined
// Automatic instantiating a bean using @Component annotation needs that there must be a default
// constructor present in the class. As we know that, default constructor is a constructor without any
// arguments. If there is no constructor present in a class, then a default constructor is automatically
// created and used. If there is a constructor in your bean class which accepts some arguments then
// you have to create a default constructor yourself. If default constructor is not available, then
// following error will be generated.
// org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.mitu.User]: No
// default constructor found