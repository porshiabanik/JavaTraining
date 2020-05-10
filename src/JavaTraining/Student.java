package JavaTraining;

public class Student
{
	String firstname;
	String lastname;
	String name;
	String SSN;
	private static int ID=100;
	String UserID;//ID+1000<=random<=9000+last 4 digit of SSN
	@SuppressWarnings("unused")
	private double initbalance;
	private static  double fees=600;
	private String phone;
	String subject;
	private String city;
	private String state;
	private double balance=0;

//constructor definition
	
public void Student()
	{
		System.out.println("New Student database is created here.");
	}

public void Student(String name,String SSN)
{	ID++;
	System.out.println("Student "+name+" has SSN:"+SSN+" has ID:"+ID);
}

public void createEmail(String name)
{
	String email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@gmail.com";
	System.out.println("Email for "+name+" whose SSN is "+SSN+" is : "+email);
}

public void createUserID()
{	int randomactual=0;
	int random=(int) (Math.random()*10000);
	if (random>=1000 && random<=9000)
		randomactual=random;
	String userID=ID+""+randomactual+""+SSN.substring(4, 8);
	System.out.println("User ID for "+name+" and SSN:"+SSN+" is : "+userID);
}

public void enroll(String subject)
{
	System.out.println(name+" with SSN: "+SSN+" has enrolled to the following courses:");
	System.out.println(showCourses(subject));
}
public void pay(String subject)
{
	System.out.println( name+" with SSN: "+SSN+" has paid Rs."+fees+" for the "+showCourses(subject)+" course");
}
public String showCourses(String subject)
{
	return subject;
}

public String toString(String name,String SSN)
{
	return "[Student with SSN:"+SSN+" ]\n[Student name: "+name+" ]\n[Student ID:" +ID+" ]";
}

public void checkBalance()
{	
	 balance=balance+fees;
	System.out.println("Student has a balance of Rs."+balance);
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

}