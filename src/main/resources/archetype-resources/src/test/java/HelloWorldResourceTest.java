/*
 * Copyright 2017 http://www.beyondcoding.net
 */
package ${package};

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
	public void shouldSayHello()
	{
		final String result = RESOURCES.target( "/hello-world" ).request().get( String.class );
		assertEquals( "Hello", result );
	}

	@Test
	public void shouldSayHello_2()
	{
		final HelloWorldResource r = new HelloWorldResource();
		assertEquals( "Hello", r.sayHello() );
	}
}
