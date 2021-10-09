package FlipPokeGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.event.AncestorListener;

public class FlipPoke extends JFrame {
	// count la bien phan biet lan bam
	// idFirstImage la vi tri hinh anh duoc click vao
	// firstX, firstY la vi tri x y cua hinh anh dau tien duoc dem di so sanh
	// secondX, secondY la vi tri x y cua hinh cua thu 2 duoc dem di so sanh
	int count = 0, idFirstImage, firstX, firstY, secondX, secondY;
	// level la man choi
	// hit la cac cap bai
	int level = 0;
	int hit = 0;
	// chieu doc cua cac man chơi tương ứng
	int sizeX[] = { 2, 2, 2, 3, 2, 2, 3, 4, 2, 4, 2, 4, 5, 4, 4, 5, 6, 4, 6, 5, 4, 6, 7, 6, 8, 7, 8, 8, 8, 9, 8, 9 };
	// chieu ngang cau r các màn chơi tương ứng
	int sizeY[] = { 3, 4, 5, 4, 7, 8, 6, 5, 11, 6, 13, 7, 6, 8, 9, 8, 7, 11, 8, 10, 13, 9, 8, 10, 8, 10, 9, 10, 11, 10,
			12, 12, 11 };
	int rows = sizeX[0], cols = sizeY[0];
	// progressbar
	JProgressBar timeBar;
	// đi tắt đoán đầu đặt các mảng có chiều dài max
	int maxXY = 1000;
	// số nút gắn hình ảnh vào
	JButton buttons[][] = new JButton[maxXY][maxXY];
	// check click chưa và không cho click nữa
	boolean checkClick[][] = new boolean[maxXY][maxXY];
	// vi trí của 1 hình ảnh
	int idImages[][] = new int[maxXY][maxXY];
	JButton buttonScore, buttonNext, buttonPause, buttonReset;
	JPanel panelImage, panelScore, panelTopRight, panelBot, FuncPanel, panelTop, panelTopLeft;
	Container container;
	Timer timerChecking, timerTictac, timerSecondBar;
	Font font = new Font("Almanac MT", 1, 20);
	JLabel labelScore, labelTime;
	boolean paused = false;
	int tictac = 100;
	int second = 60;
	String seconds_string;
	String tictiac_string;
	// số hình ảnh / icon ko tính background
	int images = 90;

// contructor
	public FlipPoke(int k, int score, int time) {
		this.setTitle("Flip Poke Game");
		// level k
		level = k;
		second = time;
		// so hang
		rows = sizeX[k];
		// so cot
		cols = sizeY[k];
		// thùng chứa chứa các panel và component ko bị khuyết khi hiển thị
		container = this.getContentPane();
		// thoi gian lat va check hinh anh thu nhat khi lat hinh anh thu hai
		timerChecking = new Timer(100, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// khi thuc hien hanh dong nay timer se tu dong bat
				check2Image();
				// khi het 100/1000 giay thi phuong thuc open se khong duoc thuc thi nua timer
				// bi dong lai
				timerChecking.stop();
			}
		});
		// thoi gian chay cua so giay cua progressBar va ca thoi gian so
		timerSecondBar = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// sau 1 giây second sẽ bị trừ đi 1 đơn vị
				second--;
				// set progressbar ban đầu cho nó giá trị second cx như GTLN
				timeBar.setValue(second);
				// nếu số điểm = 0 hay thời gian giảm hết thì thua
				if (Integer.parseInt(buttonScore.getText()) == 0 || second < 0) {
					timerTictac.stop();
					timerSecondBar.stop();
					// goi phuong thuc showDialogNewGame() de hien thi thong bao
					showDialogNewGame(
							"bạn đã thua.\n" + "Điểm: " + buttonScore.getText() + "\n" + "Bạn có muốn chơi lại không?",
							"Thông báo");
				}
				// phan giay cua thoi gian so se giam dan
				seconds_string = String.format("%02d", second);
				// set string cho labelTime sau 1s sẽ thay đổi string
				labelTime.setText(seconds_string + ":" + tictiac_string);
			}
		});
		// thoi gian chay phan tictac cx ko quan trọng mấy
		timerTictac = new Timer(1, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// sau 1/1000s thì tictac từ 100 giảm dần 1 đơn vị
				tictac--;
				// khi tictac = 0 thì sẽ tăng lên lại 100 r cứ thế trừ dần tiếp
				if (tictac == 0) {
					tictac += 100;
				}
				/// tương tự phan second
				tictiac_string = String.format("%02d", tictac);
				labelTime.setText(seconds_string + ":" + tictiac_string);
			}
		});

		// vẽ background lên panel chứa các nút cx như các hình
		panelImage = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				// qua màn mới sẽ thay đổi background theo màn đó ko random
				g.drawImage(getImage(level), 0, 0, this);
			}
		};
		panelBot = new JPanel();
		panelTopRight = new JPanel();
		panelTopLeft = new JPanel();
		panelTop = new JPanel();
		FuncPanel = new JPanel();
		FuncPanel = new JPanel();
		panelScore = new JPanel();
		buttonNext = new JButton("Next");
		buttonPause = new JButton("Pause");
		buttonReset = new JButton("Reset");
		labelScore = new JLabel("Score: ");
		labelTime = new JLabel();
		timeBar = new JProgressBar(0, 100);

		// layout của panelImage theo gridlayout thay đổi theo rows cols khi qua màn mới
		panelImage.setLayout(new GridLayout(rows, cols));
		panelBot.setLayout(new BoxLayout(panelBot, BoxLayout.X_AXIS));
		panelTopRight.setLayout(new GridLayout(1, 1));
		panelScore.setLayout(new FlowLayout());
		panelTopLeft.setLayout(new GridLayout(1, 1));
		panelTop.setLayout(new BoxLayout(panelTop, BoxLayout.X_AXIS));
		FuncPanel.setLayout(new FlowLayout());

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// new nút
				buttons[i][j] = new JButton();
				// set viền cho các nút đó
				buttons[i][j].setBorder(BorderFactory.createLineBorder(Color.pink, 1));
				// loại bỏ phần viền của nội dung khi click vào nút
				buttons[i][j].setFocusable(false);
				// add các nút vào panel
				panelImage.add(buttons[i][j]);
				// set actionCommand cho all nut voi vi tri hien tai cua nut do là 1 string
				buttons[i][j].setActionCommand(i + "" + j);
				// add action click vao cho all nut
				buttons[i][j].addActionListener(new ActionListener() {
					// ham check lan click
					@Override
					public void actionPerformed(ActionEvent e) {
						if (!paused) {
							int i, j;
							// lay string khi setActionCommand
							String s = e.getActionCommand();
							// vi tri cot cua nut do
							i = Integer.parseInt(s.substring(0, 1));
							// vi tri dong cua nut do
							j = Integer.parseInt(s.substring(1, s.length()));
							buttons[i][j].setIcon(getIcon(idImages[i][j]));
							if (checkClick[i][j]) {// kiem tra click chua
								// hien thi nut pause
								buttonPause.setVisible(true);
								// click vao hinh thoi gian bat dau chay
								timerSecondBar.start();
								timerTictac.start();
								// cho phep click hinh do 1 lan
								checkClick[i][j] = false;
								// hinh dau tien
								if (count == 0) {
									// gan vi tri hinh anh do cho id
									idFirstImage = idImages[i][j];
									firstX = i;
									firstY = j;
									// hinh thu 2
								} else {
									secondX = i;
									secondY = j;
									// set thoi gian up lai
									timerChecking.start();
								}
								// tro ve hinh anh dau tien
								// ban dau count = 0 thi se roi vao truong hop count == 0 gan id tai vi tri cau
								// hinh anh do sau do gan toa do x y cho bien o ngoai nhan duoc
								count = 1 - count;
								// count = 1 -0 = 1 khi nay se roi vao truong hop count = 1 gan toa do cua lan
								// bam thu 2 do cho bien ngoai nhan duoc
								// cu nhu the no se chay 0 1 0 1 de phan biet duoc lan bam
							}

						}
					}
				});
				// xao tron vi tri cac hinh ảnh
				// set icon mac dinh cho cac button la 1 hinh anh up xuong
				buttons[i][j].setIcon(getIcon(0));
				// cho phep tat ca cac nut duoc click vao
				checkClick[i][j] = true;
				// set nen cho cac nut vì các hình là png
				buttons[i][j].setBackground(Color.white);
			}
		}

		buttonScore = new JButton(String.valueOf(score));
		buttonScore.setForeground(Color.pink);
		buttonScore.setFont(font);
		buttonScore.setBackground(Color.white);
		buttonScore.setFocusable(false);

		buttonNext.setFocusable(false);
		buttonNext.setBackground(Color.white);
		buttonNext.setForeground(Color.pink);
		buttonNext.setVisible(false);
		buttonNext.setFont(font);

		buttonReset.setFocusable(false);
		buttonReset.setForeground(Color.pink);
		buttonReset.setBackground(Color.white);
		buttonReset.setFont(font);

		buttonPause.setFocusable(false);
		buttonPause.setFont(font);
		buttonPause.setVisible(false);
		buttonPause.setBackground(Color.white);
		buttonPause.setForeground(Color.pink);

		labelScore.setForeground(Color.white);
		labelScore.setFont(font);

		panelScore.setBackground(Color.pink);
		FuncPanel.setBackground(Color.pink);
		// action cua nut reset
		buttonReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resGame();
			}
		});
		// action cua nut Pause
		buttonPause.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handlePauseGame();
			}
		});
		// action cua nut next khi click voa nut next se cho qua man moi
		buttonNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// qua man moi
				handleNextGame();
			}
		});
		timeBar.setValue(second);
		timeBar.setForeground(Color.pink);
		timeBar.setStringPainted(true);
		timeBar.setFont(font);
		timeBar.setBorder(null);

		seconds_string = String.format("%02d", second);
		tictiac_string = String.format("%02d", tictac);
		labelTime.setText(seconds_string + ":" + tictiac_string);
		labelTime.setFont(font);
		labelTime.setOpaque(true);
		labelTime.setForeground(Color.pink);
		labelTime.setBackground(Color.white);
		labelTime.setBorder(BorderFactory.createLineBorder(Color.pink, 1));
		labelTime.setHorizontalAlignment(JLabel.CENTER);

		panelBot.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		panelTop.setBorder(BorderFactory.createLineBorder(Color.white, 1));

		FuncPanel.add(buttonPause);
		FuncPanel.add(buttonReset);
		FuncPanel.add(buttonNext);
		panelTopLeft.add(labelTime);
		panelScore.add(labelScore);
		panelScore.add(buttonScore);
		panelTopRight.add(timeBar);
		panelTop.add(panelTopLeft);
		panelTop.add(panelTopRight);
		panelBot.add(panelScore);
		panelBot.add(FuncPanel);
		// add cac component vao container
		container.add(panelTop, "North");
		container.add(panelImage, "Center");
		container.add(panelBot, "South");

		this.pack();
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				paused = true;
				timerSecondBar.stop();
				timerTictac.stop();
				buttonPause.setText("Cont");
				int exit = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình không?", null,
						JOptionPane.YES_NO_OPTION);

				if (exit == JOptionPane.YES_OPTION) {
					System.exit(0);
				}

			}
		});
		this.setVisible(true);
		createMatrix();
