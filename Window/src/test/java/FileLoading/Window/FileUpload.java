package FileLoading.Window;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	
	@Test
	public void testing() throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
				// TODO Auto-generated method stub
		driver.get("https://pdf2doc.com/");
		driver.findElement(By.cssSelector(".button__text")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\prave\\Desktop\\Dhareene\\FileUploadAutoIT\\newupload.exe");
		
		
	}
}
