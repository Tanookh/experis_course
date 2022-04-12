package Week2.Day3.Book;

import java.util.Random;

public class BuyableBook extends BorrowableBook implements Buyable {

    protected float price;

    public BuyableBook(TYPE bookType, String title, Author author, int quantity, int borrowedDays, float price) {
        super(bookType, title, author, quantity, borrowedDays);
        setPrice(price);
    }

    public BuyableBook(TYPE bookType, String title, Author author, int quantity, int borrowedDays) {
        super(bookType, title, author, quantity, borrowedDays);
        setPrice(0);
    }

    public BuyableBook(TYPE bookType, String title, Author author, int quantity) {
        super(bookType, title, author, quantity, 0);
        setPrice(0);
    }

    @Override
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price >= 0) {
            this.price = price;
        } else {
            price = 0;
        }
    }

    @Override
    public String toString() {
        String msg = super.toString();
        msg += "The book price is " + price + "\n";
        return msg;
    }

    public void buying() {
        if (quantity > 0) {
            System.out.println("Buying " + title + " " + bookType + " book at " + price);
            quantity--;
        } else {
            System.out.println("No books to buy available");
        }
    }

    @Override
    public void approach() {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            if (rand.nextBoolean()) {
                borrowing();
            } else {
                buying();
            }
        } else {
            super.read();
        }
    }

}
