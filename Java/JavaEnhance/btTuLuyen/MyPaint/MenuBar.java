package MyPaint;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Random;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar implements ActionListener {
	JMenuItem item;
	JMenu menu;
	JCheckBoxMenuItem cbToolBar, cbCommand, cbDrawShape;
	MainPaint mainPaint;
	String com;

	public MenuBar(MainPaint mainPaint) {
		this.mainPaint = mainPaint;
		menu = new JMenu("File");
		item = new JMenuItem("New");
		menu.add(item);
		item.setActionCommand("New");
		item.addActionListener(this);
		item.setMnemonic(KeyEvent.VK_N);
		item = new JMenuItem("Open");
		menu.add(item);
		item.setActionCommand("Open");
		item.addActionListener(this);
		item.setMnemonic(KeyEvent.VK_O);
		item.setActionCommand("Open");
		item = new JMenuItem("save");
		item.setActionCommand("save");
		item.setMnemonic(KeyEvent.VK_S);
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Exit");
		item.setActionCommand("Exit");
		item.addActionListener(this);
		item.setMnemonic(KeyEvent.VK_E);
		menu.add(item);
		add(menu);
		menu = new JMenu("Edit");
		item = new JMenuItem("Select all");
		item.setActionCommand("Select all");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Deselect");
		item.setActionCommand("Deselect");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Clear select");
		item.setActionCommand("Clear select");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Clear All");
		item.setActionCommand("ClearAll");
		item.addActionListener(this);
		menu.add(item);
		add(menu);
		item = new JMenuItem("Select");
		item.setActionCommand("selecOn");
		item.addActionListener(this);
		menu.add(item);
		add(menu);
		menu = new JMenu("View");
		cbToolBar = new JCheckBoxMenuItem("ToolBar");
		cbToolBar.setSelected(true);
		cbToolBar.addActionListener(this);
		menu.add(cbToolBar);
		cbCommand = new JCheckBoxMenuItem("Command Line");
		cbCommand.setSelected(true);
		cbCommand.addActionListener(this);
		menu.add(cbCommand);
		cbDrawShape = new JCheckBoxMenuItem("Draw Shape");
		cbDrawShape.setSelected(true);
		cbDrawShape.addActionListener(this);
		menu.add(cbDrawShape);
		add(menu);

		menu = new JMenu("Format");
		item = new JMenuItem("Color");
		item.setActionCommand("Color");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Fill");
		item.setActionCommand("Fill");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Color shape");
		item.setActionCommand("Color Shape");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Background color");
		item.setActionCommand("Background color");
		item.addActionListener(this);
		menu.add(item);
		add(menu);

		menu = new JMenu("Draw");

		item = new JMenuItem("Line");
		item.setActionCommand("Line");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Square");
		item.setActionCommand("Square");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("TriangleType2");
		menu.add(item);
		item.setActionCommand("TriangleType2");
		item.addActionListener(this);
		item = new JMenuItem("Rectangle");
		menu.add(item);
		item.setActionCommand("Rectangle");
		item.addActionListener(this);
		item = new JMenuItem("TriangleType1");
		item.setActionCommand("TriangleType1");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Oval");
		item.setActionCommand("Oval");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Circle");
		item.setActionCommand("Circle");
		item.addActionListener(this);
		menu.add(item);
		add(menu);

		menu = new JMenu("Modify");
		item = new JMenuItem("Add tab");
		item.setActionCommand("Add tab");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Close tab");
		item.setActionCommand("Close tab");
		item.addActionListener(this);
		menu.add(item);

		item = new JMenuItem("Undo");
		item.setActionCommand("Undo");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Copy");
		item.setActionCommand("Copy");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Paste");
		item.setActionCommand("Paste");
		item.addActionListener(this);
		menu.add(item);

		add(menu);

		menu = new JMenu("Help");
		menu.setActionCommand("Help");
		menu.addActionListener(this);
		add(menu);
		menu = new JMenu("About");
		menu.setActionCommand("About");

		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new About();
			}
		});
		add(menu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		com = e.getActionCommand();
		mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).setShapeType(com);
		if (e.getActionCommand() == "Close tab") {

			mainPaint.tabPane.removeNewTab(mainPaint.tabPane.getSelectedIndex());

		}
		if (e.getActionCommand() == "selecOn")
			mainPaint.statusBar.command2.setText("nhấp chuột lên trên để chọn hình đó!");
		if (e.getActionCommand() == "Undo") {
			if (mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes.size() > 0)
				mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes.remove(
						mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes.size() - 1);
			else
				return;
			mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).repaint();
			mainPaint.statusBar.command2.setText("đã quay lại bước trước!");
		}
		if (e.getActionCommand() == "Color") {
			JColorChooser colorChooser = new JColorChooser();
			Color color = colorChooser.showDialog(null, "pick a color", Color.red);
			mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).color = color;
			mainPaint.statusBar.setColor(color);
			mainPaint.toolBar.color = color;
			mainPaint.statusBar.command2.setText("bạn vừa chọn màu: " + color);
		}
		if (e.getActionCommand() == "Fill") {
			mainPaint.statusBar.command2.setText("đã tô màu hình được chọn!");
			for (int i = 0; i < mainPaint.drawingPanel.shapes.size(); i++) {
				if (mainPaint.drawingPanel.shapes.get(i).select) {
					mainPaint.drawingPanel.shapeSelect.fill = true;
					mainPaint.drawingPanel.shapeSelect.color = mainPaint.toolBar.color;
				}
			}

		}
		if (e.getActionCommand() == "Eraser")
			mainPaint.statusBar.command2.setText("nhấn giữ chuột và di chuyển để xóa phần đó!");
		if (e.getActionCommand() == "Line" || e.getActionCommand() == "Square"
				|| e.getActionCommand() == "TriangleType2" || e.getActionCommand() == "Rectangle"
				|| e.getActionCommand() == "TriangleType1" || e.getActionCommand() == "Ellipse"
				|| e.getActionCommand() == "Circle") {
			mainPaint.statusBar.command2.setText("nhấn giữ chuột và di chuyển để vẽ");
			mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).command = true;
		}
		if (e.getActionCommand() == "Color Shape") {
			mainPaint.statusBar.command2.setText("đã thay đổi màu sắc cho hình được chọn!");
			for (int i = 0; i < mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes
					.size(); i++) {
				if (mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes.get(i).select) {
					mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes
							.get(i).color = mainPaint.toolBar.color;
					mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).repaint();

				}
			}
			mainPaint.statusBar.command2.setText("nhấp chuột vào trong hình cần tô màu đang chọn");
		}
		if (e.getActionCommand() == "ClearAll") {
			mainPaint.statusBar.command2.setText("đã xóa hết tất cả các hình!");
		}

		if (e.getActionCommand() == "Background color") {
			mainPaint.statusBar.command2.setText("đã tô màu cho khu vực vẽ!");
			mainPaint.tabPane.drawPanels
					.get(mainPaint.tabPane.getSelectedIndex()).colorBackground = mainPaint.toolBar.color;
			Color color = mainPaint.toolBar.color;
			mainPaint.tabPane.setBackground(mainPaint.toolBar.color);

		}

		if (e.getActionCommand() == "ClearAll") {
			mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes
					.removeAll(mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes);
			mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).repaint();
			mainPaint.statusBar.command2.setText("đã xóa tất cả các hình!");
		}
		if (e.getActionCommand() == "Select all") {
			mainPaint.statusBar.command2.setText("đã chọn tất cả các hình!");
			for (int i = 0; i < mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes
					.size(); i++) {
				mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes.get(i).select = true;
				mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).repaint();
			}

		}
		if (e.getActionCommand() == "Clear select") {
			mainPaint.statusBar.command2.setText("đã xóa hình được chọn!");

			for (int i = 0; i < mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes
					.size(); i++) {

				if (mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes.get(i).select) {
					mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes
							.remove(mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapeIndex);
				}
			}
		}
		if (e.getActionCommand() == "Deselect") {
			for (int i = 0; i < mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes
					.size(); i++) {
				mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).shapes.get(i).select = false;
				mainPaint.tabPane.drawPanels.get(mainPaint.tabPane.getSelectedIndex()).repaint();
			}
			mainPaint.statusBar.command2.setText("đã hủy chọn các hình được chọn trước đó!");
		}
		if (e.getActionCommand() == "Open") {

			JFileChooser fc = new JFileChooser();
			int result = fc.showOpenDialog(null);
			if (result == JFileChooser.APPROVE_OPTION) {
				File file = new File(fc.getSelectedFile().getAbsolutePath());
//				System.out.println(file);
				if (fc.getSelectedFile().getName().endsWith(".png")) {

				} else if (fc.getSelectedFile().getName().endsWith(".txt")) {

				}
			}

		}

		if (e.getActionCommand() == "Copy") {
			for (int i = 0; i < mainPaint.drawingPanel.shapes.size(); i++) {
				if (mainPaint.drawingPanel.shapes.get(i).select) {
					Random rand = new Random();
					int x = rand.nextInt(mainPaint.drawingPanel.getWidth());
					int y = rand.nextInt(mainPaint.drawingPanel.getHeight());
//					shapeCopy = drawingPanel.shapes.get(i).copyShape(x, y);
				}
			}
		}
		if (e.getActionCommand() == "Paste") {
			for (int i = 0; i < mainPaint.drawingPanel.shapes.size(); i++) {
				if (mainPaint.drawingPanel.shapes.get(i).select) {

					mainPaint.drawingPanel.shapes.add(mainPaint.shapeCopy);// add ball to panel to be drawn
				}
			}
		}
		if (e.getActionCommand() == "Exit")
			System.exit(0);
		if (e.getActionCommand() == "Add tab") {
			mainPaint.statusBar.setTextArea("New Tab " + (mainPaint.tabPane.numTabs - 1) + " \n");
			mainPaint.tabPane.addNewTabFromMenu();
		}
		if (e.getActionCommand() == "New") {
			for (DrawingPanel drawingPanel : mainPaint.tabPane.drawPanels) {
				drawingPanel.shapes.removeAll(drawingPanel.shapes);
				drawingPanel.repaint();
				drawingPanel.colorBackground = Color.white;
			}
			mainPaint.statusBar.command2.setText("đã tạo mới tất cả khu vực vẽ!");
			mainPaint.tabPane.setBackground(Color.white);
		}

		// TODO Auto-generated method stub
		if (!cbCommand.isSelected()) {
			mainPaint.statusBar.setVisible(false);
		} else
			mainPaint.statusBar.setVisible(true);
		if (!cbToolBar.isSelected()) {
			mainPaint.toolBar.setVisible(false);
		} else
			mainPaint.toolBar.setVisible(true);
		if (!cbDrawShape.isSelected()) {
			mainPaint.drawShape.setVisible(false);
		} else
			mainPaint.drawShape.setVisible(true);
	}
}
