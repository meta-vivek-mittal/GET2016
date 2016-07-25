package session3.assignment1;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	// the game board
	private Board board; 
	 // the current state of the game (of enum GameState)
	private GameState currentState;
	// the current player (of enum Seed)
	private Seed currentPlayer; 

	/**
	 * Constructor definition
	 */
	public TicTacToe() {
		board = new Board();

		// Initialize the game-board and current status
		initGame();
		// Play the game once. Players CROSS and NOUGHT move alternately.
		do {
			playerMove(currentPlayer); // update the content, currentRow and
										// currentCol
			board.paint(); // ask the board to paint itself
			updateGame(currentPlayer); // update currentState
			// Print message if game-over
			if (currentState == GameState.CROSS_WON) {
				System.out.println("'X' won! Bye!");
			} else if (currentState == GameState.NOUGHT_WON) {
				System.out.println("'O' won! Bye!");
			} else if (currentState == GameState.DRAW) {
				System.out.println("It's Draw! Bye!");
			}
			// Switch player
			currentPlayer = (currentPlayer == Seed.CROSS) ? Seed.NOUGHT
					: Seed.CROSS;
		} while (currentState == GameState.PLAYING);
	}

	/**
	 * Following function Initializes the game
	 */
	public void initGame() {
		// clear the board contents
		board.init(); 
		// CROSS plays first
		currentPlayer = Seed.CROSS; 
		// ready to play
		currentState = GameState.PLAYING; 
	}

	/**
	 * The player with "theSeed" makes one move, with input validation. Update
	 * Cell's content, Board's currentRow and currentCol.
	 */
	public void playerMove(Seed theSeed) {
		boolean validInput = false; // for validating input
		do {
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			int row;
			int col;
			if (theSeed == Seed.CROSS) {
				System.out
						.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
				row = in.nextInt() - 1;
				col = in.nextInt() - 1;
				
			} else {			
				Random rn = new Random();	//For computer turn
				int i = rn.nextInt(2);
				row =  1+i;
				i = rn.nextInt(2);
			    col = 1 + i;
			}
			
			System.out.println();
			if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
					&& board.cells[row][col].content == Seed.EMPTY) {
				board.cells[row][col].content = theSeed;
				board.currentRow = row;
				board.currentCol = col;
				validInput = true; // input okay, exit loop
			} else {
				System.out.println("This move at (" + (row + 1) + ","
						+ (col + 1) + ") is not valid. Try again...");
			}
		} while (!validInput); // repeat until input is valid
	}

	/**
	 * Following function check the status(won/draw/playing) for the parameter Seed and update accordingly.
	 * @param theSeed(Seed) 
	 */
	public void updateGame(Seed theSeed) {
		if (board.hasWon(theSeed)) { // check for win
			currentState = (theSeed == Seed.CROSS) ? GameState.CROSS_WON
					: GameState.NOUGHT_WON;
		} else if (board.isDraw()) { // check for draw
			currentState = GameState.DRAW;
		}
		// Otherwise, no change to current state (still GameState.PLAYING).
	}

	public static void main(String[] args) {
		new TicTacToe();
	}
}
