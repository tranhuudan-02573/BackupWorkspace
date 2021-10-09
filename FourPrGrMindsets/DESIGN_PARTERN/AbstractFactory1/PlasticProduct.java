package AbstractFactory1;

	public class PlasticProduct extends ASecondFactory{

		public ITable getTable() {
			// TODO Auto-generated method stub
			return new PlasticTable();
		}

		public IChair getChair() {
			// TODO Auto-generated method stub
			return new PlasticChair();
		}
		
	}

