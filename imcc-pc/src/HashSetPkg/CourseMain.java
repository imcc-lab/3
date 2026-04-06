package HashSetPkg;

import java.util.HashSet;

public class CourseMain {

	public static void main(String[] args) {
		
		HashSet<Course> courses = new HashSet<>();

        courses.add(new Course(101, "Java"));
        courses.add(new Course(102, "Python"));
        courses.add(new Course(103, "Data Structures"));
        courses.add(new Course(101, "Java"));   // duplicate

        System.out.println("Unique Courses:");

        for(Course c : courses) {
            c.display();
        }

	}

}
