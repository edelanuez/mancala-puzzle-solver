package src;

public class Main {
    public static void main(String[] args) {
        // Create a Board object (this will initialize the board and ask for user input)
        Board board = new Board();

        // Print the board's initial state after it has been initialized
        board.printBoard();  // Show the board to the user after they've set it up
    }
}

/** notes to self: javac -d . src/*.java (this makes the class files)
 * java -cp . src.Main (this runs Main.java)
  */