/*Then implement it in
        Java and test it. The Book class should have the following fields:
        author (String), title (String), price (double), and pages (int).
        a) Create a 4-argument constructor initializing all fields.
        b) Create get methods for all fields.
        c) Create a set method for price.
        d) Write a test program that creates two Book objects based on user
        input (use a Scanner object to input author, title, price, and pages),
        then lowers the price on both books by 20%, and finally prints out
        the information about the two books.*/
//One of the key principles of object-oriented programming (OOP) is encapsulation,
// which means keeping an object's internal data private and only allowing access
// to it through public methods (getters and setters).

public class Book {
    private String author;
    private String title;
    private double price;
    private int pages;

    // create a 4 argument constructor
     public Book( String author, String title, double price, int pages){
         this.author = author;
         this.title = title;
         this.price = price;
         this.pages = pages;
     }
     // get methods for all fields


    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor(){
         return author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(){
         return title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPages(){
         return pages;
    }
    public double getPrice(){
         return price;
    }
    public void setPrice( double price){
         this.price = price;
    }
    //Override toString for displaying book info
    @Override
    public String toString() {
        return "Author: " + author + "\nTitle: " + title + "\nPrice: $" + price + "\nPages: " + pages;
    }



}
