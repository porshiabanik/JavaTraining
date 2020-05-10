package Exceptions;
import java.util.Scanner;

public class UserDefinedException {
public static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		double payment_amount;
		System.out.println("Enter payment amount");
		payment_amount=scan.nextDouble();
		
		 Acknowledgement(payment_amount);
	}
	
public static void Acknowledgement(double payment_amount)
			{
				try
				{
			if (payment_amount<0)
				throw new NegativePaymentException(payment_amount);
				}
				catch (NegativePaymentException e)
				{
					System.out.println("Exception Occured.");
					System.out.println(e.toString());
				}
				if (payment_amount>0)
					System.out.println("Thank you for the payment of Rs."+payment_amount);	
}
			
	}

