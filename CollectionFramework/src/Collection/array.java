package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class array {

	public static void main(String[] args) {
		
		ArrayList<Object> a=new ArrayList<Object>();
		a.add(100);
		a.add("Selenium");
		a.add("new");
		a.add("30.6");
		
		System.out.println(a);
		
		System.out.println(a.contains("Selenium"));
		
		System.out.println(a.get(0));
		System.out.println(a.indexOf("new"));
		System.out.println(a.lastIndexOf(" "));
		System.out.println(a.isEmpty());
		System.out.println(a.remove(2));
		System.out.println(a.set(1, "Addthrough"));

		
		System.out.println("----For Loop ------");
		
		for(int i=0;i<a.size();i++) {
			System.out.println( a.get(i));
		}
		
		
		System.out.println("----For Each---");
		for(Object e:a) {
		System.out.println(e);
		}
		System.out.println("----Iterator---");
		Iterator t=a.iterator();
		if(t.hasNext()) {
			System.out.println(t.next());
		}
		
		
		
	}

}
