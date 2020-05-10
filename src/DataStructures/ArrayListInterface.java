package DataStructures;
import java.util.ArrayList;

public class ArrayListInterface {

	public static void main(String[] args) {
		ArrayList <String> city=new ArrayList <String>();
		city.add("New York");
		city.add("Manhattan");
		city.add("Toronto");
		city.add("Miami");
		Iterate(city);
		Length(city);
		Retrieve(city);
		Remove(city);
	}
	
		public static void Iterate(ArrayList <String> city)
		{
			System.out.println("The cities in the city array are: ");
		for (String city_name:city)
		{
			System.out.println(city_name);
		}
		
		}
		public static void Length(ArrayList <String> city)
		{
			System.out.println("Size of arraylist is : "+city.size());
		}
		
		public static void Retrieve(ArrayList <String> city)
		{
			System.out.println("City at 2nd position of arraylist is : "+city.get(1));
			System.out.println("City at 4th position of arraylist is : "+city.get(3));
		}
		public static void Remove(ArrayList <String> city)
		{
		city.remove(0);
		System.out.println("Size of arraylist is : "+city.size());
		System.out.println("The cities in the city array after Removal are: ");
		for (String city_name:city)
		{
			System.out.println(city_name);
		}
		}
	}


