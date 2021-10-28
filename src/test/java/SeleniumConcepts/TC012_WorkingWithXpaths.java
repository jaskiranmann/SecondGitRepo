package SeleniumConcepts;
import org.openqa.selenium.By;

//Xpath = extended path
// -  <input name="txtUsername" id="txtUsername" type="text">
//syntax= //tagname[@attribute='attributevalue']
// --> //input[@name='txtUsername']
import Utilities.BaseUtil;

public class TC012_WorkingWithXpaths extends BaseUtil{

	public static void main(String[] args) {

		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//input name = "txtUsernamr" id = "txtUsername" type = "text"
		driver.findElement(By.xpath("input[@id='txtUsername']")).sendKeys("Admin");
		//syntex = //tagname[@attributename='attributeValue']
		//input[@id='txtUsername']
		//2 attributes
		//tagname[@attributename='attributeValue' and @attributename2='attributeValue2']
		//input[@id='txtPassword' and @type='password']
		
		//contains concept
		//
		//contain with 1 attribute
		//classname = wds-button wds-button--stretch wds-button--icon-right wds-button--arrow-right
		//input[contains(@class,'wds-button--stretch')]
		//(//input[contains(@class,'wds-button--stretch')])[1] -->if 2 options
		
		//contains with 2 attributes
		//
		
		//using text directly
		//a[text()='Log in with SSO']
		
		//Log in with your Office 365, LinkedIn, Facebook, Google, or Apple Account
		
		//strong[text()='Log in with your Office 365, LinkedIn, Facebook, Google, or Apple Account']
		
		driver.findElement(By.xpath("input[@id='txtPassword' and @type='password']")).sendKeys("admin123");
		
	}

}
