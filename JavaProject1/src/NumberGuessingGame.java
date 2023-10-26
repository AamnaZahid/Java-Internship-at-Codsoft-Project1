import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minNumber = 1;
        int maxNumber = 100;
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between " + minNumber + " and " + maxNumber + ". Try to guess it.");

        while (true) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
