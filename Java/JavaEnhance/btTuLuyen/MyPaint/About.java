package MyPaint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class About extends JFrame {
	private JPanel contentPane;

	public About() {
		setTitle("About");
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setFont(new Font("Arial", Font.ITALIC, 25));
				g.setColor(Color.BLUE);
				g.drawImage(new ImageIcon(new ImageIcon("./btTuLuyen/MyPaint/author.png").getImage()
						.getScaledInstance(contentPane.getWidth(), contentPane.getHeight(), Image.SCALE_SMOOTH))
								.getImage(),
						0, 0, this);
				g.drawString("About Application ", 120, 40);
				g.drawString("Design by Tran Huu Dan ", 90, 100);
				g.drawString("MSSV: 20130218", 120, 140);
				g.drawString("Class: DH20DT", 130, 180);
				g.drawString("Date: 04/11/202", 125, 220);
			}
		};
		;
		add(contentPane);

	}

}
