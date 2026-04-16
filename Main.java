import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int playAgain = 1;
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("----------------------------------");
        while (playAgain == 1) {
            int numberToGuess = rand.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            System.out.println("\nI have chosen a number between 1 and 100.");
            System.out.println("Try to guess it!");
            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;
                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                }
            }
            System.out.print("\nDo you want to play again? (1 = Yes, 0 = No): ");
            playAgain = sc.nextInt();
        }
        System.out.println("\nThanks for playing!");
        sc.close();
    }
}