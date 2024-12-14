package piece;

import main.GamePanel;
import main.Type;

public class Knight extends Piece {

	public Knight(int color, int col, int row) {
		super(color, col, row);
		
		type = Type.KNIGHT;
		
		if(color==GamePanel.WHITE) {
			image = getImage("/piece/wKnight");
		}
		else {
			image = getImage("/piece/bKnight");
		}
	}
	
	public boolean canMove(int targetCol, int targetRow) {
		if(isWithinBoard(targetCol, targetRow)) {
			//knight can move uf its movement ratio of col and row is 1:2 or 2:1
			if(Math.abs(targetCol-preCol)*Math.abs(targetRow-preRow)==2) {
				if(isValidSquare(targetCol, targetRow)) {
					return true;
				}
			}
		}
		return false;
	}

}
