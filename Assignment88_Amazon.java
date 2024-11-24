
Amazon Suggestions:
package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Suggestions
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> e1=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		int length=e1.size();
		System.out.println(length);
		for(int i=0;i<length;i++)
		{
			WebElement e2=e1.get(i);
			String ausg=e2.getText();
			System.out.println(ausg);
		}
		Thread.sleep(1000);
		e1.get(4).click();
	}
}