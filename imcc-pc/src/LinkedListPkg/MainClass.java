package LinkedListPkg;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		TaskManager tm=new TaskManager();
		
		while(true)
		{
			System.out.println("Choose below options:"
					+ "\n1. Add task at beggining"
					+ "\n2. Add task at the end"
					+ "\n3. Remove a task"
					+ "\n4. Display all tasks"
					+ "\n5. Exit");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter task id:");
				int id1=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter task name:");
				String name1=sc.nextLine();
				tm.addTaskBeggining(new Task(id1,name1));
				break;
			case 2:
				System.out.println("Enter task id:");
				int id2=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter task name:");
				String name2=sc.nextLine();
				tm.addTaskLast(new Task(id2,name2));
				break;
			case 3:
				tm.removeTask();
				break;
			case 4:
				tm.displayTasks();
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
