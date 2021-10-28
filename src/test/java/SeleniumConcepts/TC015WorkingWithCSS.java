package SeleniumConcepts;

import Utilities.BaseUtil;

public class TC015WorkingWithCSS extends BaseUtil {

	public static void main(String[] args) {
		
		
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu");
		
		//Id--># in css selector
		//#username
		//input[@id='username'] -- Xpath
		//input#username -- css selector no special character in CSS selector
		//input[id=username]
		//to use class name in CSS selector, space will be changed to "." and also "." is used at the start
		//for example class=notranslate required sm-input sm-input--stretch
		// .notranslate.required.sm-input.sm-input--stretch
		
	}

}
