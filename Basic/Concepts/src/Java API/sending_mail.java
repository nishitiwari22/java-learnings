import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class EmailSend {
    public static void main(String[] args) {
        String to = "hello@abc.com"; // Recipient's email
        String from = "data@xyz.com"; // Sender's email
        String host = "localhost"; // Sending email from localhost

        Properties properties = System.getProperties(); // Get system properties

        properties.setProperty("mail.smtp.host", host); // Setup the mail server

        Session session = Session.getDefaultInstance(properties); // Get the default session

        try {
            MimeMessage message = new MimeMessage(session); // Create a new email message
            message.setFrom(new InternetAddress(from)); // Set sender's email
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); // Set recipient
            message.setSubject("The Subject is here."); // Set email subject
            message.setText("Message: Hi Friend"); // Set email message

            Transport.send(message); // Send the message
            System.out.println("The message is sent successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
// This code sends a simple email using the JavaMail API. It specifies the
// recipient's email, sender's email, and the mail server (localhost). It sets
// up the email message with a subject and text. The email is then sent using
// the Transport class. When you run the program, it should display "The message
// is sent successfully!" if the email is sent successfully.


// Output

// $ java EmailSend
// The message is sent successfully!

// If we want to send an e-mail to multiple recipients then the following methods would be used to
// specify multiple e-mail IDs:

// void addRecipients(Message.RecipientType type, Address[] addresses) throws MessagingException

// Parameters:

// type − This would be set to TO, CC or BCC. Here TO represents original receiver of message, CC
// represents Carbon Copy and BCC represents Black Carbon Copy. Example:
// Message.RecipientType.TO
// addresses − This is an array of e-mail IDs. We would need to use InternetAddress() method while
// specifying email IDs.