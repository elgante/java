//Write a program that generates a random number between 1 and 10,
// and then asks the user to try to guess it.
// When the user enters a guess, compare it with
// the random generated number, and then tell the user
// if the guess was correct, or not.
//Since we want a number between 1 and 10 (instead of 0 to 9), we add 1 to shift the range.
//
//This transforms the range from {0,1,2,3,4,5,6,7,8,9} → to {1,2,3,4,5,6,7,8,9,10}.

import java.util.Random;
import java.util.Scanner;

public class solution801 {

    public static void main(String[] args) {
        Random random_no = new Random();
        Scanner keyboard = new Scanner(System.in);

        int numberToGuess = random_no.nextInt(10) + 1;
        System.out.print("Please pick a number between 1 and 10:");
        int numbers = keyboard.nextInt();

        if (numbers == numberToGuess) {
            System.out.println("That number is correct!");
        } else {
            if (numbers > numberToGuess)
                System.out.println("Number is too high, the number was "+numberToGuess);
            else
                System.out.println("Number is too low, the number was "+numberToGuess);
        }
    }
}
