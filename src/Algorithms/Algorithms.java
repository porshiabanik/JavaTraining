package Algorithms;

public class Algorithms {
	
	public static void LinearSearch(int[]numbers,int Lineartarget)
	{
		boolean found=false;
		System.out.println("This is Linear Search");
		for (int i =0;i<numbers.length;i++)
		{
			if (numbers[i]==Lineartarget)
			{
				System.out.println(numbers[i]+ " is at index "+i);
				found=true;
				break;
			}
			
		}
		if (found==false)
			System.out.println("Number "+Lineartarget+" is not present in the array");
	}
	
	public static void BinarySearch(int[] numberset,int binarytarget,int start,int end)
	{
		System.out.println("This is Binary Search"); 
		boolean found=false;
		int middle=0;
		middle=(int) Math.floor((start+end)/2);
		int value=numberset[middle];
		
		if (binarytarget<value)
			{
				BinarySearch(numberset,binarytarget,start,middle-1);
			}
			else if (binarytarget>value)
			{
				BinarySearch(numberset,binarytarget,middle+1,end);
			}
				if (binarytarget==value)
					System.out.println("The number "+binarytarget+" is present at position "+middle);
				 	found=true;
				 	if(found==false)
				 		System.out.println(binarytarget+ " is not present in the array");
	}
	
}