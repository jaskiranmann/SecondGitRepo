package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.BaseUtil;

public class TC008_WorkingWithFrames extends BaseUtil{

	public static void main(String[] args) {
		
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		//capturing draggable text
		WebElement drag = driver.findElement(By.id("draggable"));
		String dragText = driver.findElement(By.id("draggable")).getText();
		System.out.println(dragText);
		
		//capturing drop text
		WebElement drop = driver.findElement(By.id("droppable"));
		String dropText = driver.findElement(By.id("droppable")).getText();
		System.out.println(dropText);
		
		//actions concept
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Button")).click();
	}

}
