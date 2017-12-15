
public class NormalPet implements Pet {
	
	int id;
	static int score = -1;
	
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
		else return -1;
	}

	@Override
	public int explode ( int id2, int id3) {
		if (this.checkMatch(id2)== 1 && this.checkMatch(id3)==1) {
			score +=1;
			this.crush(this.id);
			return 1;
		}
		return -1;
	}
	 public int crush(int id) {
		 this.id = 100;
		 return this.id;
	 }
	 
}
