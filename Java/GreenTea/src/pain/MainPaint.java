package pain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class MainPaint extends JFrame implements ActionListener {
	ImageIcon icon;
	JCheckBoxMenuItem cbToolBar, cbCommand, cbDrawShape;
	JMenuItem item;
	JMenu menu;
	JMenuBar menuBar;
	JTabbedPane tabPane;
	JSplitPane splitPane;
	JPanel contentPane;
	String selectShapes;
	public static Color selectColor = Color.black;
	public static MainPaint frame;
	PannelBott statusBar;
	PannelCenter pannelCenter;
	PannelLeft drawShape;
	String selectShape = "";

	public static void main(String[] args) {
		try {
			frame = new MainPaint();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MainPaint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Paint");
		setSize(1000, 600);
		setMinimumSize(getSize());
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		menu = new JMenu("File");
		item = new JMenuItem("New");
		menu.add(item);
		item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectShapes = "";
				OpenFile.image = null;
				PannelCenter.paint.clear();
				repaint();
			}
		});

		item = new JMenuItem("Open");
		menu.add(item);
		item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectShapes = "Open";
				try {
					PannelCenter.paint.clear();
					new OpenFile();
				} catch (ClassNotFoundException e2) {
					e2.printStackTrace();
				}
			}
		});
		item = new JMenuItem("Save");
		menu.add(item);
		item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectShapes = "Save";
				new SaveFile();
			}
		});

		item = new JMenuItem("Exit");
		item.setActionCommand("Exit");
		item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectShapes = "Exit";
				System.exit(0);
			}
		});
		menu.add(item);
		menuBar.add(menu);
		menu = new JMenu("Edit");

		item = new JMenuItem("Clear All");
		item.setActionCommand("ClearAll");
		item.addActionListener(this);
		menu.add(item);
		menuBar.add(menu);

		menu = new JMenu("View");
		cbCommand = new JCheckBoxMenuItem("Pannel Bottom");
		cbCommand.setSelected(true);
		cbCommand.addActionListener(this);
		menu.add(cbCommand);
		cbDrawShape = new JCheckBoxMenuItem("Pannel Left");
		cbDrawShape.setSelected(true);
		cbDrawShape.addActionListener(this);
		menu.add(cbDrawShape);
		menuBar.add(menu);

		menu = new JMenu("Format");
		item = new JMenuItem("Color shape");
		item.setActionCommand("Color Shape");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Background color");
		item.setActionCommand("Background color");
		item.addActionListener(this);
		menu.add(item);
		menuBar.add(menu);

		menu = new JMenu("Draw");

		item = new JMenuItem("Line");
		item.setActionCommand("Line");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Square");
		item.setActionCommand("Square");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Triangle");
		menu.add(item);
		item.setActionCommand("Triangle");
		item.addActionListener(this);
		item = new JMenuItem("Rectangle");
		menu.add(item);
		item.setActionCommand("Rectangle");
		item.addActionListener(this);

		item = new JMenuItem("Oval");
		item.setActionCommand("Oval");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Circle");
		item.setActionCommand("Circle");
		item.addActionListener(this);
		menu.add(item);
		menuBar.add(menu);

		menu = new JMenu("Modify");

		item = new JMenuItem("Color");
		item.setActionCommand("Color");
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Clear");
		item.setActionCommand("Clear");
		item.addActionListener(this);
		menu.add(item);

		item = new JMenuItem("Fill");
		item.setActionCommand("Fill");
		item.addActionListener(this);
		menu.add(item);
		menuBar.add(menu);

		menu = new JMenu("Help");
		menu.setActionCommand("Help");
		menu.addActionListener(this);
		menuBar.add(menu);
		menu = new JMenu("About");
		menu.setActionCommand("About");

		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new About();
			}
		});
		menuBar.add(menu);

		Panel pnlabout = new Panel();
		pnlabout.setVisible(false);

		statusBar = new PannelBott();
		pannelCenter = new PannelCenter(statusBar, drawShape);
		drawShape = new PannelLeft(this, statusBar, pannelCenter);
		JSplitPane topSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, drawShape, pannelCenter);

		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topSplitPane, statusBar);
		splitPane.setDividerLocation(500);

		add(splitPane, BorderLayout.CENTER);

		setSize(1200, 800);
		((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (!cbCommand.isSelected()) {
			statusBar.setVisible(false);
		} else
			statusBar.setVisible(true);
		if (!cbDrawShape.isSelected()) {
			drawShape.setVisible(false);
		} else
			drawShape.setVisible(true);

	}

}
