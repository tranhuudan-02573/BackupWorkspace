package baiTapTuLuyen;

public class DocSo1 {

	public static String readNumber(int number) {

		String[] arr = { "khÃ´ng", "má»™t", "hai", "ba", "bá»‘n", "nÄƒm", "sÃ¡u", "báº£y", "tÃ¡m", "chÃ­n" };
		String[] hang = { "mÆ°á»�i`", "trÄƒm", "láº»", "mÆ°Æ¡i" };
		// so hang don vi
		int sohangdau;
		int sodu = number % 10;
		int sohangchuc;
		// hang tram
		int soduchuc = number % 100;
		if (number < 10) {
			return arr[sodu];
		}
		if (number > 10 && number < 20) {
			return hang[0] + arr[sodu];
		}
		// xu li truong hop 20,30,..,90 //sai
		sohangdau = (number - sodu) / 10;
		if (number % 10 == 0 && number < 100) {
			return arr[sohangdau] + " " + hang[3];
		}
		// hang chuc >19
		if (number > 19 && number < 100) {
			return arr[sohangdau] + " " + arr[sodu];
		}
		// tach so hang tram
		sohangdau = (number - soduchuc) / 100;
		// xu li cac trong hop 100,200,..,900
		if (number % 100 == 0) {
			return arr[sohangdau] + " " + hang[1];
		}

		for (int i = 1; i < 10; i++) {
			if (i * 100 < i * 100 + 10) {
				return arr[sohangdau] + " " + hang[1] + " " + hang[2] + " " + arr[sodu];
			}
		}
		if (number > 99 && number < 1000) {
			// tach hang chuc
			sodu = soduchuc % 10;
			sohangchuc = (soduchuc - sodu) / 10;
			return arr[sohangdau] + " " + hang[1] + " " + arr[sohangchuc] + " " + arr[sodu];
		}
		return "";
	}
}
