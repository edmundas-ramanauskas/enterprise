package com.enterprise.app.context;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author edmundas
 */
@WebListener(value = "AppContextListener")
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        AppCamelContext.getInstance().startCamelContext();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        AppCamelContext.getInstance().stopCamelContext();
    }
}
