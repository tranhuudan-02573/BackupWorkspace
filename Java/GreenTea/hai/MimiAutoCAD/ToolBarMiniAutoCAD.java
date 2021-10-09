package MimiAutoCAD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JToolBar;

public class ToolBarMiniAutoCAD extends JToolBar implements ActionListener {
	JButton select_bt, del_bt, cancel_bt, line_bt, circle_bt, ellip_bt, rectange_bt, polygon_bt;
	JComboBox circleCombo;
	Dimension dimension = new Dimension(30, 30);
	StatusBarMiniAutoCAD statusBarMiniAutoCAD;
	String[] name = { "Select", "Line", "Circle", "Ellip", "Rectange", "Polygon", "Delete", "Cancel" };
	TabbedPane tabbedPane;

	public ToolBarMiniAutoCAD(StatusBarMiniAutoCAD statusBarMiniAutoCAD, TabbedPane tabbedPane) {
		this.statusBarMiniAutoCAD = statusBarMiniAutoCAD;
		this.tabbedPane = tabbedPane;
		this.setBackground(Color.red);
//	setFocusable(false);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(new Color(0, 0, 0, 150));
		select_bt = new JButton("Select");
		select_bt.setActionCommand("Select");
		select_bt.addActionListener(this);
		select_bt.setMnemonic(KeyEvent.VK_S);
//	select_bt.setBorder(BorderFactory.createBevelBorder());/
		add(select_bt);
		addSeparator(new Dimension(30, 30));

		line_bt = new JButton("");
		line_bt.setActionCommand("Line");
		line_bt.setPreferredSize(dimension);
		line_bt.addActionListener(this);

		// line_bt.setBorder(null);
		line_bt.setIcon(createIcon30("./hai/ImageMimiAutoCAD/line.PNG"));
		add(line_bt);
//	addSeparator();

//	circleCombo = new JComboBox();
		circle_bt = new JButton("");
		circle_bt.setActionCommand("Circle");
		circle_bt.addActionListener(this);

		// circleCombo.add(circle_bt);
//	circleCombo.setPreferredSize(new Dimension(60, 40));
//	circleCombo.
		circle_bt.setPreferredSize(new Dimension(30, 30));
//	circle_bt.setBorder(null);
		circle_bt.setIcon(createIcon30("./hai/ImageMimiAutoCAD/circle_radius.PNG"));

		add(circle_bt);
//	addSeparator();

		ellip_bt = new JButton("");
		ellip_bt.setActionCommand("Ellip");
		ellip_bt.addActionListener(this);

		add(ellip_bt);
		ellip_bt.setPreferredSize(dimension);
		ellip_bt.setIcon(createIcon30("./hai/ImageMimiAutoCAD/ellip.PNG"));
//	ellip_bt.setBorder(null);
//	addSeparator();

		rectange_bt = new JButton("");
		rectange_bt.setActionCommand("Rectange");
//	rectange_bt.setContentAreaFilled(false);
		rectange_bt.addActionListener(this);

		add(rectange_bt);
		rectange_bt.setPreferredSize(dimension);
		rectange_bt.setIcon(createIcon30("./hai/ImageMimiAutoCAD/rectange.PNG"));
//	rectange_bt.setBorder(null);
//	addSeparator();

		polygon_bt = new JButton("");
		polygon_bt.setActionCommand("Polygon");
		add(polygon_bt);
		polygon_bt.addActionListener(this);

		polygon_bt.setPreferredSize(dimension);
		polygon_bt.setIcon(createIcon30("./hai/ImageMimiAutoCAD/polygon.PNG"));
//	polygon_bt.setBorder(null);
//	addSeparator();
		del_bt = new JButton("Delete");
		del_bt.setActionCommand("Delete");
		del_bt.addActionListener(this);
		del_bt.setToolTipText("delete selected shapes");

		add(del_bt);
		cancel_bt = new JButton("Cancel");
		cancel_bt.setActionCommand("Cancel");
		cancel_bt.addActionListener(this);
		cancel_bt.setMnemonic(KeyEvent.VK_C);
		add(cancel_bt);
	}

	public ImageIcon createIcon30(String part) {
		ImageIcon i1 = new ImageIcon(part);
		Image newImage = i1.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		i1 = new ImageIcon(newImage);
		return i1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DrawingPanel.shapeTemp = null;
		DrawingPanel.pointClick[0] = null;
		DrawingPanel.pointClick[1] = null;
		DrawingPanel.i = 1;
		for (int i = 0; i < name.length; i++) {
			if (e.getActionCommand().equals(name[i])) {
				tabbedPane.drawPanels.get(tabbedPane.getSelectedIndex()).setCommand(name[i]);
				statusBarMiniAutoCAD.setTextArea("Command :" + name[i] + " reddy !!!\n");
				if (name[i].equals("Line"))
					statusBarMiniAutoCAD.setTextArea("Press down Alt+C to cancel.\n");

				if (name[i].equals("Cancel")) {
					statusBarMiniAutoCAD.setTextArea("Cancel.\n");
					for (ShapeCAD shape : tabbedPane.drawPanels.get(tabbedPane.getSelectedIndex()).shapes) {
						shape.setSelect(false);
						shape.setHighlights(false);
						tabbedPane.drawPanels.get(tabbedPane.getSelectedIndex()).repaint();
					}

				}
				if (name[i].equals("Delete")) {
					statusBarMiniAutoCAD.setTextArea("Deleted !.\n");
					ArrayList<ShapeCAD> shapeTemp = tabbedPane.drawPanels.get(tabbedPane.getSelectedIndex()).shapes;
					for (ShapeCAD shape : shapeTemp) {
						try {

							if (shape.isSelect())
								shapeTemp.remove(shape);
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println("lỗi xóa");
						}
						tabbedPane.drawPanels.get(tabbedPane.getSelectedIndex()).repaint();
					}

				}

			}
//	if(e.getActionCommand().equals("Line"))
		}

	}
}
