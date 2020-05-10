package JavaTraining;
import java.util.Scanner;

public class Calculator {
	private static Scanner scan;

	public static void main(String[] args) {
		// calculate the addition,subtraction,multiplication,division of two numbers
int a,b;
scan=new Scanner(System.in);
System.out.println("Enter the value of a:");
a=scan.nextInt();
System.out.println("Enter the value of b:");
b=scan.nextInt();
add_method(a,b);
sub_method(a,b);
mult_method(a,b);
div_method(a,b);
	}
static void add_method(int a,int b)
{
	int c;
	c= a+b;
	System.out.println("Summation of a and b is :"+c);
}
static void sub_method(int a,int b)
{
	int c;
	c= a-b;
	System.out.println("Subtraction of a and b is :"+c);
}
static void mult_method(int a,int b)
{
	int c;
	c= a*b;
	System.out.println("Multiplication of a and b is :"+c);
}
static void div_method(int a,int b)
{
	int c;
	c= a/b;
	System.out.println("Division of a and b is :"+c);
	
}
}
