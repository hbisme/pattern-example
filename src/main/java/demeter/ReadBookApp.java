package demeter;

public class ReadBookApp {
    private String name;

    private Book book;

    // public ReadBookApp(String name) {
    //     this.name = name;
    // }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void read() {
        book.read();
    }
}
