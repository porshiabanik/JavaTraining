package JavaTraining;



public class StudentApp {

	public static void main(String[] args) {
		Student Student1=new Student();	
		Student1.name="Sweta Banerjee";
		Student1.firstname="Sweta";
		Student1.lastname="Banerjee";
		Student1.SSN="12342345";
		Student1.Student();
		Student1.Student(Student1.name, Student1.SSN);
		Student1.createEmail(Student1.name);
		System.out.println("****************");
		Student1.createUserID();
		Student1.enroll("Maths");
		Student1.pay("Maths");
		Student1.checkBalance();
		Student1.enroll("Physics");
		Student1.pay("Physics");
		Student1.checkBalance();
		System.out.println("****************");
		System.out.println(Student1.toString(Student1.name,Student1.SSN));
		Student1.checkBalance();
		System.out.println("****************");
		Student1.setPhone("011-234565");
		System.out.println("Student has phone number:"+Student1.getPhone());
		Student1.setCity("Kolkata");
		System.out.println("Student city is : "+Student1.getCity());
		Student1.setState("West Bengal");
		System.out.println("Student state is :"+Student1.getState());
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		
		Student Student2=new Student();	
		Student2.name="Abhay Sharma";
		Student2.firstname="Abhay";
		Student2.lastname="Sharma";
		Student2.SSN="23456789";
		
		Student2.Student();
		Student2.Student(Student2.name, Student2.SSN);
		Student2.createEmail(Student2.name);
		System.out.println("****************");
		Student2.createUserID();
		Student2.enroll("Physics");
		Student2.pay("Physics");
		Student2.checkBalance();
		Student2.enroll("English");
		Student2.pay("English");
		Student2.checkBalance();
		Student2.enroll("Science");
		Student2.pay("Science");
		Student2.checkBalance();
		System.out.println("****************");
		System.out.println(Student2.toString(Student2.name,Student2.SSN));
		Student2.checkBalance();
		System.out.println("****************");
		Student2.setPhone("012-454322");
		System.out.println("Student has phone number:"+Student2.getPhone());
		Student2.setCity("Ranchi");
		System.out.println("Student city is : "+Student2.getCity());
		Student2.setState("Jharkhand");
		System.out.println("Student state is :"+Student2.getState());
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
	}

}
