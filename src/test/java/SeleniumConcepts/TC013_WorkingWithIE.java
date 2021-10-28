package SeleniumConcepts;

import Utilities.BaseUtil;

public class TC013_WorkingWithIE extends BaseUtil{

	public static void main(String[] args) throws InterruptedException {
		BaseUtil b = new BaseUtil();
		b.launchBrowser("IE");
		
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu");
		Thread.sleep(5000);
		System.out.println("title is :" + driver.getTitle());
	}

}
