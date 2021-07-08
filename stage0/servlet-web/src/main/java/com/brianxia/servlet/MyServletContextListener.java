package com.brianxia.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author brianxia
 * @version 1.0
 * @date 2021/7/7 15:59
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().setAttribute("abc","test");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
