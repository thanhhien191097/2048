package rescutePet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board {
	private static int[][] board = new int [20][8];
	
	private Board() {
		
		board[0][0] = 1;
		board[0][1] = 2;
		board[0][2] = 3;
		board[0][3] = 4;
		board[0][4] = 5;
		board[0][5] = 3;
		board[0][6] = 2;
		board[0][7] = 1;
		
		board[1][0] = 1;
		board[1][1] = 2;
		board[1][2] = 3;
		board[1][3] = 4;
		board[1][4] = 5;
		board[1][5] = 3;
		board[1][6] = 2;
		board[1][7] = 1;
		
		board[2][0] = 1;
		board[2][1] = 2;
		board[2][2] = 3;
		board[2][3] = 4;
		board[2][4] = 5;
		board[2][5] = 3;
		board[2][6] = 2;
		board[2][7] = 1;
		
		board[3][0] = 1;
		board[3][1] = 2;
		board[3][2] = 3;
		board[3][3] = 4;
		board[3][4] = 5;
		board[3][5] = 3;
		board[3][6] = 2;
		board[3][7] = 1;
		
		board[4][0] = 1;
		board[4][1] = 2;
		board[4][2] = 3;
		board[4][3] = 4;
		board[4][4] = 5;
		board[4][5] = 3;
		board[4][6] = 2;
		board[4][7] = 1;
		
		board[5][0] = 1;
		board[5][1] = 2;
		board[5][2] = 3;
		board[5][3] = 4;
		board[5][4] = 5;
		board[5][5] = 3;
		board[5][6] = 2;
		board[5][7] = 1;
		
		board[6][0] = 1;
		board[6][1] = 2;
		board[6][2] = 3;
		board[6][3] = 4;
		board[6][4] = 5;
		board[6][5] = 3;
		board[6][6] = 2;
		board[6][7] = 1;
		
		board[7][0] = 1;
		board[7][1] = 2;
		board[7][2] = 3;
		board[7][3] = 4;
		board[7][4] = 5;
		board[7][5] = 3;
		board[7][6] = 2;
		board[7][7] = 1;
		
		board[8][0] = 1;
		board[8][1] = 2;
		board[8][2] = 3;
		board[8][3] = 4;
		board[8][4] = 5;
		board[8][5] = 3;
		board[8][6] = 2;
		board[8][7] = 1;
		
		board[9][0] = 1;
		board[9][1] = 2;
		board[9][2] = 3;
		board[9][3] = 4;
		board[9][4] = 5;
		board[9][5] = 3;
		board[9][6] = 2;
		board[9][7] = 1;
		
		board[10][0] = 1;
		board[10][1] = 2;
		board[10][2] = 3;
		board[10][3] = 4;
		board[10][4] = 5;
		board[10][5] = 3;
		board[10][6] = 2;
		board[10][7] = 1;
		
		board[11][0] = 1;
		board[11][1] = 2;
		board[11][2] = 3;
		board[11][3] = 4;
		board[11][4] = 5;
		board[11][5] = 3;
		board[11][6] = 2;
		board[11][7] = 1;
		
		board[12][0] = 1;
		board[12][1] = 2;
		board[12][2] = 3;
		board[12][3] = 4;
		board[12][4] = 5;
		board[12][5] = 3;
		board[12][6] = 2;
		board[12][7] = 1;
		
		board[13][0] = 1;
		board[13][1] = 2;
		board[13][2] = 3;
		board[13][3] = 4;
		board[13][4] = 5;
		board[13][5] = 3;
		board[13][6] = 2;
		board[13][7] = 1;
		
		board[14][0] = 1;
		board[14][1] = 2;
		board[14][2] = 3;
		board[14][3] = 4;
		board[14][4] = 5;
		board[14][5] = 3;
		board[14][6] = 2;
		board[14][7] = 1;
		
		board[15][0] = 1;
		board[15][1] = 2;
		board[15][2] = 3;
		board[15][3] = 4;
		board[15][4] = 5;
		board[15][5] = 3;
		board[15][6] = 2;
		board[15][7] = 1;

		board[16][0] = 1;
		board[16][1] = 2;
		board[16][2] = 3;
		board[16][3] = 4;
		board[16][4] = 5;
		board[16][5] = 3;
		board[16][6] = 2;
		board[16][7] = 1;
		
		board[17][0] = 1;
		board[17][1] = 2;
		board[17][2] = 3;
		board[17][3] = 4;
		board[17][4] = 5;
		board[17][5] = 3;
		board[17][6] = 2;
		board[17][7] = 1;
		
		board[18][0] = 1;
		board[18][1] = 2;
		board[18][2] = 3;
		board[18][3] = 4;
		board[18][4] = 5;
		board[18][5] = 3;
		board[18][6] = 2;
		board[18][7] = 1;
		
		board[19][0] = 1;
		board[19][1] = 2;
		board[19][2] = 3;
		board[19][3] = 4;
		board[19][4] = 5;
		board[19][5] = 3;
		board[19][6] = 2;
		board[19][7] = 1;
		
		

		
	}
		
		




}

