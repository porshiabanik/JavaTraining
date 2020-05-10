package DataStructures;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//hashset or set adds items haphazardly
//linked hashset adds elements in the order of their entry
//Tree set adds elements in alphabetical order

public class SetInterface {

	public static void main(String[] args) {
		HashSet<String> animals=new HashSet<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("lion");
		animals.add("tiger");
		animals.add("monkey");
		animals.add("bear");
		Display(animals);
		
		Set<String> animal=new LinkedHashSet<String>();
		animal.add("dog");
		animal.add("cat");
		animal.add("lion");
		animal.add("tiger");
		animal.add("monkey");
		animal.add("bear");
		
		Display(animal);
		Size(animal);
		
		animal.add("tiger");
		animal.add("giraffee");
		animal.add("polar bear");
		animal.add("goose");
		Display(animal);
		Size(animal);
		
		Set<String> farmanimal=new HashSet<String>();
		farmanimal.add("dog");
		farmanimal.add("cat");
		farmanimal.add("hen");
		farmanimal.add("cow");
		farmanimal.add("goose");
		farmanimal.add("donkey");
		Displayfarmanimal(farmanimal);
		
		intersection(animal,farmanimal);
		union(animal,farmanimal);
		difference(animal,farmanimal);
		
		Set<String> newanimal=new TreeSet<String>();
		newanimal.add("dog");
		newanimal.add("mongoose");
		newanimal.add("pig");
		newanimal.add("wolf");
		Display(newanimal);
	}
	
	public static void Display( HashSet<String>animals)
	{
		System.out.println("\n animals in the set are: ");
		System.out.println(animals);
	}
	
	public static void Display( Set<String>animal)
	{
		System.out.println("\n animals in the set are: ");
		System.out.println(animal);
	}

	public static void Size( Set<String>animal)
	{
		System.out.println("\n Size of set is : "+animal.size());
		System.out.println("\n **********************");
	}
	
	public static void Displayfarmanimal( Set<String>farmanimal)
	{
		System.out.println("\n farmanimals in the set are: ");
		System.out.println(farmanimal);
	}
	public static void intersection(Set<String>animal,Set<String>farmanimal)
	{
		Set<String> intersectionset=new HashSet<String>(animal);
		intersectionset.retainAll(farmanimal);
		System.out.println("\n Animals common between animal and farmanimal sets are : ");
		System.out.println(intersectionset);
		System.out.println("\n **********************");
	}
	
	public static void union(Set<String>animal,Set<String>farmanimal)
	{
		Set<String> unionset=new HashSet<String>(animal);
		unionset.addAll(farmanimal);
		System.out.println("\n Animals present in both animal and farmanimal sets are : ");
		System.out.println(unionset);
		System.out.println("\n **********************");
	}
	
	public static void difference(Set<String>animal,Set<String>farmanimal)
	{
		Set<String> differenceset=new HashSet<String>(animal);
		differenceset.removeAll(farmanimal);
		System.out.println("\n Animals present in animal but not in farmanimal sets are : ");
		System.out.println(differenceset);
		System.out.println("\n **********************");
	}
	
	public static void Display( TreeSet<String>newanimal)
	{
		System.out.println("\n New animals in the tree set are: ");
		System.out.println(newanimal);
	}
}
