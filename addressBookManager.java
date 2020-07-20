public class addressBookManager implements InAddressBookManager {

	public void createAddressBook() {
		main.userInput();
	}


	public void openAddressBook() {
		main.openUsrIn();
	}

	public void deleteAllAddress() {
		addressBook.dataBase.clear();
		System.out.println("Address Book Emptied!");
	}


	public void quitAddressBook() {
		System.out.println("Address Book Closed, Thank you!");
	}


}
