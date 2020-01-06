package coreJavaTraining;

public class childClassDemo extends parentClassdemo {
	
	
	public void engine()
	{
		System.out.println("new engine");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassDemo cd = new childClassDemo();
		cd.colour();
		


	}

}
