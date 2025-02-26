// The Application class will have the main method, which calls the send() method to send a message, as
// shown in the following pseudo code:
// package org.mitu.Spring.fourth.JMS.Main;
import java.util.HashMap;
import java.util.Map;
// import org.mitu.Spring.mitu.JMS.Message.MessageSender;
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Application

{
public static void main(String[] args)
{
ApplicationContext context = new
ClassPathXmlApplicationContext("Spring.xml");
MessageSender messageSender = (MessageSender) context
.getBean("messageSender");
Map<String, String> message = new HashMap<String, String>();
message.put("Hello", "India");
message.put("city", "Nashik");
message.put("state", "Maharashtra");
message.put("country", "India");
messageSender.send(message);
System.out.println("Message Sent to JMS Queue: " + message);
}
}