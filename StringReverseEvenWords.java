package assignment.week3day1;

public class StringReverseEvenWords {

	public static void main(String[] args) {
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
//		Declare the input as Follow
			String test1 = "I am a software tester";
			
//		a) split the words and have it in an array
			String[] splitTotal = test1.split(" ");
			//System.out.println(Arrays.toString(splitTotal));
			
//		b) Traverse through each word (using loop)
			for(int i=0;i<splitTotal.length;i++) {
//		c) find the odd index within the loop (use mod operator)
				if(i%2!=0) {
//		d)split the words and have it in an array
//		e)print the even position words in reverse order using another loop (nested loop)
//		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
					String reverseEven="";
					char[] splitOdd=splitTotal[i].toCharArray();
					for(int j=splitOdd.length-1;j>=0;j--) {
						reverseEven+=splitOdd[j];
						
					}
					System.out.println(reverseEven+" ");
				}

				else {
				
					System.out.println(splitTotal[i]+" ");
					
					
				}
				
			}	
			
			
			

	}

}
