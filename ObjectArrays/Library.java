import java.util.Arrays;

public class Library {

	String nameOfLibrary;
	Book[] books;
	int bookCount = 0;
	int maxNumberOfBooks;

	public Library(String nameOfLibrary, int maxNumberOfBooks) {
		this.nameOfLibrary = nameOfLibrary;
		this.books = new Book[maxNumberOfBooks];
		this.bookCount = 0;
	}

	public String getNameOfLibrary() {
		return nameOfLibrary;
	}

	public void setNameOfLibrary(String nameOfLibrary) {
		this.nameOfLibrary = nameOfLibrary;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	public int getMaxNumberOfBooks() {
		return maxNumberOfBooks;
	}

	public void setMaxNumberOfBooks(int maxNumberOfBooks) {
		this.maxNumberOfBooks = maxNumberOfBooks;
	}

	public void addBook(Book b) {

		if (this.getBookCount() < books.length) {
			this.books[bookCount] = b;
			bookCount++;
		} else
			System.out.println("Library is full. Cannot add " + b.getTitle()+ "\n");
	}

	public Book findByTitle(String title) {
		for (int i = 0; i < bookCount; i++) {
			if (books[i].getTitle().equalsIgnoreCase(title)) {
				return books[i];
			}
		}
		System.out.println("Book titled '" + title + "' not found." + "\n");
		return null;
	}
	
	   public void findByAuthor(String author) {
	        System.out.println("\nSearching for books by: " + author+ "\n");
	        boolean found = false;
	        for (int i = 0; i < bookCount; i++) {
	            if (books[i].getAuthor().equalsIgnoreCase(author)) {
	                books[i].displayInfo();
	                found = true;
	            }
	        }
	        if (!found) System.out.println("No books found by " + author+ "\n");
	    }
	   public void issueBook(String title) {
	        Book b = findByTitle(title);
	        if (b != null) {
	            if (!b.isIssued()) {
	                b.markIssued();
	                System.out.println("You have successfully issued: " + title + "\n");
	            } else {
	                System.out.println("Sorry, '" + title + "' is already issued." + "\n");
	            }
	        }
	    }

	    public void returnBook(String title) {
	        Book b = findByTitle(title);
	        if (b != null) {
	            b.markReturned();
	            System.out.println("You have successfully returned: " + title+ "\n");
	        }
	    }

	    public void displayAllBooks() {
	        System.out.println(getNameOfLibrary() + " Inventory"+ "\n");
	        for (int i = 0; i < bookCount; i++) {
	            books[i].displayInfo();
	        }
	    }

	    public int countAvailable() {
	        int count = 0;
	        for (int i = 0; i < bookCount; i++) {
	            if (!books[i].isIssued()) {
	                count++;
	            }
	        }
	        return count;
	    }
	}