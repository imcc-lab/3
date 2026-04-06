package EmployeePkg;

public class Employee {

	public void checkSalary(double salary) throws InvalidSalaryException
	{
		if(salary<10000)
		{
			throw new InvalidSalaryException("Salary cannot be less than 10000");
		}
		
		System.out.println("Valid salary:"+salary);
	}
}
