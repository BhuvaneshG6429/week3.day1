package assignment.week3day1;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("deposit");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axis = new AxisBank();
		axis.fixed();
		axis.saving();
		axis.deposit();
	
		

	}

}
