package com.marketplace.app.web.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edmundas
 */
abstract class AbstractServlet extends HttpServlet {
    
    private static final String BASE_PATH = "/WEB-INF/html/";
    
    protected final void _404(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        render("404.html", request, response);
    }
    
    protected final void _500(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        render("500.html", request, response);
    }
    
    protected final void render(String path, HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
        request.getRequestDispatcher(BASE_PATH.concat(path)).forward(request, response);
    }
    
    protected final void output(String content, HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
        
        response.getWriter().write(content);
    }

    @Override
    public String getServletInfo() {
        return "";
    }
}
