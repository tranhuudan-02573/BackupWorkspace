package Paint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Paint.DrawLine3.Line;

public class View extends MainArea {

	private JButton clearBtn, choseColorBtn;
	private JToggleButton pencilBtn, deleteBtn, drawLineBtn;
	private DrawArea drawArea;
	private static JSlider slider;
	private JLabel label;
	private JPanel panelMain, panelFunc;

	public void show() {
		// create main frame
		// set layout on content pane
		content.setLayout(new BorderLayout());
		// create draw area
		drawArea = new DrawArea();

		panelMain = new JPanel();

		panelFunc = new JPanel();
		panelMain.setLayout(new BorderLayout());

		// add to content pane
		content.add(drawArea, BorderLayout.CENTER);
		slider = new JSlider(1, 50);
		label = new JLabel();
//gach
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(4);
// don vi cach nhau moi vach
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(6);
// so hien thi
		slider.setPaintLabels(true);

		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		label.setText("*Size= " + slider.getValue());

		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				label.setText("*Size= " + slider.getValue());
			}
		});
		// create controls to apply colors and call clear feature
		choseColorBtn = new JButton("Choose Color");
		pencilBtn = new JToggleButton("Pencil");
		deleteBtn = new JToggleButton("eraser");
		drawLineBtn = new JToggleButton("draw line");
		pencilBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (pencilBtn.isSelected() == true) {
					drawLineBtn.setSelected(false);
					drawArea.pencil();
				} else {
					drawArea.noPencil();
				}
				deleteBtn.setSelected(false);
				drawLineBtn.setSelected(false);
			}
		});
		deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				drawArea.noPencil();
				pencilBtn.setSelected(false);
			}
		});
		choseColorBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				drawArea.color();
				if (pencilBtn.isSelected() == true) {
					drawArea.pencil();
				} else {
					drawArea.noPencil();
				}
			}
		});
		clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				drawArea.clear();
				if (pencilBtn.isSelected() == true) {
					drawArea.pencil();
				} else {
					drawArea.noPencil();
				}
			}
		});
		drawLineBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (drawLineBtn.isSelected() == true) {
					new DrawLine();
				} else {
					drawArea.noPencil();
				}
				pencilBtn.setSelected(false);
			}
		});
		panelFunc.add(clearBtn);
		panelFunc.add(choseColorBtn);
		panelFunc.add(pencilBtn);
		panelFunc.add(deleteBtn);
		panelFunc.add(drawLineBtn);
//		panelMain.add(label);
//		panelMain.add(panelFunc);
		panelMain.add(label, BorderLayout.NORTH);
		panelMain.add(slider, BorderLayout.CENTER);

		// add to content pane
		content.add(panelFunc, BorderLayout.NORTH);
		content.add(panelMain, BorderLayout.WEST);

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setResizable(false);
		frame.pack();
		// can close frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// show the swing paint result
		frame.setVisible(true);

		// Now you can try our Swing Paint !!! Enjoy :D
	}

	public static JSlider getSlider() {
		return slider;
	}

}
