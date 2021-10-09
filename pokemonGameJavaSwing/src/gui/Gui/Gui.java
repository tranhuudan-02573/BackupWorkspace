package gui.Gui;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import gui.Panel.BoardPanel;
import gui.Panel.ControlPanel;
import logic.Board;
import logic.Square;

public class Gui extends JFrame implements ICommon, ITransBoard, ITransControl {
	private static final long serialVersionUID = -5479701518838741039L;
	private static final String TITLE = "Pokemon";
	public static final int WIDTH = 700;
	public static final int HEIGHT = 540;
	public static final int TIME = 600;
	public static final boolean WIN = true;
	public static final boolean LOSE = false;
	private Board board;
	private int numSquareIsShowed = (Board.NUM_ROWS - 2) * (Board.NUM_COLUMNS - 2);
	private BoardPanel boardPanel;
	private ControlPanel controlPanel;

	public Gui() {
		board = new Board();
		initComp();
		addComp();
		addEvent();
	}

	@Override
	public void initComp() {
		setTitle(TITLE);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLayout(null);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addComp() {
		addBoardPanel();

		controlPanel = new ControlPanel();
		add(controlPanel);
		controlPanel.addListener(this);
	}

	@Override
	public void addEvent() {
		WindowListener wd = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int kq = JOptionPane.showConfirmDialog(Gui.this, "Bạn có muốn thoát không?", "Thông báo",
						JOptionPane.YES_NO_OPTION);
				if (kq == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		};
		addWindowListener(wd);
	}

	@Override
	public Square[][] getListSquare() {
		return board.getListSquare();
	}

	@Override
	public void setListSquare(Square[][] list) {
		board.setListSquare(list);
	}

	@Override
	public boolean checkMatching(int x0, int y0, int x1, int y1) {
		boolean check = board.checkMatching(x0, y0, x1, y1);
		if (check) {
			numSquareIsShowed = getNumSquareIsShowed() - 2;
		}
		return check;
	}

	@Override
	public void renewBoardPanel() {
		board = new Board();
		remove(boardPanel);
		addBoardPanel();
	}

	private void addBoardPanel() {
		boardPanel = new BoardPanel();
		boardPanel.setBorder(new LineBorder(Color.gray, 2));
		add(boardPanel);
		boardPanel.addListener(this);
		boardPanel.initBoard();
	}

	@Override
	public void showDialog(boolean checkWin) {
		int kq;
		if (checkWin) {
			kq = JOptionPane.showConfirmDialog(Gui.this, "Bạn thắng!\n Bạn có muốn chơi lại không?", "Thông báo",
					JOptionPane.YES_NO_OPTION);
		} else {
			kq = JOptionPane.showConfirmDialog(Gui.this, "Bạn thua!\n Bạn có muốn chơi lại không?", "Thông báo",
					JOptionPane.YES_NO_OPTION);
		}
		if (kq == JOptionPane.YES_OPTION) {
			numSquareIsShowed = (Board.NUM_ROWS - 2) * (Board.NUM_COLUMNS - 2);
			controlPanel.restart();
		} else if (kq == JOptionPane.NO_OPTION) {
			System.exit(0);
		}
	}

	@Override
	public int getNumSquareIsShowed() {
		return numSquareIsShowed;
	}
}
