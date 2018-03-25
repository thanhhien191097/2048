package dsa.hcmiu.a2048pets.entities.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Admin on 3/25/2018.
 */

public class Board {
    private static Board instance;
    public static int row;
    public static int col;
    public static int score;
    public static int countUndo;
    public static int scoreUndo;
    public static int countMove = 0;
    private static int[][] board = new int[4][4];
    private Random random = new Random();
    private ArrayList<Integer> List1, List2;


    private Board() {
        init();
    }

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }

    public int getElement(int rowi, int col) {
        return board[rowi][col];
    }

    public void setElement(int rowi, int col, int value) {
        board[rowi][col]=value;
    }

/*	public static void printboard() {
		for (int i=0;i<20;i++) {
			for(int k=0;k<8;k++) {
				System.out.print(board[i][k]+"\t");
			}
			System.out.println("\n");
		}
	}*/

    private void init() {
        score = 0;
        countUndo = 0;
        scoreUndo = 0;
        countMove = 0;
        int rCol1 = random.nextInt(4);
        int rRow1 = random.nextInt(4);
        int rCol2 = random.nextInt(4-rCol1);
        int rRow2 = random.nextInt(4-rRow1);
        for (row =0; row <4; row++)
        {
            for(col = 0; col <4; col++)
            {
                board[rCol1][rRow1] = 2;
                board[rCol2][rRow2] = (random.nextInt(2)+1)*2;
            }
        }
    }

    public void newGame() {
        score = 0;
        countUndo = 0;
        for (col = 0; col < 4; col++) {
            for (row = 0; row < 4; row++) {
                board[col][row] = 0;
            }
        }
        init();
    }

    public void addRandomNumber(){
        int countEmpty = 0;
        for (row = 0; row < 4; row++)
        {
            for (col = 0; col < 4; col++)
            {
                if (board[col][row] == 0)
                {
                    countEmpty ++;
                }
            }
        }

        if(countEmpty != 0)
        {
            int addedPosition = random.nextInt(countEmpty);
            int countPosition = 0 ;
            for (row = 0 ; row < 4; row++)
            {
                for (col = 0; col < 4; col ++)
                {
                    if (board[col][row] == 0)
                    {
                        countPosition++;
                    }
                    if (countPosition == addedPosition + 1)
                    {
                        board[col][row] =(random.nextInt(2)+1)*2;
                        return;
                    }
                }
            }
        }
    }


    public boolean fullRow(){
        int count = 0;
        for(row= 0; row <3;row++) {
            for (col = 0; col < 4; col++) {
                if(board[row][col] == 0 || board[row][col] == board[row+1][col] )
                {
                    count++;
                }
            }
        }
        if(count == 0) return true;
        return false;
    }

    public boolean fullCol(){
        int count=0;
        for(row= 0; row <4;row++) {
            for (col = 0; col < 3; col++) {
                if (board[row][col] == 0 || board[row][col] == board[row][col + 1]) {
                    count++;
                }
            }
        }
        if(count == 0) return true;
        return false;
    }

    public boolean fullSpecial()
    {
        boolean check = false;
        if(board[3][3] == 0 || board[3][3] == board[3][2]|| board[3][3] == board[2][3] ) return false;
        else return true;
    }

}
