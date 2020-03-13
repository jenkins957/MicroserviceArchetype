/*
 * Copyright 2017 http://www.beyondcoding.net
 */
package net.beyondcoding;

import static org.junit.Assert.assertEquals;
import org.junit.ClassRule;
import org.junit.Test;
import io.dropwizard.testing.junit.ResourceTestRule;

public class HelloWorldResourceTest
{
	// Unit test, spinning up an in-memory Jersey Server
	@ClassRule
	public static final ResourceTestRule RESOURCES = ResourceTestRule.builder()
			.addResource( new HelloWorldResource() )
			.build();

	@Test
	public void shouldSayHelloFromApi()
	{
		final String result = RESOURCES.target( "/hello-world" ).
                queryParam( "name", "MyName" ).
                request().get( String.class );

        	assertEquals( "Hello MyName", result );
	}

	@Test
	public void shouldSayHello()
	{
		final HelloWorldResource r = new HelloWorldResource();
		assertEquals( "Hello MyName", r.sayHello( "MyName" ) );
	}
}
