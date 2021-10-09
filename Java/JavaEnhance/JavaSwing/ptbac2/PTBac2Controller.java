
package ptbac2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class PTBac2Controller {
	private PTBac2View view;
	private float hangsoA;
	private float hangsoB;
	private float hangsoC;

	public PTBac2Controller(PTBac2View view) {
		this.view = view;
		view.getBtnKetQua().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (validateHangSoA() && validateHangSoB() && validateHangSoC()) {
					view.getTextArea().setText(giaiPTBac2(hangsoA, hangsoB, hangsoC));
				} else {
					view.getTextArea().setText("");
				}
			}
		});
		view.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}

	private static String giaiPTBac2(float a, float b, float c) {
		String ketqua = null;

		// kiểm tra các hệ số
		if (a == 0) {
			if (b == 0) {
				ketqua = "Phương trình vô nghiệm!";
			} else {
				ketqua = "Phương trình có một nghiệm: " + "x = " + (-c / b);
			}
		}
		// tính delta
		float delta = b * b - 4 * a * c;
		float x1;
		float x2;
		// tính nghiệm
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			ketqua = "Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2;
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			ketqua = "Phương trình có nghiệm kép: " + "x1 = x2 = " + x1;
		} else {
			ketqua = "Phương trình vô nghiệm!";
		}

		return ketqua;
	}

	private boolean validateHangSoA() {
		boolean isValid = false;
		try {
			if (!"".equals(view.getTextFieldA().getText())) {
				hangsoA = Float.parseFloat(view.getTextFieldA().getText());
				isValid = true;
			} else {
				JOptionPane.showMessageDialog(view, "Hằng số a không được trống.");
			}
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(view, "Hằng số a không hợp lệ.");
		}
		return isValid;
	}

	private boolean validateHangSoB() {
		boolean isValid = false;
		try {
			if (!"".equals(view.getTextFieldB().getText())) {
				hangsoB = Float.parseFloat(view.getTextFieldB().getText());
				isValid = true;
			} else {
				JOptionPane.showMessageDialog(view, "Hằng số b không được trống.");
			}
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(view, "Hằng số b không hợp lệ.");
		}
		return isValid;
	}

	private boolean validateHangSoC() {
		boolean isValid = false;
		try {
			if (!"".equals(view.getTextFieldC().getText())) {
				hangsoC = Float.parseFloat(view.getTextFieldC().getText());
				isValid = true;
			} else {
				JOptionPane.showMessageDialog(view, "Hằng số c không được trống.");
			}
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(view, "Hằng số c không hợp lệ.");
		}
		return isValid;
	}

	public PTBac2View getView() {
		return view;
	}

	public void setView(PTBac2View view) {
		this.view = view;
	}
}
