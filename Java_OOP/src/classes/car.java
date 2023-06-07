package classes;

public class car {

	int mod;
	int wheel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	car a=new car();
	car b=new car();
	car c=new car();
	a.mod=2015;
	a.wheel=4;
	
	b.mod=2014;
	b.wheel=4;
	
	c.mod=2016;
	c.wheel=4;
	
	System.out.println("Before shifting");
	System.out.println(a.mod+" - "+a.wheel);
	System.out.println(b.mod+" - "+b.wheel);
	System.out.println(c.mod+" - "+c.wheel);
	
	System.out.println("After shifting");
	
	a=b;
	b=c;
	c=a;
	
	System.out.println(a.mod+" - "+a.wheel);
	System.out.println(b.mod+" - "+b.wheel);
	System.out.println(c.mod+" - "+c.wheel);
	
	
	}

}
