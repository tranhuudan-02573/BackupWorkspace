package gui.Gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.Panel.MainPanel;

public class Gui extends JFrame implements ICommon {
	private MainPanel mainPanel;
	private Container content;
	private JPanel drawArea,panelMain,panelFunc
	public Gui() {
		initComp();
		addComp();
		addEvent();
	}

	@Override
	public void initComp() {
		// cài đặt ban đầu cho Frame
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setResizable(false);
		pack();
		// can close frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// show the swing paint result
		setVisible(true);
	}

	@Override
	public void addComp() {
		// thêm Panel vào Frame
		 content = this.getContentPane();
		content.setLayout(new BorderLayout());
		// create draw area
		drawArea = new DrawArea();

		panelMain = new JPanel();

		panelFunc = new JPanel();
		panelMain.setLayout(new BorderLayout());

		// add to content pane
		content.add(drawArea, BorderLayout.CENTER);
		content.add(panelFunc, BorderLayout.NORTH);
		content.add(panelMain, BorderLayout.WEST);
	}

	@Override
	public void addEvent() {
		// thêm sự kiện
	}
}
