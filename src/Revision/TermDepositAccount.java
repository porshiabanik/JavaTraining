package Revision;

public class TermDepositAccount implements Rate {

	int term=5;

	@Override
	public void setrate() {
		System.out.println("\nRate is set at "+rate+" % p.a for Term Deposit Account for the first year.");
		
	}
	
	public void setnewrate()
	{
		int newrate=(int) (rate*1.5);
		System.out.println("New rate for Term Deposit Account after the first year is : "+newrate+ " % p.a");
	}
	
}
