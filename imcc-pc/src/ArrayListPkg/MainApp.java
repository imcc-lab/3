package ArrayListPkg;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StudentManager sm=new StudentManager();
		
		while(true)
		{
			System.out.println("1. Add student");
			System.out.println("2. Remove student");
			System.out.println("3. Search student");
			System.out.println("4. Display students");
			System.out.println("5. Exit");
			
			System.out.println("Enter choice:");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter student id:");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter student name:");
				String name=sc.nextLine();
				System.out.println("Enter marks:");
				int marks=sc.nextInt();
				
				sm.addStudent(new Student(id, name, marks));
				break;
				
			case 2:
				System.out.println("Enter student id to remove:");
				int sid=sc.nextInt();
				sm.removeStudent(sid);
				break;
			
			case 3:
				System.out.println("Enter id to search student:");
				int ssid=sc.nextInt();
				sm.searchStudent(ssid);
				break;
				
			case 4:
				sm.displayStudents();
				break;
			
			case 5:
				System.out.println("Exiting!");
				return;
				
			default:
				System.out.println("Invalid choice");
				
			}
		}

	}

}
