package pain;

import java.awt.BasicStroke;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Paint_App extends JComponent {
	public Point startDrag, endDrag;
	public Paint ptemp;
	public BasicStroke bstroke;
	PannelBott pnBott;

	public Paint_App(PannelBott pnBott) {

		this.pnBott = pnBott;
		this.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				Point p = new Point(e.getX(), e.getY());
				if (PannelCenter.selectShap == "Rectangle") {
					MyRectangle obj = new MyRectangle();
					obj.makeObject(startDrag, p);
					PannelCenter.paint.add(obj);
					obj.setCommand(pnBott);
				} else if (PannelCenter.selectShap == "Square") {
					MySquare obj = new MySquare();
					obj.makeObject(startDrag, p);
					PannelCenter.paint.add(obj);
					obj.setCommand(pnBott);
				} else if (PannelCenter.selectShap == "Triangle") {

					MyTriangle obj = new MyTriangle();
					obj.makeObject(startDrag, p);
					PannelCenter.paint.add(obj);
					obj.setCommand(pnBott);
				} else if (PannelCenter.selectShap == "Oval") {
					MyOval obj = new MyOval();
					obj.makeObject(startDrag, p);
					PannelCenter.paint.add(obj);
					obj.setCommand(pnBott);
				} else if (PannelCenter.selectShap == "Circle") {
					MyCircle obj = new MyCircle();
					obj.makeObject(startDrag, p);
					PannelCenter.paint.add(obj);
					obj.setCommand(pnBott);
				} else if (PannelCenter.selectShap == "Point") {
					MyPoint obj = new MyPoint();
					obj.makeObject(startDrag, p);
					PannelCenter.paint.add(obj);
					obj.setCommand(pnBott);
				} else if (PannelCenter.selectShap == "Line") {
					MyLine obj = new MyLine(startDrag, new Point(e.getX(), e.getY()), MainPaint.selectColor);
					obj.makeObject(startDrag, p);
					PannelCenter.paint.add(obj);
					obj.setCommand(pnBott);
				} else if (PannelLeft.selectShape == "fill") {
					for (int i = PannelCenter.paint.size() - 1; i >= 0; i = i - 1) {
						Paint pt = PannelCenter.paint.get(i);
						try {
							Class2D s = (Class2D) pt;
							if (s.contains(startDrag)) {
								try {
									s.fill(MainPaint.selectColor);
								} catch (Exception ex) {
								}
								break;
							}
						} catch (Exception ex) {
						}
					}
				} else if (PannelLeft.selectShape == "move") {
					if (ptemp.contains(startDrag)) {
						ptemp.move(startDrag, p);
						PannelCenter.paint.add(ptemp);
						ptemp.setCommand(pnBott);
					} else
						return;
				}
				startDrag = null;
				endDrag = null;

				repaint();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				startDrag = new Point(e.getX(), e.getY());
				endDrag = startDrag;
				if (PannelLeft.selectShape == "move") {

					for (int i = PannelCenter.paint.size() - 1; i >= 0; i = i - 1) {
						Paint pt = PannelCenter.paint.get(i);
						if (pt.contains(startDrag)) {
							ptemp = pt;
							PannelCenter.paint.remove(pt);
							break;
						}
					}
				} else if (PannelLeft.selectShape == "Delete") {

					for (int i = PannelCenter.paint.size() - 1; i >= 0; i = i - 1) {
						Paint pt = PannelCenter.paint.get(i);
						if (pt.contains(startDrag)) {
							ptemp = null;
							PannelCenter.paint.remove(pt);
							break;
						}
					}
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		this.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				pnBott.setPoint(x, y);
				repaint();
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				endDrag = new Point(e.getX(), e.getY());
				repaint();
			}
		});
	}

	public void paint(Graphics g) {
		GraphicAdapter g2 = new GraphicAdapter() {
		};
		g2.setGraphicAdapter(g);
		if (OpenFile.image != null) {
			g2.getGraphicAdapter().drawImage(OpenFile.image, 0, 0, null);
			repaint();
		}
		for (Paint pt : PannelCenter.paint) {
			pt.draw(g2);
		}
		if (startDrag != null && endDrag != null) {
			if (PannelCenter.selectShap == "Rectangle") {
				MyRectangle obj = new MyRectangle();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			} else if (PannelCenter.selectShap == "Square") {
				MySquare obj = new MySquare();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			} else if (PannelCenter.selectShap == "Oval") {
				MyOval obj = new MyOval();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			} else if (PannelCenter.selectShap == "Circle") {
				MyCircle obj = new MyCircle();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			} else if (PannelCenter.selectShap == "Point") {
				MyPoint obj = new MyPoint();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			} else if (PannelCenter.selectShap == "Line") {
				MyLine obj = new MyLine();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			} else if (PannelCenter.selectShap == "Triangle") {
				MyTriangle obj = new MyTriangle();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			} else if (PannelLeft.selectShape == "move") {
				if (ptemp instanceof MyRectangle) {
					MyRectangle r = (MyRectangle) ptemp;
					if (r.contains(startDrag)) {
						if (r.getColor() == null) {
							g2.getGraphicAdapter().setColor(r.getLineColor());
							g2.getGraphicAdapter().drawRect(r.getRect().x + endDrag.x - startDrag.x,
									r.getRect().y + endDrag.y - startDrag.y, r.getRect().width, r.getRect().height);
						} else {
							g2.getGraphicAdapter().setColor(r.getColor());
							g2.getGraphicAdapter().fillRect(r.getRect().x + endDrag.x - startDrag.x,
									r.getRect().y + endDrag.y - startDrag.y, r.getRect().width, r.getRect().height);
							g2.getGraphicAdapter().drawRect(r.getRect().x + endDrag.x - startDrag.x,
									r.getRect().y + endDrag.y - startDrag.y, r.getRect().width, r.getRect().height);
						}
					}
				} else if (ptemp instanceof MyOval) {
					MyOval oval = (MyOval) ptemp;
					if (oval.contains(startDrag)) {
						if (oval.getColor() == null) {
							g2.getGraphicAdapter().setColor(oval.getLineColor());
							g2.getGraphicAdapter().drawOval((int) (oval.getElip2d().getX() + endDrag.x - startDrag.x),
									(int) (oval.getElip2d().getY() + endDrag.y - startDrag.y),
									(int) oval.getElip2d().getWidth(), (int) oval.getElip2d().getHeight());
						} else {
							g2.getGraphicAdapter().setColor(oval.getColor());
							g2.getGraphicAdapter().fillOval((int) (oval.getElip2d().getX() + endDrag.x - startDrag.x),
									(int) (oval.getElip2d().getY() + endDrag.y - startDrag.y),
									(int) oval.getElip2d().getWidth(), (int) oval.getElip2d().getHeight());
						}
					}
				} else if (ptemp instanceof MyTriangle) {
					MyTriangle tr = (MyTriangle) ptemp;
					if (tr.contains(startDrag)) {
						int[] x = { tr.getTriangle().xpoints[0] + endDrag.x - startDrag.x,
								tr.getTriangle().xpoints[1] + endDrag.x - startDrag.x,
								tr.getTriangle().xpoints[2] + endDrag.x - startDrag.x };
						int[] y = { tr.getTriangle().ypoints[0] + endDrag.y - startDrag.y,
								tr.getTriangle().ypoints[1] + endDrag.y - startDrag.y,
								tr.getTriangle().ypoints[2] + endDrag.y - startDrag.y };
						if (tr.getColor() == null) {
							g2.getGraphicAdapter().setColor(tr.getLineColor());
							g2.getGraphicAdapter().drawPolygon(x, y, 3);
						} else {
							g2.getGraphicAdapter().setColor(tr.getColor());
							g2.getGraphicAdapter().fillPolygon(x, y, 3);
							g2.getGraphicAdapter().drawPolygon(x, y, 3);
						}
					}
				} else if (ptemp instanceof MyLine) {
					MyLine tr = (MyLine) ptemp;
					if (tr.contains(startDrag)) {
						g2.getGraphicAdapter().setColor(tr.getColor());
						g2.getGraphicAdapter().drawLine((int) (tr.getLine().getStartX() + endDrag.x - startDrag.x),
								(int) (tr.getLine().getStartY() + endDrag.y - startDrag.y),
								(int) (tr.getLine().getEndX() + endDrag.x - startDrag.x),
								(int) (tr.getLine().getEndY() + endDrag.y - startDrag.y));
					}
				}
			}
		}
	}
}
