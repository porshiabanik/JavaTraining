package JavaTraining;

class Person{
	
	String name;
	String dob;
	String email;
	
	 void Walking()
	{
		System.out.println(name+ " is walking");
	}
	
	 void Talking()
	{
		System.out.println(name+ " is talking");
	}
}

public class DemoClass {

	public static void main(String[] args) {
		
		Person person1=new Person();
		person1.name="Porshia";
		person1.dob="24Sep1990";
		person1.email="porshia@gmail.com";
		System.out.println("Person1 is "+person1.name+" whose DOB is "+person1.dob+ " and email is "+person1.email);
		person1.Walking();
		person1.Talking();
		
		Person person2=new Person();
		person2.name="Tuttu";
		person2.dob="24Sep1990";
		person2.email="porshia@gmail.com";
		System.out.println("person2 is "+person2.name+" whose DOB is "+person2.dob+ " and email is "+person2.email);
		person2.Walking();
		person2.Talking();
	}

}
