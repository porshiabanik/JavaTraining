package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumber {

	public static void main(String[] args) {
		
		String filename="C:\\Users\\DELL\\Documents\\study material\\phonenumber.txt";
		File file =new File(filename);
		String phonenumber=null;
		String[] phonenumbers=new String[10];
		
		try {
			@SuppressWarnings("resource")
			BufferedReader br= new BufferedReader(new FileReader(file));
			for (int i=0;i<phonenumbers.length;i++)
			{
			phonenumbers[i]=br.readLine();
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
		for (int i=0;i<phonenumbers.length;i++)
		{
			phonenumber=phonenumbers[i];
		try
		{
			if (phonenumber.length()!=10)
				throw new TenDigitExceptionException(phonenumber);
		}
		catch (TenDigitExceptionException e3)
		{
		System.out.println("Exception:TenDigitException");
		
		}
		try
		{
		if (Integer.valueOf(phonenumber.substring(0,1))==0)
			throw new StartingDigitIsZeroException(phonenumber);
		}
		catch(StartingDigitIsZeroException e4)
		{
			System.out.println("Exception: StartingDigitIsZeroException");
		}
		try
		{
		if (Integer.valueOf(phonenumber.substring(0, 3))==911)
			throw new EmmergencyPhoneException(phonenumber);
		}
		catch(EmmergencyPhoneException e5)
		{
			System.out.println("Exception: EmmergencyPhoneException");
		}
		finally
		{
		System.out.println("Reading done.");
		System.out.println("Phone number in file is :"+phonenumber);
		System.out.println("***************");
		}
	}
	}
}
class TenDigitExceptionException extends Exception
{
	String phonenumber;
	
	TenDigitExceptionException(String phonenumber)
	{
		this.phonenumber=phonenumber;
		System.out.println("Phone number "+phonenumber+" has less than 10 digits");
	}
}

class StartingDigitIsZeroException extends Exception
{
	String phonenumber;
	StartingDigitIsZeroException(String phonenumber){
		this.phonenumber=phonenumber;
		System.out.println("First digit of phone number " +phonenumber+" is 0");
	}
	
}

class EmmergencyPhoneException extends Exception
{
	String phonenumber;
	EmmergencyPhoneException(String phonenumber){
	System.out.println("phone number "+phonenumber+" is 911.");
	}
	
}
