/*
 * Copyright 2017 http://www.beyondcoding.net
 */
package ${package}.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import javax.ws.rs.client.Client;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import io.dropwizard.client.JerseyClientBuilder;

public class SayHelloStepDefinitions
{
    private String person;
    private String result;

    @Before
    public void setup() throws Exception
    {
        ApplicationIT.SUPPORT.before();
    }

    @After
    public void teardown()
    {
        ApplicationIT.SUPPORT.after();
    }

    @Given( "^I have a Person called Nemo$" )
    public void i_have_a_Person_called_Nemo() throws Throwable
    {
        person = "Nemo";
    }

    @When( "^they say hello$" )
    public void they_say_hello() throws Throwable
    {
        final Client client = new JerseyClientBuilder(
                ApplicationIT.SUPPORT.getEnvironment() ).build( "test client" );

        result = client.target(
                String.format( "http://localhost:%d/hello-world",
                        ApplicationIT.SUPPORT.getLocalPort() ) ).
                queryParam( "name", person ).
                request().get( String.class );
    }

    @Then( "^the service says hello back$" )
    public void the_service_says_hello_back() throws Throwable
    {
        assertEquals( "Hello " + person, result );
    }
}
