package learning;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JFrame implements ActionListener {
	JMenuItem loadItem, saveItem, exitItem;
	JMenu fileMenu, editMenu, helpMenu;
	ImageIcon icon;
	JMenuBar menuBar;

	public MenuBar() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);

		fileMenu = new JMenu("file");
		editMenu = new JMenu("edit");
		helpMenu = new JMenu("help");

		loadItem = new JMenuItem("load");
		saveItem = new JMenuItem("save");
		exitItem = new JMenuItem("exit");

		fileMenu.setMnemonic(KeyEvent.VK_F);// alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E);// alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H);// alt + h for help
		loadItem.setMnemonic(KeyEvent.VK_L);// l for load
		saveItem.setMnemonic(KeyEvent.VK_S);// s for save
		exitItem.setMnemonic(KeyEvent.VK_E);// e for exit

		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);

		icon = new ImageIcon("./src/swing/row.png");
		loadItem.setIcon(icon);
		saveItem.setIcon(icon);
		exitItem.setIcon(icon);

		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MenuBar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loadItem) {
			System.out.println("*beep boop* you loaded a file");
		} else if (e.getSource() == saveItem) {
			System.out.println("*beep boop* you saved a file");
		} else if (e.getSource() == exitItem) {
			System.out.println("*beep boop* you exited a file");
		}

	}
}
