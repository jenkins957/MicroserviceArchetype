/*
 * Copyright 2017
 */
package net.beyondcoding.app;

import com.codahale.metrics.health.HealthCheck;

/**
 *
 * @author mikej
 */
public class AppHealthCheck extends HealthCheck
{
	public AppHealthCheck()
	{

	}

	@Override
	protected Result check() throws Exception
	{
		return Result.healthy();
	}
}
