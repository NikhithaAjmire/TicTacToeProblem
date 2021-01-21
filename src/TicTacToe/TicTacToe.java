package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	public char board[] = new char[10];
	 public char symbol1, symbol2;
	
	 public void creatingBoard() {
	        for (int i = 1; i < 10; i++) {
	            board[i] = ' ';
	        }
	    }
	 public void getUserInput(String symbol) {
	        if (symbol.equals("X")) {
	            symbol1 = 'X';
	            symbol2 = 'O';
	        } else if (symbol.equals("O")) {
	            symbol1 = 'O';
	            symbol2 = 'X';
	        } else {
	           
	        }
	    }

	public static void main(String[] args) {
		System.out.println("---------Welcome to TicTacToe Problem-----------");
		TicTacToe ticTacToeGame = new TicTacToe();
		Scanner sc = new Scanner(System.in);
		ticTacToeGame.creatingBoard();
		ticTacToeGame.getUserInput(sc.next());

	}

}
