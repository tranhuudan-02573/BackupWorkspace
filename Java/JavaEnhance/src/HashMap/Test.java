package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		while (true) {
			System.out.println("UserName:");
			Map<String, String> map = new HashMap<String, String>();
			map.put("tranhuudan", "kukipio02573");
			Scanner s = new Scanner(System.in);
			User user = new User("tranhuudan", "kukipio02573");

			if ((user.loginUser(s.next()))) {
				System.out.println("Password:");
				if (user.loginPass(s.next())) {
					for (String i : map.keySet()) {
						System.out.println("dang nhap thanh cong" + i + "-" + map.get(i));
					}
				} else {
					System.out.println("sai password vui long nhap lai!!");
				}
			} else {
				System.out.println("sai ten user vui long nhap lai!!");
			}
		}
	}
}
