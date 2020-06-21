import java.awt.*;
import javax.swing.*;
public class TowerPanel extends JPanel{
	int referX;
	int referY;
	int basewidth;
	int baseheight;
	int towerwidth;
	int towerheight;
	int discheight = 30;
	int discwidth1 = 150;
	int discwidth2 = 100;
	int discwidth3 = 50;
	int numberOfDiscs;
	TowerPanel(int referX, int referY, int numberOfDiscs){
		this.referX = referX;
		this.referY = referY;
		this.numberOfDiscs = numberOfDiscs;
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // overriding the parent class (JPanel) -- make
									// the blank go away
		//protected- like your wifi password- only given to some,can be used by child classes unlike private
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.WHITE);
		g2.fillRect(referX-basewidth/2, referY, basewidth, baseheight);
		g2.setColor(Color.WHITE);
		g2.fillRect(referX-towerwidth/2, referY-towerheight, towerwidth, towerheight);
		int discx=referX;
		int discy=referY;
		int dheight=20;
		Disc large= new Disc(100);
		
		Disc med = new Disc(80);
		
		Disc small = new Disc(60);
		if(numberOfDiscs == 0){
			return;
		}
		
		if(numberOfDiscs>=1){
		large.draw(discx, discy,g, Color.green);
		discy = discy - dheight;
		}
		if(numberOfDiscs >=2){
			med.draw(discx, discy, g, Color.blue);
			discy = discy - dheight;
	
		}
		if(numberOfDiscs ==3){
			small.draw(discx, discy, g, Color.yellow);

		}
		

		
	}
}
