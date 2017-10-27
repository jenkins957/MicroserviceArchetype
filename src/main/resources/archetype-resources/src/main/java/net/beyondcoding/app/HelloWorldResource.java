/*
 * Copyright 2017
 */
package net.beyondcoding.app;

/**
 *
 * @author mikej
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
	public String sayHello()
	{
		return "Hello";
	}
}
