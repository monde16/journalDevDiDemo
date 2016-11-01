package org.nodexy.legacy;

import java.util.Map;

import static org.nodexy.util.Misc.put;

/**
 * Created by phoenix on 11/1/16.
 */
public class MainApplication {
    private EmailService emailService;
    public MainApplication() {
        this.emailService=new EmailService();
    }
    public void processMessages(Map<String,String> messages) {
        put("Processing batch : "+messages);
        messages.forEach((k,v)->emailService.sendEmail(v,k));
        put("Done!");
    }
}
