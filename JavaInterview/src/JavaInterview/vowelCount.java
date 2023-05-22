package JavaInterview;

import java.util.function.IntPredicate;

public class vowelCount {

	public static boolean isVowel(char t) {
		
		return t=='a' ||t=='e' ||t=='i' ||t=='o' ||t=='u' || t=='A' ||t=='E' ||t=='I' ||t=='O' ||t=='U' ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Dhareene";
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				
				count++;
			}
		}
		System.out.println(count);
		
		IntPredicate Vcount=new IntPredicate() {;
		public boolean  test(int t) {
			return t=='a' ||t=='e' ||t=='i' ||t=='o' ||t=='u' || t=='A' ||t=='E' ||t=='I' ||t=='O' ||t=='U' ;
		}
	};
	
	String str1="Poovendran";
	long e=str1.chars().filter(Vcount).count();
	System.out.println(e);
	
		

	}

}
