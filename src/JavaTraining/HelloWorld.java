package JavaTraining;
import java.util.Scanner;
public class HelloWorld {
	private static Scanner scan;
	public static void main (String[]args)
	{
		String name;
		scan= new Scanner(System.in);
		System.out.println("What is your name? ");
		name=scan.next();
		System.out.println("My name is "+name);
		System.out.println("Hello World");
		System.out.println("Hello "+name);
	}
}
