package FiveTwoTwo.JUnitks;


public class Calculator 
{
	CalculatorService service;
	
	public Calculator (CalculatorService service)
	{
		this.service = service;
	}
	
	public int perform(int i, int j)   // 2  5 ->(i+j)*2
	{
		return  service.add(i, j)*i;
		// return(i+j)*i;
	}
	
}
