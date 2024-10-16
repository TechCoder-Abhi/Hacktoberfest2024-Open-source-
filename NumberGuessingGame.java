import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        int attempts = 5; // Number of attempts allowed

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + attempts + " attempts to guess it.");

        boolean guessedCorrectly = false;

        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Please guess a number within the range of 1 to 100.");
                continue;
            }

            if (guess == randomNumber) {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly!");
                guessedCorrectly = true;
                break; // Exit the loop if guessed correctly
            } else {
                System.out.println("Not a match! Try again.");
                if (attempt == attempts) {
                    System.out.println("Sorry! You've used all your attempts. The number was " + randomNumber + ".");
                }
            }
        }

        scanner.close(); // Close the scanner resource
    }
}
