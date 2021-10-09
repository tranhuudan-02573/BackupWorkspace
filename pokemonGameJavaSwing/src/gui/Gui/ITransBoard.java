package gui.Gui;

import logic.Square;

public interface ITransBoard {
	Square[][] getListSquare();

	void setListSquare(Square[][] list);

	boolean checkMatching(int x0, int y0, int x1, int y1);
}
