import java.util.ArrayList;

public class Tower {
	ArrayList<Disc> disckeeper = new ArrayList<Disc>();
	private String letter;
	void draw() {
		drawPole();
		for (int x = 0; x < disckeeper.size(); x=x+1) {
			Disc d = disckeeper.get(x);
			d.draw();
		}
		System.out.println(letter);
	}

	void addDisc(Disc d){
		this.disckeeper.add(d);
	}
	Disc removeTopDisc(){
		return this.disckeeper.remove(0);
	}
	
	void drawPole() {
		for(int x=0; x<4; x++) {
			System.out.println("    |");
		}
	}


	Tower(String letter) { 
		this.letter = letter;
		
		
	}

	
}
