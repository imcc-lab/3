package QueuePkg;

import java.util.Scanner;

import LinkedListPkg.Task;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		QueueDemo qd=new QueueDemo();
		
		while(true)
		{
			System.out.println("Choose below options:"
					+ "\n1. Enqueue"
					+ "\n2. Dequeue"
					+ "\n3. Peek"
					+ "\n4. Display"
					+ "\n5. Exit");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter a number:");
				int num=sc.nextInt();
				qd.enqueue(num);
				break;
			case 2:
				qd.dequeue();
				break;
			case 3:
				qd.peek();
				break;
			case 4:
				qd.display();
				break;
			case 5:
				System.out.println("Exiting");
				return;
			default:
				System.out.println("Invalid choice");
			}		
		}
	}

}
