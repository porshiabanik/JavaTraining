package Revision;

public class revise {
	public static void main(String[] args) {
		BankAccount acc1=new BankAccount();
		acc1.setAccno(0000000);
		acc1.toString(acc1.getAccno(), "Dummy account");
		
		BankAccount acc2=new BankAccount("Savings");
		acc2.deposit(1000);
		acc2.setAccno(5363763);
		System.out.println("Account number is : "+acc2.getAccno());
		acc2.deposit(acc2.getAccno(), 10000);
		acc2.withdraw(acc2.getAccno(), 4000);
		acc2.setInitbalance(650000);
		acc2.setDeposit(190000);
		acc2.setWithdraw(8000);
		acc2.checkbalance(acc2.getAccno(), acc2.getInitbalance(), acc2.getDeposit(), acc2.getWithdraw());
		acc2.calyearlybalance(acc2.getAccno(), acc2.getInitbalance(), acc2.getDeposit(), acc2.getWithdraw());
		
		CDAccount acc3=new CDAccount();
		acc3.setAccno(4876486);
		acc3.cdmethod(acc3.getAccno());
		acc3.setInitbalance(60000);
		acc3.setDeposit(5000);
		acc3.setWithdraw(10000);
		acc3.checkbalance(acc3.getAccno(), acc3.getInitbalance(), acc3.getDeposit(), acc3.getWithdraw());
		acc3.setrate();
		acc3.calyearlybalance(acc3.getAccno(), acc3.getInitbalance(), acc3.getDeposit(), acc3.getWithdraw());
		System.out.println(acc3.toString());
		System.out.println(acc3.toString(acc3.getAccno(), CDAccount.acctype));
		TermDepositAccount acc4=new TermDepositAccount();
		acc4.setrate();
		acc4.setnewrate();
		
		}
	
}
