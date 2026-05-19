package mockBook;

import java.util.Objects;
import java.util.Scanner;

public class book {

	int b_id;
	String title ;
	String author ;
	
	public book() {
		// TODO Auto-generated constructor stub
	}

	public book(int b_id, String title, String author) {
		this.b_id = b_id;
		this.title = title;
		this.author = author;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter Book id");
		b_id = sc.nextInt();
		System.out.println("Enter Book Title ");
		title = sc.next();
		System.out.println("Enter Book Author ");
		author = sc.next();
	}

	public int getB_id() {
		return b_id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(b_id);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof book))
			return false;
		book other = (book) obj;
		return b_id == other.b_id;
	}

	@Override
	public String toString() {
		return "book [b_id=" + b_id + ", title=" + title + ", author=" + author + "]";
	}

	public void setB_id(Scanner sc) {
		this.b_id = sc.nextInt();
	}
	
	
	
	
	
}
