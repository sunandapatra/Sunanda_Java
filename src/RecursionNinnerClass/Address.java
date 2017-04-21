package RecursionNinnerClass;

public class Address {
	String addressOne;
	String addressTwo;
	int zip;

	public Address(String addressOne,String addressTwo,int zip) {
		this.addressOne = addressOne;
		this.addressTwo = addressTwo;
		this.zip = zip;
	}
	public String getAddressOne() {
		return addressOne;
	}

	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}

	public String getAddressTwo() {
		return addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

}