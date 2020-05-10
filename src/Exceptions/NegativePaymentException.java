package Exceptions;

@SuppressWarnings("serial")
public class NegativePaymentException extends Exception
{
	double payment_amount;
	public NegativePaymentException(double payment_amount)
	{
		System.out.println("Exception Occured: Negative payment is invalid.");
		this.payment_amount=payment_amount;
	}
	
	public String toString()
	{
		return "Negative payment amount entered is : "+payment_amount+" \nPlease enter valid payment amount.";
		
	}
}
