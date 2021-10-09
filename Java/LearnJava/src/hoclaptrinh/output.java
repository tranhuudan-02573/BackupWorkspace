package hoclaptrinh;

public class output {

	public static void main(String[] args) {
		int a = 10;
		int b = 3; 
		double res = 1.0*a/b;
		
		// định dạng dữ liệu 
		System.out.println("KQ = " + res);
		System.out.printf("KQ = %f\n", res); // in ra số thực ngắn đi
		System.out.printf("KQ = %10.2f\n", res); // in ra số thực chỉ lấy 2 đv sau dấu chấm và thụt vào 10 đv  
		System.out.printf("KQ = %-10.2f\n", res); // số dương sẽ được đẩy sang phía phải
		System.out.printf("KQ = %10.5f", res);
		System.out.println();
		double res1 = 9999999999.232323;
		System.out.printf("%,3.5f", res1);
		
		/**
		 * int :  %d
		 * char : %c
		 * String : %s
		 * double : %f
		 * float : %f
		 * boolean " %b
		 * % : %%
		 */
		
	}

}

