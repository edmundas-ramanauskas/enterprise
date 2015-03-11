/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "SoftwareServlet", urlPatterns = {"/software"})
public class SoftwareServlet extends AbstractServlet {
    
    private static final Logger logger = LoggerFactory.getLogger(ContextServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        output("[{},{},{},{},{},{},{},{}]", request, response);
    }
}