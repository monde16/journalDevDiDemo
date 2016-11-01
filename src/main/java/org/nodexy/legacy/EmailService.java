package org.nodexy.legacy;

import static org.nodexy.util.Misc.put;

/**
 * Created by phoenix on 11/1/16.
 */
public class EmailService {
    public void sendEmail(String message, String receiver) {
        put(String.format("Email sent to <%s>",receiver));
        put("With message: "+message);
    }
}
