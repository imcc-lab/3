package ArrayListPkg;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students=new ArrayList<Student>();
	
	public void addStudent(Student s)
	{
		students.add(s);
		System.out.println("Student Added!");
	}
	
	public void removeStudent(int id)
	{
		for(Student s:students)
		{
			if(s.id==id)
			{
				students.remove(s);
				System.out.println("Student Removed!");
				return;
			}
		}
		System.out.println("Student not found!");
	}
	
	public void searchStudent(int id)
	{
		for(Student s:students)
		{
			if(s.id==id)
			{
				s.display();
				return;
			}
		}
		System.out.println("Student not found!");
	}
	
	public void displayStudents()
	{
		if(students.isEmpty())
		{
			System.out.println("No students found!");
			return;
		}
		for(Student s:students)
		{
			s.display();
		}
	}

}
