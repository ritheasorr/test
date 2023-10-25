import java.util.Scanner;

public class main4TTT2PlayersAndBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boardSize = 9; // You can adjust the board size as needed
        classTTT2 gameBoard = new classTTT2(boardSize);

        System.out.println("Welcome to Tic-Tac-Toe!");

        System.out.println("Choose your game mode:");
        System.out.println("1. Play against a bot");
        System.out.println("2. Play against another human player");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();


        if (choice == 1) {
            main4TTTbot.main(new String[0]);
        } else if (choice == 2) {
            main4TTT.main(new String[0]);

        } else {
            System.out.println("Invalid choice. Exiting.");
            return;
        }
        scanner.close();
    }
}
