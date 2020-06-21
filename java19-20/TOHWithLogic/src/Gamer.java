import java.util.ArrayList;

public class Gamer {

	ArrayList<Tower> towers = new ArrayList<Tower>();
	DiscManager dm = new DiscManager();
	Disc small = dm.getSmallDisc();
	Disc medium = dm.getMediumDisc();
	Disc large = dm.getLargeDisc();

	void create() throws Exception {
		System.out.println("Making game!");

		Tower t1 = new Tower("T1");
		t1.addDisc(large);
		t1.addDisc(medium);
		t1.addDisc(small);

		towers.add(t1);
		Tower t2 = new Tower("T2");
		towers.add(t2);

		Tower t3 = new Tower("T3");
		towers.add(t3);

		this.draw();

	}

	boolean move(int from, int to) throws Exception {
		
		Tower t1 = towers.get(from - 1);
		Disc d = t1.removeDisc();
		Tower t2 = towers.get(to - 1);
		try {
			t2.addDisc(d);
		} catch (Exception e) {
			t1.addDisc(d);
			throw e;
		}
		this.draw();

		//int tower2count = towers.get(1).getDiscCount();
		//int tower3count = towers.get(2).getDiscCount();

		if (towers.get(1).getDiscCount() == 3 || towers.get(2).getDiscCount() == 3) {
			return true;
		} else {
			return false;
		}

	}

	void draw() {
		for (int i = 0; i < towers.size(); i++) {
			Tower t = towers.get(i);
			t.draw();

		}

	}

}

// Disc disc = towers[from].removeTopDisc();
// towers[to].addDisc(disc);
// draw();
