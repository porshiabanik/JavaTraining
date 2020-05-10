package JavaTraining;
import java.util.Scanner;

public class IsPalindromeOrNot {
private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		int num;
		System.out.println("Entera number");
		num=scan.nextInt();
		IsPalindrome(num);

	}

	private static void IsPalindrome(int num)
	{
		int temp=num;
		int sum=0;
		int last_digit;
		while (temp>0)
		{
			last_digit=temp%10;
			sum=last_digit+(sum*10);
			temp=temp/10;
		}
		if (sum==num)
			System.out.println("Number "+num+ " is palindrome");
		else
			System.out.println("Number "+num+ " is not palindrome");
	}
}
