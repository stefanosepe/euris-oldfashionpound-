package it.euris.oldfashionpound;

public class OldPound  {
	private String sign;
	private Integer pounds;
	private Integer shillings ;
	private Integer pennies;
	public Integer getPounds() {
		return pounds;
	}
	public void setPounds(Integer pounds) {
		this.pounds = pounds;
	}
	public Integer getShillings() {
		return shillings;
	}
	public void setShillings(Integer shillings) {
		this.shillings = shillings;
	}
	public Integer getPennies() {
		return pennies;
	}
	public void setPennies(Integer pennies) {
		this.pennies = pennies;
	}
	
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public OldPound(Integer pounds, Integer shillings, Integer pennies) {
		super();
		this.pounds = pounds;
		this.shillings = shillings;
		this.pennies = pennies;
		this.sign = "";
	}
	
	public OldPound(Integer pounds, Integer shillings, Integer pennies,String sign) {
		super();
		this.pounds = pounds;
		this.shillings = shillings;
		this.pennies = pennies;
		this.sign = sign;
	}
	
	public OldPound() {
		
	}
	
	public OldPound(Integer input) {
		this.sign = "";
		boolean isNegative = false;
		if(input<0) {
			isNegative = true;
			input = input *-1;
		}
		this.pennies = input%12;
		input = input - this.pennies; 
		this.shillings = Integer.divideUnsigned(input,12)%20; 
		input = input - this.shillings * 12;
		this.pounds = input/12/20;
		if (isNegative) 
			this.sign = "-";
	}
	
	public Integer toPennies() {
		return (this.pounds*20*12)+(this.shillings*12)+this.pennies;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof OldPound)) {
            return false;
        }
		OldPound otherObj = (OldPound) obj;
		
         
		return otherObj.getPennies().equals(this.getPennies()) && 
				otherObj.getPounds().equals(this.getPounds()) &&
				otherObj.getShillings().equals(this.getShillings()) &&
				otherObj.getSign().equals(this.getSign());
	}
	@Override
	public String toString() {
		return (sign!=null?sign:"") +" "+ pounds + "p "+ shillings + "s " + pennies+ "d";
	}
	
	
	
	
	
	
}
