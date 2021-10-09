package MimiAutoCAD;

import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MenuBarAutoCAD extends JMenuBar implements ActionListener {
	JMenu fileMenu, editMenu, drawMenu, windowMenu, helpMenu, themeMenu;
	JMenuItem newItem, openItem, saveItem;
	JMenuItem copyItem, cutItem, pasteItem;
	JMenuItem lineItem, circleItem, rectangeItem, polygonItem, ellipItem;
//JMenuItem darkModeItem,lightModeItem;
	JRadioButtonMenuItem darkModeItem, lightModeItem;
	Floor floor;
	static int themeMode = 1; // 1 = dark , 2 = light

	public MenuBarAutoCAD(Floor floor) {
		this.floor = floor;
//	ActionListener this = new MenuListener();
		// Creat menuBar
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu = new JMenu("Edit");
		editMenu.setMnemonic(KeyEvent.VK_E);
		drawMenu = new JMenu("Draw");
		drawMenu.setMnemonic(KeyEvent.VK_D);
		windowMenu = new JMenu("Window");
		windowMenu.setMnemonic(KeyEvent.VK_W);
		helpMenu = new JMenu("Help");
		helpMenu.setMnemonic(KeyEvent.VK_H);
		themeMenu = new JMenu("Theme");
		themeMenu.setMnemonic(KeyEvent.VK_T);

		// creat menuItem
		newItem = new JMenuItem("New Tab");
		newItem.addActionListener(this);
		newItem.setMnemonic(KeyEvent.VK_N);
		openItem = new JMenuItem("Open");
		openItem.addActionListener(this);
		saveItem = new JMenuItem("Save");
		saveItem.addActionListener(this);
		//
		copyItem = new JMenuItem("Copy");
		copyItem.addActionListener(this);
		cutItem = new JMenuItem("Cut");
		cutItem.addActionListener(this);
		pasteItem = new JMenuItem("Paste");
		pasteItem.addActionListener(this);
		//
		lineItem = new JMenuItem("Line");
		lineItem.addActionListener(this);
		circleItem = new JMenuItem("Circle");
		circleItem.addActionListener(this);
		rectangeItem = new JMenuItem("Rectange");
		rectangeItem.addActionListener(this);
		polygonItem = new JMenuItem("Polygon");
		polygonItem.addActionListener(this);
		ellipItem = new JMenuItem("Ellip");
		ellipItem.addActionListener(this);
		// add JMenubar
		add(fileMenu);
		add(editMenu);
		add(drawMenu);
		add(windowMenu);
		add(helpMenu);
		add(themeMenu);
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);

		editMenu.add(copyItem);
		editMenu.add(cutItem);
		editMenu.add(pasteItem);

		drawMenu.add(lineItem);
		drawMenu.add(circleItem);
		drawMenu.add(ellipItem);
		drawMenu.add(rectangeItem);
		drawMenu.add(polygonItem);

		ButtonGroup group = new ButtonGroup();
		darkModeItem = new JRadioButtonMenuItem("DarkMode", true);
		group.add(darkModeItem);
		darkModeItem.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (darkModeItem.isSelected())
					floor.statusBar.setTextArea("Theme Mode : Dark\n");
				themeMode = 1;// 1= dark mode
				for (DrawingPanel drawPanel : floor.tabbedPane.getDrawPanels()) {
					drawPanel.setMode(1);
					drawPanel.repaint();

				}
			}
		});
		lightModeItem = new JRadioButtonMenuItem("LightMode");
		group.add(lightModeItem);
		lightModeItem.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (lightModeItem.isSelected())
					floor.statusBar.setTextArea("Theme Mode : Light\n");
				themeMode = 0;// 0 = light mode
				for (DrawingPanel drawPanel : floor.tabbedPane.getDrawPanels()) {
					drawPanel.setMode(0);
					drawPanel.repaint();

				}
			}
		});
		themeMenu.add(darkModeItem);
		themeMenu.add(lightModeItem);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("New Tab")) {
			floor.statusBar.setTextArea("New Tab " + (floor.tabbedPane.numTabs - 1) + " \n");
			floor.tabbedPane.addNewTabFromMenu();
//		floor.tabbedPane.validate();
		}
	}
}
