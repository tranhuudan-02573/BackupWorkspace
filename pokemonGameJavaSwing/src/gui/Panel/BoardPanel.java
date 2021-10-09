package gui.Panel;

import logic.Board;
import logic.Square;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import gui.Gui.Gui;
import gui.Gui.ICommon;
import gui.Gui.ITransBoard;

public class BoardPanel extends JPanel implements ICommon {
	private static final long serialVersionUID = -4333819455965695569L;
	private ITransBoard listener;
	private Label[] selectedSlot;
	private static final LineBorder NORMAL_BORDER = new LineBorder(Color.gray, 1);
	private static final LineBorder SELECTED_BORDER = new LineBorder(Color.red, 2);
	private Label[][] lbSquare;

	public BoardPanel() {
		selectedSlot = new Label[2];
		initComp();
		addComp();
		addEvent();
	}

	@Override
	public void initComp() {
		setSize(Gui.WIDTH - 30, Gui.HEIGHT - 120);
		setLocation(10, 70);
		setBackground(Color.gray);
		setLayout(new GridLayout(Board.NUM_ROWS, Board.NUM_COLUMNS));
		lbSquare = new Label[Board.NUM_ROWS][Board.NUM_COLUMNS];
	}

	@Override
	public void addComp() {
		for (int i = 0; i < Board.NUM_ROWS; i++) {
			for (int j = 0; j < Board.NUM_COLUMNS; j++) {
				lbSquare[i][j] = new Label();
				add(lbSquare[i][j]);
			}
		}
	}

	@Override
	public void addEvent() {
		MouseListener ml = new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Label label = (Label) e.getComponent();
				// them label vao danh sach cac label duoc chon
				if (selectedSlot[0] == null) {
					label.setBorder(SELECTED_BORDER);
					selectedSlot[0] = label;
				} else if (selectedSlot[0] == label) {
					label.setBorder(NORMAL_BORDER);
					selectedSlot[0] = null;
				} else {
					label.setBorder(SELECTED_BORDER);
					selectedSlot[1] = label;
					// kiem tra ghep doi
					int x0 = selectedSlot[0].x;
					int y0 = selectedSlot[0].y;
					int x1 = selectedSlot[1].x;
					int y1 = selectedSlot[1].y;
					boolean check = listener.checkMatching(x0, y0, x1, y1);
					if (check) {
						lbSquare[x0][y0].removeMouseListener(lbSquare[x0][y0].ml);
						lbSquare[x1][y1].removeMouseListener(lbSquare[x1][y1].ml);
					}
					updateBoard();
					selectedSlot[0] = null;
					selectedSlot[1] = null;
				}
			}
		};
		for (int i = 1; i < Board.NUM_ROWS - 1; i++) {
			for (int j = 1; j < Board.NUM_COLUMNS - 1; j++) {
				lbSquare[i][j].x = i;
				lbSquare[i][j].y = j;
				lbSquare[i][j].ml = ml;
				lbSquare[i][j].addMouseListener(ml);
			}
		}
	}

	public void addListener(ITransBoard event) {
		listener = event;
	}

	public void updateBoard() {
		Square[][] listSquare = listener.getListSquare();
		for (int i = 0; i < listSquare.length; i++) {
			for (int j = 0; j < listSquare[0].length; j++) {
				if (!listSquare[i][j].isDroped()) {
					lbSquare[i][j].setBorder(NORMAL_BORDER);
				} else {
					lbSquare[i][j].setBorder(null);
					lbSquare[i][j].setIcon(null);
					lbSquare[i][j].setOpaque(false);
				}
			}
		}
	}

	public void initBoard() {
		Square[][] listSquare = listener.getListSquare();
		for (int i = 0; i < listSquare.length; i++) {
			for (int j = 0; j < listSquare[0].length; j++) {
				if (!listSquare[i][j].isDroped()) {
					lbSquare[i][j].setBorder(NORMAL_BORDER);
					lbSquare[i][j].setOpaque(true);
					lbSquare[i][j].setBackground(Color.lightGray);
					lbSquare[i][j].setHorizontalAlignment(JLabel.CENTER);
					lbSquare[i][j].setVerticalAlignment(JLabel.CENTER);
					try {
						Image image = ImageIO.read(listSquare[i][j].getValue());
						int newWidth = this.getWidth() / Board.NUM_COLUMNS;
						int newHeight = this.getHeight() / Board.NUM_ROWS;
						image = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
						ImageIcon icon = new ImageIcon(image);
						lbSquare[i][j].setIcon(icon);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private class Label extends JLabel {
		private static final long serialVersionUID = 6825410015958932243L;
		private int x;
		private int y;
		private MouseListener ml;
	}
}
