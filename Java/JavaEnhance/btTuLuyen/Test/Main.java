package Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class Main extends JFrame implements ActionListener, ItemListener {
	JMenuBar menuBar;

	JMenu menu, submenu;
	JMenuItem menuItem;

	JCheckBoxMenuItem cbMenuItem;
	JRadioButtonMenuItem rbMenuItem;
	JLabel label;

	public Main() {
		label = new JLabel("");
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);

		// a group of JMenuItems
		menuItem = new JMenuItem("New ...", KeyEvent.VK_N);
		// used constructor instead
		// menuItem.setMnemonic(KeyEvent.VK_N);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuItem.setActionCommand("New ...");
		menuItem = new JMenuItem("Open ...",
				new ImageIcon(new ImageIcon("./JavaSwing/learning/_2.jpg").getImage().getScaledInstance(10, 10, 10)));
		menuItem.setMnemonic(KeyEvent.VK_O);
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuItem.setActionCommand("Open ...");
//Menu item has only a Icon 
		menuItem = new JMenuItem(
				new ImageIcon(new ImageIcon("./JavaSwing/learning/_2.jpg").getImage().getScaledInstance(10, 10, 10)));
		menuItem.setMnemonic(KeyEvent.VK_D);
		menuItem.addActionListener(this);
		menu.add(menuItem);

		// a group of radio button menu items
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		rbMenuItem = new JRadioButtonMenuItem("A radio button menu item 1");
		rbMenuItem.setMnemonic(KeyEvent.VK_1);
		rbMenuItem.setSelected(true);
		group.add(rbMenuItem);
		rbMenuItem.addActionListener(this);
		menu.add(rbMenuItem);
		rbMenuItem = new JRadioButtonMenuItem("A radio button menu item 2");
		rbMenuItem.setMnemonic(KeyEvent.VK_2);
		group.add(rbMenuItem);
		rbMenuItem.addActionListener(this);
		menu.add(rbMenuItem);

		// a group of check box menu items
		menu.addSeparator();
		cbMenuItem = new JCheckBoxMenuItem("A check box	menu item 1");
		cbMenuItem.setMnemonic(KeyEvent.VK_C);
		cbMenuItem.addItemListener(this);
		menu.add(cbMenuItem);
		cbMenuItem = new JCheckBoxMenuItem("A check box	menu item 2");
		cbMenuItem.setMnemonic(KeyEvent.VK_A);
		cbMenuItem.addItemListener(this);
		menu.add(cbMenuItem);

		// a submenu
		menu.addSeparator();
		submenu = new JMenu("A submenu");
		submenu.setMnemonic(KeyEvent.VK_S);
		menuItem = new JMenuItem("An item in the submenu");
		menuItem.setActionCommand("An item in the submenu");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		submenu.add(menuItem);
		menuItem = new JMenuItem("Another item in the submenu");
		menuItem.setActionCommand("Another item in the submenu");
		menuItem.addActionListener(this);
		submenu.add(menuItem);
		menu.add(submenu);

		// a Exit Menu Item
		menu.addSeparator();
		menuItem = new JMenuItem("Exit", KeyEvent.VK_E);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		menuItem.setActionCommand("Exit");
		menu.add(menuItem);
		add(label);
		// Build second menu in the menu bar.
		menu = new JMenu("Options");
		menu.setMnemonic(KeyEvent.VK_P);
		menuBar.add(menu);
		setVisible(true);
		setSize(500, 600);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand() == "Exit") {
			System.exit(0);
		} else if (e.getActionCommand() == "Another item in the submenu") {
			System.out.println("Another item in the submenu");
		} else if (e.getActionCommand() == "An item in the submenu") {
			System.out.println("An item in the submenu");
		} else if (e.getActionCommand() == "Open ...") {
			System.out.println("Open ...");
		} else if (e.getActionCommand() == "New ...") {
			System.out.println("New ...");
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		System.out.println("a");
		if (e.getStateChange() == ItemEvent.SELECTED) {
			label.setVisible(true);
			label.revalidate();
			label.repaint();
		} else {
			label.setVisible(false);
		}

	}

	public static void main(String[] args) {
		new Main();
	}
}
