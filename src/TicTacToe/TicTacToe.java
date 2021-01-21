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
	 public void printingBoard() {
	        String horizPart = "+---+---+---+";
	        for (int i = 0; i < 3; i++) {
	            System.out.println(horizPart);
	            for (int j = 1; j < 4; j++) {
	                System.out.print("| " + board[i * 3 + j] + " ");
	            }
	            System.out.print("|\n");
	        }
	        System.out.print(horizPart);
	        System.out.print("\n");
	 }
	 public void makeMovement(int i) {
	        if (board[i] == ' ') {
	            board[i] = symbol1;
	        } else {
	            System.out.println("Already occupied place.");
	        }
	        printingBoard();
	 }

	public static void main(String[] args) {
		System.out.println("---------Welcome to TicTacToe Problem-----------");
		TicTacToe ticTacToeGame = new TicTacToe();
		Scanner sc = new Scanner(System.in);
		ticTacToeGame.creatingBoard();
		 System.out.println("Choose either O or X: ");
	    ticTacToeGame.getUserInput(sc.next());
	    ticTacToeGame.printingBoard();
	    System.out.println("Enter between (1-9): ");
	    ticTacToeGame.makeMovement(sc.nextInt());

	}

}
