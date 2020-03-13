/*
 * Copyright 2017 http://www.beyondcoding.net
 */
package ${package}.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.dropwizard.testing.DropwizardTestSupport;
import net.beyondcoding.App;
import net.beyondcoding.AppConfiguration;

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
	"~@cucumberIgnore"
}, strict = true, dryRun = false )
public class ApplicationIT
{
    public static final DropwizardTestSupport<AppConfiguration> SUPPORT
            = new DropwizardTestSupport<AppConfiguration>( App.class, "" );
}
