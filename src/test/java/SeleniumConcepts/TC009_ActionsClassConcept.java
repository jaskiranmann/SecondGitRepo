package SeleniumConcepts;

import java.awt.Frame;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.BaseUtil;

public class TC009_ActionsClassConcept extends BaseUtil{

	public static void main(String[] args) {
	
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		driver.get("https://www.amazon.ca/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2.nav-long-width"))).build().perform();
		List<WebElement> listing = driver.findElements(By.xpath("//*[@id=\'nav-al-your-account\']/a"));
		System.out.println(listing.size());
		
		for (int i = 0; i <listing.size() ; i++) {
			System.out.println(listing.get(i).getText());
		}
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\'nav-al-wishlist\']/a"));
		System.out.println(list.size());
		
		for (int i = 0; i <list.size() ; i++) {
			System.out.println(list.get(i).getText());
		}
	
//		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu");
//		
//		Actions a = new Actions(driver);
//		a.sendKeys(driver.findElement(By.id("username")), "Jaskiranmann").build().perform();
//		a.sendKeys(driver.findElement(By.id("password")), "Jaskiran@92").build().perform();
//		a.click(driver.findElement(By.xpath("//*[@id=\'sign_in_form\']/fieldset/div/div[5]/button"))).build().perform();
	}

}
