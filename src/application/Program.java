package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Daniel", 0.0);
		BusinessAccount ba = new BusinessAccount(1002, "leo", 2000.0, 12);

		// UPCASTING

		Account ac1 = ba;
		Account ac2 = new BusinessAccount(1003, "carol", 200.0, 0.0);
		Account ac3 = new SavingsAccount(1004, "Ana", 0.00, 0.01);
			
		//DOWNCASTING
		
		BusinessAccount ac4 = (BusinessAccount) ac2;
		ac4.loan(100.0);
		//BusinessAccount ac5 =(BusinessAccount) ac3; // Neste caso o downcasting não é permitido porque o objeto account 
		//foi instanciado como savingsAccount  e não businessAccount.
		if(ac3 instanceof BusinessAccount) {
			BusinessAccount ac5 =(BusinessAccount) ac3; 
			ac5.loan(200.0);
			System.out.println("Loan!");
		}
		if(ac3 instanceof SavingsAccount) {
			SavingsAccount ac5= (SavingsAccount) ac3;
			ac5.updateBalance();
			System.out.println("Update!");
		}
	}

}
