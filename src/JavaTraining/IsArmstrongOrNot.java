package JavaTraining;
import java.util.Scanner;
public class IsArmstrongOrNot {
private static Scanner scan;
	public static void main(String[] args) {
		int num1;//example : 153,1634
		String num;
		scan=new Scanner(System.in);
		System.out.println("enter a number");
		num=scan.next();
		
		num1=Integer.valueOf(num);
		isArmstrong(num1,num);
	}

	private static void isArmstrong(int num1, String num)
	{	double  r;
	int temp; 
	double  len=num.length();
	
		double sum=0;
		temp=num1;
		while (temp>0)
		{
			r=temp%10;
			temp=temp/10;
			sum= Math.pow(r, len)+sum;
			
		}
		if (sum==num1)
			System.out.println("number "+num+ " is Armstrong");
		else
			System.out.println("number "+num+ " is not Armstrong");
	}
}
