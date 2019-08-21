package demeter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();

        ReadBookApp app  = new ReadBookApp();

        Book book = new Book("设计模式-迪米特法则");

        app.setBook(book);

        phone.setPhoneApp(app);

        phone.readBook();



    }
}
