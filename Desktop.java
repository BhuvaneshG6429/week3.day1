package assignment.week3day1;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("print desktop size");
	}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}
	
}
