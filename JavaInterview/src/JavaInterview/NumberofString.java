package JavaInterview;

import java.util.Map;
import java.util.*;

public class NumberofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Dhareene";
		char[] charArray=str.toCharArray();
		
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		for(Character c:charArray) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet=hm.entrySet();
		for(Map.Entry<Character, Integer> entry:entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
