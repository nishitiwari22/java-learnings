// Spring's e-mail sender
// It is the e-mail API-specific Java file. It provides the definition of the sendEmail() method, which is
// used to send the actual e-mail to the recipient:
package org.mitu.Spring.fourth.mail;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
public class MyEmailService
{
private MailSender ms;
public void sendEmail(String to, String subject, String message)
{
// creates a simple e-mail object
SimpleMailMessage mail = new SimpleMailMessage();
mail.setTo(to);
mail.setSubject(subject);
mail.setText(message);

// sends the e-mail
ms.send(mail);
}
}


// The MessageSender.java file – Spring JMS Template
// The MessageSender class used for sending a message to the JMS queue as given in the code below:
// package org.mitu.Spring.fourth.JMS.Message;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jms.core.JmsTemplate;
// import org.springframework.stereotype.Component;
// @Component
// public class MsgSender
// {
// @Autowired
// private JmsTemplate jt;
// public void send(final Object Object)
// {
// jt.convertAndSend(Object);
// }
// }




