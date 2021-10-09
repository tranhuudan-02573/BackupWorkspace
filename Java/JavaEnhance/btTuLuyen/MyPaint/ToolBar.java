package MyPaint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class ToolBar extends JPanel {
	Color color;
	StatusBar statusBar;
	String[] s = { "Color", "Undo", "Delete", "Fill", "Clear All", "Eraser" };
	JButton[] btn = new JButton[6];
	JToggleButton selectButton;
	String com;
	TabPane tabPane;

	public ToolBar(TabPane tabPane, StatusBar statusBar) {
		setBackground(Color.white);
		this.statusBar = statusBar;
		this.tabPane = tabPane;
		setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(),
				new MatteBorder(2, 2, 0, 2, Color.black)));
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				com = e.getActionCommand();
				tabPane.drawPanels.get(tabPane.getSelectedIndex()).setShapeType(com);

				tabPane.drawPanels.get(tabPane.getSelectedIndex()).command = false;

				if (e.getActionCommand() == "Color") {
					JColorChooser colorChooser = new JColorChooser();
					color = colorChooser.showDialog(null, "pick a color", Color.red);
					tabPane.drawPanels.get(tabPane.getSelectedIndex()).color = color;
					statusBar.setColor(color);
					statusBar.command2.setText("bạn vừa chọn màu: " + color);
				}
				if (e.getActionCommand() == "Delete") {

					statusBar.command2.setText("đã xóa hình được chọn!");
					for (int i = 0; i < tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapes.size(); i++) {

						if (tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapes.get(i).select) {
							tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapes
									.remove(tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapeIndex);
						}
					}

				}
				if (e.getActionCommand() == "Fill") {
					for (int i = 0; i < tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapes.size(); i++) {

						if (tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapes.get(i).select) {
							tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapeSelect.fill = true;
							tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapeSelect.color = color;
						}

					}

					statusBar.command2.setText("đã tô màu hình được chọn!");
				}
				if (e.getActionCommand() == "Eraser") {
					statusBar.command2.setText("nhấn giữ chuột và di chuyển để xóa phần đó!");
				}

				if (e.getActionCommand() == "Undo") {
					statusBar.command2.setText("đã quay lại bước trước!");
					if (tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapes.size() > 0)
						tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapes
								.remove(tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapes.size() - 1);
					else
						return;
					tabPane.drawPanels.get(tabPane.getSelectedIndex()).repaint();

				}
				if (e.getActionCommand() == "Clear All") {
					tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapes
							.removeAll(tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapes);
					tabPane.drawPanels.get(tabPane.getSelectedIndex()).repaint();
					statusBar.command2.setText("đã xóa tất cả các hình!");
				}

				if (selectButton.isSelected()) {
					tabPane.drawPanels.get(tabPane.getSelectedIndex()).repaint();
					selectButton.setActionCommand("selecOff");
					btn[3].setEnabled(true);
					btn[2].setEnabled(true);
					btn[4].setEnabled(false);
					btn[1].setEnabled(false);
					btn[5].setEnabled(false);
					com = e.getActionCommand();
					tabPane.drawPanels.get(tabPane.getSelectedIndex()).setShapeType(com);
					statusBar.command2.setText("nhấp chuột lên trên để chọn hình đó!");

				} else {

					selectButton.setActionCommand("selecOn");
					for (AShape shape : tabPane.drawPanels.get(tabPane.getSelectedIndex()).shapes) {
						shape.select = false;

					}
					tabPane.drawPanels.get(tabPane.getSelectedIndex()).repaint();
					btn[3].setEnabled(false);
					btn[2].setEnabled(false);
					btn[4].setEnabled(true);
					btn[1].setEnabled(true);
					btn[5].setEnabled(true);
				}

			}
		};
		selectButton = new JToggleButton("Select");
		selectButton.addActionListener(action);
		selectButton.setActionCommand("selecOn");
		selectButton.setBackground(Color.white);
		selectButton.setFocusable(false);
		selectButton.setMargin(new Insets(5, 20, 5, 20));

		for (int i = 0; i < btn.length; i++) {

			btn[i] = new JButton(s[i]);
			btn[i].addActionListener(action);
			btn[i].setActionCommand(s[i]);
			btn[i].setBackground(Color.white);
			btn[i].setFocusable(false);
			btn[i].setMargin(new Insets(5, 20, 5, 20));
			add(btn[i]);
		}
		btn[3].setEnabled(false);
		btn[2].setEnabled(false);
		Slider slider = new Slider(tabPane, statusBar);
		add(selectButton);
		add(slider);

		setVisible(true);
	}

}
