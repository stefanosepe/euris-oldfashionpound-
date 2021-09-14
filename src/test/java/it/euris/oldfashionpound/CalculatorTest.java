package it.euris.oldfashionpound;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private OldPoundCalculator calculator;
	
	@Before
	public void setUp() throws Exception {
		calculator = new OldPoundCalculator();
	}
	
	@Test
	public void testSum() {
		OldPound a = new OldPound(5, 17, 8);
		OldPound b = new OldPound(3, 4, 10); ;
		OldPound result = new OldPound(9, 2, 6);;
		assertTrue(calculator.sum(a, b).equals(result));
	}
	
	@Test
	public void testSubtraction() {
		OldPound a = new OldPound(5, 17, 8);
		OldPound b = new OldPound(3, 4, 10);
		OldPound result = new OldPound(2, 12, 10);
		assertTrue(calculator.subtraction(a, b).equals(result));
	}
	
	
	@Test
	public void testMultiplication() {
		OldPound a = new OldPound(5, 17, 8);
		OldPound result = new OldPound(11, 15, 4);
		assertTrue(calculator.multiplication(a, 2).equals(result));
	}
	
	@Test
	public void testDivision() {
		OldPound a = new OldPound(5, 17, 8);
		DivisionResult result = new DivisionResult( new OldPound(1, 19, 2),new OldPound(0, 0, 2));
		assertTrue(calculator.division(a, 3).equals(result));
	}
	
	@Test
	public void testDivision2() {
		OldPound a = new OldPound(18, 16, 1);
		DivisionResult result = new DivisionResult( new OldPound(1, 5, 0),new OldPound(0, 1, 1));
		System.out.println(result);
		assertTrue(calculator.division(a, 15).equals(result));
	}
	
	
}
