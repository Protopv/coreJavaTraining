package coreJavaTraining;

import java.util.Arrays;

public class secondHignestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// interview coding
		
		
		int largest = 0;
		int secondLargest = 0;
		
		int[] arr = {9, 2, 1, 60, 47};
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > largest)
			{
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > secondLargest)
			{
				secondLargest = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("The 1nd Largest number is: "+ largest);
		System.out.println("The 2nd Largest number is: "+ secondLargest);
		

	}

}
