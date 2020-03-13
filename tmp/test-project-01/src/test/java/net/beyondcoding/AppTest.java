/*
 * Copyright 2017 http://www.beyondcoding.net
 */
package net.beyondcoding;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest
{
	@Test
	public void shouldGetAppName()
	{
		final App app = new App();
		assertEquals( "Application Name", "App", app.getName() );
	}
}
