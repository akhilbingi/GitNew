package MvnFun.mavenJava1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/bingis/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(3000L);
		
		Actions a=new Actions(driver);
		
	
		
		a.moveToElement(driver.findElement(By.xpath("//a[@data-group='men']"))).build().perform();
		
		a.moveToElement(driver.findElement(By.cssSelector(".desktop-searchBar"))).click().keyDown(Keys.SHIFT).sendKeys("jeans").build().perform();
		
		
	}

}
