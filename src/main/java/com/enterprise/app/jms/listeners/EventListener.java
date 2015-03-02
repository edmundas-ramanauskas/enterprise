package com.enterprise.app.jms.listeners;

/**
 *
 * @author edmundas
 */
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author edmundas
 */
public class EventListener implements MessageListener {
    
    private static final Logger logger = LoggerFactory.getLogger(EventListener.class);
    
    @Override
    public void onMessage(Message message) {
        try {
            TextMessage event = (TextMessage) message;
            logger.info(event.getText());
        } catch (JMSException ex) {
            logger.error("Error reading message", ex);
        }
    }
}