/*
 * Copyright 2017 http://www.beyondcoding.net
 */
package ${package}.it;

import javax.ws.rs.client.Client;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.ClassRule;
import io.dropwizard.testing.junit.DropwizardAppRule;
import ${package}.App;
import ${package}.AppConfiguration;

/*
 * Integration Test - Starting up full app
 */
public class SayHelloIT
{
	@ClassRule
	public static final DropwizardAppRule<AppConfiguration> RULE = new DropwizardAppRule<AppConfiguration>( App.class );

	private Client client;

	@Before
	public void setUp()
	{
		client = new JerseyClientBuilder().build();
	}

	@Test
	public void shouldSayHello()
	{
		final String result = client.target( getUrl() ).
                queryParam( "name", "MyName" ).request().get( String.class );

		assertEquals( "Hello MyName", result );
	}

	private String getUrl()
	{
		return String.format( "http://localhost:%d/hello-world", RULE.getLocalPort() );
	}
}
