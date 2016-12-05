package com.vodden.math.parser.acceptance.steps;

public interface ParserSteps {

	void theUserVisitsTheWebpage();

	void theySubmitTheExpression(String value);

	void theResultShouldBe(Double value);

}