package JavaTraining;

import java.util.Scanner;

public class Whether {
	private static Scanner scan;
	public static void main(String[] args) {
		// wearing dress according to temperature and sun condtion
float temperature;
String sun_condition;
 scan = new Scanner(System.in);

System.out.println("Temeprature is : ");
temperature=scan.nextFloat();
System.out.println("Sun condition is : ");
sun_condition=scan.next();
System.out.println("Sun condition is : " +sun_condition);
 if (temperature>30 && sun_condition.equalsIgnoreCase("sunny"))
	 System.out.println("Wear a short dress");
 	else if (temperature>10 && temperature<30 && sun_condition.equalsIgnoreCase("cloudy"))
	 System.out.println("Wear a long dress");
 else
	 System.out.println("Wear a jacket");
	
	}

}
