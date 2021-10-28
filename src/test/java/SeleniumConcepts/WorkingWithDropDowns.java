package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseUtil;

public class WorkingWithDropDowns extends BaseUtil{

	public static void main(String[] args) throws InterruptedException {
		
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		
		//1. selecting value from drop down using sendkeys
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		
		Thread.sleep(4000);
		
		/*
		 * driver.findElement(By.id("month")).sendKeys("july");
		 * 
		 * //select class
		 * 
		 * Select s1 = new Select(driver.findElement(By.id("day")));
		 * //s1.selectByVisibleText("6"); //for month s1.selectByValue("6"); //selecting
		 * day
		 * 
		 * Select s2 = new Select(driver.findElement(By.id("year")));
		 * //s2.selectByValue("2005"); s2.selectByIndex(16);
		 * 
		 * //capture all the values from dropdown
		 * 
		 * List<WebElement> monthsvals = s1.getOptions();
		 * System.out.println(monthsvals.size());
		 * 
		 * for (int i = 0; i < monthsvals.size(); i++) { String MonthName =
		 * monthsvals.get(i).getText(); System.out.println(MonthName); }
		 * 
		 * //print all the values from dropdown without using select class
		 * 
		 * List<WebElement> NoOfMnth =
		 * driver.findElements(By.xpath("//*[@id='month']/option"));
		 * System.out.println(NoOfMnth.size());
		 * 
		 * for (int i = 0; i < NoOfMnth.size(); i++) {
		 * 
		 * String mnName = NoOfMnth.get(i).getText(); System.out.println(mnName);
		 * 
		 * if (mnName.equalsIgnoreCase("Jul")) { NoOfMnth.get(i).click(); break; }
		 * 
		 * }
		 */
		WebElement MonthName = driver.findElement(By.id("month"));
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Year = driver.findElement(By.id("year"));
		
		String dob = "30-Jan-2005";
		String splitdob[] = dob.split("-");
		
		//splitdob[0] = 30
		//splitdob[1] = Jan
		//splitdob[2] = 2005
		
		b.SelectValueFromDropDown(MonthName, splitdob[1]);
		b.SelectValueFromDropDown(Day, splitdob[0]);
		b.SelectValueFromDropDown(Year, splitdob[2]);
		
		/*
		 * b.SelectValueFromDropDown(MonthName, "jan"); b.SelectValueFromDropDown(Year,15);
		 */
		
	}

}
