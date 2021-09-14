package it.euris.oldfashionpound;

public class OldPoundCalculator{

	public OldPound sum(OldPound a, OldPound b) {
		Integer pennies = Integer.sum(a.toPennies(),b.toPennies());
		OldPound result = new OldPound(pennies);
		System.out.println(a+" + "+b+" = "+result);
		return result;
	}

	public OldPound subtraction(OldPound a, OldPound b) {
		Integer pennies = a.toPennies() - b.toPennies();
		OldPound result =  new OldPound(pennies);
		System.out.println(a+" - "+b+" = "+result);
		return result;
	}

	public DivisionResult division(OldPound a, Integer b) {
		Integer pennies = a.toPennies() / b;
		Integer r = a.toPennies() % b;
		OldPound result =  new OldPound(pennies);
		OldPound rest =  new OldPound(r);
		DivisionResult ret = new DivisionResult(result,rest);
		System.out.println(a+" / "+b+" = "+ret);
		return ret ;
	}
	
	
	public OldPound multiplication(OldPound a, Integer b) {
		Integer pennies = a.toPennies() * b;
		OldPound result =  new OldPound(pennies);
		return result;
	}
	

}
