package week3.day1;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("200");
		
	} 
	
	
	public static void main(String[] args) {
		
		AxisBank ba = new AxisBank();
		ba.saving();
		ba.fixed();
		ba.deposit();
	}

}
