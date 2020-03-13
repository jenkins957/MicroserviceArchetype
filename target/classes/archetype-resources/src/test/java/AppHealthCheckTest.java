/*
 * Copyright 2017 http://www.beyondcoding.net
 */
package ${package};

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
