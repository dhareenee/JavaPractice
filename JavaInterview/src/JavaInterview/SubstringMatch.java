package JavaInterview;

public class SubstringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(substring("Suekiyaal is cutest ever","alos"));

	}
	public static boolean substring(String main,String sub) {
		return main.matches(".*"+sub+".*");
	}

}
