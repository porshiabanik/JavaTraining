package JavaTraining;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String BookTitle="Lord Of The Rings";
		if (BookTitle.contains("Rings"))
		{
			System.out.println("BookTitle contains Rings: TRUE");
		}
		String BookTitle1="Lord Of The Rings123";
		
		if (BookTitle1.equalsIgnoreCase("LORD OF THE rings123"))
		{
			System.out.println("BookTitle contains LORD OF THE rings123: TRUE");
		}
		String firstname="Porshia";
		String lastname="Banik";
		int dob=24091990;
		System.out.println("Passwod is : "+firstname.substring(0, 1)+lastname.substring(0, 1)+ dob);
	}

}
