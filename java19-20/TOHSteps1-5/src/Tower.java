
public class Tower {
	Disc disc;
	void draw(){
		System.out.println("Tower is being drawn!");
		this.disc.draw(); 
	}
	void addDisc(Disc d){
		System.out.println("disc is being added to tower");
		this.disc=d; //saving object into field
	}
}
