package DataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		List<String[]> data=new ArrayList<String[]> ();
		String filename="C:\\Users\\DELL\\Documents\\study material\\trainingfile.csv";
		String read=null;
		try {
			//open the file 
			
			BufferedReader br =new  BufferedReader(new FileReader(filename));
			
			//read the data as long as its not empty
			 read=br.readLine();
			while (read!=null)
			{
				String[] line =read.split(",");
				data.add(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String [] dataline: data)
		{
			System.out.print("[ ");
			for (String word : dataline)
			{
				System.out.print(word+ "  ");
		    }
			System.out.print(" ]");
 
}
	System.out.println(read);	
	}
}
