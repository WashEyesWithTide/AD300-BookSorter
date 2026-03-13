import java.util.ArrayList;
import java.util.List;

public class Main{
    private static List<Book> books;
    public static void main(String[] args) {
        books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("Animal Farm", "George Orwell", 1945));
        books.add(new Book("Crime and Punishment", "Fyodor Dostoevsky", 1866));
        books.add(new Book("White Nights", "Fyodor Dostoevsky", 1848));
        books.add(new Book("The Stranger", "Albert Camus", 1942));
        books.add(new Book("The Alchemist", "Paulo Coelho", 1988));
        books.add(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 1967));
        books.add(new Book("The Metamorphosis", "Franz Kafka", 1915));
        books.add(new Book("The Trial", "Franz Kafka", 1925));
        books.add(new Book("No Longer Human", "Osamu Dazai", 1948));

        System.out.println("Books sorted by title:");
        books.sort(null); // Sort by natural order (title)
        books.forEach(System.out::println);
        
        System.out.println("\nBooks sorted by author:");
        books.sort(new BookAuthorComparator()); //sorts by author
        books.forEach(System.out::println);

        System.out.println("\nBooks sorted by publication year:");
        books.sort(new BookYearComparator()); // sorts by publication year
        books.forEach(System.out::println);

        System.out.println("\nBooks sorted by author, then title:");
        books.sort(new AuthorTitleComparator()); // sorts by author then title
        books.forEach(System.out::println);
    }
}