package OOP3;

public abstract class AStaff {
	protected String id;
	protected String name;
	protected Birthday date;
	protected boolean gender;
	public AStaff(String id, String name, Birthday date, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AStaff other = (AStaff) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (gender != other.gender)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		return "[id=" + id + ", name=" + name + this.date.toString() + ", gender=" + gender + "]";
	}
	public abstract int wage();
	
}
