package com.email.api.service;

import com.email.api.model.SendEmailRequest;
import jakarta.mail.MessagingException;

public interface EmailService {

    void sendEmailToCustomer(SendEmailRequest sendEmailRequest) throws MessagingException;

    void sendEmailToOwner(SendEmailRequest sendEmailRequest);

}
