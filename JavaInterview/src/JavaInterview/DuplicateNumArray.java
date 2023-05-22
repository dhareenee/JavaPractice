package JavaInterview;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.*;
import java.util.Map.Entry;

public class DuplicateNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lang[]= {"java","Ruby","python","C","java","C"};
		
		for(int i=0;i<lang.length;i++) {
			for(int j=i+1;j<lang.length;j++) {
				if(lang[i].equals(lang[j])) {
				//	System.out.println("Duplicate : "+lang[i]);
				}
			}
		}
		
		
		
		Set<String> hs=new HashSet<String>();
		for(String  langs : lang) {
			if(hs.add(langs)==false){
			//	System.out.println("Duplicate : "+langs);
			}
		}
		
		Map<String,Integer> hm=new HashMap<String,Integer>();
		for(String lanugs:lang) {
			Integer count=hm.get(lanugs);
			if(count==null) {
				hm.put(lanugs, 1);
			}
			else {
				hm.put(lanugs, ++count);
			}
		}
			Set<Entry<String,Integer>> entry=hm.entrySet();
			for(Entry<String,Integer> entryset:entry) {
				if(entryset.getValue()>1) {
					System.out.println("Duplicate : "+entryset.getKey());
				}
			}
			
			Set<String> map=new HashSet<String>();
			Set<String> dup=Arrays.asList(lang).stream().filter(e->!map.add(e)).collect(Collectors.toSet());
	System.out.println(dup);
	
	List<String> list=Arrays.asList(lang);
	Set<String> frq=
	list.stream().filter(e->Collections.frequency(list,e)>1).collect(Collectors.toSet());
	System.out.println(frq);
	}
	
		
	}

