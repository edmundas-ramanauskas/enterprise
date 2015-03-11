package com.marketplace.app.web.servlets;

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
        
        render("default.html", request, response);
    }
}