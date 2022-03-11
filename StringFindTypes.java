package assignment.week3day1;

public class StringFindTypes {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		
			//a) Convert the String to character array
		char[] ch3=test.toCharArray();
			//b) Traverse through each character (using loop)
		for(int i=0;i<ch3.length;i++) {
			//c) Find if the given character is what type using (if)
			//	i)  Character.isLetter
			if(Character.isLetter(ch3[i])) {
				letter++;
			}
			//	ii) Character.isDigit
			else if(Character.isDigit(ch3[i])) {
				num++;
			}
			//	iii)Character.isSpaceChar
			else if(Character.isSpaceChar(ch3[i])) {
				space++;
			}
			//	iv) else -> consider as special character
			else {
				specialChar++;
			}
		}

		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
