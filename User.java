package TicTacToe;

public class User {

	public String Name;

	User(String nm) {
		Name = nm;
	}



//------------------------------------------------------------------------------

	public boolean isfull(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != 'X' && board[i][j] != 'O') {

					return false;
				}
			}
		}
		print(board);
		System.out.println("Game Dropped");
		return true;
	}
//------------------------------------------------------------------------------

	public boolean win(char[][] board, int i, int j, char sym) {
		int count = 0;
		for (int k = 0; k < board.length; k++) {
			if (board[i][k] != sym) {
				break;
			}
			count++;
			if (count == 3) {
				print(board);
				System.out.println(this.Name+" Win....");
				System.out.println(this.Name + " completed in row " + (i + 1));
				return true;
			}
		}
		// row
		count = 0;
		for (int k = 0; k < board.length; k++) {
			if (board[k][j] != sym) {
				break;
			}
			count++;
			if (count == 3) {
				print(board);
				System.out.println(this.Name+" Win....");
				System.out.println(this.Name + " completed in column " + (j + 1));
				return true;
			}
		}
		// left diagonal
		count = 0;
		for (int k = 0, l = 0; k < board.length && l < board.length; k++, l++) {
			if (board[k][l] != sym) {
				break;
			}
			count++;
			if (count == 3) {
				print(board);
				System.out.println(this.Name+" Win....");
				System.out.println(this.Name + " completed in left diagonal ");
				return true;
			}
		}
		//Right Diagonal
		count = 0;
		for (int k = 0, l = board.length - 1; k < board.length && l >= 0; k++, l--) {
			if (board[k][l] != sym) {
				break;
			}
			count++;
			if (count == 3) {
				print(board);
				System.out.println(this.Name+" Win....");
				System.out.println(this.Name + " completed in right diagonal ");
				return true;
			}
		}
		return false;
	}
//------------------------------------------------------------------------------

	public void print(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
