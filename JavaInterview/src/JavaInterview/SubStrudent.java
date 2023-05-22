package JavaInterview;
import java.util.*;

public class SubStrudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentMaster sm=new StudentMaster("Suekiyaal", 1, 1, 100);
		StudentMaster sm1=new StudentMaster("Dhareene", 1, 1, 34);
		StudentMaster sm2=new StudentMaster("Poovendran", 1, 1, 75);
		
		List<StudentMaster> lis=new ArrayList<StudentMaster>();
		
		lis.add(sm);
		lis.add(sm1);
		lis.add(sm2);
		
		lis.stream().forEach(e->System.out.println(e.getName())  );
		lis.stream().filter(e->e.getMark()>50).forEach(e->System.out.println(e.getName()+" : "+e.getMark()));
		

		

	}

}
