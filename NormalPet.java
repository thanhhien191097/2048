
public class NormalPet implements Pet {
	int id;
	static int score = 0;
	
	public NormalPet(int id) {
		super();
		this.id = id;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public int  checkMatch (int id2) {
		
		if (this.id == id2)
			return 1;
		else return 0;
	}

	@Override
	public int explode ( int id2, int id3) {
		if (this.checkMatch(id2)== 1 && this.checkMatch(id3)==1) {
			score +=10;
			return 1;
		}
		return 0;
	}
	
	
	@Override
	public int born() {
		return this.id;
	}
	
}
