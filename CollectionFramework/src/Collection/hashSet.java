package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class hashSet {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("i");
		al.add("o");
		HashSet hs=new HashSet();
		hs.add("d");
		hs.add("a");
		hs.add("u");
		hs.addAll(al);
		
		System.out.println(hs);
		
		hs.removeAll(al);
		System.out.println(hs);
	System.out.println(	hs.contains("d"));
	System.out.println(	hs.isEmpty());
		
	for(Object e:hs) {
		System.out.println(e);
	}
	
	System.out.println("------New-------");
		String a="Dhareene";
		
		char[] b=a.toCharArray();
		
		HashSet hss=new HashSet();
		
		for(char n:b) {
			if(hss.add(n)==false) {
				System.out.println(n);
			}
			
		}
		System.out.println(hs);
	
		

	}

}
