package classes;

public class function {

	public static void main(String[] args) {
		function a=new function();
		a.test();
	System.out.println(	a.test1());
	System.out.println(	a.test2());
	System.out.println(a.division(8,2));

	}
	public void test() {
		System.out.println("No input no Output");
	}

	public int test1() {
		int a=10;
		int b=20;
		int c=a+b;
				return c;
	}
	
	public String test2() {
		String s="Selenium";
		return s;
	}
	public int division(int a, int b) {
		int c=a/b;
		return c;
	}
}
