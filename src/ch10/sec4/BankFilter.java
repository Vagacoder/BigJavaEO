package ch10.sec4;

import ch10.sec1.BankAccount;

public class BankFilter implements Filter {

	@Override
	public boolean accept(Object x) {

		BankAccount bankAcc = (BankAccount) x;
		double balance = bankAcc.getMeasure();
		if (balance >= 1000) {
			return true;
		} else {
			return false;
		}
	}
	
//	@Override
//	public boolean accept(Object x) {
//
//		BankAccount bankAcc = (BankAccount) x;
//		double balance = bankAcc.getMeasure();
//		if (balance >= 1000) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
