package Algorithms;
import java.util.Scanner;
public class Demo {
private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		int[] numbers= {35,67,90,24,14};
		int Lineartarget;
		System.out.println("Enter the number to be searched through Linear Search");
		Lineartarget=scan.nextInt();
		
		Algorithms.LinearSearch(numbers,Lineartarget);
		System.out.println("**********");
		
		int[] numberset= {10,12,15,20,25,26,30,35,40,42,45,50,52,55,60,61,65,67,70};
		int binarytarget;
		System.out.println("Enter the number to be searched through Binary Search");
		binarytarget=scan.nextInt();
		
		Algorithms.BinarySearch(numberset, binarytarget, 0, numberset.length);
		System.out.println("**********");
		
		int[] bubblenumbers= {35,67,24,90,124,14,2};
		Sort.BubbleSort(bubblenumbers);
	}

}
