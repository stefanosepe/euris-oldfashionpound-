package it.euris.oldfashionpound;

public class DivisionResult {
	OldPound result;
	OldPound rest;
	public OldPound getResult() {
		return result;
	}
	public void setResult(OldPound result) {
		this.result = result;
	}
	public OldPound getRest() {
		return rest;
	}
	public void setRest(OldPound rest) {
		this.rest = rest;
	}
	public DivisionResult(OldPound result, OldPound rest) {
		super();
		this.result = result;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return result + " (" + rest + ")";
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof DivisionResult)) {
            return false;
        }
		DivisionResult otherObj = (DivisionResult) obj;
		return this.result.equals(otherObj.getResult()) && this.rest.equals(otherObj.getRest());
	}
	
	
	
	
}
