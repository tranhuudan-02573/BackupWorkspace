package demo;

public class Department {
	private String name;
	private int estalishDate;
	private Manager Manager;
	private IStaffs list;
	public Department(String name, int estalishDate, Manager manager, IStaffs list) {
		super();
		this.name = name;
		this.estalishDate = estalishDate;
		Manager = manager;
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEstalishDate() {
		return estalishDate;
	}
	public void setEstalishDate(int estalishDate) {
		this.estalishDate = estalishDate;
	}
	public Manager getManager() {
		return Manager;
	}
	public void setManager(Manager manager) {
		Manager = manager;
	}
	public IStaffs getList() {
		return list;
	}
	public void setList(IStaffs list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", estalishDate=" + estalishDate + this.Manager.toString() + this.list.toString()
				+ "]";
	}
	public double totalWage() {
		return this.list.totalWage();
		
	}
	public double maxWage() {
		return this.list.maxWage();
	}
	
	

}
