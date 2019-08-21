package demeter;

public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void read(){
        System.out.println("正在阅读书籍: " + name);
    }
}
