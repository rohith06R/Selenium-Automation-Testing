package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohith\\OneDrive\\Documents\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.thesparksfoundationsingapore.org/";
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Join Us")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Why Join Us")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Name")).sendKeys("Rohith");
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("Rohiths789@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Brand Ambassador")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Expert Mentor")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Events Volunteer")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Management Volunteer")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Internship Positions")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
