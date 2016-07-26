package session3.assignment1;

/**
 * The Cell class models each individual cell of the game board.
 */
public class Cell {

	Seed content;
	int row, col; // row and column of this cell, not used in this program

	/** Constructor to initialize this cell */
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
		clear(); // clear content
	}

	/** Clear the cell content to EMPTY */
	public void clear() {
		content = Seed.EMPTY;
	}

	/** 
	 * Fills the Symbols in the 3x3 Board pattern according to the turn of the player
	 */
	public void paint() {
		switch (content) {
		case CROSS:
			System.out.print(" X ");
			break;
		case NOUGHT:
			System.out.print(" O ");
			break;
		case EMPTY:
			System.out.print("   ");
			break;
		}
	}
}