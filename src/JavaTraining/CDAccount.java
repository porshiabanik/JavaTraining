package JavaTraining;

public class CDAccount extends BankAccount{
	int interest_rate;
	void compute(int interest_rate)
	{
		System.out.println("A "+account_type+" with account number "+account_number+ " whose holder is "+name+" has balance of "+balance+" and its interest rate is : "+interest_rate+"% p.a");
	}

}
