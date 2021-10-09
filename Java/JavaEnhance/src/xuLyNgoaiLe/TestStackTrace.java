package xuLyNgoaiLe;

public class TestStackTrace {

	void methodA() throws Exception {
		methodB();
		throw new Exception();
	}

	void methodB() throws Exception {
		methodC();
		throw new Exception();
	}

	void methodC() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) {
		TestStackTrace t = new TestStackTrace();
		try {
			t.methodA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
