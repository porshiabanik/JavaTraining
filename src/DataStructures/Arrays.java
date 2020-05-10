package DataStructures;
public class Arrays {

	public static void main(String[] args) {
		// cities array
		String[]cities = {"New York","Manhattan","San Fransisco","California"};
		System.out.println("1st city in the array is : "+cities[0]);
		String[]states = {"Texas","New Jersey","Ohio"};
		System.out.println("size of states array is : "+states.length);
		
		for (int i = 0; i < states.length; i++) {
			System.out.println("The 2nd state is :"+states[1]);
		}
		System.out.println("*********");
		int i=0;
		do {
			System.out.println("State is : "+states[i]);
			i=i+1;
		  }while (i<3);
		
		System.out.println("*********");
		System.out.println("\n\nUsing For Each loop: ");
		for (String city:cities)
			System.out.println(city);
		System.out.println("*********");
		
		//multi-dimensional arrays
		
		
		
		System.out.println("\n\nExample of multi-dimensional arrays using For-Each Loop: ");
		String[][] users= {
				{"John","Mathews","john.mathews@test.com","78790998"},
				{"Sarah","Gomes","sarah.gomes@test.com","44568986"},
				{"Jacob","Hopkins","jacob.hopkins@test.com","34538087"}
					};
		int rownum=users.length;
		System.out.println("Number of rows in array users is: "+rownum);
		int colnum=users[0].length;
		System.out.println("Number of columns in array users is: "+colnum);
		for (String [] username:users)
		{
			System.out.print("[ ");
			for (String field : username)
				{
					System.out.print(field + " ");
				}
			System.out.println(" ]");
			
		}
		System.out.println("\n *********");	
		
		System.out.println("\n\n Traversing the array:");
		for (int i1=0;i1<rownum;i1++)
			for (int j1=0;j1<colnum;j1++)
			{
				System.out.println(users[i1][j1]);
			}
System.out.println("*****************");
String[][] matrix = { {"a","b","c"},
                {"e","f","g"},
                {"h","i","j"} };

for (String[] list : matrix) {
for (int i2=list.length-1;i2>=0;i2--) {
System.out.print(list[i2]);
}
}
	}

	
	
}
