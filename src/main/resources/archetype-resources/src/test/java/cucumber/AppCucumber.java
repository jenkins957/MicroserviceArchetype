/*
 * Copyright 2017 http://www.beyondcoding.net
 */
package ${package}.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

/**
 *
 * @author mikej
 */
@RunWith( Cucumber.class )
@CucumberOptions( plugin =
{
	"html:target/cucumber/cucumber-html-report",
	"json:target/cucumber/cucumber-html-report/cucumber.json"
}, features =
{
	"src/test/resources/features"
}, tags =
{
	"~@cucumberIgnore", "@hello"
}, strict = true, dryRun = false )
public class AppCucumber
{

}
