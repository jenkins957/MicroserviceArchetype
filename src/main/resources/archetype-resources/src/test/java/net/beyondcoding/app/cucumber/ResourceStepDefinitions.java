/*
 * Copyright 2017
 */
package net.beyondcoding.app.cucumber;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import net.beyondcoding.app.App;
import net.beyondcoding.app.AppConfiguration;
import javax.ws.rs.client.Client;
import cucumber.api.java.en.Given;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.testing.ConfigOverride;
import io.dropwizard.testing.DropwizardTestSupport;
import io.dropwizard.testing.ResourceHelpers;

/**
 *
 * @author mikej
 */
public class ResourceStepDefinitions
{
	public static final DropwizardTestSupport<AppConfiguration> SUPPORT
			= new DropwizardTestSupport<AppConfiguration>( App.class,
					ResourceHelpers.resourceFilePath( "" ),
					ConfigOverride.config( "server.applicationConnectors[0].port", "0" ) );

	private String result;

	@Given( "^The app is running$" )
	public void the_app_is_running() throws Throwable
	{
		SUPPORT.before();
	}

	@When( "^I check call say hello$" )
	public void i_check_call_say_hello() throws Throwable
	{
		Client client = new JerseyClientBuilder( SUPPORT.getEnvironment() ).build( "test client" );

		result = client.target(
				String.format( "http://localhost:%d/hello-world", SUPPORT.getLocalPort() ) )
				.request()
				.get( String.class );
	}

	@Then( "^hello is returned$" )
	public void hello_is_returned() throws Throwable
	{
		assertEquals( "Hello", result );
	}
}
