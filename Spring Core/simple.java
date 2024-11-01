package org.mitu.Spring.second.constructioninjection.simplejavatype;

public class Empl {
    private String emplName;
    private int emplAge;
    private String emplId;

    Empl(String emplName, int emplAge, String emplId) {
        this.emplName = emplName;
        this.emplAge = emplAge;
        this.emplId = emplId;
    }

    Empl(String emplName, String emplId, int emplAge) {
        this.emplName = emplName;
        this.emplId = emplId;
        this.emplAge = emplAge;
    }

@Override
public String toString()
{
return "Empl Name: " + emplName + ", EmplAge: " + emplAge + ",
Empl Id: " + emplId;
}
}The

beans.xml file, will
be like this:

...<
bean id = "empl"class="org.mitu.Spring.second.constructioninjection.simplejavatype.Empl"><constructor-arg value="Rashmi Thorave" />
<constructor-arg value="534" />
<constructor-arg value="28" />
</bean>
...
Spring chooses
the wrong
constructor to
create the
bean.The preceding
bean definition
has been
written in
the hope
that Spring
will choose
the second
constructor as
Rashmi Thorave for emplName,534 for emplId,and 28 for
emplAge.But the
actual output
will be:
Empl Name:
Rashmi Thorave, Empl Age:534,
Empl Id:
28