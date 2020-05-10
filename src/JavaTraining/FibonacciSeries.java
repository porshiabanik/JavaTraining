package JavaTraining;
import java.util.Scanner;
public class FibonacciSeries {
private static Scanner scan;
	public static void main(String[] args) {
		int a,b;
		
		scan=new Scanner(System.in);
		System.out.println("enter the value of a ");
		a=scan.nextInt();
		System.out.println("enter the value of b ");
		b=scan.nextInt();
		CalculateFibonacci(a,b);
		

	}
	static void CalculateFibonacci(int a,int b)
	{
		int count;
		int sum=0;
		System.out.println("new Fibonacci Series is : ");
		for (count =1;count<15;count++)
			
		{
			sum=a+b;
			a=b;
			b=sum;
			count++;
			System.out.println(b);
		}
			
			
		}
	}


