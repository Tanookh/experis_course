package Week2.Day3.Book;

import java.util.Random;

import Week2.Day3.Book.Book.TYPE;

public class Library {

    public static void main(String[] args) {

        Book[] books = new Book[6];

        Author author = new Author();

        Book readableBook1 = new ReadableBook(TYPE.Novel, "Tarazn", author, 3);
        Book readableBook2 = new ReadableBook(TYPE.CookingBook, "Rasberry Cake", author, 2);

        Book borrowableBook1 = new BorrowableBook(TYPE.Dictionary, "English", author, 1);
        Book borrowableBook2 = new BorrowableBook(TYPE.Novel, "Life", author, 33);

        Book buyableBook1 = new BuyableBook(TYPE.Dictionary, "Hebrew", author, 2);
        Book buyableBook2 = new BuyableBook(TYPE.CookingBook, "Chicken Nuggets", author, 8);

        books[0] = readableBook1;
        books[1] = readableBook2;
        books[2] = borrowableBook1;
        books[3] = borrowableBook2;
        books[4] = buyableBook1;
        books[5] = buyableBook2;

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            books[rand.nextInt(books.length)].approach();
        }

    }

}
