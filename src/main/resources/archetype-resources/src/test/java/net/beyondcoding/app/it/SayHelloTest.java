/*
 * Copyright 2017
 */
package net.beyondcoding.app.it;

import javax.ws.rs.client.Client;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.ClassRule;
import io.dropwizard.testing.junit.DropwizardAppRule;
import net.beyondcoding.app.App;
import net.beyondcoding.app.AppConfiguration;

/*
 * Integration Test - Starting up full app
 */
public class SayHelloTest
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
		final String result = client.target( getUrl() ).request().get( String.class );
		assertEquals( "Hello", result );
	}

	private String getUrl()
	{
		return String.format( "http://localhost:%d/hello-world", RULE.getLocalPort() );
	}
}
