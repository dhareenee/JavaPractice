package JavaInterview;

public class StringCapitalCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="HelloThisIsATest";
		
		int count=0;
		if(Character.isLowerCase(str.trim().charAt(0))) {
			count++;
		}
		
		long value=str.chars().filter(e->Character.isUpperCase(e)).count();
		System.out.println(value);
		
		long value1=str.chars().filter(e-> e>=65 && e<=90).count();
		System.out.println(value1);

	}

}
