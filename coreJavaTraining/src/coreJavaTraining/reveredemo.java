package coreJavaTraining;

public class reveredemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s = "Eduard";
		String t = "";
		for(int i=s.length()-1; i>=0;i--)
		{
			t = t+ s.charAt(i);
		}
		
		System.out.println(t);
   

	}

}



//String s = "Eduard";
//for(int i=s.length()-1; i>=0;i--)
//{
//	System.out.println(s.charAt(i));
//}