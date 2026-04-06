package TreeMapPkg;

import java.util.TreeMap;

public class Library {

	TreeMap<Integer, String> books = new TreeMap<>();

    // Add book
    public void addBook(int id, String name) {
        books.put(id, name);
        System.out.println("Book added successfully.");
    }

    // Remove book
    public void removeBook(int id) {
        if(books.containsKey(id)) {
            books.remove(id);
            System.out.println("Book removed.");
        } else {
            System.out.println("Book ID not found.");
        }
    }

    // Search book
    public void searchBook(int id) {
        if(books.containsKey(id)) {
            System.out.println("Book Found: " + books.get(id));
        } else {
            System.out.println("Book not found.");
        }
    }

    // Display books
    public void displayBooks() {
        System.out.println("Books in sorted order of ID:");

        for(Integer id : books.keySet()) {
            System.out.println("Book ID: " + id + " Book Name: " + books.get(id));
        }
    }
}
