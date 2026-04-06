package AgePkg;

public class AgeValidator {
	
	public void checkAge(int age) throws Exception
	{
		if(age<18)
		{
			throw new Exception("Age is less than 18!");
		}
		else {
			System.out.println("Valid age, you are eligible!");
		}
	}

}
