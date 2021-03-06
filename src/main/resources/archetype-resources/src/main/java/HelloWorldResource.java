/*
 * Copyright 2017 http://www.beyondcoding.net
 */
package ${package};

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path( "/hello-world" )
@Produces( MediaType.APPLICATION_JSON )
public class HelloWorldResource
{
	public HelloWorldResource()
	{

	}

    @GET
    public String sayHello( @QueryParam( "name" ) final String name )
    {
        return "Hello " + name;
    }
}
