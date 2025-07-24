package com.example.demo.config;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class WebAppConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext sc) throws ServletException {

        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.scan("com.example.demo");

        sc.addListener(new ContextLoaderListener(appContext));
        

        ServletRegistration.Dynamic registration = sc.addServlet("dispatcher", new DispatcherServlet(new GenericWebApplicationContext()));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}