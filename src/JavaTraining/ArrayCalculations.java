package JavaTraining;

public class ArrayCalculations {

	public static void main(String[] args) { 
		int[]numbers= {33,46,22,743,23,3563,336};
		MinCal(numbers);
		MaxCal(numbers);
		AvgCal(numbers);

	}
	
	static void MinCal(int[] numbers)
	{
		int min=numbers[0];
		for (int i=0;i<numbers.length;i++)
		{
			if (numbers[i]<min)
			{
				min=numbers[i];
			}
		}
		System.out.println("Min number in array is : "+min);
	}

	
	static void MaxCal(int[] numbers)
	{
		int max=numbers[0];
		for (int i=0;i<numbers.length;i++)
		{
			if (numbers[i]>max)
			{
				max=numbers[i];
			}
		}
		System.out.println("Max number in array is : "+max);
	}
	static void AvgCal(int[] numbers)
	{
		float sum=0;
		float avg=0;
		for (int i=0;i<numbers.length;i++)
		{
			sum=sum+numbers[i];
			avg=sum/numbers.length;
		}
		System.out.println("Avg number in array is : "+avg);
		}
		
	}

