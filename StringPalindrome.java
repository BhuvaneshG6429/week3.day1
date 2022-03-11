package assignment.week3day1;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to find the given string is palindrome or not
				System.out.println("----------------------palindrome----------------------------");
				 // Declare A String value as"madam"
				String s1 = "madam";
				 
				 // Declare another String rev value as ""
				String rev="";
				 // Iterate over the String in reverse order
				for(int i=s1.length()-1;i>=0;i--) {
				// Add the char into rev
					rev=rev+s1.charAt(i);
				}
				  
				 // Compare the original String with the reversed String, if it is same then print palinDrome 
				System.out.println("reverse string is "+rev+" and original String is "+s1);
				 if(rev.equalsIgnoreCase(s1)) {
					 System.out.println("palindrome");
				 }
				 else {
					 System.out.println("not a palindrome");
				 }
				 
	}

}
