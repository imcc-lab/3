package ShapePkg;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius of the circle:");
		double r=sc.nextDouble();
		
		Circle c=new Circle(r);
		
		System.out.println("Area of circle:"+c.area());
		System.out.println("Perimeter of circle:"+c.perimeter());
		
		System.out.println("\nEnter length of the rectangle:");
		double l=sc.nextDouble();
		System.out.println("\nEnter width of the rectangle:");
		double w=sc.nextDouble();
		
		Rectangle rect=new Rectangle(l,w);
		
		System.out.println("Area of rectangle:"+rect.area());
		System.out.println("Perimeter of rectangle:"+rect.perimeter());

	}

}