//		showMatrix();
	}

	// phuong thuc lat the
	public void check2Image() {
		// neu 2 hinh giong nhau
		if (idFirstImage == idImages[secondX][secondY]) {
			// reset gia tri cua mang tai hinh anh do
			buttons[secondX][secondY].setBorder(null);
			buttons[firstX][firstY].setBorder(null);
			// khong duoc click khu vuc do nua
			checkClick[secondX][secondY] = checkClick[firstX][firstY] = false;
			// 2 hình giống nhau đó bị ẩn đi
			buttons[secondX][secondY].setVisible(false);
			buttons[firstX][firstY].setVisible(false);
			// cong diem
			buttonScore.setText(String.valueOf(Integer.parseInt(buttonScore.getText()) + 10));
			// cặp hinh mất đi duoc tang len
			hit++;
			// tang thoi gian len
			second += 10;
			// set lai value cua progressBar
			timeBar.setValue(second);
			// neu cac cap hinh duoc lat het
			if (hit == rows * cols / 2) {
				// thi ko check hinh anh nua
				timerChecking.stop();
				timerSecondBar.stop();
				// progressbar dung lai
				timerSecondBar.stop();
				timerTictac.stop();
				// qua man moi nut next duoc hien thi len
				buttonNext.setVisible(true);
				// nut pause bi an di
				buttonPause.setVisible(false);
			}
			// neu 2 hinh do ko giong nhau
		} else {
			// set 2 anh do up lai
			// noi cach khac set 2 hinh do ve lai hinh up
			buttons[firstX][firstY].setIcon(getIcon(0));
			buttons[secondX][secondY].setIcon(getIcon(0));
			// 2 hinh do duoc phep chon lai
			checkClick[firstX][firstY] = checkClick[secondX][secondY] = true;
			// tru diem
			buttonScore.setText(String.valueOf(Integer.parseInt(buttonScore.getText()) - 5));
			// tru thoi gian
			second -= 5;
			timeBar.setValue(second);
		}
	}

	// logic/ phần core/ lõi của game
	public void createMatrix() {
		// lấy ví dụ là màn 1
		int N = rows * cols;// N = 6
		// mang b,c co so phan tu la 96
		int b[] = new int[N + images];// b[96]
		int c[] = new int[N + images];// c[96]
		// 2 hàm for này nhằm mục đích xáo trộn các phần tử của b
		for (int i = 0; i < images; i++) {// i 0 < 90
			b[i] = i;// b[i] 0 ts 89
			// random 90 lan
			// * 1000 cx là đi tắt đoán đầu
			c[i] = (int) (Math.random() * 1000);// xao tron 90 hinh anh r lay no ra
			// random khi lay hinh anh
		}
		for (int i = 0; i < images - 1; i++) {// i 0 ts 88
			for (int j = i + 1; j < images; j++) { // j 1 ts 89
				// c[] nó sẽ random từ 1 ts 1000
				// i lớn hơn j 1 đơn vị
				if (c[i] > c[j]) {// nếu số radom trước lớn hơn số random sau thì nó sẽ thực thi các lệnh bên dưới
					// ví dụ i = 0 j = 1 c[i] = 89 c[j] = 65 c[i] > c[j] thì nó sẽ thực hiện khối
					// lệnh bên dưới là hoán đổi giá trị của b là c tại vị trí 0 và 1 thì nó sẽ là
//					System.out.println("i " + i);
//					System.out.println("c[i] " + c[i]);
//					System.out.println("j " + j);
//					System.out.println("c[j] " + c[j]);
					int tmp = b[i];// 0
//					System.out.println(tmp);
					b[i] = b[j];// 1
//					System.out.println(b[i]);
					b[j] = tmp;// 0
//					System.out.println(b[j]);
					tmp = c[i];// 89
//					System.out.println(tmp);
					c[i] = c[j];// 65
//					System.out.println(c[i]); 
					c[j] = tmp;// 89
//					System.out.println(c[j]);
					// lúc này c[0] = 65 c[1] = 89 b[i] = 1 b[j] =0
					// i chạy tiếp từ 0 j chạy tới 2 c[0] lúc này = 65 giả sử c[2] = 65 thì khối
					// lệnh hoán đổi ko đc thực thi nên nó sẽ bỏ qua và chạy random tiếp
					// i vẫn là 0 và j = 3 lúc này c[0] = 65 c[3] = 55 thì nó tiếp tục hoán đổi
					// b[0] = 3 b[3] = 0 c[0] = 55 c[3] = 65 cứ như thế nó sẽ hoán đổi ngẫu nhiên
					// phần tử của b như b[5] đúng ra = 5 thì nó lại = 80 chẳng hạn do từ c[5] đến
					// c[81] nó random đều bé hơn đứa đằng trước nên nó bỏ qua
					// đến khi i chạy tới 88 và j chạy tới 89 thì dừng
				}
			}
		}
		// lam trong mang co 2 hinh giong nhau
		// nhân đôi m * n / 2 của số đầu của dãy b.
		// sắp xếp random dãy b từ 0 đến m * n - 1 và đưa nó vào matrix idImages.
		// hàm trên b đã lấy ngẫu nhiên các hình từ 0 ts 91 r
		// hàm for này giúp lấy đúng phần tử của 1 màn ra rồi chia đôi
		for (int i = N / 2; i < N; i++) { // 3 4 5
			// 0 1 2
			b[i] = b[i - N / 2];
			// mảng b sẽ là {0,1,2,0,1,2}
		}
		// 2 hàm for này nhằm mục đích xáo trộn vị trí các nút trong 1 màn chơi xáo trog
		// mảng b {0,1,2,0,1,2}
		// ham random xao tron cac vi tri hinh anh trong man choi

		for (int i = 0; i < N; i++) {// i 0 < 6
			c[i] = (int) (Math.random() * 1000);
		}
		for (int i = 0; i < N - 1; i++) {// i 0 < 4
			for (int j = i + 1; j < N; j++) {// j 1 < 5
				if (c[i] > c[j]) {
					int tmp = b[i];
					b[i] = b[j];
					b[j] = tmp;
					tmp = c[i];
					c[i] = c[j];
					c[j] = tmp;
				}
			}
		}
		// reset array
		N = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// gán vị trí của idImages
				idImages[i][j] = b[N++];
			}
		}

	}

