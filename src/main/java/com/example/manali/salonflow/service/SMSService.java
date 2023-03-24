package com.example.manali.salonflow.service;

import com.example.manali.salonflow.repository.ClientRepository;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.lookups.v1.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;

import static com.twilio.example.ValidationExample.ACCOUNT_SID;
import static com.twilio.example.ValidationExample.AUTH_TOKEN;

public class SMSService {
    private ClientRepository clientRepository;

    @Autowired
    private TwilioConfig twilioConfig;
    public void sendMessages(String message) {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        ("+12225559999"),
                        (TWILIO_NUMBER),
                        "Sample Twilio SMS using Java")
                .create();
}
}
