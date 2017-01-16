package com.vodden.math.parser.acceptance.steps;

import javax.inject.Inject;

import com.vodden.math.parser.acceptance.pages.Home;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ParserStepsImpl implements ParserSteps {

	private Home home;

	@Inject
	public ParserStepsImpl(Home home) {
		this.home = home;
	}

	@Given("I visit the webpage")
	public void theUserVisitsTheWebpage() {
		home.open();
	}

	@When("I submit the expression (.*)")
	public void theySubmitTheExpression(String value) {
		home.calculate(value);
	}

	@Then("the result should be (-?\\d+)")
	public void theResultShouldBe(Double value) {
		assertEquals(true, home.checkResult(value));
	}

}
