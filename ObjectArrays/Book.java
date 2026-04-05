import java.util.Arrays;
public class Book {

	private String title;
	private String author;
	private String isbn;
	private String genre;
	private boolean isIssued;

	public Book(String title, String author, String isbn, String genre) {
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.isbn = isbn;
		this.isIssued = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isIssued() {
		return isIssued;
	}

	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}

	// method to display info
	public void displayInfo() {
		System.out.println("The Title of the book is: " + this.getTitle());
		System.out.println("The Author of the book is: " + this.getAuthor());
		System.out.println("The Genre of the book is: " + this.getGenre());
		System.out.println("The ISBN of the book is: " + this.getIsbn());
		if (this.isIssued)
			System.out.println("The Book is issued.\n");
		else
			System.out.println("The Book is returned.\n");
	}

	public void markIssued() {
		this.setIssued(true);
	}

	public void markReturned() {
		this.setIssued(false);
	}
}
