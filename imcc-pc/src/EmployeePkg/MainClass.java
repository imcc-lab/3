package EmployeePkg;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		
		try {
			System.out.println("Enter employee salary:");
			double salary=sc.nextDouble();
			
			e.checkSalary(salary);
		}catch(InvalidSalaryException i)
		{
			System.out.println("Exception:"+i.getMessage());
		}
	}

}
