/*
 * Copyright 2017 http://www.beyondcoding.net
 */
package ${package}.cucumber;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import ${package}.App;
import ${package}.AppConfiguration;
import javax.ws.rs.client.Client;
import cucumber.api.java.en.Given;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.testing.DropwizardTestSupport;

/**
 *
 * @author mikej
 */
public class ResourceStepDefinitions
{
	public static final DropwizardTestSupport<AppConfiguration> SUPPORT
			= new DropwizardTestSupport<AppConfiguration>( App.class, "");

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
