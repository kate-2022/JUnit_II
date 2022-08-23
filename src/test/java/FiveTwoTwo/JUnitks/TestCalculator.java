package FiveTwoTwo.JUnitks;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

// import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import junit.framework.TestCase;

// many thanks to N.Reddy!

public class TestCalculator 
{	
	Calculator calc = null;
	// CalculatorService service = mock(CalculatorService.class);
	@Mock
	CalculatorService service;
	
	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
  /*	CalculatorService service = new CalculatorService() {
		
		public int add(int i, int j) {
			return i+j;
		}	
	};*/
	
	
	
	@Before
	public void setUp() 
	{
		calc = new Calculator(service);
	}
	
	@Test
	public void testPerform() // perform() is the test method, not add ( provided by e.g cloud service) 
	{
		when(service.add(2, 5)).thenReturn(7);
		assertEquals(14, calc.perform(2, 5));
		verify(service).add(2, 5);
	}

}
