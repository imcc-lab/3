package MainPkg;
import java.util.Scanner;

import UtilityPkg.*; //wildcard import
import UtilityPkg.StringUtility;	//explicit import

public class TestUtility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StringUtility s=new StringUtility();
		System.out.println("Enter string to reverse and display in uppercase:");
		String u=sc.next();
		
		System.out.println("Reversed string-> "+s.reverse(u));
		System.out.println("String in uppercase-> "+s.toUpperCase(u));
		
		sc.close();

	}

}
