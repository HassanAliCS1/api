package com.email.api.service;

import com.email.api.model.SendEmailRequest;
import jakarta.mail.MessagingException;

public interface EmailService {

    void sendEmailToCustomer(SendEmailRequest sendEmailRequest);

    void sendEmailToOwner(SendEmailRequest sendEmailRequest);

    void sendHtmlEmail() throws MessagingException;
}
