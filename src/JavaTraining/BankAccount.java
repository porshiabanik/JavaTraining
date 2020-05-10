package JavaTraining;
//public access specifier>>anywhere in the project
//default access specifier>>anywhere in the package
//private access specifier>>anywhere in the class only

public class BankAccount implements IRate{
	String name;
	static final int  IFSC_code=7128;//static>>class and not for object instance
	int account_number;//final>>constant
	String account_type;
	double balance;
	


//default constructor
	
BankAccount(){
	System.out.println("This is default constructor");
	System.out.println("New account created");
	Deposit();
	Withraw();
	CheckBalance();
}

//1st parameterized constructor

BankAccount(String AccountType,int IFSC_code){
	System.out.println("This is the first parameterized constructor");
	System.out.println("New account created : "+AccountType+" with IFSC code : "+IFSC_code);
}

//2nd parameterized constructor

BankAccount(String AccountType,String AccountName,int IFSC_code,int account_number,double initial_balance,double deposit_amount,double withdraw_amount){
	
	System.out.println("This is the second parameterized constructor");
	System.out.println("Type of account created is : "+AccountType+" having IFSC code : " +IFSC_code+ " with account name as: "+AccountName+" having initial balance of Rs."+initial_balance);
	Deposit(deposit_amount);
	Withraw(withdraw_amount);
	CheckBalance(initial_balance,deposit_amount,withdraw_amount);
}

void Deposit()
{
	double deposit_amount=1000.00;
	System.out.println("Rs."+deposit_amount+" is deposited");
}

void Withraw()
{
	double withdraw_amount=500.00;
	System.out.println("Rs."+withdraw_amount+ " is withrawn");
}

void CheckBalance()
{
	System.out.println("Balance is Rs.600.00");
}

//method overloading means calling same method with different arguments
//polymophism
void Deposit(double deposit_amount)
{
	System.out.println("Rs."+deposit_amount+" is deposited");
	CheckActivity("DEPOSIT");
}

void Withraw(double withdraw_amount)
{
	System.out.println("Rs."+withdraw_amount+ " is withrawn");
	CheckActivity("WITHDRAW");
}

private void CheckActivity(String Activity)
{
	System.out.println("Your recent activity was :"+Activity);
}
void CheckBalance(double initial_balance,double deposit_amount,double withdraw_amount)
{
	double new_balance=initial_balance+deposit_amount-withdraw_amount;
	System.out.println("Balance is Rs."+new_balance);
}
//overriding method//polymorphism
public String  toString(String account_type,String name,int account_number,double balance)
{
  return("Type of account created is : "+account_type+" with account name as: "+name+" having balance of Rs."+balance);	
}

//encapsulation+getter+setter
public void setName(String name)
{
	this.name=name;
}

public String getName()
{
	return name;
}

public void SetRate(int rate)
{
	System.out.println("This is the first interface method");
	System.out.println("Setting rate to "+rate+"% p.a");
}

public void IncreaseRate(int newrate)
{
	System.out.println("This is the second interface method");
	System.out.println("Increasing rate to "+newrate+ "% p.a");
}
}
