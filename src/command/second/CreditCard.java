package command.second;

public class CreditCard {
	private String number;
	private double creditLine;
	private boolean isValidated;
	
	public boolean isValidated() {
		return isValidated;
	}

	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}

	CreditCard(String number, double creditLine) {
		this.number = number;
		this.creditLine = creditLine;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(double creditLine) {
		this.creditLine = creditLine;
	}
	
	
}
