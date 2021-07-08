package com.brianxia.servlet;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * @author brianxia
 * @version 1.0
 * @date 2021/7/7 16:01
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println(servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {

    }
}
