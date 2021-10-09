package AbstractFactory1;

public class User {

	public static void main(String[] args) {

		System.out.print(FirstFactory.getType(EProductType.WOOD).getChair().getName());

	}

}
