Exception handling running Application.java
We can get the following while connecting to broker URL exception:
tcp://localhost:61616. Reason: Java.net.ConnectException: Connection refused: connect.
This exception will come if the message broker service is not up, so we need to make sure that
ActiveMQ is running, as shown here:
Exception in thread "main"
org.springframework.jms.UncategorizedJmsException: Uncategorized
exception occurred during JMS processing; nested exception is
javax.jms.JMSException: Could not connect to broker URL:
tcp://localhost:61616. Reason: java.net.ConnectException:

Connection refused: connect at
org.springframework.jms.support.JmsUtils.convertJmsAccessException (JmsUtils.java:316)

Sending an HTML E-mail

It is assumed that our computer, localhost is connected to the Internet and capable of sending an e-
mail.

Here we are using setContent() method to set content whose second argument is "text/html" to specify
that the HTML content is included in the message. Using this example, we can send as big as
HTML content we like.
// File Name HtmlEmail.java
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
public class HtmlEmail
{
public static void main(String [] args)
{
// Email Id of receiver
String to = "abc@xyz.com";

// Sender's email ID
String from = "data@xyz.com";

// We are sending email from localhost
String host = "localhost";

// Get properties of system
Properties properties = System.getProperties();

// Setup the mail server
properties.setProperty("mail.smtp.host", host);

// Get the default Session object.

Session ssn = Session.getDefaultInstance(properties);
try
{
// Create a default MimeMessage object.
MimeMessage msg = new MimeMessage(ssn);

// From: header field of the header.
msg.setFrom(new InternetAddress(from));

// To: header field of the header.
msg.addRecipient(Message.RecipientType.TO,new InternetAddress(to));

// Subject: header field
msg.setSubject("Hi! This is subject.");

// Actual message
msg.setContent("<h1>This is your message</h1>", "text/html");

// Send message
Transport.send(msg);
System.out.println("Message is sent successfully!");
}
catch (MessagingException e)
{
e.printStackTrace();
}
}
}

Output:

$ java HtmlEmail
Message is sent successfully!


Sending email with attachment
JavaMail API provides some useful classes like BodyPart, MimeBodyPart etc for sending email with
attachment. Let‘s see the steps of sending email using JavaMail API first. For sending the email
using JavaMail API, we need to load the two jar files:
mail.jar
activation.jar
So wee need to download these jar files (or) go to the Oracle site to download the latest version of
them.
We need to go with 7 steps for sending attachment with email.
 Create the session object
 Compose the message
 Create object of MimeBodyPart and set your message text
 Create new MimeBodyPart object and set DataHandler object to this object
 Create Multipart object and add MimeBodyPart objects to this object
 Set the multiplart object to the message object
 Finally, send the message

Example of sending email with attachment in Java
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
class SendWithAttachment
{
public static void main(String [] args)
{
String to="abc@xyz.com"; // Receiver‘s email ID
final String user="sonoojaiswal@javatpoint.com"; // Sender's email ID
final String password="xxxxx"; // Password

// First: get the session object
Properties properties = System.getProperties();
properties.setProperty("mail.smtp.host", "mail.xyz.com");

properties.put("mail.smtp.auth", "true");

Session ssn = Session.getDefaultInstance(properties, new

javax.mail.Authenticator()

{
protected PasswordAuthentication getPasswordAuthentication()
{
return new PasswordAuthentication(user,password);
} });

// Second: compose message
try{
MimeMessage msg = new MimeMessage(ssn);
msg.setFrom(new InternetAddress(user));
msg.addRecipient(Message.RecipientType.TO,new
InternetAddress(to));
msg.setSubject(―Hi Message‖);

// Third: create MimeBodyPart object and set our message text
BodyPart msgBodyPart1 = new MimeBodyPart();
msgBodyPart1.setText("This is actual message");

//Fourth: create new MimeBodyPart object and set DataHandler object to this object
MimeBodyPart messageBodyPart2 = new MimeBodyPart();

String file = "SendWithAttachment.java";
DataSource source = new FileDataSource(file);
msgBodyPart2.setDataHandler(new DataHandler(source));
msgBodyPart2.setFileName(file);

//Fifth: Create Multipart object and add MimeBodyPart objects to this object
Multipart multipart = new MimeMultipart();
multipart.addBodyPart(msgBodyPart1);
multipart.addBodyPart(msgBodyPart2);

//Sixth: Set the multiplart object to the message object
msg.setContent(multipart);

//Seventh: send the message
Transport.send(msg);

System.out.println("The Message is sent successfully!");
}
catch (MessagingException e)
{
e.printStackTrace();
}
}
}

