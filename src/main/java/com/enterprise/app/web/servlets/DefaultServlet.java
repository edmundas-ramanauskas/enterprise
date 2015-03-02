package com.enterprise.app.web.servlets;

import com.enterprise.app.jms.messages.EventMessage;
import com.enterprise.app.jms.producers.EventProducer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author edmundas
 */
@WebServlet(name = "DefaultServlet", urlPatterns = {"/default"})
public class DefaultServlet extends AbstractServlet {
    
    private static final Logger logger = LoggerFactory.getLogger(DefaultServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        logger.info("Executing DefaultServlet.doGet");
        
        EventProducer.sendEvent(new EventMessage("Hello JMS!"));
        render("/WEB-INF/html/default.html", request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        _404(request, response);
    }
}