package JavaInterview;

public class getMultipleOccuranceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Dhareene is a ";
	System.out.println(getReoccuranceChar(str,'e'));

	}
	
	public static long getReoccuranceChar(String str , char i) {
		return str.chars().filter(e->(char)e==i).count();
		
		
		
	}

}
