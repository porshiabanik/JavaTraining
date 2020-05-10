package JavaTraining;
import java.util.Scanner;
public class IsPrimeOrNot {
private static Scanner scan;
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	scan=new Scanner(System.in);	
		int num;
		
		System.out.println("enter a number: ");
		num=scan.nextInt();
		System.out.println("Number entered is : "+num);
		CalculatePrime(num);
		
	}
	@SuppressWarnings("unused")
	static void CalculatePrime(int num)
	{
		for (int i=2;i<num/2;i++)
		{
			int remainder = num%i;
			if (remainder==0)
			{
				System.out.println("NOT PRIME");
				break;
			}
			else
			{
				System.out.println("PRIME");
				break;
			}
		}
	
		

	}

}
