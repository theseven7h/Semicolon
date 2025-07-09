package book;

public class PrintBook extends Book {
    private final String publisher;
    private final String isbn;

    public PrintBook(String title, int publicationYear, String author, String publisher, String isbn) {
        super(title, publicationYear, author);
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s: %s%n\t%s: %s%n", super.toString(), "Publisher", getPublisher(), "ISBN", getIsbn());
    }
}
