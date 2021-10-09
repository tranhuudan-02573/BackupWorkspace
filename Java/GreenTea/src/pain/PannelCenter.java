package pain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class PannelCenter extends JPanel {
	JButton[] btn = new JButton[7];
	String[] s = { "Point", "Line", "Circle", "Square", "Rectangle", "Triangle", "Oval" };
	public static ArrayList<Paint> paint = new ArrayList<Paint>();
	static String selectShap = "";
	JPanel panelPunc;
	PannelBott pnBott;
	PannelLeft pannelLeft;

	public PannelCenter(PannelBott pnBott, PannelLeft pannelLeft) {
		this.pnBott = pnBott;
		this.pannelLeft = pannelLeft;
		setLayout(new BorderLayout());
		// TODO Auto-generated constructor stub
		panelPunc = new JPanel();
		panelPunc.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(),
				new MatteBorder(0, 0, 2, 0, Color.black)));
		panelPunc.setBackground(Color.white);
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(s[i]);
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					for (int i = 0; i < btn.length; i++) {
						if (e.getSource() == btn[i]) {
							selectShap = s[i];
							pannelLeft.selectShape = "";
						}
					}
				}
			});

			btn[i].setActionCommand(s[i]);
			btn[i].setBackground(Color.white);
			btn[i].setFocusable(false);
			btn[i].setMargin(new Insets(5, 20, 5, 20));
			panelPunc.add(btn[i]);

		}
		add(panelPunc, BorderLayout.NORTH);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(),
				new MatteBorder(0, 0, 2, 0, Color.black)));

		setBorder(new EmptyBorder(5, 5, 5, 5));

		add(new Paint_App(pnBott), BorderLayout.CENTER);
		setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(),
				new MatteBorder(2, 2, 2, 2, Color.black)));

	}
}
