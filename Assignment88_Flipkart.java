package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Suggestions
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.className("Pke_EE")).sendKeys("Laptops");
		Thread.sleep(1000);
		List <WebElement> e1=driver.findElements(By.xpath("		//div/form[@class='_2rslOn header-form-search OpXDaO']/ul/li\r\n"));
		//xpath for auto suggestions: 	//div/form[@class='_2rslOn header-form-search OpXDaO']/ul/li
		int length=e1.size();
		System.out.println(length);
		for(int i=0;i<length;i++)
		{
			WebElement e2=e1.get(i);
			String suggestions=e2.getText();
			System.out.println(suggestions);
		}
		Thread.sleep(1000);
		e1.get(3).click();
		
	}
}
