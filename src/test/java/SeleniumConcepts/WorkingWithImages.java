package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.BaseUtil;

public class WorkingWithImages extends BaseUtil {

	public static void main(String[] args) {
		
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		
		driver.get("https://www.ebay.com");
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		int totalImages = images.size();
		System.out.println(totalImages);
		
		for (int i = 0; i < totalImages; i++) {
			
			String ImageUrl = images.get(i).getAttribute("src");
			System.out.println(ImageUrl);
			
		}

	}

}
