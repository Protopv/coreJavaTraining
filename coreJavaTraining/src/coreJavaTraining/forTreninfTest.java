package coreJavaTraining;

public class forTreninfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// interview coding
		
		
		/*String a = "Good";
		String b = " ";
		
		for (int i = a.length()-1; i>=0; i--)
		{
			b = b + a.charAt(i);
		}
		System.out.println(b);*/
		
		/*int y = 20;
		do
		{
			System.out.println(y);
			y++;
		}
		while (y<30);*/
		
		int abc [][] = {{3,10,5},{4,5,6},{6,8,3}};
		int min = abc[0][0];
		for (int i = 0; i < 3; i ++)
		{
			for (int j = 0; j<3; j++)
			{
				if (abc[i][j]< min)
				{
					min = abc[i][j];
				}
			}
		}
		System.out.println(min);
	}

}
