package MimiAutoCAD;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D.Double;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DrawingPanel extends JPanel {
	int indexResizeCode;
	int mode;
	Color dark, light;
	StatusBarMiniAutoCAD statusBarMiniAutoCAD;
	ArrayList<ShapeCAD> shapes = new ArrayList<ShapeCAD>();
	Point p = new Point(0, 0);
	String command = "Select";
	Point movePoint = new Point(0, 0);
	Point drawgedPoint;
	static ShapeCAD shapeTemp;
	static ShapeCAD shape;
	static int i = 1;
	int j = 1;
	static Point[] pointClick = new Point[2];
	Point clickResize, clickMove;
	boolean checkMove = false;

	public DrawingPanel(int mode, StatusBarMiniAutoCAD statusBarMiniAutoCAD) {
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.statusBarMiniAutoCAD = statusBarMiniAutoCAD;
		this.mode = mode;
		dark = new Color(0, 0, 0, 150);
		light = new Color(240, 240, 240, 200);
		setFocusable(true);
		addMouseMotionListener(mouseAdapter());
		addMouseListener(mouseAdapter());
	}

	private MouseAdapter mouseAdapter() {
		return new MouseAdapter() {

			@Override
			public void mouseMoved(MouseEvent e) {
				movePoint = e.getPoint();
				// ve lai cac hinh khi resize
				if (command.equals("Select")) {

					if (clickResize != null)
						for (ShapeCAD shape : shapes) {
							if (shape.isSelect() && shape.isTaget()) {
								// thỏa mãn 2 điều kiện để chọn đúng hình đang taget
								if (indexResizeCode != 0) {// indexResizeCode dùng để lưu lại ResizeCode từ Click
									shapeTemp = shape;
									shapeTemp.reSize(indexResizeCode, movePoint);
								}

							}
							if (checkMove && shape.isTaget()) {
								shapeTemp = shape;
								shapeTemp.move(movePoint);
//							break;
							}
						}

				}
				// ve cac hinh tam
				if (!isFunction()) {
					if (pointClick[0] != null) {
						shapeTemp = getShape(pointClick[0], movePoint);
					}
				}
				repaint();

			}

			int countSelect = 0;

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Rectangle2D rec = new Rectangle2D.Double(e.getPoint().x - 2, e.getPoint().y - 2, 5, 5);
				// 1 ô vuông nhỏ vô hình được tạo ra ở đầu chuột để xác định sự giao nhau
				statusBarMiniAutoCAD.setTextArea(e.getPoint().toString() + "click\n");

				// điều kiện để chọn hình
				for (ShapeCAD shape : shapes) {
					if (shape.getBounds().intersects(rec) && !shape.getBounds().contains(rec)) {
						shape.setSelect(true);
						for (ShapeCAD shape1 : shapes) {
							shape1.setTaget(false);
						}
						shape.setTaget(true);
					}
					if (shape.isSelect() && shape.isMove(e.getPoint())) {
						for (ShapeCAD shape1 : shapes) {
							shape1.setTaget(false);
						}
						shape.setTaget(true);
					}

				}

				if (command.equals("Select")) {
					clickResize = e.getPoint();
					clickMove = e.getPoint();
					for (ShapeCAD shape : shapes) {

						// Resize hinh
						if (shape.isSelect() && shape.isTaget()) {
							// Điêu kiện để chọn đúng 1 hình ngay con tro chuot
							if (i == 0) {// nếu i = 0, đặc lại kích thước của hinh ,( i=1 là chỉ só ban đầu)
								shape.reSize(indexResizeCode, clickResize);
								indexResizeCode = 0; // đăc lại ResizeCode
								i = 1 - i; // đặc lại i
								shapeTemp = null; // đặc lại hình tạm
								clickResize = null; // đặc lại click
							}
							if (clickResize == null)
								continue; // dòng này là dể khi set dc hình rồi thì ngăn không cho lưu resizecode nữa
							if (shape.resizeCode(clickResize) != 0) {// resizeCode đại diện cho 4 vị trí có thể resize
																		// hình
								indexResizeCode = shape.resizeCode(clickResize);// lưu lại resizeCode để vẽ hình tạm
								i = 1 - i; // nếu có chấm xanh được chọn, i -> 0 sẵn sàng để click tiếp theo đặc lại
											// kích thước mới của hình
							}
						}

						// Move hinh
						//
						if (shape.isSelect() && shape.isTaget()) {
							if (j == 0) {
								j = 1 - j;
								shape.move(clickMove);
								shapeTemp = null;
								clickMove = null;
								checkMove = false;
//								continue;

							}
							if (clickMove == null)
								continue;
							if (shape.isMove(clickResize)) {
//								System.out.println("chon dc diem move");
								checkMove = shape.isMove(clickResize);
								j = 1 - j;
							}
						}

					}

				}
				if (!isFunction()) { // !isfunction = isShape
					i = 1 - i; // luân phiên 0 và 1 để dưa dự liệu vào mảng pointclick[]
					pointClick[i] = e.getPoint();

					if (i == 1) {
						if (pointClick[1] != null) {
							shape = getShape(pointClick[0], pointClick[1]);
//					shape.setP2(pointClick[1]);
							shapes.add(shape);
							statusBarMiniAutoCAD.setTextArea("Drawed ! \n");
							pointClick[0] = null;
							pointClick[1] = null;
						}
						shapeTemp = null;
					}
//					System.out.println("is fun");
				}

				repaint();
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
//			System.out.println(e.getPoint().toString()+"dragged");
//			statusBarMiniAutoCAD.setTextArea(e.getPoint().toString()+"dragged\n");
				drawgedPoint = e.getPoint();

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
//			System.out.println(e.getPoint().toString()+"press");
//			statusBarMiniAutoCAD.setTextArea(e.getPoint().toString()+"press\n");

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseReleased(e);
//			System.out.println(e.getPoint().toString()+"release");
//			statusBarMiniAutoCAD.setTextArea(e.getPoint().toString()+"released\n");

			}

			private ShapeCAD getShape(Point p1, Point p2) {
				// TODO Auto-generated method stub
				if (command.equals("Line")) {
					shape = new LineCAD(p1, p2, Color.WHITE, false, false, false);
//					Line2D line = new Line2D.Double(p1, p2);
				}
				if (command.equals("Circle")) {
					shape = new CircleCAD(p1, p2, Color.WHITE, false, false, false);
				}
				if (command.equals("Rectange")) {
					shape = new RectangeCAD(p1, p2, Color.WHITE, false, false, false);
				}
				return shape;
			}

		};
	}

	public boolean isFunction() {
		return command.equals("Delete") || command.equals("Select") ||
//				command.equals("Chose Color")&&
				command.equals("Cancel");
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	private void darkMode(Graphics g) {
		this.setBackground(new Color(40, 40, 40));
//System.out.println(Color.DARK_GRAY.toString());
		Color white50 = new Color(200, 200, 200, 100);// 50 do mo cua line
		Color white25 = new Color(200, 200, 200, 50);// 25 do mo cua line
		drawPaperLine(g, 50, white50, white25);
	}

	private void lightMode(Graphics g) {

		this.setBackground(Color.WHITE);
		Color black50 = new Color(0, 0, 0, 100);// 50 do mo cua line
		Color black25 = new Color(0, 0, 0, 50);// 25 do mo cua line
		drawPaperLine(g, 50, black50, black25);

	}

	private void drawCursor(Point p, Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.setStroke(new BasicStroke(1.5f));
		if (mode == 1)
			g2d.setColor(Color.white);
		else
			g2d.setColor(Color.black);

		g2d.drawLine(p.x, 0, p.x, getHeight());
		g2d.drawLine(0, p.y, getWidth(), p.y);
		// highlights
		if (command.equals("Select")) {
			Rectangle2D rec = new Rectangle2D.Double(p.x - 2, p.y - 2, 5, 5);
			for (ShapeCAD shape : shapes) {
				if (shape.getBounds().intersects(rec) && !shape.getBounds().contains(rec)) {
					shape.highlights = true;
				} else
					shape.highlights = false;
			}
		}

	}

	private void drawPaperLine(Graphics g, int pixel, Color cl1, Color cl2) {
// draw big line
		g.setColor(cl1);// color of bigLine
		for (int i = pixel; i < getHeight(); i += pixel) {// pixel do day cua line
			g.drawLine(0, i, getWidth(), i);
		}
		for (int i = pixel; i < getWidth(); i += pixel) {
			g.drawLine(i, 0, i, getHeight());
		}
		// draw small line
		g.setColor(cl2);// color of smallLine
		for (int i = pixel / 5; i < getHeight(); i += pixel / 5) {
			g.drawLine(0, i, getWidth(), i);
		}
		for (int i = 10; i < getWidth(); i += 10) {
			g.drawLine(i, 0, i, getHeight());
		}
	}

	private void drawOxy(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.red);
		g2d.setStroke(new BasicStroke(5.0f));
		g2d.drawLine(10, 10, 50, 10);
		g2d.setColor(Color.GREEN);
		g2d.drawLine(10, 10, 10, 50);
		g2d.setColor(Color.BLUE);
		g2d.drawRect(10, 10, 3, 3);
		if (mode == 1)
			g2d.setColor(Color.GREEN);
		else
			g2d.setColor(Color.BLUE);

		g2d.drawString("Y", 15, 55);
		g2d.drawString(new String("X"), 55, 25);
	}

	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		if (mode == 0) {
			lightMode(g);
		} else
			darkMode(g);
		drawOxy(g);

		drawCursor(movePoint, g2d);

		g2d.setColor(Color.WHITE);
		g2d.setStroke(new BasicStroke(2.0f));
		for (ShapeCAD shape : shapes) {

			if (shape.isHighlights())
				shape.drawHighlights(g2d);
			shape.draw(g2d);
			if (shape.isSelect())
				shape.drawIfSelect(g2d);

		}
		try {
			if (shapeTemp != null)
				g2d.setStroke(new BasicStroke(0.5f));
			shapeTemp.draw(g2d);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
