package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					monochrome = true, //bardziej czytelny opis wykonanych scenariuszy i test�w + czas
					//dryRun = true, // do sprawdzenia
					features = "src/main/java/feature",
					glue = {"stepdefinition"}
				)

public class TestRun  {

}
