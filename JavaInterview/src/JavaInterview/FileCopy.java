package JavaInterview;
import java.io.*;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileinputpath = System.getProperty("user.dir")+"\\src\\JavaInterview\\Sample";
		String FileoutputPath = System.getProperty("user.dir")+"\\src\\JavaInterview\\SampleCopy";
		copyFile(fileinputpath,FileoutputPath);

	}
	
	public static void copyFile(String inputURL ,String outputURL) throws IOException{
		File file=new File(inputURL);
		File DestFile=new File(outputURL);
		
		FileInputStream fileInputStream=null;
		FileOutputStream fileOutputStream=null;
		
		 fileInputStream=new FileInputStream(file);
		 fileOutputStream=new FileOutputStream(DestFile);
		 
		 int i=0;
		 try {
			while((i=fileInputStream.read())!=-1) {
				 fileOutputStream.write(i);
			 }
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 finally {
			 if(fileInputStream !=null) {
				 fileInputStream.close();
			 }
			 if(fileOutputStream !=null) {
				 fileOutputStream.close();
			 }
		 }
		
		
	}

}
