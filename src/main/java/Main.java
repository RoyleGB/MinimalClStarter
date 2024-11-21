
public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        Book book = new Book("Harry Potter", 15.99);

        store.addBook(book);
        
        store.findBook("Harry Potter");
        System.out.println("Your book: " + store.findBook("Harry Potter");)


    }
}