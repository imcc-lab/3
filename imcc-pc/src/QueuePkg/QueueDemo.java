package QueuePkg;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	Queue<Integer> ql=new LinkedList<>();
	
	public void enqueue(int a)
	{
		ql.add(a);
		System.out.println("Element added:"+a);
	}
	
	public void dequeue()
	{
		try {
			if(ql.isEmpty()) {
				throw new Exception("Queue is empty");
			}
			int val=ql.remove();
			System.out.println("Element removed:"+val);
		} catch(Exception e)
		{
			System.out.println("Exception:"+e.getMessage());
		}
	}
	
	public void peek()
	{
		try {
			if(ql.isEmpty()) {
				System.out.println("Queue is empty");
			}
			System.out.println("Top element-"+ql.peek());
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void display()
	{
		System.out.println("Entire queue-"+ql);
	}
	
}
