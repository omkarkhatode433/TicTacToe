package TicTacToe;

import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws InputMismatchException, IOException {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		char board[][] = new char[3][3];

		boolean full = false, win = false;

		User user = new User("Omkar");
		User comp = new User("Computer");

		int i, j;
		while (!full && !win) {
			while (true) {
				i = rd.nextInt(3);
				j = rd.nextInt(3);
				if (board[i][j] != 'X' && board[i][j] != 'O') {
					board[i][j] = 'X';
					if (comp.win(board, i, j, 'X') || user.isfull(board)) {
						win = true;
						full = true;
					}
					break;
				}

			}
			if (full && win)
				break;
			user.print(board);
			System.out.println("Enter Your Position :numbers only");
			while (true) {
				try {

					i = sc.nextInt();
					j = sc.nextInt();
					if (board[i][j] != 'X' && board[i][j] != 'O') {

						board[i][j] = 'O';
						if (user.win(board, i, j, 'O') || user.isfull(board)) {
							win = true;
							full = true;

						}
						break;
					}
					System.out.println("Already Filled Select Another");

				} catch (Exception e) {
					System.out.println("please enter only 1 , 2 , 0");

				}
			}
			if (full && win)
				break;
		}

	}

}
