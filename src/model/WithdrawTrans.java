package model;

public class WithdrawTrans {
	
	private int withdraw;
	private int balance;
	
	public WithdrawTrans() {
		super();
	}
	
	public WithdrawTrans(int withdraw, int balance) {
		super();
		this.withdraw = withdraw;
		this.balance = balance;
		setWithdrawBalance(withdraw, balance);
	}

	public void setWithdrawBalance(int withdraw, int balance) {
		
		balance = balance - withdraw;		
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