As you can see in the above code, total 7 steps are followed to send email with attachment. Now run
this program by :
Load the jar file c:\> set classpath=mail.jar;activation.jar;.;
Compile the source file c:\> javac SendWithAttachment.java
Run using c:\> java SendWithAttachment

Sending Email in Java through Gmail Server
We can send email by using the SMTP server of gmail. It is good if you are don't have any SMTP
server and reliable. The SSL, Secure Socket Layer is basically used for security if we are sending
email through gmail server.

Sending Email through Gmail Server with SSL
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
class Gmailer
{
public static void send (String from,String password,String to,String sub,String message)

{
//Get properties object
Properties properties = new Properties();
properties.put("mail.smtp.host", "smtp.gmail.com");
properties.put("mail.smtp.socketFactory.port", "465");
properties.put("mail.smtp.socketFactory.class",
―javax.net.ssl.SSLSocketFactory");

properties.put("mail.smtp.auth", "true");
properties.put("mail.smtp.port", "465");
// Get Session object
Session session = Session.getDefaultInstance(properties, new

javax.mail.Authenticator()
{
protected PasswordAuthentication getPasswordAuthentication()
{
return new PasswordAuthentication(from,password);
}
});
// No compose the message
try {
MimeMessage msg = new MimeMessage(session);
msg.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
msg.setSubject(sub);
msg.setText(messsage);
// Now send the message
Transport.send(message);
System.out.println("The message sent successfully!");
}
catch (MessagingException e)
{
throw new RuntimeException(e);
}
}

}
public class SendMailSSL
{
public static void main(String[] args)
{
// from, password, to, subject, message
Mailer.send("from@gmail.com","xxxxx","to@gmail.com","Welcome!","Hi Friend");
}
}

As we can see in the above example, userid and password need to be authenticated. As, this program
illustrates, we can send email easily but change the username and password as per the account
used.


Receiving email in Java
For receiving email Store and Folder classes are used in collaboration with MimeMessage, Session
and Transport classes.
For sending the email using JavaMail API, we need to load the same jar files:
mail.jar
activation.jar
download these jar files (or) go to the Oracle site to download the latest version.

Steps for receiving the email using JavaMail API
 Create the session object
 Create the POP3 store object and connect with the pop server
 Create the folder object and open it
 Retrieve the messages from the folder in an array format and print it on screen
 Close the store and folder objects

Example : Receiving email in Java

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;

import javax.mail.Session;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Folder;
import com.sun.mail.pop3.POP3Store;
public class ReceiveMail
{
public static void receiveEmail(String pop3Host, String storeType, String user, String password)
{
try {
//First:Create the session object
Properties properties = new Properties();
properties.put("mail.pop3.host", pop3Host);
Session emailSession = Session.getDefaultInstance(properties);

//Second: create the POP3 store object and connect with the pop server
POP3Store emailStore = (POP3Store) emailSession.getStore(storeType);
emailStore.connect(user, password);

//Third: create the folder object and open it
Folder emailFolder = emailStore.getFolder("MYDATA");
emailFolder.open(Folder.READ_ONLY);

//Fourth:acquire the messages from the folder in an array element and print it
Message[ ] messages = emailFolder.getMessages();
for (int i = 0; i < messages.length; i++)
{
Message message = messages[i];
System.out.println("---------------------------------");
System.out.println("Email Number: " + (i + 1));
System.out.println("Subject: " + message.getSubject());
System.out.println("From: " + message.getFrom()[0]);
System.out.println("Text: " + message.getContent().toString());
}

//Fifth: close the store and folder objects
emailFolder.close(false);
emailStore.close();
}
catch (IOException e)
{
e.printStackTrace();
}
catch (NoSuchProviderException e)
{
e.printStackTrace();
}
catch (MessagingException e)
{
e.printStackTrace();
}
}
public static void main(String[] args)
{
String host = "mail.gmail.com"; // Change as per requirement
String mailStoreType = "pop3";
String username= "data@gmail.com";
String password= "xxxxx"; // User password
receiveEmail(host, mailStoreType, username, password);
}
}
In the above example, userid and password need to be authenticated. We can receive email easily but
change the username and password as per our account.
Receiving email with attachment
As we receive the email, we can receive the attachment also by using Multipart and BodyPart classes
available in JavaMail API.
import java.util.*;

import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.*;
import java.io.*;
class ReadAttachments
{
public static void main(String [] args) throws Exception
{
String host="mail.zoho.com";
final String user="mail@zoho.com";
final String password="xxxxx"; // Actual password

Properties properties = System.getProperties();
properties.setProperty("mail.smtp.host",host );
properties.put("mail.smtp.auth", "true");

Session session = Session.getDefaultInstance(properties,
new javax.mail.Authenticator()
{
protected PasswordAuthentication getPasswordAuthentication()
{
return new PasswordAuthentication(user, password);
}
});

Store store = session.getStore("pop3");
store.connect(host,user,password);

Folder folder = store.getFolder("MYDATA");
folder.open(Folder.READ_WRITE);

Message[] message = folder.getMessages();
for (int a = 0; a < message.length; a++)

{
System.out.println(message[a].getSentDate());
Multipart multipart = (Multipart) message[a].getContent();
for (int i = 0; i < multipart.getCount(); i++)
{
BodyPart bodyPart = multipart.getBodyPart(i);
InputStream stream = bodyPart.getInputStream();
BufferedReader reader = new BufferedReader
(new InputStreamReader(stream));

while (reader.ready()) {
System.out.println(reader.readLine());
}
System.out.println();
}
System.out.println();
}
folder.close(true);
store.close();
}
}

7.8 Forwarding an email
We can forward the received mail to someone else as we send emails. There are severalJavaMail
classes that are used to forward the messages to the destination. See the below example for
forwarding email.

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
public class ForwardingEMail
{
public static void main(String[] args) throws Exception
{
final String user="maya@abc.com"; // User ID

final String password="xxxxx"; // Password

// Get the session object
Properties properties = new Properties();
properties.put("mail.smtp.host", "mail.abc.com");
properties.put("mail.smtp.auth", "true");

Session session = Session.getDefaultInstance

(properties, new javax.mail.Authenticator()

{
protected PasswordAuthentication getPasswordAuthentication()
{
return new PasswordAuthentication(user,password);
}
});

// Get a Store object and connect to current host
Store store = session.getStore("pop3");
store.connect("mail.abc.com", user, password);

// Create a Folder object and open the folder
Folder folder = store.getFolder("MYDATA");
folder.open(Folder.READ_ONLY);

Message msg = folder.getMessage(1);

// Retrive all the information from the message
String from = InternetAddress.toString(msg.getFrom());
if (from != null)
{
System.out.println("From: " + from);
}
String replyTo = InternetAddress.toString( msg.getReplyTo());

if (replyTo != null)
{
System.out.println("Reply-to: " + replyTo);
}
String to = InternetAddress.toString ( msg.getRecipients
(Message.RecipientType.TO));

if (to != null)
{
System.out.println("To: " + to);
}

String subject = msg.getSubject();
if (subject != null)
{
System.out.println("Subject: " + subject);
}
Date sent = msg.getSentDate();
if (sent != null)
{
System.out.println("Sent: " + sent);
}
System.out.println(msg.getContent());

// Compose the message to forward
Message msg2 = new MimeMessage(session);
msg2.setSubject("Fwd: " + message.getSubject());
msg2.setFrom(new InternetAddress(from));
msg2.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

// Create your new message part
BodyPart messageBodyPart = new MimeBodyPart();
messageBodyPart.setText("Original message is: ");

// Create a multi-part to combine the parts
Multipart multipart = new MimeMultipart();
multipart.addBodyPart(messageBodyPart);

// Create and fill part for the forwarded content
messageBodyPart = new MimeBodyPart();
messageBodyPart.setDataHandler(message.getDataHandler());

// Add part to multi part
multipart.addBodyPart(messageBodyPart);

// Associate multi-part with message
msg2.setContent(multipart);

// Send message
Transport.send(msg2);
System.out.println("The message is forwarded!");
}
}