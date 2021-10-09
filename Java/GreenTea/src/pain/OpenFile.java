package pain;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class OpenFile extends JFrame {
	public static BufferedImage image;
	private BufferedReader br;

	public OpenFile() throws ClassNotFoundException {
		JFileChooser fc = new JFileChooser();
		fc.addChoosableFileFilter(new pngSaveFilter());
		fc.addChoosableFileFilter(new txtSaveFilter());
		int result = fc.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			if (fc.getSelectedFile().getName().endsWith(".png")) {
				try {
					image = ImageIO.read(fc.getSelectedFile());
					MainPaint.frame.repaint();
				} catch (IOException ex) {
				}
			} else if (fc.getSelectedFile().getName().endsWith(".txt")) {
				try {
					FileInputStream k = new FileInputStream(fc.getSelectedFile());
					InputStreamReader in = new InputStreamReader(k);
					br = new BufferedReader(in);
					String t = br.readLine();
					if (t == null) {
						System.out.println("File rong, chua co du lieu!");
					} else {
						while (t != null) {
							String[] a = t.split(";");
							if (a[0].equals("MyRectangle") || a[0].equals("MySquare")) {
								MyRectangle r = new MyRectangle();
								r.makeRectangle(Integer.parseInt(a[1].toString()), Integer.parseInt(a[2].toString()),
										Integer.parseInt(a[3].toString()), Integer.parseInt(a[4].toString()));
								r.setLineColor(new Color(Integer.parseInt(a[5]), Integer.parseInt(a[6]),
										Integer.parseInt(a[7])));
								if (a[8].equals("null")) {
									r.setColor(null);
								} else {
									r.setColor(new Color(Integer.parseInt(a[8]), Integer.parseInt(a[9]),
											Integer.parseInt(a[10])));
								}
								PannelCenter.paint.add(r);
								MainPaint.frame.repaint();
							} else if (a[0].equals("MyOval") || a[0].equals("MyCircle")) {
								MyOval r = new MyOval();
								r.makeOval(Integer.parseInt(a[1]), Integer.parseInt(a[2]), Integer.parseInt(a[3]),
										Integer.parseInt(a[4]));
								r.setLineColor(new Color(Integer.parseInt(a[5]), Integer.parseInt(a[6]),
										Integer.parseInt(a[7])));
								if (a[8].equals("null")) {
									r.setColor(null);
								} else {
									r.setColor(new Color(Integer.parseInt(a[8]), Integer.parseInt(a[9]),
											Integer.parseInt(a[10])));
								}
								PannelCenter.paint.add(r);
								MainPaint.frame.repaint();
							} else if (a[0].equals("MyTriangle")) {
								MyTriangle r = new MyTriangle();
								r.makeTriangle(Integer.parseInt(a[1]), Integer.parseInt(a[2]), Integer.parseInt(a[3]),
										Integer.parseInt(a[4]));
								r.setLineColor(new Color(Integer.parseInt(a[5]), Integer.parseInt(a[6]),
										Integer.parseInt(a[7])));
								if (a[8].equals("null")) {
									r.setColor(null);
								} else {
									r.setColor(new Color(Integer.parseInt(a[8]), Integer.parseInt(a[9]),
											Integer.parseInt(a[10])));
								}
								PannelCenter.paint.add(r);
								MainPaint.frame.repaint();
							} else if (a[0].equals("MyLine")) {
								Point startPoint = new Point(Integer.parseInt(a[1]), Integer.parseInt(a[2]));
								Point endPoint = new Point(Integer.parseInt(a[3]), Integer.parseInt(a[4]));
								MyLine r = new MyLine(startPoint, endPoint);
								r.setColor(new Color(Integer.parseInt(a[5]), Integer.parseInt(a[6]),
										Integer.parseInt(a[7])));
								PannelCenter.paint.add(r);
								MainPaint.frame.repaint();
							} else if (a[0].equals("MyPoint")) {
								MyPoint r = new MyPoint();
								r.setPoint(new Point(Integer.parseInt(a[1]), Integer.parseInt(a[2])));
								r.setColor(new Color(Integer.parseInt(a[3]), Integer.parseInt(a[4]),
										Integer.parseInt(a[5])));
								PannelCenter.paint.add(r);
								MainPaint.frame.repaint();
							}
							t = br.readLine();
						}
					}

				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
