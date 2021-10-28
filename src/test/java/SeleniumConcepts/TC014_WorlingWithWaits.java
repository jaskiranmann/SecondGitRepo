package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseUtil;
//--> Absolute xpath starts with /
// Relative Xpath starts with //
//Thread.sleep = Hard wait (we will not use)
//Implicitwait = dynamic wait
//Explicitwait = dynamic wait
public class TC014_WorlingWithWaits extends BaseUtil{

	public static void main(String[] args) {
		
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		
		driver.get("https://www.awwwards.com/");
		System.out.println("title is :" + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\'header\']/div/div[2]/div[2]/strong/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("_username")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("_username")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tab-login-form\"]/div/div[1]/form/p[1]/button")));
		
		driver.findElement(By.name("_username")).sendKeys("jaskiran");
	}

}
