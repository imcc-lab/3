package UtilityPkg;

public class StringUtility {
	
	public String reverse(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	
	public String toUpperCase(String str)
	{
		return str.toUpperCase();
	}

}
