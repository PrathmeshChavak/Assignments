Google Auto Suggestions.

package Selenium_Practice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google_Suggestions 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bangalore");
		Thread.sleep(2000);
		List<WebElement> e1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li")); //return type is list because auto suggestions have indexing
		int length=e1.size(); //Get the number of auto suggestions
		System.out.println(length);
		for(int i=0;i<length;i++) // This code is to print all the suggestions shown.
		{
			WebElement e2=e1.get(i);
			String autosuggestion=e2.getText();
			System.out.println(autosuggestion);
		}
		Thread.sleep(1000);
		e1.get(7).click(); //Clicking on a specific suggestion
		
	}
}



