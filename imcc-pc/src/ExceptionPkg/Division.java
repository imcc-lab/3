package ExceptionPkg;

public class Division {
	
	public void divison(int a, int b)
	{
		try {
			int div=a/b;
			System.out.println("Result->"+div);
		} catch(ArithmeticException ae)
		{
			System.out.println("Message->"+ae);
		}
		finally {
			System.out.println("Code executed successfully!");
		}
	}

}
