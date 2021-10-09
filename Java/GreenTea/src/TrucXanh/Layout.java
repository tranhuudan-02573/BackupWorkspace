package TrucXanh;

import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Layout {
	JPanel panelMain, panelTop, panelBot, panelBotRight, panelBotLeft, panelBotLeftTop, panelBotLeftBot,
			panelBotRightName, panelBotRightButtons, panelBotLeftScore, panelBotLeftTime;
	JLabel labelMain, labelScore, labelName;
	JTextArea textScore1, textTime;
	JFrame frame;
	JButton btnewgame, btresume, bttype, btrank, bthelp, btquit, btnOK;
	JTextField textName;
	Image backgroundImage;
	ImageIcon iconOK;

//	public void paint(Graphics g) {
//		super.paint(g);
//		Graphics2D g2D = (Graphics2D) g;
//		g2D.drawImage(backgroundImage, 0, 0, null);
//	}
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(backgroundImage, 550, 550, null);
	}

	public Layout() {

//		panelBotRight.add(new JLabel(new ImageIcon("./src/TrucXanh/truc.jpg")));
		ImageIcon rollIcon = new ImageIcon("./src/TrucXanh/yellow.jpg");
		Font font = new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 28);
		frame = new JFrame();
		labelName = new JLabel("�serName:");
		labelName.setFont(new Font("Consolas", Font.PLAIN, 0));
		panelBotRightButtons = new JPanel();
		textTime = new JTextArea("11");
		labelMain = new JLabel("TRÚC XANH");
		labelMain.setForeground(Color.red);
		labelMain.setFont(new Font("Segoe UI", Font.BOLD, 30));
		labelScore = new JLabel("Top Score");
		labelScore.setFont(font);
		labelScore.setForeground(Color.white);
//		textScore1 = new JTextArea("dsada ");
		textName = new JTextField("");
		panelBotRightName = new JPanel(new FlowLayout());
		panelTop = new JPanel();
		panelBot = new JPanel();
		panelBot.setLayout(new BoxLayout(panelBot, BoxLayout.X_AXIS));
		panelBotLeftBot = new JPanel(new GridLayout(1, 1));
		panelBotLeftScore = new JPanel();
		panelBotLeftTime = new JPanel();

		panelBotLeftTop = new JPanel();

//		panelBotRight.add(new JLabel(new ImageIcon("./src/TrucXanh/truc.jpg")));
//		panelBotRight.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("./src/TrucXanh/truc.jpg"))));

		panelBotRight = new JPanel();

		panelBotRight.setLayout(new BoxLayout(panelBotRight, BoxLayout.Y_AXIS));
		panelBotLeft = new JPanel();
		panelBotLeft.setLayout(new BoxLayout(panelBotLeft, BoxLayout.Y_AXIS));
		panelMain = new JPanel(new FlowLayout());
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

		panelBotLeftScore.add(Box.createRigidArea(new Dimension(0, 15)));
		panelBotLeftTime.add(textTime);
		panelBot.add(panelBotLeft);
		panelBot.add(panelBotRight);
		panelBotLeftTop.add(labelScore);
		panelBotLeft.add(panelBotLeftTop);
		panelBotLeft.add(panelBotLeftBot);
		panelBotRight.add(panelBotRightName);
		panelBotRightName.add(textName);

		labelName.setVerticalAlignment(labelName.CENTER);// set vertical position of icon + text within label
		labelName.setHorizontalAlignment(labelName.CENTER);// set horzontal position of icon + text within label

		labelScore.setVerticalAlignment(labelName.CENTER);// set vertical position of icon + text within label
		labelScore.setHorizontalAlignment(labelName.CENTER);// set horzontal position of icon + text within label

		textName.setPreferredSize(new Dimension(300, 70));
		textName.setFont(new Font("Consolas", Font.PLAIN, 30));
		textName.setForeground(new Color(0x00FF00));
		textName.setBackground(Color.black);
		textName.setCaretColor(Color.white);
		textName.setText("�serName:");
		panelBotRightName.add(labelName);
		panelBotRightName.add(textName);
		btnOK = new JButton("submit");
		panelBotRightName.add(btnOK);
