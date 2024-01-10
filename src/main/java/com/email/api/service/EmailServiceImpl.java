package com.email.api.service;

import com.email.api.model.SendEmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import static com.email.api.model.EmailContents.*;

@Service
public class EmailServiceImpl implements EmailService{

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmailToCustomer (SendEmailRequest sendEmailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(BUSINESSES_EMAIL);
        message.setTo(sendEmailRequest.outEmail());
        message.setSubject(SUBJECT_FOR_CUSTOMER);
        message.setText(BODY_FOR_CUSTOMER);

        mailSender.send(message);

        System.out.println("Mail sent to customer successfully");
    }

    @Override
    public void sendEmailToOwner(SendEmailRequest sendEmailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(BUSINESSES_EMAIL);
        message.setTo(OWNERS_EMAIL);
        message.setSubject(sendEmailRequest.subject());
        message.setText(sendEmailRequest.body());

        mailSender.send(message);

        System.out.println("Mail sent to owner successfully");
    }
}
