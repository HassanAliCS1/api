package com.email.api.service;

import com.email.api.model.SendEmailRequest;

public interface EmailService {

    void sendEmailToCustomer(SendEmailRequest sendEmailRequest);

    void sendEmailToOwner(SendEmailRequest sendEmailRequest);
}
