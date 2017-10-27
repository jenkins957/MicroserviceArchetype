/*
 * Copyright 2017
 */
package net.beyondcoding.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppHealthCheckTest
{
	@Test
	public void shouldBeHealthy() throws Exception
	{
		final TestHealthCheck healthCheck = new TestHealthCheck();
		assertTrue( "Is Healthy", healthCheck.isHealthy() );
	}

	public static class TestHealthCheck extends AppHealthCheck
	{
		public boolean isHealthy() throws Exception
		{
			return super.check().isHealthy();
		}
	}
}
