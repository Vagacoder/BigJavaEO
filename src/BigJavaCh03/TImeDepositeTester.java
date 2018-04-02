package BigJavaCh03;

public class TImeDepositeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TimeDepositAccount Qirui = new TimeDepositAccount(10000, 5, 3);
		
		System.out.println(Qirui.getBalance());
		System.out.println("Expected: 10000.0");
		
		Qirui.addInterest();
		
		System.out.println(Qirui.getBalance());
		System.out.println("Expected: 10500.0");
		

	}

}
