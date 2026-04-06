package StudentDataPkg;

import java.util.Scanner;

public class Student {
	
	int roll_num;
	String name;
	int m1, m2, m3;
	int total_marks;
	double average_marks;
	
	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student roll number:");
		roll_num=sc.nextInt();
		System.out.println("Enter name of the student:");
		name=sc.next();
		System.out.println("Enter marks for subject 1:");
		m1=sc.nextInt();
		System.out.println("Enter marks for subject 2:");
		m2=sc.nextInt();
		System.out.println("Enter marks for subject 3:");
		m3=sc.nextInt();
		
		total_marks=m1+m2+m3;
		average_marks=total_marks/3.0;
	}
	
	public void display()
	{
		System.out.println("Student details");
		System.out.println("\nStudent roll number:"+roll_num);
		System.out.println("\nStudent name:"+name);
		System.out.println("\nTotal marks:"+total_marks);
		System.out.println("\nAverage marks:"+average_marks);
	}
	
}
