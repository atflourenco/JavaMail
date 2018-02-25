/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mail;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author soft2
 */
public class Email {

  public void ConfiguraEmail() throws MessagingException {
    Properties props = new Properties();

    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");
    Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {

      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("seuemail@gmail.com", "suasenha");
      }
    });
    session.setDebug(true);

    Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress("seuemail@gmail.com"));
    Address[] toUser = InternetAddress.parse("seuemail@gmail.com");
    message.setRecipients(Message.RecipientType.TO, toUser);
    message.setSubject("Enviando email com JavaMail");
    message.setText("Enviei este email usando minha conta com Gmail com JavaMail");
    Transport.send(message);

  }
}
