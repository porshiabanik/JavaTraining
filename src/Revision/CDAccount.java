package Revision;

public class CDAccount extends BankAccount {
	static String acctype="CD Account";

	public void cdmethod(int accno)
	{
		System.out.println("\nNew CD account is opened for account number : "+accno+" with IFSC code : "+IFSC);
	}
}
