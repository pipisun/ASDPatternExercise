package visitor;

public class Book implements Item {
	
	FineCalculator fc;
	private double fineDay = 0.1;
	private int loanDays = 0;
	private double fine = 0;
	
	Book(int loanDays) {
		this.loanDays = loanDays;
	}
	public double getFine() {
		int overDueDays = loanDays - 21;
		fine = fineDay * overDueDays;
		return fine;
	}

	public double getFineDay() {
		return fineDay;
	}

	public void setFineDay(double fineDay) {
		this.fineDay = fineDay;
	}

	@Override
	public void accept(FineCalculator fc) {
		// TODO Auto-generated method stub
		fc.calculateFine(this);
	}

}
