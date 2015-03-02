package com.enterprise.app.context;

import com.enterprise.app.jms.queue.AppQueue;
import com.enterprise.app.jms.listeners.EventListener;
import org.apache.camel.builder.RouteBuilder;

/**
 *
 * @author edmundas
 */
public class AppCamelRoutes extends RouteBuilder {
    
    @Override
    public void configure() throws Exception {
        from(AppQueue.EVENT.toString()).bean(EventListener.class);
    }
}
