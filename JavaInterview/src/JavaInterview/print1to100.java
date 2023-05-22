package JavaInterview;

import java.util.Arrays;

public class print1to100 {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	stream(0);
		
		Object num[]=new Object[100];
		Arrays.fill(num, new Object() {
			
			int count=0;
			public String toString() {
				return Integer.toString(++count);
			}
		});
		System.out.println(Arrays.toString(num));
		
		
			}
	public static void stream(int count) {
		if(count<100) {
			count+=1;
			System.out.println(count);
			stream(count);
		}
		
	}

}
