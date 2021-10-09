package OOP3;

public class Department {
	private String name;
	private int establishDate;
	private Manager manager;
	private IStaffs listStaff;

	public Department(String name, int establishDate, Manager manager, IStaffs listStaff) {
		super();
		this.name = name;
		this.establishDate = establishDate;
		this.manager = manager;
		this.listStaff = listStaff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEstablishDate() {
		return establishDate;
	}

	public void setEstablishDate(int establishDate) {
		this.establishDate = establishDate;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public IStaffs getListStaff() {
		return listStaff;
	}

	public void setListStaff(IStaffs listStaff) {
		this.listStaff = listStaff;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + establishDate;
		result = prime * result + ((listStaff == null) ? 0 : listStaff.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (establishDate != other.establishDate)
			return false;
		if (listStaff == null) {
			if (other.listStaff != null)
				return false;
		} else if (!listStaff.equals(other.listStaff))
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
		return "[name=" + name + ", establishDate=" + establishDate + this.manager.toString()
				+ this.listStaff.toString() + "]";
	}

}
