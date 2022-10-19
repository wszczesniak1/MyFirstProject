package bookstore.entity;

public class Book {
    private String title;
    private int price;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() { return this.title;}

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "BOOK: " + title + " , price:" + String.valueOf(price);
    }
}
