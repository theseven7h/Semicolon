package book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("What if it all works out?", 2022, "Semaj");
        AudioBook audioBook = new AudioBook("Rise to grace", 2019, "E. Carg", 3, 5, "Y. Ug Daer");
        PrintBook printBook = new PrintBook("Money", 2025, "H. Cir Mai", "G. Ohdi", "090720263112");
        System.out.printf("%s%n", book);
        System.out.printf("%s%n", audioBook);
        System.out.printf("%s%n", printBook);
    }
}
