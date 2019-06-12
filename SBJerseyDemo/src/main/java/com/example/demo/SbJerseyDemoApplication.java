package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class SbJerseyDemoApplication  extends SpringBootServletInitializer
{
    public static void main(String[] args)
    {
        new SbJerseyDemoApplication().configure(new SpringApplicationBuilder(SbJerseyDemoApplication.class)).run(args);
    }
}
