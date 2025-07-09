package book;

public class Book {
    private String title;
    private int publicationYear;
    private String author;

    public Book(String title, int publicationYear, String author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
         return String.format("%s:%n\t%s: %s%n\t%s: %s%n\t%s: %s%n", "Book Details", "Title", getTitle(),
                 "Publication Year", getPublicationYear(), "Author", getAuthor());
    }
}
