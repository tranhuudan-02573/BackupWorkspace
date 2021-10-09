package AbstractFactory1;

public class FirstFactory {

	private FirstFactory() {

	}

	public static ASecondFactory getType(EProductType productType) {
		switch (productType) {
		case PLASTIC:
			return new PlasticProduct();
		case WOOD:
			return new WoodProduct();
		default:
			throw new IllegalArgumentException();
		}
	}
}
