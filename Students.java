package assignment.week3day1;

public class Students {
	public void getStudentInfo(int ID) {
		System.out.println(ID);
	}
	
	public void getStudentInfo(String name, int ID) {
		System.out.println(ID+" "+name);
	}
	
	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println(email+" "+phoneNumber);
	}
	
	public static void main(String[] args) {
		Students stds = new Students();
		stds.getStudentInfo(1);
		stds.getStudentInfo("Bhuvanesh", 1);
		stds.getStudentInfo("bhuvicheck@gmail.com", "+91 0000000001");
	}
}	
