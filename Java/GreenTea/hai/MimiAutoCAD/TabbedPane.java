package MimiAutoCAD;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPane extends JTabbedPane implements ChangeListener {
	int numTabs;
	ArrayList<DrawingPanel> drawPanels = new ArrayList<DrawingPanel>();
	StatusBarMiniAutoCAD statusBarMiniAutoCAD;

	public TabbedPane(StatusBarMiniAutoCAD statusBarMiniAutoCAD) {
		this.statusBarMiniAutoCAD = statusBarMiniAutoCAD;

		this.setTabPlacement(JTabbedPane.TOP);
		this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		// add first tab
		add(CreateDrawPanel(numTabs), "Tab" + String.valueOf(numTabs), numTabs++);
		setTabComponentAt(0, new CustomTab(this));
		// add tab to add new tab when click
		add(new JPanel(), "+", numTabs++);
		addChangeListener(this);

	}

	public ArrayList<DrawingPanel> getDrawPanels() {
		return drawPanels;
	}

	private JPanel CreateDrawPanel(int numTabs) {
		// TODO Auto-generated method stub
		drawPanels.add(new DrawingPanel(MenuBarAutoCAD.themeMode, statusBarMiniAutoCAD));
		return drawPanels.get(numTabs);

	}

	@Override
	public DrawingPanel getSelectedComponent() {
		// TODO Auto-generated method stub
		return (DrawingPanel) drawPanels.get(this.getSelectedIndex());
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		statusBarMiniAutoCAD.setTextArea("New Tab " + (numTabs - 1) + " \n");
//	return;
		addNewTab();
	}

	public void addNewTabFromMenu() {
		// TODO Auto-generated method stub
		int index = numTabs - 1;
		// add new tab
		this.add(CreateDrawPanel(index), "Tab" + String.valueOf(index), index);
		// set tab is custom tab
		this.setTabComponentAt(index, new CustomTab(this));
		this.removeChangeListener(this);
		this.setSelectedIndex(index);
		this.addChangeListener(this);
		numTabs++;
	}

	public void addNewTab() {
		// TODO Auto-generated method stub
		int index = numTabs - 1;
		if (this.getSelectedIndex() == index) {// click new tab
			// add new tab
			this.add(CreateDrawPanel(index), "Tab" + String.valueOf(index), index);
			// set tab is custom tab
			this.setTabComponentAt(index, new CustomTab(this));
			this.removeChangeListener(this);
			this.setSelectedIndex(index);
			this.addChangeListener(this);
			numTabs++;
//		System.out.println(numTabs);
		}
//	System.out.println("da add");
//	System.out.println(this.getSelectedIndex()+"  "+index);
	}

	public void removeNewTab(int index) {
		this.remove(index);
		drawPanels.remove(index);
		numTabs--;
		if ((index == numTabs - 1) && (index > 0)) {
			this.setSelectedIndex(numTabs - 2);
		} else {
			this.setSelectedIndex(index);
		}
		if (numTabs == 1) {
			addNewTab();
		}
	}
}

class CustomTab extends JPanel {
	TabbedPane tabbedPane;

	public CustomTab(TabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBorder(new EmptyBorder(5, 2, 2, 2));
		setOpaque(false);
		addLable();
		add(customButton("x"));

	}

	private JButton customButton(String string) {
		// TODO Auto-generated method stub
		JButton bt = new JButton(string);
		bt.setToolTipText("Close the Tab");
		bt.setContentAreaFilled(false);
		bt.setPreferredSize(new Dimension(15, 15));
		bt.setBorder(new EtchedBorder());
		bt.setBorderPainted(false);
		bt.setFocusable(false);

		bt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				int index = tabbedPane.indexOfTabComponent(CustomTab.this);
				if (index != -1) {
					tabbedPane.removeNewTab(index);
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseEntered(e);
				bt.setBorderPainted(true);
				bt.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseExited(e);
				bt.setBorderPainted(false);
				bt.setForeground(Color.BLACK);
			}

		});
		return bt;
	}

	private void addLable() {
		// TODO Auto-generated method stub
		JLabel jLabel = new JLabel() {
			public String getText() {
				int index = tabbedPane.indexOfTabComponent(CustomTab.this);
				if (index != -1) {
					return tabbedPane.getTitleAt(index);
				}
				return null;
			}
		};
		jLabel.setBorder(new EmptyBorder(0, 0, 0, 10));
		add(jLabel);

	}
}
