package entities;

public class SavingsAccount extends Account { //conta poupança
	private Double interestRate; //taxa de juros
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance = balance + balance *interestRate;
	}
	
	@Override
	public void withdraw(Double amount) {
		balance -= amount;
	}
	
}