//		ImageIcon iconOK = new ImageIcon("./src/TrucXanh/black.jpg");

		backgroundImage = new ImageIcon("./src/TrucXanh/truc.jpg").getImage();
		iconOK = new ImageIcon(new ImageIcon("./src/TrucXanh/black.jpg").getImage().getScaledInstance(210, 60, 0));

		btnOK.setBorderPainted(false);
		btnOK.setContentAreaFilled(false);
		btnOK.setFocusPainted(false);
		btnOK.setIcon(iconOK);
		btnOK.setText("OK");
		btnOK.setHorizontalTextPosition(SwingConstants.CENTER);
		btnOK.setVerticalTextPosition(SwingConstants.CENTER);
		btnOK.setFont(font);
		btnOK.setForeground(Color.white);
		btnOK.setRolloverIcon(rollIcon);
		panelTop.add(labelMain);

		panelBotLeftBot.add(panelBotLeftScore, BorderLayout.WEST);
		panelBotLeftBot.add(panelBotLeftTime, BorderLayout.EAST);

		panelTop.setBackground(null);
		frame.add(new JLabel(new ImageIcon("./src/TrucXanh/truc.jpg")));
//		panelBotLeftScore.setBackground(Color.gray);
//		panelBotLeftTime.setBackground(Color.cyan);
//		panelBotRightButtons.setBackground(Color.magenta);
//		panelBotRightName.setBackground(Color.orange);
//		panelTop.setBackground(Color.blue);
//		panelBotLeftBot.setBackground(Color.red);
//		panelBotLeftTop.setBackground(Color.black);
//		panelBotLeft.setBackground(Color.yellow);
//		panelBotRight.setBackground(Color.green);

		panelBotRight.add(panelBotRightButtons);

//		panelBotRightButtons.add(new JLabel(new ImageIcon("./src/TrucXanh/truc.jpg")));

		panelBotRightName.setPreferredSize(new Dimension(500, 120));
		panelBotRightButtons.setPreferredSize(new Dimension(500, 330));
		panelBotRight.setPreferredSize(new Dimension(-1000, 1000));
		panelBotLeft.setPreferredSize(new Dimension(-1000, 1000));
		panelBotLeftBot.setPreferredSize(new Dimension(500, 500));
		panelBotLeftTop.setPreferredSize(new Dimension(100, 100));
//		panelBotLeftTop.setPreferredSize(new Dimension(100,100'
//		panelTop.setPreferredSize(new Dimension(100,100));
		panelBot.setPreferredSize(new Dimension(1000, 1000));
		panelMain.add(panelTop);
		panelMain.add(panelBot);
		frame.add(panelMain);
		frame.setTitle("truc xanh");
		panelBotRightButtons.add(createPanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 600);
		frame.setVisible(true);

	}

	public JButton createButton(ImageIcon icon, String text, Font font, Color color) {
		JButton btn = new JButton();
		btn.setBorderPainted(false);
		btn.setContentAreaFilled(false);
		btn.setFocusPainted(false);
		btn.setIcon(icon);
		btn.setText(text);
		btn.setHorizontalTextPosition(SwingConstants.CENTER);
		btn.setVerticalTextPosition(SwingConstants.CENTER);
		btn.setFont(font);
		btn.setForeground(color);
		return btn;
	}

	public JPanel createPanel() {
		// Font font = new Font("Blackadder ITC", Font.BOLD | Font.ITALIC, 40);
		// Font font = new Font("VNI-Slogan", Font.BOLD | Font.ITALIC, 40);
		Font font = new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 28);
		Color color = new Color(255, 255, 255);
		ImageIcon icon2 = new ImageIcon(("./src/TrucXanh/blue.jpg"));
		ImageIcon icon1 = new ImageIcon(("./src/TrucXanh/red.jpg"));
		ImageIcon rollIcon = new ImageIcon("./src/TrucXanh/yellow.jpg");
		JPanel pnInMain = new JPanel();
		pnInMain.setOpaque(false);
		pnInMain.setLayout(new BoxLayout(pnInMain, BoxLayout.Y_AXIS));

		btnewgame = createButton(icon2, "New Game", font, color);
		btresume = createButton(icon2, "Resume", font, color);
		bttype = createButton(icon2, "Type Game", font, color);
		btrank = createButton(icon2, "Top Rank", font, color);
		bthelp = createButton(icon2, "Help", font, color);
		btquit = createButton(icon1, "Quit", font, color);

		btnewgame.setRolloverIcon(rollIcon);
		btresume.setRolloverIcon(rollIcon);
		bttype.setRolloverIcon(rollIcon);
		btrank.setRolloverIcon(rollIcon);
		bthelp.setRolloverIcon(rollIcon);
		btquit.setRolloverIcon(rollIcon);

		pnInMain.add(btnewgame);
		pnInMain.add(btresume);
		// pnInMain.add(bttype);
		pnInMain.add(btrank);
		pnInMain.add(bthelp);
		pnInMain.add(btquit);
		return pnInMain;
	}

	public static void main(String[] args) {
		new Layout();
	}
}
