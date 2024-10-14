package interviewQue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountLink {
	@Test
	public void noOfLinks() {
		WebDriver driver =new  ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.practo.com/Thrissur/doctors");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total numbers of links are : "+links.size());
	}
}
