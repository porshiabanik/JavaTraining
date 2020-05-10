package DataStructures;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class MapInterface {

	public static void main(String[] args) {
		HashMap<Integer,String>map1=new HashMap<Integer,String>();
		TreeMap<Integer,String>map2=new TreeMap<Integer,String>();
		LinkedHashMap<Integer,String>map3=new LinkedHashMap<Integer,String>();
		
		AddElements(map1);
		AddElements(map2);
		AddElements(map3);
		System.out.println("**************");
		
		seeKeys(map1);
		seeKeys(map2);
		seeKeys(map3);
		System.out.println("**************");
		
		Iterate(map1);
		System.out.println("**************");
		Iterate(map2);
		System.out.println("**************");
		Iterate(map3);
		System.out.println("**************");
	}

	public static void AddElements(HashMap<Integer,String>map1)
	{
		map1.put(1, "Jerry");
		map1.put(2, "Susie");
		map1.put(3, "Tommy");
		map1.put(4, "Rose");
		map1.put(5, "Andrew");
		System.out.println("Elements in HashMap map1 are : "+map1);
	}
	
	public static void AddElements(TreeMap<Integer,String>map2)
	{
		map2.put(30, "Tommy0");
		map2.put(40, "Rose0");
		map2.put(50, "Andrew0");
		map2.put(10, "Jerry0");
		map2.put(20, "Susie0");
		
		System.out.println("Elements in TreeMap map2 are : "+map2);
	}
	
	public static void AddElements(LinkedHashMap<Integer,String>map3)
	{
		map3.put(31, "Tommy1");
		map3.put(41, "Rose1");
		map3.put(11, "Jerry1");
		map3.put(21, "Susie1");
		map3.put(51, "Andrew1");
		System.out.println("Elements in LinkedHashMap map3 are : "+map3);
	}
	
	public static void seeKeys(HashMap<Integer,String>map1)
	{
		System.out.println("Keys in HashMap map3 are :"+map1.keySet());
		System.out.println("Element at number 2 is : "+map1.get(2));
		System.out.println("new method to see elements: "+map1.toString());
	}
	public static void seeKeys(TreeMap<Integer,String>map2)
	{
		System.out.println("Keys in TreeMap map3 are :"+map2.keySet());
		System.out.println("Element at number 10 is : "+map2.get(10));
		System.out.println("new method to see elements: "+map2.toString());
	}
	
	public static void seeKeys(LinkedHashMap<Integer,String>map3)
	{
		System.out.println("Keys in LinkedHashMap map3 are :"+map3.keySet());
		System.out.println("Element at number 31 is : "+map3.get(31));
		System.out.println("new method to see elements: "+map3.toString());
	} 
	
	public static void Iterate(HashMap<Integer,String>map1)
	{
		for (int key:map1.keySet())
		{ 
			System.out.println("[Key is :"+key+ " Value is : "+map1.get(key)+ "]");
		}
	}
	
	public static void Iterate(TreeMap<Integer,String>map2)
	{
		for (int key:map2.keySet())
		{ 
			System.out.println("[Key is :"+key+ " Value is : "+map2.get(key)+ "]");
		}
	}
	public static void Iterate(LinkedHashMap<Integer,String>map3)
	{
		for (int key:map3.keySet())
		{ 
			System.out.println("[Key is :"+key+ " Value is : "+map3.get(key)+ "]");
		}
	}
	
	
}
