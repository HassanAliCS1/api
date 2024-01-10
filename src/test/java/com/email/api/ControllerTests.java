package com.email.api;

import com.email.api.controller.EmailController;
import com.email.api.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@WebFluxTest(controllers = EmailController.class)
public class ControllerTests extends TestBase{

    @MockBean
    EmailService svc;


    @Test
    void contactUsByEmailTest() {
        verifyPost("/contactUsByEmail");
        verify(svc,times(1)).sendEmailToOwner(sendOwnerMessageEmailRequest);
    }

    @Test
    void orderNowEmailTest() {
        verifyPost("/notifyCustomerAndOwner");

        verify(svc,times(1)).sendEmailToOwner(sendCustomerResponse);
        verify(svc,times(1)).sendEmailToOwner(sendOwnerOrderEmailRequest);
    }
}
