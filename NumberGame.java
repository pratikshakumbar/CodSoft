import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        
        System.out.println("Welcome to the Number Game!");
        
        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;
            

            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                    score += 100 - (attempts*2); // Adjust score based on attempts
                    guessedCorrectly = true;
                } else if (guess < numberToGuess) {
                    System.out.println("Guess a higher number.");
                } else {
                    System.out.println("Guess a lower number.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            if (!playAgainInput.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println(" Your final score is: " + score);
            }
        }
        
    }
}


       

    





