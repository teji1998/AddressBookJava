public class person {
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private int zip;
	private long phoneNumber;

	//Constructor
	public person(){
		this.firstName=firstName;
		this.lastName=lastName;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phoneNumber=phoneNumber;
	}
	//Getter Methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	//Setter Methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCity(String city) {
		this.city= city;
	}

	public void setState(String state) {
		this.state= state;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString(){
		return " \nFirstName : "+this.firstName +" \nLastName : "+this.lastName +" \nCity : "+this.city +"\nState : "+this.state +" \nZip : "+this.zip +" \nPhoneNumber : "+this.phoneNumber ;
	}
}
