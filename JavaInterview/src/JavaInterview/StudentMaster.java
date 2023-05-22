package JavaInterview;

public class StudentMaster {

	
	private String name;
	
	private int  rollnum;
	private int age;
	private int mark;
	
	public StudentMaster(String name, int rollnum, int age, int mark) {
		
		this.name = name;
		this.rollnum = rollnum;
		this.age = age;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	

	public int getRollnum() {
		return rollnum;
	}

	

	public int getAge() {
		return age;
	}

	
	public int getMark() {
		return mark;
	}

	
}
