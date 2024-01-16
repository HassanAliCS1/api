package com.email.api.service;


import com.email.api.model.SendEmailRequest;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import static com.email.api.model.EmailContents.*;
import static com.email.api.model.HtmlEmail.*;

@Service
public class EmailServiceImpl implements EmailService{

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmailToCustomer (SendEmailRequest sendEmailRequest) throws MessagingException {
        try{
            //SimpleMailMessage message = new SimpleMailMessage();
            MimeMessage message = mailSender.createMimeMessage();

            message.setFrom(BUSINESSES_EMAIL);
            //message.setTo(sendEmailRequest.outEmail());
            message.setRecipients(MimeMessage.RecipientType.TO, sendEmailRequest.outEmail());
            message.setSubject(SUBJECT_FOR_CUSTOMER);
            //message.setText(BODY_FOR_CUSTOMER);

            String htmlContent = HTML_EMAIL_CONTENTS_FOR_CUSTOMER;
            message.setContent(htmlContent, "text/html; charset=utf-8");

            mailSender.send(message);

            System.out.println("Mail sent to customer successfully");
        }
        catch (MailException e){
            System.out.println("FAILED TO SEND MAIL to customer");
        }


    }

    @Override
    public void sendEmailToOwner(SendEmailRequest sendEmailRequest) {
        try{
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(BUSINESSES_EMAIL);
        message.setTo(OWNERS_EMAIL);
        message.setSubject(SUBJECT_FOR_OWNER);
        message.setText(sendEmailRequest.body());

        mailSender.send(message);

        System.out.println("Mail sent to owner successfully");}
        catch(MailException e){
            System.out.println("FAILED TO SEND MAIL to owner");
        }
    }



}
