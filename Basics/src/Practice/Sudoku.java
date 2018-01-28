package Practice;

import java.util.ArrayList;

public class Sudoku {
	int[][] board = new int [9][9];
	ArrayList[][] workBoard = new ArrayList[9][9];
	
		public void initializeBoard(){
			/***Board:
				[0][0][0][2][6][0][7][0][1]
				[6][8][0][0][7][0][0][9][0]
				[1][9][0][0][0][4][5][0][0]
				[8][2][0][1][0][0][0][4][0]
				[0][0][4][6][0][2][9][0][0]
				[0][5][0][0][0][3][0][2][8]
				[0][0][9][3][0][0][0][7][4]
				[0][4][0][0][5][0][0][3][6]
				[7][0][3][0][1][8][0][0][0]
			***/
			board[0][0] = 0;
			board[0][1] = 0;
			board[0][2] = 0;
			board[0][3] = 2;
			board[0][4] = 6;
			board[0][5] = 0;
			board[0][6] = 7;
			board[0][7] = 0;
			board[0][8] = 1;
			
			board[1][0] = 6;
			board[1][1] = 8;
			board[1][2] = 0;
			board[1][3] = 0;
			board[1][4] = 7;
			board[1][5] = 0;
			board[1][6] = 0;
			board[1][7] = 9;
			board[1][8] = 0;
			
			board[2][0] = 1;
			board[2][1] = 9;
			board[2][2] = 0;
			board[2][3] = 0;
			board[2][4] = 0;
			board[2][5] = 4;
			board[2][6] = 5;
			board[2][7] = 0;
			board[2][8] = 0;
			
			board[3][0] = 8;
			board[3][1] = 2;
			board[3][2] = 0;
			board[3][3] = 1;
			board[3][4] = 0;
			board[3][5] = 0;
			board[3][6] = 0;
			board[3][7] = 4;
			board[3][8] = 0;
			
			board[4][0] = 0;
			board[4][1] = 0;
			board[4][2] = 4;
			board[4][3] = 6;
			board[4][4] = 0;
			board[4][5] = 2;
			board[4][6] = 9;
			board[4][7] = 0;
			board[4][8] = 0;
			
			board[5][0] = 0;
			board[5][1] = 5;
			board[5][2] = 0;
			board[5][3] = 0;
			board[5][4] = 0;
			board[5][5] = 3;
			board[5][6] = 0;
			board[5][7] = 2;
			board[5][8] = 8;
			
			board[6][0] = 0;
			board[6][1] = 0;
			board[6][2] = 9;
			board[6][3] = 3;
			board[6][4] = 0;
			board[6][5] = 0;
			board[6][6] = 0;
			board[6][7] = 7;
			board[6][8] = 4;
			
			board[7][0] = 0;
			board[7][1] = 4;
			board[7][2] = 0;
			board[7][3] = 0;
			board[7][4] = 5;
			board[7][5] = 0;
			board[7][6] = 0;
			board[7][7] = 3;
			board[7][8] = 6;
			
			board[8][0] = 7;
			board[8][1] = 0;
			board[8][2] = 3;
			board[8][3] = 0;
			board[8][4] = 1;
			board[8][5] = 8;
			board[8][6] = 0;
			board[8][7] = 0;
			board[8][8] = 0;
		}
		
		public void printBoard(){
			System.out.println("Board:");
			for (int i=0;i<9;i++){
				for (int j=0; j<9; j++){
					//System.out.print("["+i+","+j+"]");
					System.out.print("["+board[i][j]+"]");
				}
				System.out.println("");
			}
		}
		
		public void initializeWorkBoard(){
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				ArrayList cell = new ArrayList();
				for (int k = 1; k <= 9; k++) {
					cell.add(k);
				}
				workBoard[i][j] = cell;
			}
		}
		}
		
		
		
	public static void main (String arg[]){
		Sudoku s = new Sudoku();
		s.initializeBoard();
		s.printBoard();
		s.initializeWorkBoard();
	}

}
