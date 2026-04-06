package AgePkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		AgeValidator av=new AgeValidator();
		
		try {
			System.out.println("Enter your age:");
			int age=sc.nextInt();
			av.checkAge(age);
		} catch(Exception e)
		{
			System.out.println("Exception:"+e.getMessage());
		}
		
		sc.close();
	}
}