//	private void showMatrix() {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				System.out.printf("%3d", idImages[i][j]);
//			}
//			System.out.println();
//
//		}
//		System.out.println("-----------------");
//		System.out.println();
//	}

	private Image getImage(int index) {
		Image image = new ImageIcon(new ImageIcon(getClass().getResource("/FlipPokeGame/bg/icon" + index + ".jpg"))
				.getImage().getScaledInstance(panelImage.getWidth(), panelImage.getHeight(), Image.SCALE_SMOOTH))
						.getImage();
		return image;
	}

	// lay hinh ra
	// lay icon thu n ra // chi dc 1 icon
	private Icon getIcon(int index) {
		Image image = new ImageIcon(getClass().getResource("/FlipPokeGame/icon/icon" + index + ".png")).getImage()
				.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		Icon icon = new ImageIcon(image.getScaledInstance(120, 120, image.SCALE_SMOOTH));
		return icon;
	}

	// bat dau choi game
	// goi class main ra // class jframe
	public void newGame() {
		this.dispose();
		new FlipPoke(0, 60, 60);
	}

	// reset game
	public void resGame() {
		timerSecondBar.setRepeats(false);
		timerSecondBar.restart();
		timerSecondBar.stop();
		if (level == 0) {
			// neu la man dau tien thì new game luôn
			newGame();
		} else {
			// nếu ko phải là màn đầu tiên thì điểm và thời gian đang có sẽ bị chia đôi
			this.dispose();
			// hình ảnh sẽ được up lại và xáo lại hết
			new FlipPoke(level, Integer.parseInt(buttonScore.getText()) / 2, second / 2);
		}
	}

//	 nextgame auto
	public void handleNextGame() {
		this.dispose();// clear man hinh
		// tang level len qua man moi so diem và thời gian cũ vẫn được duy trì
		new FlipPoke(level + 1, Integer.parseInt(buttonScore.getText()), second);
	}

	// thong bao khi lose gamescoreLabel
	public void showDialogNewGame(String message, String title) {
		int select = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, null, null);
		if (select == 0) {// bat dau lai
			newGame();
		} else {// exit game
			System.exit(0);
		}
	}

	public void handlePauseGame() {
		// khi pause cho thời gian dừng lại set lại text của nút đó và đổi giá trị lại
		// của pause vì đã pause rồi
		if (!paused) {
			paused = true;
			timerSecondBar.stop();
			timerTictac.stop();
			buttonPause.setText("Cont");
		} else { // ngược lại
			paused = false;
			timerSecondBar.start();
			timerTictac.start();
			buttonPause.setText("Pause");
		}
	}

	public static void main(String[] args) {
		new FlipPoke(0, 60, 60);
	}
}
