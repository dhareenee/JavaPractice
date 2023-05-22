package FileLoading.Window;

import java.io.InputStream;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.URL;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

public class PdfDownload {
	
	@Test
	public void verifyContentInPDf() throws IOException {
		
		String filePath=System.getProperty("user.dir");
	File f=new File(filePath+"/QA_Assignment.pdf");
	PDDocument doc1 = Loader.loadPDF(f);
		
		String content = new PDFTextStripper().getText(doc1);
	boolean flag= content.contains("Please Goto the website https://demowebshop.tricentis.com/ and get yourself familiar with it. Click\r\n"
			+ "around to explore different options and functionalities, note that this site will allow you to place a\r\n"
			+ "dummy order.\r\n"
			+ "Use Case:\r\n"
			+ "1. As a user you should be able to register and login successfully.\r\n"
			+ "2. As a user, you should be able to search for different items like jeans , laptop , desktop,\r\n"
			+ "gift card etc. [Any item of your choice].\r\n"
			+ "3. As a user, you should be able to add items to the cart. [Try adding items from different\r\n"
			+ "categories (Min:2 and Max:5)]\r\n"
			+ "4. As a user, you should be able to checkout and buy the items successfully.\r\n"
			+ "Assignment:\r\n"
			+ "● Please write test cases for the above mentioned use-cases.(should cover negative\r\n"
			+ "scenarios as well).You can write as many test cases as you want covering the entire use\r\n"
			+ "case.\r\n"
			+ "● Please prioritize the test cases.\r\n"
			+ "● Write the test cases in an excel file in your familiar format.\r\n"
			+ "● Pick any of the 2 use-cases and write an automation script. Use case 1 is mandatory as\r\n"
			+ "you need to first register the user to make the purchase. [You can use any tool /scripting\r\n"
			+ "language of your choice. (Please avoid UI based tools like Tosca)]");
			
			Assert.assertEquals(flag, true);
		
		System.out.println(content);
	
	
}
	

}
