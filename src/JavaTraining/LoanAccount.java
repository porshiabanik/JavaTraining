package JavaTraining;

public class LoanAccount implements IRate  {

	public void SetRate(int rate)
	{
		System.out.println("This is the first interface method");
		System.out.println("Setting rate to "+rate+"% p.a");
	}

	public void IncreaseRate(int newrate)
	{
		System.out.println("This is the second interface method");
		System.out.println("Increasing rate to "+newrate+ "% p.a");
	}
	
	public void Term(int term)
	{
		System.out.println("term is "+term+" years");
	}
	
}
