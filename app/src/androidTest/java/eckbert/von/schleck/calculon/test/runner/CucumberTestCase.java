package eckbert.von.schleck.calculon.test.runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "features",
        glue = {
                "eckbert.von.schleck.calculon.test.cucumber"
        },
        format = {
                "pretty",
                "html:/data/data/eckbert.von.schleck.calculon/cucumber-reports/cucumber-html-report",
        })
public class CucumberTestCase {
}
