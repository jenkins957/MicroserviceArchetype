/*
 * Copyright 2017
 */
package net.beyondcoding.app;

/**
 *
 * @author mikej
 */
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class App extends Application<AppConfiguration>
{
	@Override
	public String getName()
	{
		return "App";
	}

	@Override
	public void run( final AppConfiguration configuration, final Environment environment )
	{
		environment.jersey().register( new HelloWorldResource() );
		environment.healthChecks().register( "HealthCheck", new AppHealthCheck() );
	}
}
