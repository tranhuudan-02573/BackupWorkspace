package learning;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

public class MyKeyBinding {
	JFrame frame;
	JLabel label;
	Action upAction;
	Action rightAction;
	Action leftAction;
	Action downAction;

	MyKeyBinding() {
		frame = new JFrame("KeyBinđing demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420, 420);

		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();

		label = new JLabel();
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.setBounds(100, 100, 100, 100);

		label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
		label.getActionMap().put("upAction", upAction);

		label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
		label.getActionMap().put("downAction", downAction);

		label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
		label.getActionMap().put("leftAction", leftAction);

		label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
		label.getActionMap().put("rightAction", rightAction);

		frame.add(label);

		frame.setVisible(true);

	}

	public class UpAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY() - 10);
			System.out.println("w");
		}

	}

	public class DownAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY() + 10);
			System.out.println("s");
		}

	}

	public class LeftAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX() - 10, label.getY());
			System.out.println("a");
		}

	}

	public class RightAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX() + 10, label.getY());
			System.out.println("d");
		}

	}

	public static void main(String[] args) {
		new MyKeyBinding();
	}
}
