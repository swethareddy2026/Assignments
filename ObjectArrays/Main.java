import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Library library = new Library("California Library", 20);
		library.addBook(new Book("Java", "Oracle", "123", "Coding"));
		library.addBook(new Book("SQL", "IBM", "456", "Database"));
		library.addBook(new Book("Javascript", "Oracle", "789", "UI"));
		library.addBook(new Book("CSS", "W3C", "101", "Frontend"));
		library.addBook(new Book("HTML", "W3C", "112", "Frontend"));
		library.addBook(new Book("Networking", "Cisco", "131", "Security"));

		library.issueBook("Java");
		library.issueBook("HTML");

		library.returnBook("HTML");

		System.out.println("\nSearching for 'Python'");
		Book foundBook = library.findByTitle("Python");
		if (foundBook != null)
			foundBook.displayInfo();

		library.displayAllBooks();

		System.out.println("\nTotal available books: " + library.countAvailable());
	}
}