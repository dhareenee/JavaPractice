package JavaInterview;

import java.util.Arrays;

public class Shiftzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,7,4,0,9,7,4,5};
	System.out.println(Arrays.toString(shiftzero(a)));

	}

	private static int[] shiftzero(int a[]) {
		// TODO Auto-generated method stub
		
		if(a.length==1) {
			return a;
		}
		int newa[]=new int[a.length];
		int count =0;
		for(int c:a) {
			if(c!=0) {
				newa[count]=c;
				count++;
				
			}
			
		}
		return newa;
		
	}

}
