package JDBC.domain;

import javafx.beans.property.SimpleStringProperty;

public class Customer {

	private int customerId;
	// private String firstName;
	// private String lastName;
	// private String address;
	private int phone;

	private final SimpleStringProperty firstName = new SimpleStringProperty("");
	private final SimpleStringProperty lastName = new SimpleStringProperty("");
	private final SimpleStringProperty address = new SimpleStringProperty("");


	public Customer(int customerId, String firstName, String lastName, String address, int phone) {
		super();
		this.customerId = customerId;
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		this.phone = phone;
	}

	public Customer(String firstName, String lastName, String address) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
	}

	public Customer() {

	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName.get();
	}

	public void setFirstName(String fName) {
		firstName.set(fName);
	}

	public String getLastName() {
		return lastName.get();
	}

	public void setLastName(String LName) {
		lastName.set(LName);
	}

	public String getAddress() {
		return address.get();
	}
	
	public void setAddress(String add) {
		address.set(add);
	}
	
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", phone=" + phone + "]";
	}

}