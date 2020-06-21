import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Person P1 = new Person();
		P1.name = "John";
		System.out.println(P1.name);
		P1.getAge(14);
		
		Scanner sca = new Scanner(System.in);
		boolean quit = false;
		do {
			System.out.print("command:");
			String command = sca.next();
			if( command.equalsIgnoreCase("quit")) {
				quit = true;
			}else if( command.equalsIgnoreCase("move")) {
				System.out.print("from:");
				int from  = sca.nextInt();
				System.out.print("to:");
				int to = sca.nextInt();
				g.move(from, to);
			}else {
				System.out.println("unable to do move");
			}
		}while(quit==false);
		System.out.println("QUTTING GAME");
	}

}
