package learning;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MySildes implements ChangeListener {

	JFrame frame;
	JPanel pannel;
	JLabel label;
	JSlider slider;

	MySildes() {
		frame = new JFrame("silder demo");
		pannel = new JPanel();
		label = new JLabel();
		slider = new JSlider();

		slider.setPreferredSize(new Dimension(400, 200));
//gach
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
// don vi cach nhau moi vach
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(10);
// so hien thi
		slider.setPaintLabels(true);

		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		label.setFont(new Font("MV Boli", Font.PLAIN, 15));
// cho slide nam doc
		slider.setOrientation(SwingConstants.VERTICAL);
//		slider.setOrientation(SwingConstants.HORIZONTAL);

		label.setText("*C= " + slider.getValue());

		slider.addChangeListener(this);

		pannel.add(slider);
		pannel.add(label);
		frame.add(pannel);
		frame.setSize(420, 420);
		frame.setVisible(true);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("*C= " + slider.getValue());
	}

	public static void main(String[] args) {
		new MySildes();
	}

}
