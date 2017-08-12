package visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> items = new ArrayList<>();
		StudentVisitor studentFC = new StudentVisitor();
		
		Item book1 = new Book(30);
		Item magazine1 = new Magazine(24);
		Item paper1 = new ResearchPaper(60);
		
		items.add(book1);
		items.add(magazine1);
		items.add(paper1);
		
		for(Item item : items) {
			item.accept(studentFC);
		}
		
		double totalFineForStudent = studentFC.getTotalFine();
		System.out.println("Total fine for Student is:" + totalFineForStudent);
		System.out.println();
		
		List<Item> items2 = new ArrayList<>();
		FacultyVisitor facultyFC = new FacultyVisitor();
		
		Item book2 = new Book(70);
		Item magazine2 = new Magazine(90);
		Item paper2 = new ResearchPaper(30);
		
		items2.add(book2);
		items2.add(magazine2);
		items2.add(paper2);
		
		for(Item item : items2) {
			item.accept(facultyFC);
		}
		
		double totalFineForFaculty = facultyFC.getTotalFine();
		System.out.println("Total fine for Faculty is:" + totalFineForFaculty);
	}

}
