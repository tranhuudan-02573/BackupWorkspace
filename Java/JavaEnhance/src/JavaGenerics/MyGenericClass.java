package JavaGenerics;

public class MyGenericClass<Thing extends Number, Thing2 extends Number> {

	Thing x;
	Thing2 y;
	
	MyGenericClass(Thing x, Thing2 y) {
		this.x = x;
		this.y = y;
	}

	public Thing2 getValue() {
		return y;

	}

	public static void main(String[] args) {
		MyGenericClass<Number, Number> n = new MyGenericClass<Number, Number>(2,5);
		System.out.println(n.getValue());
	}

}
