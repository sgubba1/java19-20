
public class Disc {
	int size;

	Disc(int size) {
		this.size = size;
	}

	void draw() {
		for (int x = 0; x < size; x++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
