package MainPkg;

import java.util.Scanner;

import MathOperationsPkg.Calculator;
public class MainClassTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();
		
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		System.out.println("Select which operation to perform->"
				+ "\n1. Addition"
				+ "\n2. Subtraction"
				+ "\n3. Multiplication"
				+ "\n4. Division");
		int op=sc.nextInt();
		
		if(op==1)
		{
			System.out.println(c.add(a, b));
		}
		else if(op==2)
		{
			System.out.println(c.subtract(a, b));
		}
		else if(op==3)
		{
			System.out.println(c.multiply(a, b));
		}
		else if(op==4)
		{
			System.out.println(c.divide(a, b));
		}
		else {
			System.out.println("Invalid input");
		}

	}

}
