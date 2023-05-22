package JavaInterview;

public class RemoveSpeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="!@#$ Selenium Java";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
