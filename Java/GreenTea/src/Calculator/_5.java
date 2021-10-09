package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class _5 extends JFrame implements ActionListener, KeyListener {
	int count = 1;
	String[] str = new String[100];
	JPanel panCen, panBot, panMain, panTop, panCen2, panExtra;
	JTextArea text;
	JLabel label;
	JButton[] buttonsMain = new JButton[30];
	JButton[] buttonsDisplay = new JButton[6];
	Font myFont1 = new Font("Edda ", Font.BOLD, 55);
	Font myFont2 = new Font("Edda  ", Font.BOLD, 20);
	Font myFont3 = new Font("Edda  ", Font.ITALIC, 30);
	String buttonsName[] = { "M", "MS", "M-", "M+", "MR", "MC", "%", "C", "CE", "<=", "1", "2", "3", "+", "4", "5", "6",
			"-", "7", "8", "9", "*", ".", "0", ",", "/", "(", "sqrt(", ")", "=" };
	static ArrayList<Double> R;
	static ArrayList<String> opStr;
	static int countNext;

	public _5() {

		// create pannel Main
		panMain = new JPanel();
		panMain.setLayout(new BorderLayout());

		// create pannel center
		panCen = new JPanel();
		panCen.setLayout(new GridLayout(1, 1));

		// create pannel Bot
		panBot = new JPanel();
		panBot.setLayout(new GridLayout(6, 6));
		// create pannel Top
		panTop = new JPanel();
		panTop.setLayout(new GridLayout(1, 1));

		// create pannel cen2
		panCen2 = new JPanel();
		panCen2.setLayout(new GridLayout(1, 5));

		// creat pannel extra
		panExtra = new JPanel();
		panExtra.setLayout(new BorderLayout());

		panExtra.add(panCen);
		panExtra.add(panCen2);
		this.getContentPane().setBackground(Color.black);
		panMain.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		panCen.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		panTop.setBorder(BorderFactory.createLineBorder(Color.red, 1));

		text = new JTextArea();
		text.setWrapStyleWord(true);
		text.setLineWrap(true);
		panBot.setBackground(Color.gray);
		text.setEditable(false);
		panCen.add(text);
		label = new JLabel("CASIO");
		panTop.add(label);
		label.setHorizontalAlignment(JLabel.CENTER);

		for (int i = 0; i < 6; i++) {
			buttonsDisplay[i] = new JButton(buttonsName[i]);
			buttonsDisplay[i].addActionListener(this);
			buttonsDisplay[i].setBackground(Color.white);
			panCen2.add(buttonsDisplay[i]);

		}

		for (int i = 6; i < 30; i++) {
			buttonsMain[i] = new JButton(buttonsName[i]);
			buttonsMain[i].addActionListener(this);
			buttonsMain[i].addKeyListener(this);
			buttonsMain[i].setFont(myFont2);
			panBot.add(buttonsMain[i]);
			buttonsMain[i].setBackground(Color.white);
			buttonsMain[i].setActionCommand(buttonsName[i]);
		}
		panMain.addKeyListener(this);
		this.addKeyListener(this);
		label.setForeground(Color.RED);// set font color of text
		label.setFont(myFont1);// set font off text
		panMain.add(panBot, BorderLayout.SOUTH);
		panMain.add(panTop, BorderLayout.NORTH);
		panMain.add(panExtra, BorderLayout.CENTER);
		panExtra.add(panCen, BorderLayout.NORTH);
		panExtra.add(panCen2, BorderLayout.SOUTH);
		panCen.setPreferredSize(new Dimension(100, 100));
		panBot.setPreferredSize(new Dimension(325, 325));
		panTop.setPreferredSize(new Dimension(50, 50));
		panCen2.setPreferredSize(new Dimension(30, 30));

		this.setFocusable(true);
		this.setFocusCycleRoot(true);
		this.add(panMain);
		this.setSize(350, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("CALCULATOR");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i <= 9; i++) {
			if (e.getActionCommand().equals(String.valueOf(i))) {
				str[count] = "" + String.valueOf(i);
				count++;
				text.setFont(myFont3);
				text.setText(text.getText() + i);
			}
		}
		/*
		 * Dấu cộng , trừ, nhân, chia, "." không thể tồn tại 2 dấu đứng sát nhau "+"&"-"
		 * có thể đứng đầu của chuỗi ( "*", "/" thì không) Dấu "." sẽ đi cụ thể trogn
		 * phần dấu "."
		 */
		if (e.getActionCommand().equals("+")) {
			// Khi nút "+" được nhấn,
			// kiểm tra xem kí tự trước nó có phải là "dấu" không (kí tự cuối cùng của
			// chuỗi)
			if (!checkMarkDot(str[count - 1])) { // nếu không phải là "dấu"
				str[count] = "" + "+";// lưu trong mảng để xử lí
				count++;
				text.setText(text.getText() + "+");// thêm dấu "+" vào cuối
			} else { // là "dấu" thì xóa dấu trước đó và thêm dấu mới vào
				text.setText(text.getText().substring(0, text.getText().length() - 1) + "+");
				str[count - 1] = "" + "+";// lưu trong mảng để xử lí
			}
		}

		// Tương tự dấu cộng các dấu còn lại hoạt động y hệt
		// Dấu trừ có khác một tí là khi nhấn 2 lần nó sẽ thành dấu +
		if (e.getActionCommand().equals("-")) {
			if (!checkMarkDot(str[count - 1])) {
				str[count] = "" + "-";
				count++;
				text.setText(text.getText() + "-");
			} else {
				if (str[count - 1] == "-") {// nếu phía trước là "-" thì đổi thành "+"
					text.setText(text.getText().substring(0, text.getText().length() - 1) + "+");
					str[count - 1] = "" + "+";
				} else {
					text.setText(text.getText().substring(0, text.getText().length() - 1) + "-");
					str[count - 1] = "" + "-";
				}
			}
		}
		// Dấu nhân và chia không thể đứng ở đầu tiên có nghĩa là không thể đứng ở vị
		// trí thứ 1
		if (e.getActionCommand().equals("*")) {
			if (!(count == 1)) {// khác vị trí 1 mới nhận lệnh, (count là vị trí trong mảng)

				if (!checkMarkDot(str[count - 1])) {
					str[count] = "" + "*";
					count++;
					text.setText(text.getText() + "*");
				} else {
					text.setText(text.getText().substring(0, text.getText().length() - 1) + "*");
					str[count - 1] = "" + "*";

				}
			}
		}
		if (e.getActionCommand().equals("%")) {
			if (!(count == 1)) {// khác vị trí 1 mới nhận lệnh, (count là vị trí trong mảng)
				if (!checkMarkDot(str[count - 1])) {
					str[count] = "" + "%";
					count++;
					text.setText(text.getText() + "%");
				} else {
					text.setText(text.getText().substring(0, text.getText().length() - 1) + "%");
					str[count - 1] = "" + "%";

				}
			}
		}
		// Tương tự dấu Nhân
		if (e.getActionCommand().equals("/")) {
			if (!(count == 1)) {
				if (!checkMarkDot(str[count - 1])) {
					str[count] = "" + "/";
					count++;
					text.setText(text.getText() + "/");
				} else {
					text.setText(text.getText().substring(0, text.getText().length() - 1) + "/");
					str[count - 1] = "" + "/";
				}
			}
		}
		// xoa 1 ki tu, ta sử dụng hàm <Substring()>(hàm này trả về chuỗi con từ chuỗi
		// cha ta truyền cho nó)
		// nếu muốn xóa kí tự cuối thì ta chỉ cần lấy ra chuỗi con từ đầu => kí tự kề
		// cuối
		if (e.getActionCommand().equals("<=")) {
			if (!text.getText().equals("")) {
				text.setText(text.getText().substring(0, text.getText().length() - 1));
				// nhớ xóa trong mảng
				count--;
				str[count] = "";
			}
		}
		// xoa toan bo ki tu
		if (e.getActionCommand().equals("C") || e.getActionCommand().equals("CE")) {
			text.setText("");
			for (int i = 1; i < count; i++) {
				str[i] = "";
			}
			count = 1;// nhớ đặc count về 1

		}
		/*
		 * Dấu "." cần thỏa mãng 1. 1 kí tự phía trước nó là 1 con số 2. con số đó không
		 * được có dấu chấm nào vd: -2.908 -> true 2.9.08 -> false +. -> false Khi xử lí
		 * bằng chuỗi chúng ta sẽ sử dụng hàm indexOf(), vẫn dùng nguyên lí tương tự như
		 * trên
		 */
		if (e.getActionCommand().equals(".")) {
			str[0] = "+";// setup để không lỗi, vì điều kiện để nhận ra 1 con số là trước "dấu"
			boolean check = true;// mặc định là số trước nó không có dấu "."

			if (!checkMarkDot(str[count - 1])) {// kiểm tra kí tự đầu nếu khác "dấu" thì thực hiện if
				while (!checkMark(str[count - 1])) { // while chạy đến khi nào nó gặp 1 "dấu", đi từ cuối về đầu

					if (str[count] == ".") { // kiểm tra phía trước đã có đấu "." chưa, nếu có đánh dấu là sai và thoát
												// loop
						check = false;
						break;
					}
					count--;//
				}
				if (check) { // thỏa đk thì in dấu "."
					text.setText(text.getText() + ".");
					str[count] = ".";
					count++;
				}

			}
		}
		// sửa lỗi khi bạn nhấn dấu "+","-" và thay thế nó bằng dấu "*" or "/" đầu tiên,
		// thử cmt lại và cảm nhận nhé!
		if (text.getText().equals("*") || text.getText().equals("/") || text.getText().equals("%")) {
			text.setText("");
			str[count] = "";
			count--;
		}
		// hàm này sử lí trong class ActionCalculator, có chú thích cụ thể
		if (e.getActionCommand().equals("=")) {
			// kiểm tra kí tự cuối cùng nếu không phải là dấu thì thực hiện tính toán
			if (!checkMarkDot(text.getText().substring(text.getText().length() - 1))) {
				// kiểm tra dấu // đoạn dài ngoằng này chỉ để lấy ra kí tự cuối cùng //
				text.setText("" + result(text.getText()));// in kết quả
			}
		}

	}

	// kiem tra dau
	public static boolean checkMarkDot(String a) {
		return (a == "+") || (a == "-") || (a == "*") || (a == "/") || (a == ".") || (a == "%");
	}

	private static boolean checkPlusMinus(int countNext, String st) {

		// Lấy "dấu" đó ra bằng hàm Substring và kiểm tra nó có phải dấu "+" or "-"
		// không,
		String s = st.substring(countNext, countNext + 1);
		return s.equals("+") || s.equals("-");
	}

	// Phương thức này dùng để kiểm tra dấu (trừ dấu ".")
	public boolean checkMark(String a) {
		return (a == "+") || (a == "-") || (a == "*") || (a == "/") || (a == "%");
	}

	private static int getLocalMark(String st) {
		// Kiểm tra vị trí của các "dấu" trong chuỗi,
		// trả về kí tự dấu đầu tiên tính từ vị trí thứ 1 trở đi(nghĩa là ta không xét
		// vị trí đầu tiên)
		String[] a = { "+", "-", "*", "/", "%" };
		int value = st.length();
		// VD "27+3333*49" trả về 2, "-27+3333*49" trả về 2, không tính kí tự đầu tiên
		// khi kiểm tra đấu
		for (int i = 0; i < 5; i++) {
			if ((value > st.indexOf(a[i], 1)) && (st.indexOf(a[i], 1) != -1)) {
				value = st.indexOf(a[i], 1);

			}
			// điều kiện tối quan trọng khi không còn "dấu" nào nữa thì trả về -1,
			// đây là dk để kết thúc vòng while ở trên <createOptimalStr(String st)>
			if ((st.indexOf(a[0], 1) == -1) && (st.indexOf(a[1], 1) == -1) && (st.indexOf(a[2], 1) == -1)
					&& (st.indexOf(a[4], 1) == -1) && (st.indexOf(a[3], 1) == -1)) {
				value = -1;
			}
		}
		return value;
	}

	// tao mang toi uu,
	// VD "27+3333*49" => ["27","+3333","*","49"]
	public static ArrayList<String> createOptimalStr(String st) {
		opStr = new ArrayList<String>();
		countNext = getLocalMark(st);// Tìm vị trí dấu đầu tiên, trả về giá trị khác vị trí đầu tiên
		while (countNext != -1) {// khi countNext = -1 có nghĩa là không còn "dâu" nào trong chuỗi => dừng lặp
			if (checkPlusMinus(countNext, st)) {// Nếu "dấu đó là "+" or "-" thì
				opStr.add(st.substring(0, countNext));// cắt số trước "dấu" luu vào mảng kết quả
				st = st.substring(countNext);// tạo chuỗi mới đã xóa phần tử đã cắt
			} else {// nếu dấu là "*" or "/" thì
				opStr.add(st.substring(0, countNext)); // cắt số trước "dấu" luu vào mảng kết quả
				opStr.add(st.substring(countNext, countNext + 1));// cắt "dấu" lưu vào mảng kết quả
				st = st.substring(countNext + 1); // tạo chuỗi mới đã xóa phần tử đã cắt
			}
			countNext = getLocalMark(st);// tìm lại vị trí countNext cho chuỗi mới xóa các phần tử đã cắt
		}
		opStr.add(st);// khi hết "dấu" => countNext =-1 => vòng while đóng lại
		// => thừa 1 chuỗi số cuối cùng chưa lưu vào kết quả, lưu dãy số đó vào mảng kết
		// quả
		return opStr;
	}

	public static double result(String st) {
		opStr = createOptimalStr(st);
		R = new ArrayList<Double>();
		/*
		 * Kiểm tra các dấu "*" or "/" trong arraylist nếu gặp tính tích or thương của 2
		 * số gần kề "dấu" rồi đưa lên array kết quả (R)
		 */

		for (int i = 0; i < opStr.size(); i++) {
			// Tích
			if (opStr.get(i).equals("*")) {
				R.add(Double.parseDouble(opStr.get(i - 1)) * Double.parseDouble(opStr.get(i + 1)));
				opStr.set(i, "0");
				opStr.set(i - 1, "0");
				opStr.set(i + 1, "0");
			}
			// Thương
			if (opStr.get(i).equals("/")) {
				R.add(Double.parseDouble(opStr.get(i - 1)) / Double.parseDouble(opStr.get(i + 1)));
				opStr.set(i, "0");
				opStr.set(i - 1, "0");
				opStr.set(i + 1, "0");
			}
			if (opStr.get(i).equals("%")) {
				R.add(Double.parseDouble(opStr.get(i - 1)) % Double.parseDouble(opStr.get(i + 1)));
				opStr.set(i, "0");
				opStr.set(i - 1, "0");
				opStr.set(i + 1, "0");
			}
		}
		// Đưa hết tất cả các phần từ còn lại trong Array(opStr) lên Array kết quả (r)
		for (int i = 0; i < opStr.size(); i++) {
			R.add(Double.parseDouble(opStr.get(i)));
		}
		// Tính tổng Array kết quả (R);
		double sum = 0;
		System.out.println(R);
		for (int i = 0; i < R.size(); i++) {
			sum += R.get(i);
		}
		// Tính tổng Array kết quả (R);

		System.out.println(R);
		return sum;

	}

	public static void main(String[] args) {
		new _5();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case 10:
			if (!checkMarkDot(text.getText().substring(text.getText().length() - 1))) {
				// kiểm tra dấu // đoạn dài ngoằng này chỉ để lấy ra kí tự cuối cùng //
				text.setText("" + result(text.getText()));// in kết quả
			}
			break;
		case 8:
			String string = text.getText();
			text.setText("");
			for (int i = 0; i < string.length() - 1; i++) {
				text.setText(text.getText() + string.charAt(i));
				String str = "";
			}
			break;
		case 97:

			str[count] = "" + String.valueOf(1);
			count++;
			text.setFont(myFont3);
			text.setText(text.getText() + 1);
			break;
		case 98:
			str[count] = "" + String.valueOf(2);
			count++;
			text.setFont(myFont3);
			text.setText(text.getText() + 2);
			break;
		case 99:
			str[count] = "" + String.valueOf(3);
			count++;
			text.setFont(myFont3);
			text.setText(text.getText() + 3);
			break;
		case 100:
			str[count] = "" + String.valueOf(4);
			count++;
			text.setFont(myFont3);
			text.setText(text.getText() + 4);
			break;
		case 101:
			str[count] = "" + String.valueOf(5);
			count++;
			text.setFont(myFont3);
			text.setText(text.getText() + 5);
			break;
		case 102:
			str[count] = "" + String.valueOf(6);
			count++;
			text.setFont(myFont3);
			text.setText(text.getText() + 6);
			break;
		case 103:
			str[count] = "" + String.valueOf(7);
			count++;
			text.setFont(myFont3);
			text.setText(text.getText() + 7);
			break;
		case 104:
			str[count] = "" + String.valueOf(8);
			count++;
			text.setFont(myFont3);
			text.setText(text.getText() + 8);
			break;
		case 105:
			str[count] = "" + String.valueOf(9);
			count++;
			text.setFont(myFont3);
			text.setText(text.getText() + 9);
			break;
		case 96:
			str[count] = "" + String.valueOf(0);
			count++;
			text.setFont(myFont3);
			text.setText(text.getText() + 0);
			break;
		case 107:
			// Khi nút "+" được nhấn,
			// kiểm tra xem kí tự trước nó có phải là "dấu" không (kí tự cuối cùng của
			// chuỗi)
			if (!checkMarkDot(str[count - 1])) { // nếu không phải là "dấu"
				str[count] = "" + "+";// lưu trong mảng để xử lí
				count++;
				text.setText(text.getText() + "+");// thêm dấu "+" vào cuối
			} else { // là "dấu" thì xóa dấu trước đó và thêm dấu mới vào
				text.setText(text.getText().substring(0, text.getText().length() - 1) + "+");
				str[count - 1] = "" + "+";// lưu trong mảng để xử lí
			}

			break;
		case 109:
			if (!checkMarkDot(str[count - 1])) {
				str[count] = "" + "-";
				count++;
				text.setText(text.getText() + "-");
			} else {
				if (str[count - 1] == "-") {// nếu phía trước là "-" thì đổi thành "+"
					text.setText(text.getText().substring(0, text.getText().length() - 1) + "+");
					str[count - 1] = "" + "+";
				} else {
					text.setText(text.getText().substring(0, text.getText().length() - 1) + "-");
					str[count - 1] = "" + "-";
				}
			}
			break;
		case 106:
			if (!(count == 1)) {// khác vị trí 1 mới nhận lệnh, (count là vị trí trong mảng)

				if (!checkMarkDot(str[count - 1])) {
					str[count] = "" + "*";
					count++;
					text.setText(text.getText() + "*");
				} else {
					text.setText(text.getText().substring(0, text.getText().length() - 1) + "*");
					str[count - 1] = "" + "*";

				}
			}

			break;
		case 16:
			if (!(count == 1)) {// khác vị trí 1 mới nhận lệnh, (count là vị trí trong mảng)
				if (!checkMarkDot(str[count - 1])) {
					str[count] = "" + "%";
					count++;
					text.setText(text.getText() + "%");
				} else {
					text.setText(text.getText().substring(0, text.getText().length() - 1) + "%");
					str[count - 1] = "" + "%";
				}
			}
			break;

		case 111:
			if (!(count == 1)) {
				if (!checkMarkDot(str[count - 1])) {
					str[count] = "" + "/";
					count++;
					text.setText(text.getText() + "/");
				} else {
					text.setText(text.getText().substring(0, text.getText().length() - 1) + "/");
					str[count - 1] = "" + "/";
				}
			}
			break;

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
