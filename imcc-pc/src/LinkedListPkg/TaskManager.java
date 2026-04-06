package LinkedListPkg;

import java.util.LinkedList;

public class TaskManager {
	
	LinkedList<Task> ll=new LinkedList<Task>();
	
	public void addTaskBeggining(Task t)
	{
		ll.addFirst(t);
		System.out.println("Task added at first!");
	}
	
	public void addTaskLast(Task t)
	{
		ll.addLast(t);
		System.out.println("Task added at last!");
	}

	public void removeTask()
	{
		if(ll.isEmpty())
		{
			System.out.println("No task available to remove.");
		}
		else {
			ll.removeFirst();
			System.out.println("Task removed!");
		}
	}
	
	public void displayTasks()
	{
		if(ll.isEmpty())
		{
			System.out.println("No tasks avialable to display.");
		}
		for(Task t:ll)
		{
			t.display();
		}
	}
}
