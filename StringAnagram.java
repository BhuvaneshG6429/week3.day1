package assignment.week3day1;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to find the given strings are Anagrams or not 	  
		// Declare a String 
			String text1 = "stops";
		// Declare another String
			String text2 = "potss"; 
		 // a) Check length of the strings are same then (Use A Condition)
			if(text1.length()==text2.length()) {
				System.out.println("strings are of same length");
			}
			
		 // b) Convert both Strings in to characters
			char[] ch1=text1.toCharArray();
			char[] ch2=text2.toCharArray();
		 // c) Sort Both the arrays
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
		 // d) Check both the arrays has same value
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Arrays have same value");
			}
			else 
			{ 
				System.out.println("Arrays do not have same value"); 
			}
			
	}

}
