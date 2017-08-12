package visitor;

public class StudentVisitor implements FineCalculator {
	
	private double maximumFine = 10.0;
	private double totalFine = 0;
	
	@Override
	public void calculateFine(Book book) {
		// TODO Auto-generated method stub
		totalFine += book.getFine();
		System.out.println("Fine for Book(student) is:" + book.getFine());
	}

	@Override
	public void calculateFine(Magazine magazine) {
		// TODO Auto-generated method stub
		totalFine += magazine.getFine();
		System.out.println("Fine for Magazine(student) is:" + magazine.getFine());
	}

	@Override
	public void calculateFine(ResearchPaper paper) {
		// TODO Auto-generated method stub
		totalFine += paper.getFine();
		System.out.println("Fine for Research Paper(student) is:" + paper.getFine());
	}
	
	public double getTotalFine() {
		if(totalFine < maximumFine) {
			return totalFine;
		}
		
		return maximumFine;
	}

}
