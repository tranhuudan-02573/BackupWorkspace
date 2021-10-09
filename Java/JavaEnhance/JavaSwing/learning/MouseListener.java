package learning;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListener extends JFrame implements java.awt.event.MouseListener {
	JLabel label;
	ImageIcon icon1, icon2, icon3, icon4;

	public MouseListener() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		label = new JLabel();
//		label.setBounds(0, 0, 100, 100);
//		label.setBackground(Color.red);

//		this.pack();
//		this.setLocationRelativeTo(null);

		label.addMouseListener(this);

		icon1 = new ImageIcon(new ImageIcon("./JavaSwing/learning/_rock.png").getImage().getScaledInstance(100, 100, 100));
		icon2 = new ImageIcon(new ImageIcon("./JavaSwing/learning/rocket.jpg").getImage().getScaledInstance(100, 100, 100));
		icon3 = new ImageIcon(new ImageIcon("./JavaSwing/learning/rocketIcon.png").getImage().getScaledInstance(100, 100, 100));
		icon4 = new ImageIcon(new ImageIcon("./JavaSwing/learning/rocket-icon.[ng").getImage().getScaledInstance(100, 100, 100));
		label.setIcon(icon1);
		this.add(label);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListener();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you click the mouse");
//		label.setBackground(Color.yellow);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you press the mouse");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you release the mouse");
//		label.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you enter the mouse");
//		label.setBackground(Color.blue);
		label.setIcon(icon3);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you exit the mouse");
//		label.setBackground(Color.red);
		label.setIcon(icon1);
	}

}
