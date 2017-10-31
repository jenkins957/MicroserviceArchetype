/*
 * Copyright 2017 http://www.beyondcoding.net
 */
package ${package};

import com.codahale.metrics.health.HealthCheck;

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
