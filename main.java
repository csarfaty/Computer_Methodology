
import java.util.Scanner;
import java.util.ArrayList;

public class main {
	public static void main(String [] args) {
		
		ArrayList<Camper> camperList= new ArrayList<Camper>();
		int firstStep;
		Scanner kb = new Scanner(System.in);
		char choice= 'C';
		do {
			System.out.println("'A'dd camper, 'R'emove camper, 'D'eposit for camper, 'P'rint all campers, 'Q'uit");
			choice = kb.nextLine().toUpperCase().charAt(0);
			switch(choice) {
				case 'A':
					addCamper(camperList);
					break;
				case 'R':
					removeCamper(camperList);
					break;
				case 'D':
					depositCamper(camperList);
					break;
				case 'P':
					printCampers(camperList);
					break;
				case 'Q':
					System.out.println("Exiting.");
					break;
				default:
					System.out.println("Invalid selection.");
					break;
			}
		}
		while (choice != 'Q');
	}

	private static void printCampers(ArrayList<Camper> camperList) {
		for (int i=0; i<camperList.size(); i++){
			System.out.println(camperList.get(i).getFirstName()+ ' '+ camperList.get(i).getLastName());
			System.out.println();
		}
	}

	private static void depositCamper(ArrayList<Camper> camperList) {
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter camper ID you would like to deposit for: ");
		int id=kb.nextInt();
		kb.nextLine();
		for (int i=0; i<camperList.size(); i++) {
			if (camperList.get(i).getID()==id) {
				System.out.println("Please enter deposit amount: ");
				int deposit= kb.nextInt();
				camperList.get(i).deposit(deposit);
				System.out.println("Deposit of $"+ deposit+ " was a succes");
				break;	
			}
		}
		System.out.println("Camper does not exist.");
		
	}

	private static void removeCamper(ArrayList<Camper> camperList) {
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter camper ID of the camper you would like to remove");
		int id= kb.nextInt();
		for (int i=0; i<camperList.size(); i++) {
			if (camperList.get(i).getID()==id) {
				camperList.remove(i);
				camperList.get(i).removeCamper();
				break;
				
			}
		}
		System.out.println("Camper does not exist.");
		
	}

	private static void addCamper(ArrayList<Camper> camperList) {
		Scanner kb= new Scanner(System.in);
		System.out.println("First Name: ");
		String firstName=kb.nextLine();;
		System.out.println("Last name: ");
		String lastName= kb.nextLine();
		System.out.println("Street Address: ");
		String address=kb.nextLine();
		System.out.println("Age (1- for entering 1st grade, 2- for entering 2nd grade): ");
		int age=kb.nextInt();
		System.out.println("For first half select 1, for second half select 2, for full summer select 2");
		int half= kb.nextInt();
		System.out.println("Deposit amount: ");
		int amountPaid=kb.nextInt();
		kb.nextLine();
		Camper camper = new Camper(firstName, lastName, address,  age, half, amountPaid);
		camperList.add(camper);
		
	}}
