package Specialpane;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.util.*;

//SplitPaneDemo itself is not a visible component.
public class NestingSplitPaneDemo extends JFrame implements ListSelectionListener {
	private Vector imageNames;
	private JLabel picture;
	private JList list;
	private JSplitPane topSplitPane, splitPane;
	private JScrollPane listScrollPane, pictureScrollPane;
	private JLabel label;

	public NestingSplitPaneDemo(String title) {
		super(title);
		// Create the list of images and put it in a scroll pane
		imageNames = new Vector();
		imageNames.addElement("Bird.gif");
		imageNames.addElement("Cat.gif");
		imageNames.addElement("Dog.gif");
		imageNames.addElement("Rabbit.gif");
		imageNames.addElement("Pig.gif");
		imageNames.addElement("All.gif");
		imageNames.addElement("Blue.gif");
		imageNames.addElement("dukeWaveRed.gif");
		imageNames.addElement("doggy/T1.gif");
		imageNames.addElement("geek/geek-cght.gif");
		imageNames.addElement("kathyCosmo.gif");

		list = new JList(imageNames);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(0);
		list.addListSelectionListener(this);
		listScrollPane = new JScrollPane(list);

		// Set up the picture label and put it in a scroll pane
		ImageIcon firstImage = new ImageIcon("images/" + (String) imageNames.firstElement());
		picture = new JLabel(firstImage);
		picture.setPreferredSize(new Dimension(firstImage.getIconWidth(), firstImage.getIconHeight()));
		pictureScrollPane = new JScrollPane(picture);

		// Create a split pane with the two scroll panes in it
		topSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, listScrollPane, pictureScrollPane);
//		topSplitPane.setOneTouchExpandable(true);
		topSplitPane.setDividerLocation(150);

        topSplitPane.setLeftComponent(listScrollPane);
        topSplitPane.setRightComponent(pictureScrollPane);

		// Provide minimum sizes for the two components in the split pane
		Dimension minimumSize = new Dimension(100, 50);
		listScrollPane.setMinimumSize(minimumSize);
		pictureScrollPane.setMinimumSize(minimumSize);

		// Provide a preferred size for the split pane
		topSplitPane.setPreferredSize(new Dimension(400, 200));

		label = new JLabel("Click on an image name in the list.", JLabel.CENTER);

		// Create a split pane and put "top" (a split pane)
		// and JLabel instance in it.
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topSplitPane, label);
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerLocation(180);

		// Provide minimum sizes for the two components in the split pane
		topSplitPane.setMinimumSize(new Dimension(100, 50));

		label.setMinimumSize(new Dimension(100, 30));

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		getContentPane().add(splitPane);
		pack();
		setVisible(true);
	}

	public void valueChanged(ListSelectionEvent e) {
		if (e.getValueIsAdjusting())
			return;

		JList theList = (JList) e.getSource();
		if (theList.isSelectionEmpty()) {
			picture.setIcon(null);
			label.setText("Nothing selected.");
		} else {
			int index = theList.getSelectedIndex();
			label.setText("Selected image number " + index);
			ImageIcon newImage = new ImageIcon("images/" + (String) imageNames.elementAt(index));
			picture.setIcon(newImage);
			picture.setPreferredSize(new Dimension(newImage.getIconWidth(), newImage.getIconHeight()));
			picture.revalidate();
		}
	}

	public static void main(String s[]) {
		JFrame frame = new NestingSplitPaneDemo("Nesting SplitPane Demo");

	}
}
