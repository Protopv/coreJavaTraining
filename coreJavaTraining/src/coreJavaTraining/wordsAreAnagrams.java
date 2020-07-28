package coreJavaTraining;

import java.util.Arrays;

public class wordsAreAnagrams {

	public static void main(String[] args) {
		
		
		// interview coding  --- Determine if 2 words are anagrams of each other
		
		areAnagrams("actor", "cotar");
		

	}
	
	
	
	public static boolean areAnagrams(String word1, String word2)
	{
		// convert the 2 words passed in to char arrays
		char[] string1 = word1.toCharArray();
		char[] string2 = word2.toCharArray();

		//sort the arrays
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		// keep track of the length of each word passed
		int stringLength1 = string1.length;
		int stringLength2 = string2.length;
		
		// check the length of each string to determine if they are anagrams
		if (stringLength1 != stringLength2)
		{
			System.out.println("The 2 words are not anagrams!");
			return false;
		}

		//determine if the 2 words of equal length are anagrams. the loop will compare each char in the sorted char array
		for (int i = 0; i < stringLength1; i++)
		{
			//compare the letters of each word to determine if they are anagrams of each other
			if (string1[i] != string2[i])
			{
				System.out.println("The 2 words are not anagrams");
				return false;
			}
		}
		
		System.out.println("The 2 words are anagrams");
		return true;
	}

}
