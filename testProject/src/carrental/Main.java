package carrental;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		WorkflowManager manager = new WorkflowManager();
		Scanner scan = new Scanner(System.in);
		String input;
		boolean run = true;
		while(run) {
			System.out.println("Please choose your decired workflow");
			System.out.println("1. create car");
			System.out.println("2. crete customer");
			System.out.println("3. rent car");
			input = scan.nextLine();
			switch (input) {
			case "1": {
				manager.register_car();
				break;
			}
			case "2":{
				manager.register_customer();
				break;
			}
			case "3":{
				manager.book_car();
				break;
			}
			case "quit":{
				run=false;
				break;
			}
			default:
				System.out.println("uption not recogniced, type 'quit' to exit");
			}
	} 
	}
}
