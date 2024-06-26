import java.util.Scanner;

// Level-3

// Add many more Riddles. Also make sure the riddles are in a either a JSON file, CSV file, YAML file or a text file.
// Add a hint for each riddle.

// Add a scoring system to the game. For each correct answer, the player gets a point. Display the final score at the end of the game.
// Add a feature to allow the player to ask for a hint if they don't know the answer to a riddle.
// Add a feature to allow the player to continue playing or exit the game after each riddle.

// Add a feature to allow the player to choose the difficulty level of the riddles (easy, medium, hard). Each difficulty level will have a different set of riddles.
// Add a feature to allow the player to choose the number of riddles they want to play.
// Add a feature to allow the player to choose the category of riddles they want to play (e.g., animals, food, nature, etc.).

public class RiddleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Define an array of riddles and their corresponding answers.
        String[] riddles = {
            "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?",
            "The more you take, the more you leave behind. What am I?",
            "I'm not alive, but I can grow; I don't have lungs, but I need air; I don't have a mouth, but water kills me. What am I?"
        };

        String[] answers = {
            "An echo",
            "Footsteps",
            "A fire"
        };

        // Define hints for each riddle.
        String[] hints = {
            "Hint: This thing is known for its ability to reflect sound.",
            "Hint: Think about what you leave behind when you walk.",
            "Hint: It produces heat and light."
        };

        int numRiddles = riddles.length;

        while (true) {
            int randomIndex = (int) (Math.random() * numRiddles);
            String selectedRiddle = riddles[randomIndex];
            String correctAnswer = answers[randomIndex];
            String hint = hints[randomIndex];

            // Display the riddle to the user.
            System.out.println("Riddle: " + selectedRiddle);

            // Get user's answer.
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                // If the answer is incorrect, offer a hint.
                System.out.println("Wrong! Would you like a hint? (yes/no)");
                String giveHint = scanner.nextLine().toLowerCase();
                if (giveHint.equals("yes")) {
                    System.out.println(hint);
                }
            }

            // Allow the user to continue or exit.
            System.out.println("Continue playing? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        // Display final score.
        System.out.println("Your final score: " + score);
        System.out.println("Thanks for playing!");
    }
}