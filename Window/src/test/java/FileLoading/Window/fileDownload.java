package FileLoading.Window;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.util.HashMap;



public class fileDownload {

	@Test
	public void download() throws InterruptedException {
		String filePath=System.getProperty("user.dir");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", filePath);
		
		ChromeOptions  option=new ChromeOptions();
		option.setExperimentalOption("prefs",chromePrefs );
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(5000);
		File f=new File(filePath+"/sampleFile.jpeg");
		if(f.exists()) {
			System.out.println("The file found");
			f.delete();
		}
		
	}
}
