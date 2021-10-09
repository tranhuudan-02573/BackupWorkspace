package MyPaint;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DrawShape extends JPanel {
//	DrawingPanel drawingPanel;
	StatusBar statusBar;
	String[] s = { "Pen", "Line", "Circle", "Square", "Rectangle", "TriangleType1", "TriangleType2", "Oval" };
	JButton[] btn = new JButton[8];
	TabPane tabPane;
	ToolBar toolBar;

	public DrawShape(TabPane tabPane, StatusBar statusBar, ToolBar toolBar) {
		setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, Color.BLACK));
		setVisible(true);
		// TODO Auto-generated constructor stub
		this.statusBar = statusBar;
//		this.drawingPanel = drawingPanel;
		this.tabPane = tabPane;
		this.toolBar = toolBar;
		this.setLayout(new GridLayout(0, 1));

		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String com = e.getActionCommand();
				tabPane.drawPanels.get(tabPane.getSelectedIndex()).setShapeType(com);
				for (int i = 0; i < btn.length; i++) {
					statusBar.command2.setText("giữ và di chuyển chuột để vẽ");
					if (e.getActionCommand() == s[i]) {
						tabPane.drawPanels.get(tabPane.getSelectedIndex()).command = true;
						toolBar.btn[3].setEnabled(false);
						toolBar.btn[2].setEnabled(false);
						toolBar.btn[4].setEnabled(true);
						toolBar.btn[1].setEnabled(true);
						toolBar.btn[5].setEnabled(true);
						toolBar.selectButton.setSelected(false);
						toolBar.selectButton.setActionCommand("selecOn");
					}

				}

			}
		};

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(s[i]);
			btn[i].addActionListener(action);
			btn[i].setActionCommand(s[i]);
			btn[i].setBackground(Color.white);
			btn[i].setFocusable(false);
			add(btn[i]);
		}

	}

}
