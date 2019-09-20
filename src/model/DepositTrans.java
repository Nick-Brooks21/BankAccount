package model;

public class DepositTrans {
	
	private int deposit;
	private int balance;
	
	public DepositTrans() {
		super();
	}
	
	public DepositTrans(int deposit, int balance) {
		super();
		this.deposit = deposit;
		this.balance = balance;
		setDepositBalance(deposit, balance);
	}

	public void setDepositBalance(int deposit, int balance) {
		
		balance = balance + deposit;
	}
	
	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
