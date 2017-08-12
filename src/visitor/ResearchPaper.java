package visitor;

public class ResearchPaper implements Item {
	
	private double fine1Day = 0.2;
	private double fine2Day = 0;
	private int loanDays = 0;
	private double fine = 0;
	
	ResearchPaper(int loanDays) {
		this.loanDays = loanDays;
	}
	
	public double getFine() {
		return fine;
	}

	@Override
	public void accept(FineCalculator fc) {
		// TODO Auto-generated method stub
		int overDueDays = loanDays - 21;
		if(fc instanceof StudentVisitor)
			fine = fine1Day * overDueDays;
		else
			fine = fine2Day * overDueDays;
		
		fc.calculateFine(this);
	}

}
