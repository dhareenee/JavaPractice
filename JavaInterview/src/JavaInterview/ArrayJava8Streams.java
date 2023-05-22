package JavaInterview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayJava8Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str[]= {"hello","is","this"};
  String str1[]= {"Place","is","nice"};
  
  
  Stream<String> s1=Arrays.stream(str);
  Stream<String> s2=Arrays.stream(str1);
  
  String  fullsen[]=Stream.concat(s1, s2).toArray(size -> new String[size]);
  
for(String e:fullsen) {
	  System.out.println(e);
  }
  
  
	}

}
