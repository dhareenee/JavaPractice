package JavaInterview;

import java.io.File;

public class getFilePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath=System.getProperty("user.dir")+"\\src\\JavaInterview";
		File file=new File(filePath);
		File[] projectdir=file.listFiles();
		
		for(File e:projectdir) {
			if(e.isFile()) {
				System.out.println("File :" +e);
			}else if (e.isDirectory()) {
				System.out.println("Folder "+e);
			}else {
				System.out.println("UnKnown "+e);
			}
		}
		
		
		
		

	}

}
