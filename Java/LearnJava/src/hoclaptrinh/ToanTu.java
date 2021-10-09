package hoclaptrinh;

public class ToanTu {

	public static void main(String[] args) {
		int a = 120;
		int b = 255;
		float res = a/(b*1.0f); // kq chia so thuc 
		int res2 = a/b; // kq chia so nguyen
		System.out.println(res);
		System.out.println(res2);
		int kq = a % b ; // phep chia lay du
		System.out.println(kq);
		a = a + 100;
		// tuong duong
		a+= 100;
		a*= 100; // a = a * 100;
		
		int c = 5;
		int d = c--; // gan c cho d roi moi giam c di 1
		System.out.println(d);
		c = 5;
		d = --c; // giam c di 1 roi ms gan vao d 
		System.out.println(d);
		
		// tuong tu 
		int e = 5;
		System.out.println(e++); // in e ra roi ms tang
		e = 5;
		System.out.println(++e); // tang e roi in kq do ra
		System.out.println("a == b" + (a == b));
		System.out.println("a >= b " + (a >= b));
		System.out.println("a <= b " + (a <= b));
		System.out.println((a > b) && (a != b));
		System.out.println((a == b) || (a != b));
		System.out.println(!(a > b)); // phu dinh kq
		
		String res3 = "";
		res3 = (a < b) ?  "a < b" : "a >= b"; // neu a < b true thi "a < b" duoc gan vao res3, nguoc lai neu a < b fale thi "a >= b" duoc gan cho res3
		System.out.println(res3);
	}

}
