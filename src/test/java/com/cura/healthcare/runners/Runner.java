package com.cura.healthcare.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
        "src/test/resources/features/01_Login.feature",
        "src/test/resources/features/02_Appointment.feature"
}, glue = {
        "com.cura.healthcare.definitions.login",
        "com.cura.healthcare.definitions.appointment"
}, plugin = {
        "pretty",  
        "html:target/cucumber-reporting/reports.html", 
        "json:target/cucumber-reporting/reports.json", 
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runner extends AbstractTestNGCucumberTests {
}
