package coreJavaTraining;

public class numberIsPrime {

	public static void main(String[] args) {
		
		
		// interview coding
		
		isPrime(11);

	}
	
	public static boolean isPrime(int number)
	{
		for (int i = 2; i <= number / 2; i++)
		{
			//if number divided by 1 has no remainder then it is not a prime number
			if (number % i == 0)
			{
				System.out.println(number + " is not a prime number");
				return false;
			}
		}
		System.out.println(number + " is a prime number");
		return true;
	}
	
}
