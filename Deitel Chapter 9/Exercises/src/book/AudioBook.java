package book;

public class AudioBook extends Book {
    private int size;
    private int length;
    private String artistName;

    public AudioBook(String title, int publicationYear, String author, int size, int length, String artistName) {
        super(title, publicationYear, author);
        this.size = size;
        this.length = length;
        this.artistName = artistName;
    }

    public int getSize() {
        return size;
    }

    public int getLength() {
        return length;
    }

    public String getArtistName() {
        return artistName;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s: %s MB%n\t%s: %s Hours%n\t%s: %s%n", super.toString(), "Size(MB)", getSize(), "Length", getLength(), "Artist Name", getArtistName());
    }
}
