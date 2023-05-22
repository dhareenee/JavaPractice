package JavaInterview;

public class MissingNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,4,5};
		/*int sum=0;
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
			
		}
		int sum1=0;
		for(int j=0;j<=5;j++) {
			sum1+=j;
		}
		System.out.println("The Missing Number is : "+(sum1-sum));
*/
		int sum=0;
		for(int e:a) {
			sum+=e;
		}
		int sum1=0;
		int num=5;
		int value=(num+1)/2;
		 sum1=num*value;
				 
		
		System.out.println(sum1-sum);
	}
	
		

}
