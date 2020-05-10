package Exceptions;

public class commonexceptions {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		try
		{
		int c=a/b;
		}
		catch(ArithmeticException exception1)
		{
			System.out.println("Exception Occured:");
			System.out.println("ArithmeticException:Cannot divide a number by zero.");
			System.out.println(exception1.toString());
		}
		System.out.println("Program is closing.");
		System.out.println("**********");
		String[] color= {"red","blue","green","yellow","pink"};
		for (int i=0;i<=color.length;i++)
			try {
			System.out.println(color[i]);
			}
		catch (ArrayIndexOutOfBoundsException exception2)
		{
			System.out.println("Exception Occured:");
			System.out.println("ArrayIndexOutOfBoundsException:Array index outside allowable limit.");
			System.out.println(exception2.toString());
		}
		finally
		{
			System.out.println("Iterating through array");
		}
		System.out.println("Program is closing.");
		System.out.println("**********");
}
	
}
