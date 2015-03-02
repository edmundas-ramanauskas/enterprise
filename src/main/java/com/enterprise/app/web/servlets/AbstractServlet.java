package com.enterprise.app.web.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edmundas
 */
abstract public class AbstractServlet extends HttpServlet {
    
    protected final void _404(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        render("/WEB-INF/html/404.html", request, response);
    }
    
    protected final void _500(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        render("/WEB-INF/html/500.html", request, response);
    }
    
    protected final void render(String path, HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
        request.getRequestDispatcher(path).forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "";
    }
}
