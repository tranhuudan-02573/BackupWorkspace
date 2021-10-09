package learning;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxes extends JFrame implements ActionListener {
	JComboBox comboBox;

	ComboBoxes() {
		String[] animals = { "dog", "cay", "bird" };
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		comboBox.addItem("hourse");
		
		System.out.println(comboBox.getItemCount());
		
		comboBox.setEditable(true);
		comboBox.insertItemAt("pig", 0);
		comboBox.setSelectedIndex(0);
		comboBox.removeItem("cat");
		comboBox.removeItemAt(0);
//		comboBox.removeAllItems();
		this.add(comboBox);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
			System.out.println(comboBox.getSelectedIndex());
		}

	}

	public static void main(String[] args) {
		new ComboBoxes();
	}

}
