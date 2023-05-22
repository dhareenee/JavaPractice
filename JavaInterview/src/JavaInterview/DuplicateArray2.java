package JavaInterview;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.*;
public class DuplicateArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String animation[]= {"dora","Chota","Shinchan","Dorimon","Barbi","Shinchan","dora"};
		
		Set<String> hashset=new HashSet<String>();
		
		for(String e:animation) {
			if(hashset.add(e)==false) {
				System.out.println(e);
			}
		}
		List<String> list=Arrays.asList(animation);
			Set<String> ps=	list.stream().filter(e->Collections.frequency(list,e)>1).collect(Collectors.toSet());
		System.out.println(ps);
		
		List<String> lsit=Arrays.asList(animation);
	Set<String>Hello=lsit.stream().filter(e->Collections.frequency(lsit, e)>1).collect(Collectors.toSet());
	System.out.println(Hello);
	}

}
