package bookstore.entity;

public class Book {
    private String title;
    private int price;

<<<<<<< Updated upstream

    public void setTitle(String title) {
        this.title = title;
=======
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
>>>>>>> Stashed changes
    }

    public void setPrice(int price) {
        this.price = price;
    }

<<<<<<< Updated upstream
=======
    public int getPrice() {
        return this.price;
    }

>>>>>>> Stashed changes
    public String toString() {
        return "BOOK: " + title + " , price:" + price;
    }
}
