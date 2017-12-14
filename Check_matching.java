
public class Check_matching {
	//We should put the object( pet[i][j]) and its position into function to test
	public int Check(int obj, int positionX, int positionY) {
		Board board = new Board();
		int check1 =0;
		for(int i= positionX -1; i>=0;i--) {
			if(obj == board.getElement(i, positionY)) {
				check1+=1;
			}
			else break;
		}
		
		int check2=0;
		for (int i=positionX + 1; i<20;i++) {
			if(obj == board.getElement(i, positionY) ) {
				check2+=1;
			}
			else break;
		}
		
		int check3=0;
		for (int i = positionY + 1;i<8;i++) {
			if(obj == board.getElement(positionX, i))
				check3 +=1;
			else break;
		}
		
		int check4=0;
		for(int i= positionY-1;i>=0;i--) {
			if(obj == board.getElement(positionX, i))
				check4+=1;
			else break;
		}
		/*
		 * return 0: explode 3 pets to the left
		 * return 1: explode 3 pets to the right
		 * return 2: explode 3 pets ,1 to the left , 1 to the right and the last one is the middle pet
		 * return 3: explode 3 pets down
		 * return 4: explode 3 pets up
		 * return 5: explode 3 pets up and down, 1 up ,1 down
		 * return -1: back to normal position before swap
		 */
		if(check1==2) {
			return 0;
		}
		else if(check2==2) {
			return 1;
		}
		else if( check1 + check2 == 2) {
			return 2;
		}
		else if(check3==2) {
			return 3;
		}
		else if(check4==2) {
			return 4;
		}
		else if(check3+check4==2) {
			return 5;
		}
		else return -1;
		
	}
}
