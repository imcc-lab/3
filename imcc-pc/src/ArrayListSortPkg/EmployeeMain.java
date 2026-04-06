package ArrayListSortPkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ArrayList<Employee> e=new ArrayList<Employee>();
		
		e.add(new Employee(1,"Sakshi",25000));
		e.add(new Employee(2,"Saurabh",20000));
		e.add(new Employee(3,"Vedika",30000));
		e.add(new Employee(4,"Saras",45000));
		e.add(new Employee(5,"Vishal",20000));
		
		Collections.sort(e, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o1.salary, o2.salary);
			}
		});
		
		System.out.println("Employees sorted by salary:");
		for(Employee emp:e)
		{
			emp.display();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter salary limit to filter employees:");
		double d=sc.nextDouble();
		
		System.out.println("\nEmployees with salary above "+d+" are->");
		for(Employee emp:e)
		{
			if(emp.salary>d)
			{
				emp.display();
			}
		}
		sc.close();

	}

}
