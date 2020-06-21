import java.awt.*;
import javax.swing.*;

public class DiscManager {
	Disc large;
	Disc med;
	Disc small;

	DiscManager() {
		this.large = new Disc(100);
		this.med = new Disc(80);
		this.small = new Disc(60);
	}

	Disc getLarge() {
		return large;
	}

	Disc getMed() {
		return med;
	}

	Disc getSmall() {
		return small;
	}
}
