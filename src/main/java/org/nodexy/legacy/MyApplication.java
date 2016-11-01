package org.nodexy.legacy;

import java.util.Map;

import static org.nodexy.util.Misc.put;

/**
 * Created by phoenix on 11/1/16.
 * Simply sends an email batch.
 */
public class MyApplication {
    private EmailService emailService;
    public MyApplication() {
        this.emailService=new EmailService();
    }
    public void processMessages(Map<String,String> messages) {
        put("Processing batch : "+messages);
        messages.forEach((k,v)->emailService.sendEmail(v,k));
        put("Done!");
    }
}
