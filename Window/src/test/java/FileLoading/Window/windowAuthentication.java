package FileLoading.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowAuthentication {
	
	@Test
	public void urlauthedication() {
		WebDriver driver=new ChromeDriver();
		String userName="admin";
		String password="admin";
		String url="https://"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		System.out.println(driver.getTitle());
	}

}
