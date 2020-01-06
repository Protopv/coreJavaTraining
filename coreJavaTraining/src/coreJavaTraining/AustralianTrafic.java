package coreJavaTraining;


public class AustralianTrafic implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AustralianTrafic a=new AustralianTrafic();
		a.redStop();
		a.FlashYellow();
		a.greenGo();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
		
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("FlashYellow implementation");

	}

}
