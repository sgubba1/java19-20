import java.util.ArrayList;

public class Gamer {
	
	void create() {
		System.out.println("Making game!");
		ArrayList<Tower> towers = new ArrayList<Tower>();
		DiscManager dm = new DiscManager();
		Disc small = dm.getSmallDisc();
		Disc medium = dm.getMediumDisc();
		Disc large = dm.getLargeDisc();

		Tower t1 = new Tower("T1");
		t1.addDisc(small);
		t1.addDisc(medium);
		t1.addDisc(large);
	
		towers.add(t1);
		Tower t2 = new Tower("T2");
		towers.add(t2);
		
		Tower t3 = new Tower("T3");
		towers.add(t3);
		
		
		for(int i=0; i<towers.size(); i++){
			Tower t = towers.get(i);
			t.draw();
		}

	}

	void move(int from, int to) {
		//System.out.printf("moving", from, to);
		//Disc disc = towers[from].removeTopDisc();
		//towers[to].addDisc(disc);
		//draw();
		
	}
	
	}
	

