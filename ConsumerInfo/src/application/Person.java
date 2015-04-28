package application;

public class Person {
	private String FirstName;
	private String LastName;
	private String Address;
	private String City;
	private String ZipCode;
	private String State;
	private char MiddleName;
	private String Gender;
	
	public Person(String firstName, String middleName, String lastName, String address, String city, String state, String zipCode, String gender) {
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		ZipCode = zipCode;
		State = state;
		Gender = gender;
		City = city;
	}
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		this.ZipCode = zipCode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}


	public char getMiddleName() {
		return MiddleName;
	}


	public void setMiddleName(char middleName) {
		MiddleName = middleName;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}
	
	

}
