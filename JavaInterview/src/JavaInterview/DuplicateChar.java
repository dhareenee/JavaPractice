package JavaInterview;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Dhareener";
		char[] word=name.toCharArray();
		
		List<char[]> list=Arrays.asList(word);
		Set hw=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(hw);
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character d:word) {
			if(map.containsKey(d)) {
				map.put(d,map.get(d)+1);
			}
			else {
				map.put(d, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entryMap=map.entrySet();
		for(Map.Entry<Character, Integer> entry:entryMap) {
			if(entry.getValue()>1) {
				System.out.println("The Duplicate char : "+entry.getKey());
			}
		}
		
	}

}
