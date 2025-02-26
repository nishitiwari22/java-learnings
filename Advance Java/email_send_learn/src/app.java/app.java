// package com.nishi;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.InternetAddress;
import javax.mail.MimeBodyPart;
import javax.mail.MimeMessage;
import javax.mail.MimeMultipart;

public class App {
    public static void main(String[] args) {
        System.out.println("preparing to send message");
        String message = "Hello Nishi, This is a security message check";
        String subject = "CodersArea : Confirmation";
        String to = "nishit5195@gmail.com";
        String form = "radhekrishna93@gmail.com";

        // sendEmail(message, subject, to, form);
        sendAttach(message, subject, to, form);

    }

    // This is responsible to send the message with attachement
    public static void sendAttach(String message, String subject, String to, String from) {

        // Variable for gmail
        String host = "smtp.gmail.com";

        // get the system properties
        Properties properties = System.getProperties();
        System.out.println("PROPERTIES " + properties);

        // Setting important info to properties object

        // host set
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable.", "true");
        properties.put("mail.smtp.auth", "true");

        // Step 1 : to get the session object...

    }

}
