// Setter Injection for injecting collections
// In the Spring IoC container, beans can also access collections of the objects. Spring allows us to inject
// a collection of objects in a bean using Java's collection framework. Setter Injection can be used to
// inject collection of values into the Spring Framework. If we have a dependent object in the
// collection, we can inject this information using the ref element in the list, set, or map. See the
// below elements.
// •<list> : It describes a java.util.List type. A list can contain multiple bean , ref , value , null , another
// list , set , and map elements. The required conversion is automatically performed by BeanFactory.
// • <set> : It describes a java.util.Set type. A set will have multiple bean , ref , value , null , another set ,
// list , and map elements.
// • <map> : It describes a java.util.Map type. A map can contain zero or more <entry> elements, which
// describes a key and value.
// The Empl class is a class with an injecting collection. In the Empl.java class, we will have the
// following code:
package org.mitu.Spring.second.setterinjection;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Empl
{
private List<Object> lists;
private Set<Object> sets;
private Map<Object, Object> maps;
public void setLists(List<Object> lists)
{
this.lists = lists;
}
public void setSets(Set<Object> sets)
{
this.sets = sets;

}
public void setMaps(Map<Object, Object> maps)
{
this.maps = maps;
}
}
// The bean configuration file of this code is the one that injects each and every property of the Empl
// class.
// In the beans.xml file, we will have the following code:

...
<bean id="empl" class="org.mitu.Spring.second.setterinjection.Empl">
<property name="lists">
<list>
<value>Rashmi Thorave</value>
<value>Aniket Thorave</value>
<value>Rahul Thorave</value>
</list>
</property>
<property name="sets">
<set>
<value>Vihaan Thorave</value>
<value>Pravina Thorave</value>
</set>
</property>
<property name="maps">
<map>
<entry key="Key 1" value="Shiroli Bk"/>
<entry key="Key 2" value="Maharashtra"/>
</map>
</property>
</bean>
// ...
// In this pseudo code, we have injected values of all three setter methods of the Empl class. The List
// and Set instances are injected with the <list> and <set> tags. For the map property of the Empl
// class, we injected a Map instance using the <map> tag. Each entry of the <map> tag is specified
// with the <entry> tag that contains a key-value pair of the Map instance.







// Setter Injection with simple Java type
// Here, we inject string-based values using the setter method. The Empl class contains the emplName
// ield with its setter method.
// In the Empl.java class, we will have the following code:

package org.mitu.Spring.second.setterinjection;
public class Empl
{
String emplName;
public void setEmplName(String emplName)
{
this.emplName = emplName;
}
@Override
public String toString()
{
return "Empl Name: " + emplName;
}
}
In the beans.xml file, we will have the following code:

...
<bean id="empl" class="org.mitu.Spring.second.setterinjection.Empl">
<property name="emplName" value="Rashmi Thorave" />
</bean>
...
In this pseudo-code, the bean configuration file set the property value. In the Payroll.java class, lets
have the following code.
package org.mitu.Spring.second.setterinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXml.ApplicationContext;
public class Payroll
{
public static void main(String[] args)
{
ApplicationContext context = new
ClassPathXmlApplicationContext("beans.xml");
Empl empl = (Empl)
context.getBean("empl");
System.out.println(empl);
}
}
// The output after running the Payroll class will be as follows:

// INFO: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext
// @1ba94d: startup date [Sun Jun 28 10:11:36 IST 2019]; root of context hierarchy
// Jan 25, 2015 10:11:36 AM org.springframework.beans.factory.xml.XmlBeanDefinitionReader
// loadBeanDefinitions
// INFO: Loading XML bean definitions from class path resource [beans.xml]
// Empl Name: Rashmi Thorave