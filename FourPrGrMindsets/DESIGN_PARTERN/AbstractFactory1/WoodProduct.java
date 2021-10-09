package AbstractFactory1;

public class WoodProduct extends ASecondFactory {

	@Override
	public ITable getTable() {
		// TODO Auto-generated method stub
		return new WoodTable();
	}

	@Override
	public IChair getChair() {
		// TODO Auto-generated method stub
		return new WoodChair();
	}

}
