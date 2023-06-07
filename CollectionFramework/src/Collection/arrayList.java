package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("G");
		al.add("S");
		al.add("O");
		al.add("W");
		al.add("K");
		
	   Collections.sort(al);
	   System.out.println(al);
	   Collections.shuffle(al);
	   System.out.println(al);
	   Collections.sort(al,Collections.reverseOrder());
	   System.out.println(al);
	   
	 
	
	   
	 
		

	}

}
