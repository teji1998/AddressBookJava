
public interface InAddressBook {
	public void addPerson(person newPerson);
	public void editPerson();
	public void deletePerson(long phoneNumber);
	public void searchPerson(long phoneNumber);
	public void sortByZip();
	public void sortByFirstName();
	public void display();
}