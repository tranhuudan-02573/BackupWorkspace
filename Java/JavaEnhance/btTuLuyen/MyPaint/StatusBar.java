package MyPaint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class StatusBar extends JPanel implements KeyListener {
	JLabel status;
	JLabel point;
	JLabel color;
	JLabel slider;
	JTextArea command1;
	JTextField command2;
	JPanel command3;
	JScrollPane scrollPane;
	JPanel panel;

	public StatusBar() {
		setFocusable(true);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		command1 = new JTextArea(5, 5);
		command1.setBorder(BorderFactory.createEtchedBorder());
		command1.setEditable(false);
		command2 = new JTextField();
		command2.setText("Comment ở đây ... nhấn Enter để send");
		command3 = new JPanel();
		command3.setLayout(new GridLayout());
		scrollPane = new JScrollPane(command1);
		command1.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 0, Color.BLACK));
		add(panel);
		command2.setFont(new Font("segoe ui", Font.ITALIC, 15));
		command1.setFont(new Font("segoe ui", Font.ITALIC, 20));
		panel.add(scrollPane, BorderLayout.CENTER);
		status = new JLabel("ready...", JLabel.CENTER);
		command3.add(status);
		status.setForeground(Color.red);
		status.setFont(new Font("segoe ui", Font.ITALIC, 15));

		panel.add(command2, BorderLayout.SOUTH);
		point = new JLabel("x: 0" + "  y: 0", JLabel.CENTER);
		command3.add(point);
		point.setForeground(Color.red);
		point.setFont(new Font("segoe ui", Font.ITALIC, 15));
		command3.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(),
				new MatteBorder(0, 2, 0, 2, Color.black)));
		command2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(),
				new MatteBorder(0, 0, 0, 2, Color.black)));
		color = new JLabel("Color: ", JLabel.CENTER);
		color.setText("Color: null");
		command3.add(color);
		color.setFont(new Font("segoe ui", Font.ITALIC, 15));
		color.setForeground(Color.red);
		slider = new JLabel("size: ", JLabel.CENTER);
		command3.add(slider);
		slider.setForeground(Color.red);
		slider.setFont(new Font("segoe ui", Font.ITALIC, 15));
		add(command3);
		command2.addKeyListener(this);
		setVisible(true);
	}

	public void setMessage(String text) {
		this.status.setText(text);

	}

	public void setPoint(int x, int y) {
		this.point.setText("x: " + x + "  y: " + y);
	}

	public void setColor(Color color) {
		this.color.setText("Color: " + color);
	}

	public void setSlider(int slider) {
		this.slider.setText("size: " + slider);
	}

	public void setCommand() {
//		AShape.command();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case 10:
			if (command2.getText() == "")
				return;
			else {
				command1.setText(command1.getText() + "\n\n-" + command2.getText());
				command2.setText("Comment ở đây ... nhấn Enter để send");
			}

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void setTextArea(String string) {
		// TODO Auto-generated method stub
		command1.setText(command1.getText() + string);
	}

}
