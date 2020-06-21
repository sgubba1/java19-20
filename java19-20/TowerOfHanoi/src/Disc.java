import java.awt.*;
import javax.swing.*;
public class Disc  {
		int width;
		int height=20 ;
		Disc(int width) {
			this.width = width;
			
		}
	
		public void draw(int referX,int referY,Graphics g, Color c) {
			Graphics2D g2 = (Graphics2D) g;
			g.setColor(c);
			g2.fillRect(referX-width/2, referY-height, width, height);

		}



}
