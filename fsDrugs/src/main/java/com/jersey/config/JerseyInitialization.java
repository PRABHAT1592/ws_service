package com.jersey.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import com.cusat.fsdrugs.model.Item;
import com.cusat.fsdrugs.resources.ItemResource;
import com.cusat.fsdrugs.resources.UserResource;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class JerseyInitialization extends ResourceConfig {
    /**
     * Register JAX-RS application components.
     */
    public JerseyInitialization() {
        this.register(new JacksonJsonProvider(ObjectMapperFactory.create()));
        this.property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        this.property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
        this.packages(true, "com.cusat.fsdrugs.resources");
   /*     this.register(UserResource.class);
        this.register(ItemResource.class);*/
    }
}
