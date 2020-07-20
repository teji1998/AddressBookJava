	import java.util.Scanner;

	public class main{


		private static Scanner scan = new Scanner(System.in);

		public static void main(String[] args) {
			userInterface();
		}

		public static void userInterface() {
			System.out.println("Welcome to Address Book");

			loop1: while (true) {
				System.out.println("\nMain Menu: ");

				System.out.println("\n1. New Address Book\n2. Open Address Book\n3. Delete Entire AddressBook\n4. Quit AddressBook");
				System.out.println("\nEnter the option: ");
				addressBookManager addMan = new addressBookManager();
				System.out.println();
				int choice = scan.nextInt();
				scan.nextLine();

				switch (choice) {
					case 1:
						addMan.createAddressBook();
						break;
					case 2:
						addMan.openAddressBook();
						break;
					case 3:
						addMan.deleteAllAddress();
						break;
					case 4:
						addMan.quitAddressBook();
						break loop1;
					default:
						System.out.println("Error: Invalid Option\nTry Again!");
						break;
				}
			}
		}
		public static void userInput() {

			person newPerson = new person();

			System.out.println("Enter First Name: ");
			newPerson.setFirstName(scan.nextLine());
			System.out.println("Enter Last Name: ");

			newPerson.setLastName(scan.nextLine());
			System.out.println("Enter City: ");
			newPerson.setCity(scan.nextLine());
			System.out.println("Enter State: ");
			newPerson.setState(scan.nextLine());
			System.out.println("Enter Zip: ");
			newPerson.setZip(scan.nextInt());
			System.out.println("Enter Phone Number: ");
			newPerson.setPhoneNumber(scan.nextLong());


			addressBook newEntry = new addressBook();
			newEntry.addPerson(newPerson);

		}

		public static void openUsrIn() {
			loop2: while (true) {
				System.out.println("\nOptions for Address Book: \n1. Add Person\n2. Edit Person\n3. Delete Person\n4. Search Person\n5. Sort by Zip\n6. Sort by First Name\n7. Display Entire Address Book\n8. Exit to Main Menu\n");
				System.out.println("Enter an option: ");
				int option = scan.nextInt();
				scan.nextLine();
				addressBook tempBook = new addressBook();

				switch(option) {
					case 1:
						userInput();
						break;
					case 2:
						tempBook.editPerson();
						break;
					case 3:
						System.out.println("Enter the Phone Number of the Person to be Deleted: ");
						long num = scan.nextLong();
						tempBook.deletePerson(num);
						break;
					case 4:
						System.out.println("Enter the Phone Number of the Person to Search: ");
						long num1 = scan.nextLong();
						tempBook.searchPerson(num1);
						System.out.println();
						break;
					case 5:
						tempBook.sortByZip();
						System.out.println();
						break;
					case 6:
						tempBook.sortByFirstName();
						System.out.println();
						break;
					case 7:
						tempBook.display();
						System.out.println();
						break;
					case 8:
						System.out.println("Exiting to Main Menu ...");
						break loop2;
					default:
						System.out.println("Error: Invalid Input\nTry Again!");
						break;

				}
			}
		}
	}


