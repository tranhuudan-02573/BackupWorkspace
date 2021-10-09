package Specialpane;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.util.*;

//SplitPaneDemo itself is not a visible component.
public class SplitPaneDemo extends JFrame implements ListSelectionListener {
	private Vector<String> imageNames;
	private JLabel picture;
	private JList<String> list;
	private final JSplitPane splitPane;
	private JScrollPane listScrollPane, pictureScrollPane;

	public SplitPaneDemo(String title) {
		super(title);
		// Create the list of images and put it in a scroll pane
		imageNames = new Vector<String>();
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

		list = new JList<String>(imageNames);
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
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, listScrollPane, pictureScrollPane);
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerLocation(150);
		splitPane.setDividerSize(10);

		// Provide minimum sizes for the two components in the split pane
		Dimension minimumSize = new Dimension(100, 50);
		listScrollPane.setMinimumSize(minimumSize);
		pictureScrollPane.setMinimumSize(minimumSize);

		// Provide a preferred size for the split pane
		splitPane.setPreferredSize(new Dimension(600, 400));
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

		JList<String> theList = (JList<String>) e.getSource();
		if (theList.isSelectionEmpty()) {
			picture.setIcon(null);
		} else {
			int index = theList.getSelectedIndex();
			ImageIcon newImage = new ImageIcon("images/" + imageNames.elementAt(index));
			picture.setIcon(newImage);
			picture.setPreferredSize(new Dimension(newImage.getIconWidth(), newImage.getIconHeight()));
			picture.revalidate();
		}
	}

	public static void main(String s[]) {
		JFrame frame = new SplitPaneDemo("SplitPaneDemo");

	}
}
