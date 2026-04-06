package ArrayListSortPkg;

public class Employee {
	
	int eid;
	String ename;
	double salary;
	
	public Employee(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("ID:"+eid+" Name:"+ename+" Salary:"+salary);
	}

}
