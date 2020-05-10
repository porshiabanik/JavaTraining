package JavaTraining;

public class NumberCalculations {
	public static void main(String[] args) {
	    
		CalculateMin(100,21,30);
		CalculateMax(37,566,56757);
		CalculateAvg(24,36,4);
		}
				
	
	
	static void CalculateMin(int a,int b,int c)
	{
		if (a<b && b<c && a<c)
			System.out.println("Min number is a whose value is : "+a);
		else if (a>b && b<c && a>c)
			System.out.println("Min number is b whose value is : "+b);
		else 
			System.out.println("Min number is c whose value is : "+c);
	}

	
	static void CalculateMax(int a,int b,int c)
	{
		if (a<b && b<c && a<c)
			System.out.println("Max number is c whose value is : "+c);
		else if (a>b && b<c && a>c)
			System.out.println("Max number is a whose value is : "+a);
		else 
			System.out.println("Min number is b whose value is : "+b);
	}

	static void CalculateAvg(int a,int b,int c)
	{
		float sum;
		sum=a+b+c;
		float avg;
		avg=sum/3;
		System.out.println("Average is : "+avg);
		
	}

}
