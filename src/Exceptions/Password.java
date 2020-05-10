package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Password {

	public static void main(String[] args) {
		String filename="C:\\Users\\DELL\\Documents\\study material\\password.txt";
		File file =new File(filename);
		String password=null;
		String[] passwords=new String[15];
		
		try {
			@SuppressWarnings("resource")
			BufferedReader br= new BufferedReader(new FileReader(file));
			for (int i=0;i<passwords.length;i++)
			{
				passwords[i]=br.readLine();
			}
			br.close();
			}
		catch (FileNotFoundException e1)
		{
			System.out.println("FileNotFoundException");
			System.out.println(e1.toString());
		}
		catch (IOException e2) {
			System.out.println("Exception IOException"+filename);
			System.out.println(e2.toString());
			e2.printStackTrace();
		}
		for (int i=0;i<passwords.length;i++)
		{
			password=passwords[i];
		try
		{
			if (password.matches(".*[0-9].*"))
				throw new NumberException(password);
		}
		catch (NumberException e3)
		{
		System.out.println("Exception:NumberException");
		
		}
		try
		{
		if (password.matches(".*[A-Za-z].*"))
			throw new LetterException(password);
		}
		catch(LetterException e4)
		{
			System.out.println("Exception: LetterException");
		}
		try
		{
		if (password.matches(".*[!@#].*"))
			throw new SpecialCharacterException(password);
		}
		catch(SpecialCharacterException e5)
		{
			System.out.println("Exception: SpecialCharacterException");
		}
		finally
		{
		System.out.println("Reading done.");
		System.out.println("password in file is :"+password);
		System.out.println("***************");
		}
	}
	}
}
class NumberException extends Exception
{
	String password;
	
	NumberException(String password)
	{
		this.password=password;
		System.out.println("password "+password+" has less no number");
	}
}

class LetterException extends Exception
{
	String password;
	LetterException(String password){
		this.password=password;
		System.out.println("password "+password+" has less no alphabet");
	}
	
}

class SpecialCharacterException extends Exception
{
	String password;
	SpecialCharacterException(String password){
	System.out.println("password "+password+" has less no special character");
	}
	
	}


