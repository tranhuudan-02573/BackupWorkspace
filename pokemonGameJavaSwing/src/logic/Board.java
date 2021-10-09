package logic;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Board {
	public static final int NUM_ROWS = 12;
	public static final int NUM_COLUMNS = 18;
	private ArrayList<File> listPokemon;
	private Square[][] listSquare;

	public Board() {
		listSquare = new Square[NUM_ROWS][NUM_COLUMNS];
		for (int i = 0; i < listSquare.length; i++) {
			for (int j = 0; j < listSquare[0].length; j++) {
				listSquare[i][j] = new Square();
			}
		}
		// tạo danh sách các pokemon
		File gallery = new File("./src/resources");
		File[] images = gallery.listFiles();
		listPokemon = new ArrayList<File>();
		if (images.length >= (NUM_ROWS - 2) * (NUM_COLUMNS - 2) / 8) {
			for (int i = 0; i < (NUM_ROWS - 2) * (NUM_COLUMNS - 2) / 8; i++) {
				for (int j = 0; j < 8; j++) {
					listPokemon.add(images[i]);
				}
			}
		} else {
			System.out.println("Khong du so anh");
		}
		initBoard();
	}

	public Square[][] getListSquare() {
		return listSquare;
	}

	public void setListSquare(Square[][] list) {
		listSquare = list;
	}

	private void initBoard() {
		int index = 0;
		Collections.shuffle(listPokemon);
		for (int i = 0; i < listSquare.length; i++) {
			for (int j = 0; j < listSquare[0].length; j++) {
				if (i > 0 && i < NUM_ROWS - 1 && j > 0 && j < NUM_COLUMNS - 1) {
					listSquare[i][j].setDroped(false);
					listSquare[i][j].setValue(listPokemon.get(index));
					index++;
				}
			}
		}
	}

	public boolean checkMatching(int x0, int y0, int x1, int y1) {
		if (listSquare[x0][y0].getValue().equals(listSquare[x1][y1].getValue())) {
			// đường nối giữa nằm ngang
			// lấy dải các ô trên dưới của điểm 0 có thể tạo đường nối
			int top0 = x0, bot0 = x0;
			while (bot0 - 1 >= 0) {
				if (listSquare[bot0 - 1][y0].isDroped()) {
					bot0--;
				} else {
					break;
				}
			}
			while (top0 + 1 <= NUM_ROWS - 1) {
				if (listSquare[top0 + 1][y0].isDroped()) {
					top0++;
				} else {
					break;
				}
			}
			// lấy dải các ô trên dưới của điểm 1 có thể tạo đường nối
			int top1 = x1, bot1 = x1;
			while (bot1 - 1 >= 0) {
				if (listSquare[bot1 - 1][y1].isDroped()) {
					bot1--;
				} else {
					break;
				}
			}
			while (top1 + 1 <= NUM_ROWS - 1) {
				if (listSquare[top1 + 1][y1].isDroped()) {
					top1++;
				} else {
					break;
				}
			}
			// lấy dải tương giao của 2 đường nối dọc
			int minTop = top0 >= top1 ? top1 : top0;
			int maxBot = bot0 >= bot1 ? bot0 : bot1;
			int minY = y0 >= y1 ? y1 : y0;
			int maxY = y0 >= y1 ? y0 : y1;
			for (int i = maxBot; i <= minTop; i++) {
				// kiểm tra xem có thể tìm đường nối ngang ko
				int count = 0;
				for (int j = minY + 1; j < maxY; j++) {
					if (listSquare[i][j].isDroped()) {
						count++;
					} else {
						break;
					}
				}
				if (count == maxY - minY - 1) {
					listSquare[x0][y0].setDroped(true);
					listSquare[x1][y1].setDroped(true);
					return true;
				}
			}

			// đường nối giữa nằm dọc
			int left0 = y0, right0 = y0;
			while (left0 - 1 >= 0) {
				if (listSquare[x0][left0 - 1].isDroped()) {
					left0--;
				} else {
					break;
				}
			}
			while (right0 + 1 <= NUM_COLUMNS - 1) {
				if (listSquare[x0][right0 + 1].isDroped()) {
					right0++;
				} else {
					break;
				}
			}
			int left1 = y1, right1 = y1;
			while (left1 - 1 >= 0) {
				if (listSquare[x1][left1 - 1].isDroped()) {
					left1--;
				} else {
					break;
				}
			}
			while (right1 + 1 <= NUM_COLUMNS - 1) {
				if (listSquare[x1][right1 + 1].isDroped()) {
					right1++;
				} else {
					break;
				}
			}
			int minRight = right0 >= right1 ? right1 : right0;
			int maxLeft = left0 >= left1 ? left0 : left1;
			int minX = x0 >= x1 ? x1 : x0;
			int maxX = x0 >= x1 ? x0 : x1;
			for (int i = maxLeft; i <= minRight; i++) {
				int count = 0;
				for (int j = minX + 1; j < maxX; j++) {
					if (listSquare[j][i].isDroped()) {
						count++;
					} else {
						break;
					}
				}
				if (count == maxX - minX - 1) {
					listSquare[x0][y0].setDroped(true);
					listSquare[x1][y1].setDroped(true);
					return true;
				}
			}
		}
		return false;
	}
}
