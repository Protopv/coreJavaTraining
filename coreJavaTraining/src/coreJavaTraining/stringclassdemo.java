package coreJavaTraining;

public class stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "javatraning"; //string literal
		String ab = new String("javatraning"); //with String class
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("hi Eduard"));
		System.out.println(a.toUpperCase());
		String arr[]= a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));

	}

}
