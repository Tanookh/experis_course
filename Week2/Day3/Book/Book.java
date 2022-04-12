package Week2.Day3.Book;

public abstract class Book implements Readable {

    TYPE bookType;
    String title;
    Author author;
    int quantity;

    enum TYPE {
        CookingBook,
        Novel,
        Dictionary
    }

    public TYPE getBookType() {
        return bookType;
    }

    public void setBookType(TYPE bookType) {
        if ((bookType != TYPE.CookingBook && bookType != TYPE.Dictionary && bookType != TYPE.Novel)
                || bookType == null) {
            bookType = TYPE.Novel;
            return;
        }
        this.bookType = bookType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        if (author != null) {
            this.author = author;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            quantity = 0;
        }
    }

    public void read() {
        System.out.println("Reading " + title + " " + bookType + " book...");
    }

    public abstract void approach();

}
