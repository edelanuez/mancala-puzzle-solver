package src;

import java.util.Scanner;

public class Board{
    /**
     * This class sets up the mancala board in the mancala puzzle app on the apple store.
     *  @pitsRight is describing the array of stones whose goal is on the right side, i.e. the bottom array.
     *  @pitsLeft is describing the array of stones whose goal is on the left side, i.e. the top array.
     *  @goalLeft is the goal associated to @pitsLeft.
     *  @goalRight is the goal associated to @pitsRight. 
     */
   
    private int[] pitsRight;
    private int[] pitsLeft;
    private int goalLeft;
    private int goalRight; 
    private int movesAvailable;
    private int stonesFor1Star;
    private int stonesFor2Stars;
    private int stonesFor3Stars;
    
    // constructors to set and view the board

    public Board(){
        pitsRight = new int[6];
        pitsLeft = new int[6];
        goalLeft = 0;
        goalRight = 0;
        movesAvailable = 0;
        stonesFor1Star = 0;
        stonesFor2Stars = 0;
        stonesFor3Stars = 0;
        
        initializeBoard();
    }

    private void initializeBoard(){
        Scanner scanner = new Scanner(System.in);

        //ask user to input the numer of stone for each pit on the top array of the board

        System.out.println("Enter the number of stones for each pit on the top part of the board, where the 0th hole is closest to the goal for the bottom part of the board.");
        
        for (int i = 0; i<6; i++){
            System.out.print("Pit " + (i)+ ": ");
            pitsRight[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of stones for each pit on the bottom part of the board, where the 0th hole is closest to the goal for the bottom part of the board.");
        
        for (int i = 0; i<6; i++){
            System.out.print("Pit " + (i)+ ": ");
            pitsLeft[i] = scanner.nextInt();
        }

         // Ask the user to input the goals for both sides
        System.out.print("Enter the number of stones for the right goal: ");
        goalRight = scanner.nextInt();

        System.out.print("Enter the number of stones for the left goal: ");
        goalLeft = scanner.nextInt();

        System.out.print("Enter the number of moves available");
        movesAvailable = scanner.nextInt();

        System.out.print("Enter the number of stones needed to win one star");
        stonesFor1Star = scanner.nextInt();
        System.out.print("Enter the number of stones needed to win two stars");
        stonesFor2Stars = scanner.nextInt();
        System.out.print("Enter the number of stones needed to win three star");
        stonesFor3Stars = scanner.nextInt();


    }

    //Getters
    
    public int[] getPitsRight() {
        return pitsRight;
    }

    public int[] getPitsLeft() {
        return pitsLeft;
    }

    public int getgoalRight() {
        return goalRight;
    }

    public int getgoalLeft() {
        return goalLeft;
    }

    public int getmovesAvailable() {
        return movesAvailable;
    }

    public int getStonesFor1Star() {
        return stonesFor1Star;
    }

    public int getStonesFor2Stars() {
        return stonesFor2Stars;
    }

    public int getStonesFor3Stars() {
        return stonesFor3Stars;
    }


    public void printBoard() {
        System.out.println("Left Pits: " + java.util.Arrays.toString(pitsLeft));
        System.out.println("Goal Left: " + goalLeft);
        System.out.println("Goal Right: " + goalRight);
        System.out.println("Right Pits: " + java.util.Arrays.toString(pitsRight));

    }
    public static void main(String[] args) {
        // Create a Board object (initializes the arrays and sets goals to 0)
        Board board = new Board();

        // Prompt the user to initialize the board with stones
        board.initializeBoard();  // This is where you ask the user for input

        // Print the board's initial state
        board.printBoard();  // Show the board to the user after they've set it up
    }
}