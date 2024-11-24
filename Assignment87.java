package Selenium_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Practice_DragDrop
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//div[@id='div2']"));
		WebElement e2=driver.findElement(By.xpath("//div[@id='container']"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(e2, e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e2).perform();
		WebElement e3=driver.findElement(By.xpath("//div[@id='container-1']"));
		a1.dragAndDrop(e3, e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e3).perform();
		WebElement e4=driver.findElement(By.xpath("//div[@id='container-2']"));
		a1.dragAndDrop(e4,e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e4).perform();
		WebElement e5=driver.findElement(By.xpath("//div[@id='container-3']"));
		a1.dragAndDrop(e5, e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e5).perform();
		WebElement e6=driver.findElement(By.xpath("//div[@id='container-4']"));
		a1.dragAndDrop(e6, e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e6).perform();
		WebElement e7=driver.findElement(By.xpath("//div[@id='container-5']"));
		a1.dragAndDrop(e7, e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e7).perform();
		WebElement e8=driver.findElement(By.xpath("//div[@id='container-6']"));
		a1.dragAndDrop(e8, e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e8).perform();
		WebElement e9=driver.findElement(By.xpath("//div[@id='container-7']"));
		a1.dragAndDrop(e9, e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e9).perform();
		WebElement e10=driver.findElement(By.xpath("//div[@id='container-8']"));
		a1.dragAndDrop(e10, e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e10).perform();
		WebElement e11=driver.findElement(By.xpath("//div[@id='container-9']"));
		a1.dragAndDrop(e11, e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e11).perform();
		WebElement e12=driver.findElement(By.xpath("//div[@id='container-10']"));
		a1.dragAndDrop(e12, e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e12).perform();
		WebElement e13=driver.findElement(By.xpath("//div[@id='container-11']"));
		a1.dragAndDrop(e13, e1).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(e1, e13).perform();
		Thread.sleep(2000);
		driver.quit();	
	}
}
