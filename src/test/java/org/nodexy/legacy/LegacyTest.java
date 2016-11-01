package org.nodexy.legacy;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by phoenix on 11/1/16.
 */
public class LegacyTest {
    @Test
    public void test() {
        MyApplication app = new MyApplication();

        Map<String,String> messages = new HashMap<>();
        messages.put("ndeoligent21@yahoo.com","This is testa!");
        messages.put("moonfry@yahoo.com","This is 2nd testa!!");

        app.processMessages(messages);
    }
}
