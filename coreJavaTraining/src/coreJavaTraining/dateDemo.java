package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub лекция 40
		
		Date d= new Date();

		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());


	}

}
