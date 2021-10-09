package pain;

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

public class PannelBott extends JPanel implements KeyListener {
	JLabel status;
	JLabel point;
	JTextArea command1;
	static JTextField command2;
	JPanel command3;
	JScrollPane scrollPane;
	JPanel panel;

	public PannelBott() {

		setFocusable(true);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		command1 = new JTextArea(5, 5);
		command1.setBorder(BorderFactory.createEtchedBorder());
		command1.setEditable(false);
		command2 = new JTextField();
		command2.setText("Comment ở đây ... nhấn Enter để send/tạo pannel và set color cho pannel vs pen");
		command3 = new JPanel();
		command3.setLayout(new GridLayout());
		scrollPane = new JScrollPane(command1);
		command1.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 0, Color.BLACK));
		add(panel);
		command2.setFont(new Font("segoe ui", Font.ITALIC, 15));
		command1.setFont(new Font("segoe ui", Font.ITALIC, 15));
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

}
