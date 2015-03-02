package com.enterprise.app.context;

import com.enterprise.app.jms.queue.AppQueue;
import static org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author edmundas
 */
public class AppCamelContext {
    
    private static Logger logger = LoggerFactory.getLogger(AppCamelContext.class);
    
    private static final AppCamelContext instance = new AppCamelContext();
    private final CamelContext camelContext;
    private ProducerTemplate producerTemplate;
    
    private AppCamelContext() {
        camelContext = new DefaultCamelContext();
    }
    
    public static AppCamelContext getInstance() {
        return instance;
    }
    
    public void startCamelContext() {
        try {
            camelContext.addComponent("activemq", activeMQComponent("vm://localhost"));
//            camelContext.addComponent("activemq", activeMQComponent("tcp://localhost:61616"));
            producerTemplate = camelContext.createProducerTemplate();
            camelContext.addRoutes(new AppCamelRoutes());
            camelContext.start();
        } catch (Exception ex) {
            logger.error("Error starting camel context", ex);
        }
    }
    
    public void sendMessage(AppQueue queue, Object message) {
        producerTemplate.sendBody(queue.toString(), message);
    }
    
    public void stopCamelContext() {
        try {
            camelContext.stop();
        } catch (Exception ex) {
            logger.error("Error stoping camel context", ex);
        }
    }
}
