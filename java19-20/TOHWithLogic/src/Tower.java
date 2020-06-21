import java.util.ArrayList;

public class Tower {
	ArrayList<Disc> disckeeper = new ArrayList<Disc>();
	private String letter;

	void draw() {
		drawPole();
		for (int x = disckeeper.size()-1; x>=0; x = x - 1) {
			Disc d = disckeeper.get(x);
			d.draw();
		}
		System.out.println(letter);
	}

	void addDisc(Disc d)throws Exception {
		// don't allow if input disc (d) size is more than top disc size
		// get top index (size()-1)
		// get top disv (get())
		// check topdisc.size > d.size
		// throw

		// add disc

		if (disckeeper.size() > 0) {
			Disc topdisc = disckeeper.get(disckeeper.size() - 1);
			int topdisclength = topdisc.size;
			int inputlength = d.size;

			if (inputlength > topdisclength)  {
				Exception e2 = new Exception("Unable to move disc");
				throw e2;
			}
		}
		this.disckeeper.add(d);

	}

	Disc removeDisc() throws Exception { // removes top disc
		if (disckeeper.size() == 0) {
			Exception e = new Exception("There are no discs in this tower");// hover
																			// over
																			// exception
																			// to
																			// see
																			// description
			throw e;
		} else {
			Disc first = this.disckeeper.remove(this.disckeeper.size()-1);
			return first;

		}

	}

	void drawPole() {
		for (int x = 0; x < 4; x++) {
			System.out.println("    |");
		}
	}

	Tower(String letter) {
		this.letter = letter;

	}
	int getDiscCount(){
		return disckeeper.size();
	}

}
