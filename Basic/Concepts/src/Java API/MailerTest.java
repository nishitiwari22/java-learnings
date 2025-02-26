// The MailerTest class
// The MailerTest class has the main( ) method that will call the sendEmail() method of the
// MyEmailService class and send an e-mail:

import javax.swing.Spring;
// package org.mitu.Spring.fourth.mail;
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXml
public class MailerTest
{
public static void main( String[ ] args )
{
//Create the application context
ApplicationContext context = new

ClassPathXmlApplicationContext("Spring.xml");
//Get the mailer instance
EmailService emailService = (EmailService)context.getBean("emailService ");
//Send a composed mail
emailService.sendEmail("****@gmail.com",
"Email Test Subject",
"Email Testing body");
}
}

// The output of this application can be checked by opening the inbox of your email.
// Now check the Spring Java Messaging Service.
    
