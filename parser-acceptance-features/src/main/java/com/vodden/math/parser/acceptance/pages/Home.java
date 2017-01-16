package com.vodden.math.parser.acceptance.pages;

public interface Home {

	void open();

	/* (non-Javadoc)
	 * @see com.vodden.math.parseracceptance.pages.Home#calculate(java.lang.String)
	 */
	void calculate(String expression);

	/* (non-Javadoc)
	 * @see com.vodden.math.parseracceptance.pages.Home#getResult()
	 */
	Boolean checkResult(Double value);

}