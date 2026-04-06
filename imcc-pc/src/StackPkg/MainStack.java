package StackPkg;

import java.util.Scanner;

public class MainStack {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StackDemo sd = new StackDemo();

        try {

            System.out.print("Enter Postfix Expression: ");
            String exp = sc.nextLine();

            int result = sd.evaluatePostfix(exp);

            System.out.println("Result: " + result);

        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
	}

}
