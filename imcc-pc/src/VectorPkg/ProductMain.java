package VectorPkg;

import java.util.Scanner;
import java.util.Vector;

public class ProductMain {

	public static void main(String[] args) {
		
		Vector<Product> vp=new Vector<Product>();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Choose below options:"
					+ "\n1. Add"
					+ "\n2. Remove"
					+ "\n3. Display"
					+ "\n4. Exit");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter product id:");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter product name:");
				String name=sc.nextLine();
				System.out.println("Enter product price:");
				double price=sc.nextDouble();
				vp.add(new Product(id,name,price));
				break;
			case 2:
				if(vp.isEmpty())
				{
					System.out.println("No products available");
				}else {
				vp.remove(vp.size()-1);
				System.out.println("Last product removed");
				}
				break;
			case 3:
				if(vp.isEmpty())
				{
					System.out.println("No products available");
				}else {
				for(Product p:vp)
				{
					p.display();
				}
				}
				break;
			case 4:
				System.out.println("Exiting");
				return;			
			default:
				System.out.println("Invalid choice");
			}		
		}

	}

}
