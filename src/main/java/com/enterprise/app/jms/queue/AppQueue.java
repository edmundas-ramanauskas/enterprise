package com.enterprise.app.jms.queue;

/**
 *
 * @author edmundas
 */
public enum AppQueue {
    
    EVENT("queue/enterprise.event");
    
    private static final String QUEUE_BASE = "activemq:queue:";
    
    private final String queue;
    
    private AppQueue(String queue) {
        this.queue = queue;
    }
    
    @Override
    public String toString() {
        return QUEUE_BASE + queue;
    }
}
