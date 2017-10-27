/*
 * Copyright 2017
 */
package net.beyondcoding.app;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikej
 */
public class AppTest
{
	@Test
	public void shouldGetAppName()
	{
		final App app = new App();
		assertEquals( "Application Name", "App", app.getName() );
	}
}
