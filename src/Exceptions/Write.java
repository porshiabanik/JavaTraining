package Exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String filename="C:\\Users\\DELL\\Documents\\study material\\FileToWrite.txt";
String data="This is the data I need to enter.";
try {
	FileWriter FW= new FileWriter(filename);
	FW.write(data); 
	FW.close();
} catch (IOException e) {
	System.out.println("Exception Occured: IOException"+filename);
	e.printStackTrace();
}
finally
{
	System.out.println("Closing the file now.Check the file to see if data is entered!");
}
	}

}
