package JavaTraining;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount account1=new BankAccount();
		account1.name="PORSHIA BANIK fake";
		//account1.IFSC_code=7128;
		account1.account_number=12345678;
		account1.account_type="Savings";
		account1.balance=100.00;
		System.out.println("*****************");
		
		BankAccount account2=new BankAccount("Checking Account",7128);
		account2.name="PORSHIA BANIK NEW";
		//account2.IFSC_code=7128;
		account2.account_number=00000000;
		account2.account_type="Savings";
		account2.balance=1000.00;
		System.out.println("*****************");
		
		BankAccount account3=new BankAccount("Savings Account","PORSHIA BANIK",7128,63763866,10000,10000,5000);
		account3.name="PORSHIA BANIK";
		//account3.IFSC_code=7128;
		account3.account_number=63763866;
		account3.account_type="Savings";
		account3.balance=10000.00;
		System.out.println("*****************");
		
		CDAccount account4=new CDAccount();
		account4.name="PORSHIA BANIK";
		//account3.IFSC_code=7128;
		account4.account_number=63763866;
		account4.account_type="CD Account";
		account4.balance=1000.00;
		account4.interest_rate=8;
		account4.CheckBalance();
		account4.compute(account4.interest_rate);
		System.out.println("*****************");
		
		BankAccount account5=new BankAccount();
		account5.name="FAKE ACCOUNT";
		//account1.IFSC_code=7128;
		account5.account_number=99999999;
		account5.account_type="Fake";
		account5.balance=100.00;
		System.out.println(account5.toString());
		System.out.println(account5.toString(account5.account_type, account5.name, account5.account_number,account5.balance));
		System.out.println("*****************");
		
		BankAccount account6=new BankAccount();
		//account1.IFSC_code=7128;
		account6.account_number=23416789;
		account6.account_type="Savings";
		account6.balance=10000.00;
		account6.setName("Rose Williams");
		System.out.println(account6.getName());
		System.out.println("*****************");
		account6.SetRate(8);
		account6.IncreaseRate(10);
		System.out.println("*****************");
	}

}
