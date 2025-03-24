
//Exercise 8.02
//Add a method getMonthName() to the
// MyDate class, that uses a switch
//A switch statement is used to simplify multiple if-else conditions
// to compare a single variable against many different possible values. It's a cleaner and more readable
// statement to return the name of
//the current month (1 = January, 2 = February, etc.)

public class MyDate {
    // Instance variable to store the month number
    private int month;

    // Constructor
    public MyDate(int month) {
        this.month = month;
    }

    // Method to get the month name based on the number
    public String getMonthName() {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            // Handle invalid input
            default: return "Invalid month";
        }
    }

    // Main method to test
    public static void main(String[] args) {
        // Example: May
        MyDate date = new MyDate(5);
        // Output: May
        System.out.println(date.getMonthName());
    }
}
