import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gamer {
void create(){
	JFrame J = new JFrame();
	J.setSize(1000,1000);
	J.setVisible(true);
	J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GridLayout l = new GridLayout(1,3);
	J.setLayout(l);
	
	TowerPanel p=new TowerPanel(175,500,1);
	
	p.setSize(100, 100);
	p.setBackground(Color.cyan);
	p.basewidth = 200;
	p.baseheight = 50;
	p.towerwidth=50;
	p.towerheight=400;
	J.add(p);

	
	TowerPanel p1 = new TowerPanel(175,500,2);
	p1.setSize(100, 100);
	p1.setBackground(Color.black);
	p1.basewidth = 200;
	p1.baseheight = 50;
	p1.towerwidth=50;
	p1.towerheight=400;
	J.add(p1);
	
	TowerPanel p2 = new TowerPanel(175,500,3);
	p2.setSize(100, 100);
	p2.setBackground(Color.cyan);
	p2.basewidth = 200;
	p2.baseheight = 50;
	p2.towerwidth=50;
	p2.towerheight=400;
	J.add(p2);
	
	
}
}
