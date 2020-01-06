package coreJavaTraining;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class readFromText {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("src/coreJavaTraining/sampleTest.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		
		Integer sumOfTextNumbers = 0;
		
		try {
			//go through each line of the file and total up the numbers
			while ((st = br.readLine())!=null)
			{
				sumOfTextNumbers += Integer.parseInt(st);
				System.out.println(st);//print each line read from the file
			}
			
			System.out.println("The sum of all number in the text file: "+ sumOfTextNumbers);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
