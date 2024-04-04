import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int attempts = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + attempts + " attempts to guess the number between " + minRange + " and "
                + maxRange + ".");

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int remainingAttempts = attempts;

            System.out.println("\nNew round started. Guess the number!");
            while (remainingAttempts > 0) {
                System.out.print("Attempt " + (attempts - remainingAttempts + 1) + ": Enter your guess: ");
                int guess = scanner.nextInt();
                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    score++;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                remainingAttempts--;
            }

            if (remainingAttempts == 0) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next();
            playAgain = playAgainResponse.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Your final score: " + score);
        scanner.close();
    }
}
