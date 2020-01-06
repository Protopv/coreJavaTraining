package coreJavaTraining;

public class reversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int variable holdeing the value
		int x = 472318;
		
		//variable that will hold the reversed number
		int xReverse;
		
		String val = String.valueOf(x);
		String finalVal = "";
		
		//reversed loop that iterates backwards through the string
		for (int i = val.length() - 1;i >= 0; i--)
		{
			finalVal += val.charAt(i);
		}
		
		//convert the string back to an integer
		xReverse = Integer.parseInt(finalVal);

		//print out the reversed int
		System.out.println("The number reversed is: "+ xReverse);
	}

}
