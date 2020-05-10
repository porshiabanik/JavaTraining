package JavaTraining;

public class BankApp{
	public static void main(String[] args) {
		practicalBankAccount account1=new practicalBankAccount();
		System.out.println("**********");
		System.out.println("**********");
		practicalBankAccount account2=new practicalBankAccount("123456");
		System.out.println("**********");
		System.out.println("**********");
		practicalBankAccount account3=new practicalBankAccount("098765");
		System.out.println("**********");
		System.out.println("**********");
		practicalBankAccount account4=new practicalBankAccount("009843");
		account4.setName("Porshia");
		System.out.println("**********");
		account4.deposit(10000.00, 1000.00);
		account4.withdraw(100000, 5000);
		account4.interestrate();
		System.out.println("**********");
		System.out.println(account4.toString());
}
	}
 class practicalBankAccount implements IrateforBankApp {

		private String accountname;
		private static int ID=1000;
		private String accountnumber;// ID+2RANDOM NUMBERS+FIRST 2 DIGITS OF SSN
		private String SSN;
		private double inibalance;
		private double depositbalance;
		private double withdrawbalance;
		private double balance;
		
		//constructor definition
	
public practicalBankAccount(){
	
	System.out.println("This is the default constructor:");
	System.out.println("New account created.");
	}
	
public practicalBankAccount(String SSN){
	
	System.out.println("This is the first parameterized constructor:");
	System.out.println("New account created for SSN: "+SSN);
	ID++;
	System.out.println("ID for SSN: "+ID);
	//SSN=this.SSN;
	createAccount(SSN);
	}

private void createAccount(String SSN)
{
	
	int random=(int) (Math.random()*100);
	accountnumber=ID+""+ random + SSN.substring(0, 2) ;
	System.out.println("Account number for SSN: "+SSN+ " is "+accountnumber);
	
}
public void setName(String accountname)
{
	this.accountname=accountname;
	System.out.println("Account holdername is :"+getName());
	
}
public String getName()
{
	return accountname;
}
public void deposit(double inibalance, double depositbalance)
{
	balance=inibalance+depositbalance;
	System.out.println("Amount deposited is Rs."+depositbalance);
	showBalance();
}

public void withdraw(double balance, double withdrawbalance)
{
	balance=balance-withdrawbalance;
	System.out.println("Amount withdrawn is Rs."+withdrawbalance);
	showBalance();
}

public void showBalance()
{
	System.out.println("New account balance is :Rs."+balance);
	
}

@Override
public void interestrate() {
	balance=balance+(balance*rate);
	System.out.println("New account balance after yearly interest capitalised is :Rs."+balance);
	
}

@Override
public String toString()
{
	return "[Account number:"+accountnumber+ "]\n[Account name: "+accountname+" ]\n[Balance:Rs."+balance+"]";
}
}
	


