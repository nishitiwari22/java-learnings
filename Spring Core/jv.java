Constructor Injection – injecting simple Java types
We inject simple Java types into a target bean using the Constructor Injection. The Empl class has
emplName as String , emplAge as int , and married as boolean. The constructor initializes all
these three fields. Following is the Empl.java file:
package org.mitu.Spring.second.constructioninjection.simplejavatype;
public class Empl
{
private String emplName;
private int emplAge;
private boolean married;
public Empl(String emplName, int emplAge, boolean married)
{
this.emplName = emplName;
this.emplAge = emplAge;
this.married = married;
}
@Override

public String toString()
{
return "Empl Name: " + this.emplName + " , Age:" + this.emplAge + ",
IsMarried: " + married;
}
}
Following is beans.xml file:

...
<bean id="empl" class="org.mitu.Spring.second.constructioninjection.simplejavatype.Empl">
<constructor-arg value="Rashmi Thorave" />
<constructor-arg value="28" />
<constructor-arg value="True" />
</bean>




<bean id="empl" class= "org.mitu.Spring.second.constructioninjection.simplejavatype.Empl">
<constructor-arg value="Rashmi Thorave" />
<constructor-arg value="True" />
<constructor-arg value="28" />
</bean>
...
If the orders in which constructor-arg is defined are not matching, then we will receive the following
exception:
Exception in thread "main" org.springframework.beans.factory.
UnsatisfiedDependencyException:
Error creating bean with name empl defined in the classpath resource [beans.xml]: Unsatisfied
dependency expressed through constructor argument with index 1 of type [int]: Could not convert
constructor argument value of type [java.lang.String] to required type [int]: Failed to convert
value of type 'java.lang.String' to required type 'int'; nested exception is
java.lang.NumberFormatException: For input string: "True"
Solution
The solution to this problem is to fix the order of elements sent. Either we modify the constructor-arg
order of the bean definition file or we use the index attribute of constructor-arg as follows:

...
<bean id="empl"
class="org.mitu.Spring.second.constructioninjection.simplejavatype.Empl">
<constructor-arg value="Rashmi Thorave" index="0" />
<constructor-arg value="True" index="2" />
<constructor-arg value="28" index="1" />
</bean>