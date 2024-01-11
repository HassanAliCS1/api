package com.email.api.controller;

import com.email.api.model.CustomerOrder;
import com.email.api.model.CustomerMessage;
import com.email.api.model.SendEmailRequest;
import com.email.api.service.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmailController {

    private final EmailService svc;

    public EmailController(EmailService svc) {
        this.svc = svc;
    }

    @GetMapping ("/")
    public String index() {

        return "index";
    }

    @GetMapping ("/contactUs")
    public String contactUs() {

        return "contactUs";
    }

    @GetMapping ("/orderNow")
    public String orderNow() {

        return "orderNow";
    }

    @PostMapping("/contactUsByEmail")
    public String contactUsByEmail(@ModelAttribute("message") CustomerMessage message) {
        var dtoMessage = new SendEmailRequest(
                null,
                null,
                ("Customer Name: " + message.firstName() + " " + message.lastName() +
                        " Customer Email: " + message.email() +
                        " Customer Message: " + message.message()
                ));
        svc.sendEmailToOwner(dtoMessage);
        return "redirect:/";
    }

    @PostMapping("/notifyCustomerAndOwner")
    public String notifyCustomerAndOwner(CustomerOrder customerOrder) {

        var dtoCustomer = new SendEmailRequest(
                customerOrder.email(),
                null,
                null);
        var dtoOwner = new SendEmailRequest(
                null,
                null,
                ("Customer Name: " + customerOrder.firstName() + " " + customerOrder.lastName() +
                        " Customer Phone Number: " + customerOrder.phoneNumber() +
                        " Customer Email: " + customerOrder.email() +
                        " Customers Car: " + customerOrder.carMake() + " " + customerOrder.carModel() + " " + customerOrder.carYear()));

        svc.sendEmailToCustomer(dtoCustomer);
        svc.sendEmailToOwner(dtoOwner);

        return "redirect:/";
    }
    @GetMapping("/testHtmlEmail")
    public String testHTML() throws MessagingException {
        svc.sendHtmlEmail();

        return null;
    }





}
