package MainPkg;

import StudentPkg.Student;

public class AccessVariables {

	public static void main(String[] args) {
		
		Student s=new Student();
		
		//accessible because public
		System.out.println("ID of student:"+s.id);
		//not accessible because protected
		//System.out.println("Name of the student:"s.name);
		//not accessible because default
		//System.out.println("Roll number -"s.roll_num);

	}

}
