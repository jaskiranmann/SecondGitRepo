package SeleniumConcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.BaseUtil;

public class TC010_WorkingWithAppScreenshots extends BaseUtil{

	public static void main(String[] args) throws IOException {
		
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		captureScreenshots(driver, "LoginPage");
		username.sendKeys("Admin");
		captureScreenshotsOnElementBasis(username, "user");
		password.sendKeys("admin123");
		captureScreenshotsOnElementBasis(password, "password");
		//capturing screenshot
//		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile,new File("C:\\Users\\Owner\\eclipse-workspace\\MavenPractice\\target\\ScreenShots\\Image.png"));
	}
	public static void captureScreenshots(WebDriver driver, String fileName) {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File("./target/ScreenShots/"+fileName+".png"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	public static void captureScreenshotsOnElementBasis(WebElement element, String fileName) {
		File srcFile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File("./target/ScreenShots/"+fileName+".png"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
