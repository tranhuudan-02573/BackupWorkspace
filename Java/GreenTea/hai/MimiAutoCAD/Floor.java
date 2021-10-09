package MimiAutoCAD;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Floor extends JPanel {
	ToolBarMiniAutoCAD toolBar;
//	DrawPanel drawPannel;
	StatusBarMiniAutoCAD statusBar;
	TabbedPane tabbedPane;

	public Floor() {
		statusBar = new StatusBarMiniAutoCAD();
		tabbedPane = new TabbedPane(statusBar);
		toolBar = new ToolBarMiniAutoCAD(statusBar, tabbedPane);
//		drawPannel = new DrawPanel();

		setLayout(new BorderLayout());

//		drawPannel.setSize(900, 400);
//		System.out.println(drawPannel.getSize());
		statusBar.setBorder(new TitledBorder("Status"));
		statusBar.setForeground(Color.white);

		add(toolBar, "North");
//		add(drawPannel,"Center");
		add(tabbedPane, "Center");
		add(statusBar, "South");

	}

}
