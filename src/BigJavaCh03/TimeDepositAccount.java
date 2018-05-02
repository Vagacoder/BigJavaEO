package BigJavaCh03;

import java.lang.Math;

public class TimeDepositAccount {
	
	private double balance;
	private double rate;
	private int time;
	
	public TimeDepositAccount(double initial_amount, double interestRate, int time) {
		
		balance = initial_amount;
		rate = interestRate;
		this.time = time;
	}
		
	public double getBalance() {
		
		return balance;
					
	}
	
	public void addInterest() {
		
		balance = balance * Math.pow((1+rate/100), this.time);
		
	}
}
