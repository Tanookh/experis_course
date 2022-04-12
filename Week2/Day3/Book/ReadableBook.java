package Week2.Day3.Book;

public class ReadableBook extends Book {

    public ReadableBook(TYPE bookType, String title, Author author, int quantity) {
        setBookType(bookType);
        setTitle(title);
        setAuthor(author);
        setQuantity(quantity);
    }

    @Override
    public String toString() {
        String msg = "The book is a " + bookType + " book\nIt's title is " + title + "\nThe authour is " + author
                + "\nThere are " + quantity + " books in the library\n";
        return msg;
    }

    @Override
    public void approach() {
        super.read();
    }

}
