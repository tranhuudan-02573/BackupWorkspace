package OOP4;

public class Customer {
	private int identification;
	private String name;
	private String address;
	private int birthYear;
	public Customer(int identification, String name, String address, int birthYear) {
		super();
		this.identification = identification;
		this.name = name;
		this.address = address;
		this.birthYear = birthYear;
	}
	public int getIdentification() {
		return identification;
	}
	public void setIdentification(int identification) {
		this.identification = identification;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birthYear != other.birthYear)
			return false;
		if (identification != other.identification)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "[identification=" + identification + ", name=" + name + ", address=" + address + ", birthYear="
				+ birthYear + "]";
	}
	
	

}
