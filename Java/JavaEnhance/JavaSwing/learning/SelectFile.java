package learning;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class SelectFile extends JFrame implements ActionListener {
	JButton button;

	public SelectFile() {

		 button = new JButton("select a file");

		button.addActionListener(this);
		this.add(button);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLayout(new FlowLayout());
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new SelectFile();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			JFileChooser fileChoose = new JFileChooser();
//			int response = fileChoose.showOpenDialog(null);// select file to open
			int response = fileChoose.showSaveDialog(null);// select file to save
			System.out.println(response);
			if(response==JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChoose.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}

}
