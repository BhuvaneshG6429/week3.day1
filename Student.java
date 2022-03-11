package assignment.week3day1;

public class Student extends Department{
	public void studentName() {
		System.out.println("student name");
	}
	public void studentDept() {
		System.out.println("student department");
	}
	public void studentId() {
		System.out.println("student ID");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentId();
	}

}
