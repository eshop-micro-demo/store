package com.kubewarrior.store;

import com.kubewarrior.store.domain.Product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Value("${client.url}")
    private String allowed_origins;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Product.class);
        // System.out.println("id exposed for product?: "+config.isIdExposedFor(Product.class));
        System.out.println("Allowed origins: "+allowed_origins);
        cors.addMapping("/**")
            .allowedOrigins(allowed_origins)
            // .allowedMethods("PUT", "DELETE")
            // .allowedHeaders("header1", "header2", "header3")
            // .exposedHeaders("header1", "header2")
            .allowCredentials(true).maxAge(3600);
    }
}