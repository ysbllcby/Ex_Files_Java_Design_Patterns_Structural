import java.awt.print.Book;

public class LibraryClient {

  private static String name;

  public static void main(String[] args) {

    NonfictionBook nonfictionBook = new NonfictionBook("A Brief History of Time");
    FictionBook book1 = new FictionBook("Hamlet", true);
    FictionBook book2 = new FictionBook("The Great Gatsby", false);

    BookCollection bookCollection = new BookCollection();
    bookCollection.addBook(nonfictionBook);
    bookCollection.addBook(book1);
    bookCollection.addBook(book2);

    checkoutBook(nonfictionBook);
    checkoutBook(book1);
    checkoutBook(book2);

    returnBook(nonfictionBook);
    returnBook(book1);
    returnBook(bookCollection);

  }

  private static void checkoutBook(Books books) {
    System.out.println("Checking out " + name + "\n");
    books.checkout();
  }

  private static void returnBook(Books books) {
    System.out.println("Returning " + name + "\n");
    books.returnBook();
  }

}
