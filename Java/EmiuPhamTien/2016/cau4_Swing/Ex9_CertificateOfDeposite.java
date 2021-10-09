package cau4_Swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import cau3_OOP.CertificateOfDeposite;

public class Ex9_CertificateOfDeposite extends JFrame implements ActionListener {
	private JButton jbtAdd;
	private JButton jbtClear;
	private JTextField jtfId;
	private JTextField jtfName;
	private JTextField jtfMinimum;
	private JTextField jtfCurrent;
	private JTextArea jta;
	private ArrayList<CertificateOfDeposite> accounts = new ArrayList<CertificateOfDeposite>();
	private String st;
	private JTextField jtfMaturity;

	public Ex9_CertificateOfDeposite() {
		setTitle("Certificate Of Deposite");
		setLayout(new BorderLayout());
		ImageIcon iconAdd = new ImageIcon(getClass().getResource("/images/cong.PNG"));
		ImageIcon iconClear = new ImageIcon(getClass().getResource("/images/nhan.PNG"));

		// JToolbar
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		toolBar.add(jbtAdd = new JButton("Add", iconAdd));
		toolBar.add(jbtClear = new JButton("Clear", iconClear));

		// Panel Center
		JPanel pnCenter = new JPanel(new GridLayout(2, 1));
		add(pnCenter, BorderLayout.CENTER);
		// Panel nhap thong tin
		JPanel pnOption = new JPanel(new GridLayout(5, 2, 0, 10));
		pnCenter.add(pnOption);
		pnOption.add(new JLabel("     ID"));
		pnOption.add(jtfId = new JTextField());
		pnOption.add(new JLabel("     Name"));
		pnOption.add(jtfName = new JTextField());
		pnOption.add(new JLabel("     Interest Rate"));
		pnOption.add(jtfMinimum = new JTextField());
		pnOption.add(new JLabel("     Current Balance"));
		pnOption.add(jtfCurrent = new JTextField());
		pnOption.add(new JLabel("     Maturity"));
		pnOption.add(jtfMaturity = new JTextField());

		// Panel text area
		pnCenter.add(jta = new JTextArea());
		jta.setBorder(BorderFactory.createTitledBorder("Certificate Of Deposite"));
		jta.setEditable(false);
		st = "ID\t\tName\t\tIR(%) \t\t CB\t\tMaturity\n";
		jta.setText(st);
		pnCenter.add(new JScrollPane(jta));

		// event
		jbtAdd.addActionListener(this);
		jbtClear.addActionListener(this);

		// for jframe
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(700, 400);
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtAdd) {
			try {
				int id = Integer.parseInt(jtfId.getText());
				String name = jtfName.getText();
				int ir = Integer.parseInt(jtfMinimum.getText());
				double cb = Double.parseDouble(jtfCurrent.getText());
				String[] str = jtfMaturity.getText().split("/");
				int day = Integer.parseInt(str[0]);
				int month = Integer.parseInt(str[1]);
				int year = Integer.parseInt(str[2]);
				if (day >= 1 && day <= 31 && month >= 1 && month <= 12) {
					Date date = new Date(day, month, year);
					CertificateOfDeposite account = new CertificateOfDeposite(name, id, cb, ir, date);
					accounts.add(account);
					jta.setText(st + toString());
				} else {
					JOptionPane.showMessageDialog(null, "Sai dinh dang thong tin Date");
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Sai dinh dang thong tin");
			}
		}
		if (e.getSource() == jbtClear) {
			jtfId.setText("");
			jtfCurrent.setText("");
			jtfMinimum.setText("");
			jtfName.setText("");
			jtfMaturity.setText("");
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (CertificateOfDeposite certificateOfDeposite : accounts) {
			sb.append(certificateOfDeposite.toString() + "\n");
		}
		return sb.toString();
	}
}
