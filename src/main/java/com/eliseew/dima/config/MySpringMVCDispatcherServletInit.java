package com.eliseew.dima.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMVCDispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.printf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        return new Class[] {SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.printf("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        return new String[] {"/"};
    }
}
