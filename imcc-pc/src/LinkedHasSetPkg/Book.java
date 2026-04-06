package LinkedHasSetPkg;

public class Book {

	int bookId;
    String bookName;

    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public void display() {
        System.out.println("Book ID: " + bookId + " Book Name: " + bookName);
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;

        if(obj == null || getClass() != obj.getClass()) return false;

        Book b = (Book) obj;

        return bookId == b.bookId;
    }

    @Override
    public int hashCode() {
        return bookId;
    }
}
