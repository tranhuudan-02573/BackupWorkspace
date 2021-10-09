package SnakeGame2;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlay extends JPanel {
	// chiều dài của snake theo chiều ngang
	private int[] snakeLengthX = new int[750];
	// chiều dài của snake theo chiều dọc
	private int[] snakeLengthY = new int[750];
	private boolean right = false;
	private boolean left = false;
	private boolean up = false;
	private boolean down = false;
	private ImageIcon titleImage, downMouth, upMouth, bodySnake, leftMouth, rightMouth, appleSmallIcon, appleBigIcon;
	private Timer timerRun, timerTime, timerEatting, timerEndEatting;
	// độ dài snake ban đầu

	private int lengthOfSnake = 3;
	// snake chưa di chuyển
	private int moves = 0;
	private Random random = new Random();
	private int rdAppleSmallX = random.nextInt(34);
	private int rdAppleSmallY = random.nextInt(21);
	// các vị trí apple có thể nằm và random ra
	private int[] appleSmallX = { 25, 50, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450,
			475, 500, 525, 550, 575, 600, 625, 650, 675, 700, 725, 750, 775, 800, 825, 850 };
	private int[] appleSmallY = { 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475,
			500, 525, 550, 575 };
	private int[] appleBigX = { 25, 50, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450,
			475, 500, 525, 550, 575, 600, 625, 650, 675, 700, 725, 750, 775, 800, 825, 850 };
	private int[] appleBigY = { 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475, 500,
			525, 550, 575 };
	// delay của snake di chuyển
	private int delay = 100;
	private int hours = 0;
	private int minutes = 0;
	private int seconds = 0;
	private int scores = 0;
	private int elapsedTime = 0;
	private String seconds_string = String.format("%02d", seconds);
	private String minutes_string = String.format("%02d", minutes);
	private String hours_string = String.format("%02d", hours);
	private int rdAppleBigX = random.nextInt(34);
	private int rdAppleBigY = random.nextInt(21);
	private boolean red = false;
	private int count = 1;
	// contructor
	public GamePlay() {
		// TODO Auto-generated constructor stub
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				if (e.getKeyCode() == e.VK_RIGHT) {
					timerTime.start();
					timerRun.start();
					moves++;
					if (!left) {
						right = true;
					} else {
						right = false;
						left = true;
					}
					up = false;
					down = false;
				}
				if (e.getKeyCode() == e.VK_LEFT) {
					timerTime.start();
					timerRun.start();
					moves++;
					if (!right) {
						left = true;
					} else {
						left = false;
						right = true;
					}
					up = false;
					down = false;
				}
				if (e.getKeyCode() == e.VK_DOWN) {
					timerTime.start();
					timerRun.start();
					moves++;
					if (!up) {
						down = true;
					} else {
						down = false;
						up = true;
					}
					right = false;
					left = false;
				}
				if (e.getKeyCode() == e.VK_UP) {
					timerTime.start();
					timerRun.start();
					moves++;
					if (!down) {
						up = true;
					} else {
						up = false;
						down = true;
					}
					right = false;
					left = false;
				}
				if (gameOver()) {
					if (e.getKeyCode() == e.VK_SPACE) {
						hours = 0;
						minutes = 0;
						seconds = 0;
						scores = 0;
						moves = 0;
						delay = 100;
						lengthOfSnake = 3;
						seconds_string = String.format("%02d", seconds);
						minutes_string = String.format("%02d", minutes);
						hours_string = String.format("%02d", hours);
						repaint();
					}
				}

				if (e.getKeyCode() == e.VK_ESCAPE) {
					timerTime.stop();
					timerRun.stop();
					System.out.println("false");
				}

			}
		});
		// cho phép nhận tín hiệu từ bàn phím
		this.setFocusable(true);
		this.setFocusCycleRoot(true);

		check();
		// thời gian snake di chuyển
		timerRun = new Timer(delay, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// nếu ko phải là gameover thì check()
				if (!gameOver()) {
					check();
					// nếu user điều hướng sang phải thì
					if (right) {
						// khi snake từ trên di chuyển xuống và qua phải
						for (int i = lengthOfSnake - 1; i > -1; i--) {
							snakeLengthY[i + 1] = snakeLengthY[i];
						}
						for (int i = lengthOfSnake; i > -1; i--) {
							// phần đầu
							if (i == 0) {
								snakeLengthX[i] = snakeLengthX[i] + 25;
							} else {
								// phần thân
								snakeLengthX[i] = snakeLengthX[i - 1];
							}
							// cho phép đi xuyên
							if (snakeLengthX[i] > 850) {
								snakeLengthX[i] = 25;
							}
						}
						repaint();

					}
					if (left) {
						// khi snake từ trên di chuyển xuống và qua trái
						for (int i = lengthOfSnake - 1; i > -1; i--) {
							snakeLengthY[i + 1] = snakeLengthY[i];
						}
						for (int i = lengthOfSnake; i > -1; i--) {
							if (i == 0) {
								snakeLengthX[i] = snakeLengthX[i] - 25;
							} else {
								snakeLengthX[i] = snakeLengthX[i - 1];
							}
							if (snakeLengthX[i] < 25) {
								snakeLengthX[i] = 850;
							}
						}
						repaint();
					}
					if (up) {
						// khi snake di chuyển từ phải sang và lên trên
						for (int i = lengthOfSnake - 1; i > -1; i--) {
							snakeLengthX[i + 1] = snakeLengthX[i];
						}
						for (int i = lengthOfSnake; i > -1; i--) {
							if (i == 0) {
								snakeLengthY[i] = snakeLengthY[i] - 25;
							} else {
								snakeLengthY[i] = snakeLengthY[i - 1];
							}
							if (snakeLengthY[i] < 75) {
								snakeLengthY[i] = 625;
							}
						}
						repaint();
					}
					if (down) {
						// khi snake di chuyển từ phải sang và xuống dưới
						for (int i = lengthOfSnake - 1; i > -1; i--) {
							snakeLengthX[i + 1] = snakeLengthX[i];
						}
						for (int i = lengthOfSnake; i > -1; i--) {
							if (i == 0) {
								snakeLengthY[i] = snakeLengthY[i] + 25;
							} else {
								snakeLengthY[i] = snakeLengthY[i - 1];
							}
							if (snakeLengthY[i] > 625) {
								snakeLengthY[i] = 75;
							}
						}
						repaint();
					}
				}
			}
		});
		timerEatting = new Timer(1500, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				red = false;
				if (count == 0) {

					count = 1;
				} else if (count == 1) {
					count = 0;
				}

			}
		});
		timerTime = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				elapsedTime += 1000;
				hours = (elapsedTime / 3600000);
				minutes = (elapsedTime / 60000) % 60;
				seconds = (elapsedTime / 1000) % 60;
				seconds_string = String.format("%02d", seconds);
				minutes_string = String.format("%02d", minutes);
				hours_string = String.format("%02d", hours);

			}

			public void actionPerformed(Graphics g) {
				// TODO Auto-generated method stub
				g.drawString("Time: " + hours_string + ":" + minutes_string + ":" + seconds_string, 780, 60);
			}

		});
		timerEndEatting = new Timer(1500, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				timerEatting.stop();
			}
		});
		start();
		titleImage = new ImageIcon("./src/SnakeGame2/snaketitle.jpg");
		rightMouth = new ImageIcon("./src/SnakeGame2/rightmouth.png");
		leftMouth = new ImageIcon("./src/SnakeGame2/leftmouth.png");
		upMouth = new ImageIcon("./src/SnakeGame2/upmouth.png");
		downMouth = new ImageIcon("./src/SnakeGame2/downmouth.png");
		bodySnake = new ImageIcon("./src/SnakeGame2/snakeimage.png");
		appleSmallIcon = new ImageIcon("./src/SnakeGame2/appleSmall.png");
		appleBigIcon = new ImageIcon("./src/SnakeGame2/appleBig.png");
	}

	public void start() {
		timerRun.start();
		timerTime.start();
		if (moves == 0) {
			snakeLengthX[0] = 100;
			snakeLengthX[1] = 50;
			snakeLengthX[2] = 75;
			snakeLengthY[0] = 100;
			snakeLengthY[1] = 100;
			snakeLengthY[2] = 100;
		}
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		check();
		super.paint(g);
		start();
		// border of title image
		g.setColor(Color.white);
		g.drawRect(24, 10, 851, 55);
		titleImage.paintIcon(this, g, 25, 11);
		// border of gamePlay
		g.setColor(Color.white);
		g.drawRect(24, 74, 851, 577);
		g.setColor(Color.BLACK);
		g.fillRect(25, 75, 850, 575);
		// draw the scores
		g.setColor(Color.red);
		g.setFont(new Font("arial", Font.BOLD, 30));
		g.drawString("ESC ", 35, 45);
		g.setColor(Color.WHITE);
		g.setFont(new Font("arial", Font.PLAIN, 14));
		g.drawString("Scores: " + scores, 770, 25);
		g.drawString("Length: " + lengthOfSnake, 770, 42);
		g.drawString("Time: " + hours_string + ":" + minutes_string + ":" + seconds_string, 770, 60);
		rightMouth.paintIcon(this, g, snakeLengthX[0], snakeLengthY[0]);
		for (int i = 0; i < lengthOfSnake; i++) {
			if (i == 0 && right) {
				rightMouth.paintIcon(this, g, snakeLengthX[i], snakeLengthY[i]);
			}
			if (i == 0 && left) {
				leftMouth.paintIcon(this, g, snakeLengthX[i], snakeLengthY[i]);
			}
			if (i == 0 && up) {
				upMouth.paintIcon(this, g, snakeLengthX[i], snakeLengthY[i]);
			}
			if (i == 0 && down) {
				downMouth.paintIcon(this, g, snakeLengthX[i], snakeLengthY[i]);
			}
			if (i != 0) {
				bodySnake.paintIcon(this, g, snakeLengthX[i], snakeLengthY[i]);
			}
		}

//		if (red) {
//			timerEatting.start();
//			System.out.println("a");
//			appleBigIcon.paintIcon(this, g, appleBigX[rdAppleSmallX], appleBigY[rdAppleSmallY]);
//		} else {
//			System.out.println("b");
//			timerEatting.stop();
//			appleSmallIcon.paintIcon(this, g, appleSmallX[rdAppleSmallX], appleSmallY[rdAppleSmallY]);
//		}
		System.out.println(count);
		if (scores != 0 && scores % 3 == 0) {
			timerEatting.start();
			timerEndEatting.start();
		}
		if (count == 1 && scores != 0 && scores % 3 == 0) {
			appleBigIcon.paintIcon(this, g, appleBigX[rdAppleSmallX], appleBigY[rdAppleSmallY]);
		} else {
			appleSmallIcon.paintIcon(this, g, appleSmallX[rdAppleSmallX], appleSmallY[rdAppleSmallY]);
		}
		if (gameOver()) {
			g.setColor(Color.red);
			g.setFont(new Font("arial", Font.BOLD, 50));
			g.drawString("Game Over", 300, 300);
			g.setFont(new Font("arial", Font.BOLD, 30));
			g.drawString("Space to RESTART", 300, 400);
			g.setFont(new Font("arial", Font.ITALIC, 20));
			g.setColor(Color.white);
			g.drawString("Số điểm : " + scores + " -- Chiều dài snake: " + lengthOfSnake + " -- Thời gian hoàn thành: "
					+ hours_string + ":" + minutes_string + ":" + seconds_string, 160, 330);
			if (scores > 0) {
				g.drawString("Trung bình: " + (hours * 3600 + minutes * 60 + seconds) / scores + "s/score", 340, 360);
			}
			if (scores == 0) {
				g.drawString("Trung bình: " + (hours * 3600 + minutes * 60 + seconds) + "s/0score", 340, 360);
			}
		}
		g.dispose();
	}

	public void check() {
		if (appleSmallX[rdAppleSmallX] == snakeLengthX[0] && appleSmallY[rdAppleSmallY] == snakeLengthY[0]) {
			lengthOfSnake++;
			delay -= 1;
			scores++;
			rdAppleSmallX = random.nextInt(34);
			rdAppleSmallY = random.nextInt(21);
			red = false;
			count = 1;
		}
		if (appleBigX[rdAppleBigX] == snakeLengthX[0] && appleBigY[rdAppleBigY] == snakeLengthY[0]) {
			lengthOfSnake += 2;
			delay -= 2;
			scores += 2;
			rdAppleBigX = random.nextInt(34);
			rdAppleBigY = random.nextInt(21);
		}
	}

	public boolean gameOver() {
		for (int j = 1; j < lengthOfSnake; j++) {
			if (snakeLengthX[j] == snakeLengthX[0] && snakeLengthY[j] == snakeLengthY[0]) {
				right = false;
				left = false;
				up = false;
				down = false;
				timerEatting.stop();
				return true;
			}
		}
		return false;
	}

}