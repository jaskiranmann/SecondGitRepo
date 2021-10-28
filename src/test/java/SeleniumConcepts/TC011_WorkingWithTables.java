package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.BaseUtil;

public class TC011_WorkingWithTables extends BaseUtil{

	public static void main(String[] args) {
		
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		String expLastName = "Morris";
		boolean status = true;
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']/b")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\'resultTable\']/tbody/tr/td[4]/a"));
		System.out.println("Numbers of rows" + rows.size());
		
		for (int i = 0; i < rows.size(); i++) {
			String actLastName = rows.get(i).getText();
			System.out.println(actLastName);
			if (expLastName.equalsIgnoreCase(actLastName)) {
				status = true;
				break;
				//System.out.println("Last Name exists");
			} else {
				status = false;
				//System.out.println("No last name");
			}
		}
		
		if (status==true) {
			System.out.println("Last name exists");
		} else {
			System.out.println("last name doesn't exist");
		}
	}

}
