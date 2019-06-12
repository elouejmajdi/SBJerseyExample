package com.example.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.demo.resource.UserResource;

@Component
public class JerseyConfig  extends ResourceConfig{

	public JerseyConfig() {

		register(UserResource.class);
	}
}
