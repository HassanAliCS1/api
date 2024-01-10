package com.email.api.model;

public record SendEmailRequest(
        String outEmail,
        String subject,
        String body
){

}


