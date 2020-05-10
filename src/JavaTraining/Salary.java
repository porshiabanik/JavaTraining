package JavaTraining;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String career;
 int hours_per_week=40;
 int no_of_weeks_per_year=50;
 double rate_per_hour = 80.00;
 double salary;
 
 career="Software Developer";
  System.out.println("Program is starting");
  System.out.println("My career is : " +career);
 salary =hours_per_week*no_of_weeks_per_year*rate_per_hour;
 career="Web Developer";
 System.out.println("My career as a "+career+ " at the rate of Rs."+rate_per_hour+ " per hour is: Rs." +salary+ " per year");
}

}
