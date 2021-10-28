package SeleniumConcepts;


import Utilities.BaseUtil;

public class WebDriverManagerConcepts extends BaseUtil {

	public static void main(String[] args) {
		
		BaseUtil bu = new BaseUtil();
		bu.launchBrowser("IE");
		driver.get("https://www.google.ca");
		System.out.println(driver.getTitle());
	}

}
