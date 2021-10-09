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

import cau3_OOP.CheckingAccount;

public class Ex9_CheckingAccount extends JFrame implements ActionListener {
	private JButton jbtAdd;
	private JButton jbtClear;
	private JTextField jtfId;
	private JTextField jtfName;
	private JTextField jtfMinimum;
	private JTextField jtfCurrent;
	private JTextArea jta;
	private ArrayList<CheckingAccount> accounts = new ArrayList<CheckingAccount>();
	private String st;

	public Ex9_CheckingAccount() {
		setTitle("Checking Account");
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
		JPanel pnOption = new JPanel(new GridLayout(4, 2, 0, 20));
		pnCenter.add(pnOption);
		pnOption.add(new JLabel("     ID"));
		pnOption.add(jtfId = new JTextField());
		pnOption.add(new JLabel("     Name"));
		pnOption.add(jtfName = new JTextField());
		pnOption.add(new JLabel("     Minimum"));
		pnOption.add(jtfMinimum = new JTextField());
		pnOption.add(new JLabel("     Current Balance"));
		pnOption.add(jtfCurrent = new JTextField());

		// Panel text area
		pnCenter.add(jta = new JTextArea());
		jta.setBorder(BorderFactory.createTitledBorder("Checking Account Infomation"));
		jta.setEditable(false);
		st = "ID\t\tName\t\tMB \t\t CB\n";
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
				double mb = Double.parseDouble(jtfMinimum.getText());
				double cb = Double.parseDouble(jtfCurrent.getText());
				CheckingAccount account = new CheckingAccount(name, id, cb, mb);
				accounts.add(account);
				jta.setText(st + toString());

			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Sai dinh dang thong tin");
			}
		}
		if (e.getSource() == jbtClear) {
			jtfId.setText("");
			jtfCurrent.setText("");
			jtfMinimum.setText("");
			jtfName.setText("");
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (CheckingAccount checkingAccount : accounts) {
			sb.append(checkingAccount.toString() + "\n");
		}
		return sb.toString();
	}
}
