package JavaInterview;

import java.lang.reflect.Field;

public class Translater {
	
	static {
		
		try {
			Field value=String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("Hello Dhareene", value.get("Can you type the email id"));
			value.set("dhareene98@gmail.com", value.get("Can you please send mthe address it will easy to fetch your user data"));
			value.set("India", value.get("Please wait a movement our agent  will conattc with you soon"));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Hello Dhareene");

	}

}
