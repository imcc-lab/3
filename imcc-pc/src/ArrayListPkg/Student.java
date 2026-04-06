package ArrayListPkg;

public class Student {
	
	int id;
	String name;
	int marks;
	
	Student(int id, String name, int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public void display()
	{
		System.out.println("ID:"+id+" Name:"+name+" Marks:"+marks);
	}

}
