package demo;

public abstract class Staff  {
	protected String id;
	protected String name;
	protected Date birthday;
	protected boolean GT;
	public Staff(String id, String name, Date birthday, boolean gT) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		GT = gT;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + this.birthday.toString() + ", GT=" + GT + "]";
	}
	public abstract double wage();
	

}
