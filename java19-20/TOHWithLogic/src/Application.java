import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Gamer g = new Gamer();
		g.create();
		int count =0;


		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		do {
			System.out.println("Enter command");
			String command = scanner.next();
			char c = command.charAt(0);
			if (c == 'q') {
				quit = true;
			} else {
				System.out.println("please enter from disc:");
				int fromTower = scanner.nextInt();
				System.out.println("please enter to disc.");
				int toTower = scanner.nextInt();
				System.out.println("moving from: " + fromTower + " to tower:" + toTower);

				try {
					boolean check =g.move(fromTower, toTower);
					count = count +1;

					
					if(check == true){
						System.out.println("CONGRATS");
						System.out.println("Move Count:"+count);

						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} while (quit == false);

	}
}
