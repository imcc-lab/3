package LinkedListPkg;

public class Task {
	
	int taskId;
	String taskName;
	
	public Task(int taskId, String taskName) {
		this.taskId = taskId;
		this.taskName = taskName;
	}
	
	public void display()
	{
		System.out.println("Task ID:"+taskId+" Task Name:"+taskName);
	}

}
