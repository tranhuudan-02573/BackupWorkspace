package cau4_Swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Ex9_Bank extends JFrame implements ActionListener {
	private JMenuItem mnItemChecking;
	private JMenuItem mnItemSavings;
	private JMenuItem mnItemCertificateOfDeposite;
	private ImageIcon iconBackGruond = new ImageIcon(getClass().getResource("/images/bank.png"));
	private ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/bank1.png"));
	private ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/bank2.png"));
	private ImageIcon icon3 = new ImageIcon(getClass().getResource("/images/bank3.png"));
	private JMenuItem mnItemEx;

	public Ex9_Bank() {
		setTitle("Bank Management");
		// menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnManagement;
		menuBar.add(mnManagement = new JMenu("Account Management"));
		JMenu mnExit;
		menuBar.add(mnExit = new JMenu("Exit"));

		mnManagement.add(mnItemChecking = new JMenuItem("Checking Account", icon1));
		mnManagement.add(mnItemSavings = new JMenuItem("Savings Account", icon2));
		mnManagement.add(mnItemCertificateOfDeposite = new JMenuItem("CertificateOfDeposite", icon3));

		mnExit.add(mnItemEx = new JMenuItem("Exit"));
		mnManagement.setMnemonic(KeyEvent.VK_A);
		mnExit.setMnemonic(KeyEvent.VK_E);

		mnItemChecking.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));

		mnItemChecking.addActionListener(this);
		mnItemSavings.addActionListener(this);
		mnItemCertificateOfDeposite.addActionListener(this);
		mnItemEx.addActionListener(this);

		
		// JLabel image
		add(new JLabel(iconBackGruond));

		// for jframe
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Ex9_Bank();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mnItemChecking) {
			new Ex9_CheckingAccount().setVisible(true);
		}
		if (e.getSource() == mnItemSavings) {
			new Ex9_SavingsAccount().setVisible(true);
		}
		if (e.getSource() == mnItemCertificateOfDeposite) {
			new Ex9_CertificateOfDeposite().setVisible(true);
		}
		if (e.getSource() == mnItemEx) {
			System.exit(0);
		}
	}
}
