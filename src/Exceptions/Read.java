package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {

		String filename="C:\\Users\\DELL\\Documents\\study material\\FileToRead.txt";
		File file =new File(filename);
		String text=null;
		try {
			@SuppressWarnings("resource")
			BufferedReader br= new BufferedReader(new FileReader(file));
			text=br.readLine();
			br.close();
			} catch (FileNotFoundException e) {
			System.out.println("Exception Occured:FileNotFoundException"+filename);
			e.printStackTrace();
		} catch (IOException e) {
				System.out.println("Exception IOException"+filename);
				e.printStackTrace();
			}
		System.out.println("Finished reading file");
		System.out.println(text);
		
	}

}
