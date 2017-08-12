package visitor;

public interface FineCalculator {
	public void calculateFine(Book book);
	public void calculateFine(Magazine magazine);
	public void calculateFine(ResearchPaper paper);
}
