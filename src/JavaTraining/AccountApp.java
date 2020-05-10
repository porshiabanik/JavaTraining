package JavaTraining;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount LoanAccount1=new LoanAccount();
		LoanAccount1.SetRate(8);
		LoanAccount1.IncreaseRate(9);
		LoanAccount1.Term(6);
		System.out.println("*************");
		
		IRate LoanAccount2=new LoanAccount();
		LoanAccount2.SetRate(5);
		LoanAccount2.IncreaseRate(8);
		System.out.println("*************");
	}
	
	

}
