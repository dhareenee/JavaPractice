package JavaInterview;

import java.util.Arrays;

public class LargeSmallNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {-10,-9,2,4,7,9,1};
		
		int larger=num[0];
		int small=num[0];
		for (int i=1;i<num.length;i++) {
			if(num[i]>larger) {
				larger=num[i];
			}else if(num[i]<small){
				small=num[i];
			}
				
			}
		System.out.println(Arrays.toString(num));
		System.out.println(larger);
		System.out.println(small);
		}

	}


