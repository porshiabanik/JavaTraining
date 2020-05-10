package Revision;

public class BankAccount implements Rate {

	static final int IFSC=5647;
	String acctype;
	private int accno;
	private double initbalance;
	private double deposit;
	private double withdraw;
	String activity;
	
	//default constructor
	
	BankAccount()
	{
		System.out.println("\nThis is the default constructor");
		System.out.println("New account created.");
	}
	
	//parameterized constructor 
	
	BankAccount(String acctype)
	{
		System.out.println("\nThis is the first parameterized constructor");
		System.out.println("New " +acctype+ " account is created with IFSC code : "+IFSC);
	}
	
	//parameterized constructor 
	
	BankAccount(String acctype,
				int accno)
	{
		System.out.println("\nThis is the second parameterized constructor");
		System.out.println("New "+acctype+ " account created with account number: "+accno);
	}
	
	//first method
	
	void deposit(double deposit)
	{
		System.out.println("\nThis is the first method");
		System.out.println("Deposit amount is Rs."+deposit);
	}
	
	//second method 
	//method overloading
	
	void deposit(int accno,double deposit)
	{
		System.out.println("\nThis is the second method and first overloading example");
		System.out.println("Deposit amount for account number : "+accno+ " is Rs."+deposit);
		System.out.println("Activity is : "+activity("deposit"));
	}
	
	void withdraw(int accno,double withdraw)
	{
		System.out.println("\nThis is the third method");
		System.out.println("Withdraw amount for account number : "+accno+ " is Rs."+withdraw);
		System.out.println("Activity is : "+activity("withdraw"));
	}

	 String activity(String activity) 
	 {
		return activity;
	 }
	 
	 void checkbalance(int accno,double initbalance,double deposit,double withdraw)
	 {
		 System.out.println("This is the fouth method");
		 double balance=initbalance+deposit-withdraw;
		 System.out.println("The account : "+accno+" has balance of Rs."+balance);
		 
	 }
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public double getInitbalance() {
		return initbalance;
	}

	public void setInitbalance(double initbalance) {
		this.initbalance = initbalance;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	//interface method#1
	
	@Override
	public void setrate() {
		 System.out.println("Rate is set at "+rate+" % p.a");
		
	}
	
public void calyearlybalance(int accno,double initbalance,double deposit,double withdraw)
{
	System.out.println("\nThis is the fifth method");
	 double balance=initbalance+deposit-withdraw;
	 double yearlybalance=balance+(balance*rate/100);
	 System.out.println("The account : "+accno+" has yearly balance of Rs."+yearlybalance);
}
	
public String toString(int accno,String acctype)
{
	return "[Account details are: \n accno:"+accno+ " \n acctype: "+acctype+"\n IFSC Code: "+IFSC+" ]";
}
}
