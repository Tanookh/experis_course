package Week2.Day3.Book;

import java.util.Random;

public class BorrowableBook extends ReadableBook implements Borrowable {

    protected int borrowedDays;

    public BorrowableBook(TYPE bookType, String title, Author author, int quantity, int borrowedDays) {
        super(bookType, title, author, quantity);
        setBorrowedDays(borrowedDays);
    }

    public BorrowableBook(TYPE bookType, String title, Author author, int quantity) {
        super(bookType, title, author, quantity);
        setBorrowedDays(0);
    }

    public int getBorrowedDays() {
        return borrowedDays;
    }

    public void setBorrowedDays(int borrowedDays) {
        if (borrowedDays >= 0) {
            this.borrowedDays = borrowedDays;
        } else {
            borrowedDays = 0;
        }
    }

    @Override
    public String toString() {
        String msg = super.toString();
        msg += "The book is borrowed for " + borrowedDays + " days\n";
        return msg;
    }

    public void borrowing() {
        if (quantity > 0) {
            Random rand = new Random();
            setBorrowedDays(rand.nextInt(5));
            System.out.println("Borrowing " + title + " " + bookType + " book for " + borrowedDays + " days");
            quantity--;
        } else {
            System.out.println("No books to borrow available");
        }
    }

    public void returnBorrowing() {

        System.out.println("Returning " + title + " " + bookType + " book");
        quantity++;
    }

    @Override
    public void approach() {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            if (rand.nextBoolean()) {
                borrowing();
            } else {
                returnBorrowing();
            }
        } else {
            super.read();
        }
    }

}
