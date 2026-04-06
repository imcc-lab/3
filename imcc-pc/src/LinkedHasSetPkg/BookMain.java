package LinkedHasSetPkg;

import java.util.LinkedHashSet;

public class BookMain {

	public static void main(String[] args) {
		LinkedHashSet<Book> books = new LinkedHashSet<>();

        books.add(new Book(1, "Java Programming"));
        books.add(new Book(2, "Python Basics"));
        books.add(new Book(3, "Data Structures"));
        books.add(new Book(1, "Java Programming")); // duplicate

        System.out.println("Books in insertion order:");

        for(Book b : books) {
            b.display();
        }

	}

}
