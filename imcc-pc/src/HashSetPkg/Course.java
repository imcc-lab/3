package HashSetPkg;

public class Course {
	
	int id;
	String name;
	
	public Course(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("ID:"+id+" Name:"+name);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;

        if(obj == null || getClass() != obj.getClass()) return false;

        Course c = (Course) obj;

        return id == c.id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
}
