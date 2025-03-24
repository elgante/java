import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Book objects with initial values
        Book book1 = new Book("Maria", "Swim", 30, 150);
        Book book2 = new Book("Steve", "Love", 15, 50);

        // User input for the first book
        System.out.println("Enter author for the first book: ");
        //initialising author
        String author = keyboard.nextLine();

        System.out.println("Enter title of the first book: ");
        String title = keyboard.nextLine();

        System.out.println("Enter price of the first book: ");
        double price = keyboard.nextDouble();

        System.out.println("Enter the number of pages of the first book: ");
        int pages = keyboard.nextInt();

        // Reset the keyboard input buffer
        keyboard.nextLine();

        // Set values for the first book
        book1.setAuthor(author);
        book1.setTitle(title);
        book1.setPrice(price);
        book1.setPages(pages);

        // User input for the second book
        System.out.println("Enter author for the second book: ");
        author = keyboard.nextLine();

        System.out.println("Enter title of the second book: ");
        title = keyboard.nextLine();

        System.out.println("Enter price of the second book: ");
        price = keyboard.nextDouble();

        System.out.println("Enter the number of pages of the second book: ");
        pages = keyboard.nextInt();

        // Set values for the second book
        book2.setAuthor(author);
        book2.setTitle(title);
        book2.setPrice(price);
        book2.setPages(pages);

        // Lowering the price by 20% for both books
        double newPrice1 = book1.getPrice() - (book1.getPrice() * 20 / 100);
        double newPrice2 = book2.getPrice() - (book2.getPrice() * 20 / 100);

        // Set the new prices
        book1.setPrice(newPrice1);
        book2.setPrice(newPrice2);

        // Display the information of both books after price reduction
        System.out.println("\n--- Book 1 ---");
        System.out.println(book1);

        System.out.println("\n--- Book 2 ---");
        System.out.println(book2);

        // Using getters to display information
        System.out.println("Author of Book 1: " + book1.getAuthor());
        System.out.println("Title of Book 1: " + book1.getTitle());
        System.out.println("Pages in Book 1: " + book1.getPages());
        System.out.println("Price of Book 1: $" + book1.getPrice());
    }
}



