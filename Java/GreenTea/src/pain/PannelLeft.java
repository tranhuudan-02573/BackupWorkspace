package pain;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PannelLeft extends JPanel {
//	DrawingPanel drawingPanel;
	PannelBott statusBar;
	String[] s = { "fill", "move", "Delete", "Select" };
	JButton[] btn = new JButton[4];
	MainPaint gui;
	static String selectShape = "";
//	public static ArrayList<Paint> paint = new ArrayList<Paint>();
	PannelCenter pannelCenter;

	public PannelLeft(MainPaint gui, PannelBott statusBar, PannelCenter pannelCenter) {
		setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, Color.BLACK));
		setVisible(true);
		this.pannelCenter = pannelCenter;
		// TODO Auto-generated constructor stub
		this.statusBar = statusBar;
		this.setLayout(new GridLayout(0, 1));
		this.statusBar = statusBar;
		this.gui = gui;
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String com = e.getActionCommand();
//				drawingPanel.setShapeType(com);
				for (int i = 0; i < btn.length; i++) {

				}
				for (int i = 0; i < btn.length; i++) {
					if (e.getActionCommand() == s[i]) {
						btn[i].setForeground(Color.red);
					}
					if (e.getActionCommand() != s[i]) {
						btn[i].setForeground(Color.BLACK);
					}

				}

			}
		};

		for (int i = 0; i < btn.length; i++) {

			btn[i] = new JButton(s[i]);
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					for (int i = 0; i < btn.length; i++) {
						if (e.getSource() == btn[i]) {
							selectShape = s[i];
							pannelCenter.selectShap = "";
						}
					}
				}
			});
			btn[i].setActionCommand(s[i]);
			btn[i].setBackground(Color.white);
			btn[i].setFocusable(false);
//			drawingPanel.command = true;
			add(btn[i]);
		}
		JButton btnChooseColor = new JButton("Chose Color");
		btnChooseColor.setBackground(Color.white);
		btnChooseColor.setFocusable(false);
		btnChooseColor.setMargin(new Insets(5, 20, 5, 20));
		btnChooseColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ColorChoose();
			}
		});
		add(btnChooseColor);

	}

}
