package dev.ifrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name= "pw2.message",  defaultValue="" )
    String message;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return ("Propriedade: " + message);
    }
}