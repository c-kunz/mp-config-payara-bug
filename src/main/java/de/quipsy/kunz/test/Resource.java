package de.quipsy.kunz.test;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@RequestScoped
@Path("resource")
public class Resource {

    @Inject
    @ConfigProperty // (name = "payara.instance.http.port")
    private int test;

    @GET
    public int getTestValue() {
        return test;
    }

}
