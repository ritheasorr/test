import java.util.Scanner;

public class main4TTT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boardSize = 9; // You can adjust the board size as needed
        classTTT2 gameBoard = new classTTT2(boardSize);

        String currentPlayer = "X"; // Start with player X
        int moves = 0;

        while (true) {
            gameBoard.printBoard();
            System.out.println("Player " + currentPlayer + "'s turn. Enter cell index (1-9):");

            int cellNumber = scanner.nextInt();

            int cellIndex = cellNumber - 1;

            if (cellIndex >= 0 && cellIndex < boardSize && gameBoard.getCell(cellIndex).equals(" ")) {
                gameBoard.setCell(cellIndex, currentPlayer);

                String result = classTTTlogic.checkWinner(gameBoard.getBoard());

                if (result.equals("X wins") || result.equals("O wins")) {
                    gameBoard.printBoard();
                    System.out.println(result);
                    break;
                } else if (moves == boardSize) {
                    gameBoard.printBoard();
                    System.out.println("It's a draw!");
                    break;
                }

                currentPlayer = (currentPlayer.equals("X")) ? "O" : "X";
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }

        scanner.close();
    }

}
