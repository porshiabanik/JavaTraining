package JavaTraining;
import java.util.Scanner;

public class SumofNnumbers {
	private static Scanner scan;

	public static void main(String[] args) {
		
scan=new Scanner(System.in);
int a;
System.out.println("enter the value of a");
a=scan.nextInt();
CalculateSum(a);

	}
	
static void CalculateSum(int a)
{
	int sum=0;
for (int i=1;i<=a;i++)
{
	sum=sum+i;
}
	System.out.println("sum of numbers from 1 to "+a+ " is : "+sum);

}
}
