package visitor;

public class FacultyVisitor implements FineCalculator {

	private double maximumFine = 5.0;
	private double totalFine = 0;
	
	@Override
	public void calculateFine(Book book) {
		// TODO Auto-generated method stub
		totalFine += book.getFine();
		System.out.println("Fine for Book(faculty) is:" + book.getFine());
	}

	@Override
	public void calculateFine(Magazine magazine) {
		// TODO Auto-generated method stub
		totalFine += magazine.getFine();
		System.out.println("Fine for Magazine(faculty) is:" + magazine.getFine());
	}

	@Override
	public void calculateFine(ResearchPaper paper) {
		// TODO Auto-generated method stub
		totalFine += paper.getFine();
		System.out.println("Fine for Research Paper(faculty) is:" + paper.getFine());
	}
	
	public double getTotalFine() {
		if(totalFine < maximumFine) {
			return totalFine;
		}
		
		return maximumFine;
	}
}
