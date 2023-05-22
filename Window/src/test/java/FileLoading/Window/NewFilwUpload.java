package FileLoading.Window;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.awt.datatransfer.StringSelection;

public class NewFilwUpload {
	
	@Test
	public void data() throws AWTException {
		Robot robot=new Robot();
		WebDriver driver=new ChromeDriver();
		driver.get("https://pdf2doc.com/");
		driver.findElement(By.cssSelector(".button__text")).click();
		robot.setAutoDelay(3000);
		StringSelection stringSelection=new StringSelection("C:\\Users\\prave\\Documents\\VNG PAL - patta 1081 - north path.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.setAutoDelay(1000);
		
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.setAutoDelay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.setAutoDelay(1000);
	}

}
