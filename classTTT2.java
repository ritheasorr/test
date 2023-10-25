public class classTTT2 {
    private String[] board;
    private int size;

    public classTTT2(int size) {
        this.size = size;
        board = new String[size];
        for (int i = 0; i < size; i++) {
            board[i] = " "; // Initialize the board with empty spaces
        }
    }

    public void setCell(int index, String value) {
        if (index >= 0 && index < size) {
            if (board[index].equals(" ")) {
                board[index] = value;
            } else {
                System.out.println("Cell is already occupied. Try another cell.");
            }
        } else {
            System.out.println("Invalid cell index. Choose a cell between 0 and " + (size - 1));
        }
    }

    public String getCell(int index) {
        if (index >= 0 && index < size) {
            return board[index];
        } else {
            System.out.println("Invalid cell index. Choose a cell between 0 and " + (size - 1));
            return null;
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < size; i++) {
            System.out.print("| " + board[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println("|");
                System.out.println("-------------");
            }
        }
    }

    public String[] getBoard() {
        return board;
    }

    public void initializeBoard() {
        for (int i = 0; i < size; i++) {
            board[i] = " "; // Reset all cells to empty spaces
        }

    }
}