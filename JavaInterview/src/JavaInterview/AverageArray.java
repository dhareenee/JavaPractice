package JavaInterview;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num[]= {1,2,3};
		int total=0;
		int div=num.length;
		for(int i=0;i<num.length;i++) {
			
			total+=num[i];
			
		}
		
		int average=total/div;
		System.out.println(average);
		OptionalDouble ave=Arrays.stream(num).average();
		
	System.out.println(ave.getAsDouble());

	}

}
