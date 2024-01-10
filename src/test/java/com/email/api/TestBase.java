package com.email.api;

import com.email.api.model.CustomerMessage;
import com.email.api.model.CustomerOrder;
import com.email.api.model.SendEmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.StatusAssertions;
import org.springframework.test.web.reactive.server.WebTestClient;

import static com.email.api.model.EmailContents.*;

@WebFluxTest
class TestBase {

	@Autowired
	protected WebTestClient webClient;

	protected CustomerMessage messageEmail = new CustomerMessage(
			"testFirstName",
			"testLastName",
			"testEmail",
			"testMessage");

	protected CustomerOrder orderEmail = new CustomerOrder(
			"testFirstName",
			"testLastName",
			"testEmail",
			"12345678910",
			"testCarMake", "testCarModel", "testCarYear");

	protected SendEmailRequest sendCustomerResponse = new SendEmailRequest(
			null,
			SUBJECT_FOR_CUSTOMER,
			BODY_FOR_CUSTOMER);

	protected SendEmailRequest sendOwnerMessageEmailRequest = new SendEmailRequest(
			null,
			"nullnull",
			null);

	protected SendEmailRequest sendOwnerOrderEmailRequest = new SendEmailRequest(
			OWNERS_EMAIL,
			SUBJECT_FOR_OWNER,
			("Customer Name: " + null + " " + null +
					" Customer Phone Number: " + null +
					" Customer Email: " + null +
					" Customers Car: " + null + " " +null + " " + null));

	protected void verifyPut(String s) {
		webClient
				.put()
				.uri(s)
				.exchange()
				.expectStatus()
				.isOk();
	}

	protected void verifyPut(String uri, Object body) {
		webClient
				.put()
				.uri(uri)
				.bodyValue(body)
				.exchange()
				.expectStatus()
				.isOk();
	}

	protected void verifyGet(String uri) {
		webClient
				.get()
				.uri(uri)
				.exchange()
				.expectStatus().isOk();
	}

	protected StatusAssertions verifyPost(String uri) {
		return verifyPost(uri, null);
	}

	protected StatusAssertions verifyPost(String uri, Object body) {
		WebTestClient.RequestBodySpec spec = webClient.post()
				.uri(uri);

		if (body != null) {
			spec = (WebTestClient.RequestBodySpec) spec.bodyValue(body);
		}

		return spec
				.exchange()
				.expectStatus();
	}

}
