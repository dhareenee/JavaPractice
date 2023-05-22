package JavaInterview;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//String path=System.getProperty("user.dir")+"\\src\\JavaInterview\\createNew";
		//File file=new File(path);
		//file.createNewFile();

	
	
	try {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file Path");
		String FileName=sc.nextLine();
		
		FileOutputStream fos=new FileOutputStream(FileName,true);
		
		System.out.println("Enter the content of the file");
		
	String content=	sc.nextLine();
	byte[] conbyte=content.getBytes();
	
	fos.write(conbyte);
	fos.close();
	System.out.println(" the file is created");
		
		
	}
	catch(Exception e){
		e.getStackTrace();
		
	}

}
}
