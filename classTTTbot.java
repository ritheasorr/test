import java.util.Random;
public class classTTTbot {
    public int makeMove(String[] board) {
        // Basic bot logic: choose a random available cell
        Random random = new Random();
        int cellIndex;

        do {
            cellIndex = random.nextInt(board.length);
        } while (!board[cellIndex].equals(" "));

        return cellIndex;
    }
}
