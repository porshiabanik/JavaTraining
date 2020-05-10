package Algorithms;
public class Sort
{
public static void BubbleSort(int[] bubblenumbers)
{
	boolean swapped=false;
	System.out.println("Original array is : ");
	for (int j:bubblenumbers) 
		System.out.print(j+" ");
	System.out.println("\n**********");
	do {
	for (int i=0;i<bubblenumbers.length-1;i++)
	{
		int temp=0;
		if (bubblenumbers[i]>bubblenumbers[i+1])
		{
			temp=bubblenumbers[i];
			bubblenumbers[i]=bubblenumbers[i+1];
			bubblenumbers[i+1]=temp;
			swapped=true;
			swap(bubblenumbers);
		}
	}	
	
}while (swapped);
}

public static void swap (int[] bubblenumbers)
	{
		for (int value:bubblenumbers)
		{
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	

}


