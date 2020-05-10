package JavaTraining;
import java.util.Scanner;

public class Factorial {
private static Scanner scan;
	public static void main(String[] args) {
		int num;
		scan=new Scanner(System.in);
		System.out.println("Enter the value of num");
		num=scan.nextInt();
		System.out.println("Value of num is : "+num);
		FindFact(num);
	}

	 static void FindFact(int num)
	{
		int fact=1;
		for (int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
	System.out.println("Factorial of n is : "+fact);
	}
	 
	 
}

