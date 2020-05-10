package JavaTraining;
import java.util.Scanner;
public class OddEven {
	private static Scanner scan;
	public static void main(String[] args) {
		int num;
		scan = new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
		System.out.println("Number entered by user is : "+num);
		OddOrEven(num);
	}

	private static void OddOrEven(int num)
	{
		if (num%2==0)
			System.out.println("Number is even");
		else 
			System.out.println("Number is odd");
	}
}
