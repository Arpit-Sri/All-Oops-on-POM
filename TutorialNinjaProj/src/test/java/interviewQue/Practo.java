package interviewQue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practo {
	
	@Test
	public void showDoc() {
	WebDriver driver =new  ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.practo.com/Thrissur/doctors");
	 
	//list of doctors 
	////div[@class='info-section']--represents the list of all doctors
	  List<WebElement> listOfDoc = driver.findElements(By.xpath("//div[@class='info-section']"));
	
	
	for( WebElement doctor : listOfDoc) {
		////span[contains(text(), 'Patient Stories')]--represents the list of doc having patient story
		List<WebElement> patientStory = doctor.findElements(By.xpath(".//span[contains(text(), 'Patient Stories')]"));
		
		if(patientStory.isEmpty()) {
			
			 String docName = doctor.findElement(By.xpath(".//h2")).getText();
			
			System.out.println(docName);
			}
		}
		driver.quit();
	}

}
