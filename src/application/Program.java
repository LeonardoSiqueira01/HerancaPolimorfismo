package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
//O super() serve para chamar o construtor da superclasse
public class Program {

	public static void main(String[] args) {
		Account ac1= new Account(14232, "Fernando", 1000.0);
		ac1.withdraw(200.0);
		System.out.println(ac1.getBalance());
		
		Account sa1 = new SavingsAccount(1233, "Julia", 1000.0, 00.1);
		sa1.withdraw(200.0);
		System.out.println(sa1.getBalance());
		
		Account ba1 = new BusinessAccount(1231, "Daniel", 1000.0, 500.0);
		ba1.withdraw(200.0);
		System.out.println(ba1.getBalance());
	}

}
