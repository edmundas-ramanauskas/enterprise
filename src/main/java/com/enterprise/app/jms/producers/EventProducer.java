package com.enterprise.app.jms.producers;

import com.enterprise.app.context.AppCamelContext;
import com.enterprise.app.jms.messages.EventMessage;
import com.enterprise.app.jms.queue.AppQueue;

/**
 *
 * @author edmundas
 */
public class EventProducer {
    
    public static void sendEvent(EventMessage event) {
        AppCamelContext.getInstance().sendMessage(AppQueue.EVENT, event.getDetails());
    }
}
