package cau2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class Information extends JFrame implements ActionListener {

	private String[] hocSinh = { "Phân ban", "Không phân ban" };
	private String[] sinhVien = { "Kỹ thuật", "Xã hội" };
	private String[] kySU = { "Cơ khí", "CNTT" };
	private JComboBox<String> jcbb;
	private JRadioButton jrbHS;
	private JRadioButton jrbSV;
	private JRadioButton jrbKS;
	private JCheckBox jcbDB;
	private JCheckBox jcbDS;
	private JCheckBox jcbNN;
	private JLabel jlbInf;
	private String text = "";

	public Information(String title) {
		super(title);
		setLayout(new BorderLayout());

		// panel center
		JPanel jpnCenter = new JPanel(new GridLayout(4, 2));
		add(jpnCenter, BorderLayout.CENTER);
		jpnCenter.add(new JLabel("Nghề nghiệp"));
		jpnCenter.add(jcbb = new JComboBox<String>(hocSinh));
		jpnCenter.add(jrbHS = new JRadioButton("Học sinh"));
		jrbHS.setSelected(true);
		jpnCenter.add(jcbDB = new JCheckBox("Đọc báo"));
		jpnCenter.add(jrbSV = new JRadioButton("Sinh viên"));
		jpnCenter.add(jcbDS = new JCheckBox("Đọc sách"));
		jpnCenter.add(jrbKS = new JRadioButton("Kỹ Sư"));
		jpnCenter.add(jcbNN = new JCheckBox("Nghe nhạc"));
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jrbHS);
		buttonGroup.add(jrbSV);
		buttonGroup.add(jrbKS);

		// panel south
		JPanel jpnSouth = new JPanel();
		add(jpnSouth, BorderLayout.SOUTH);
		jpnSouth.setBackground(Color.WHITE);
		jpnSouth.add(jlbInf = new JLabel("      "));

		// event
		jrbHS.addActionListener(this);
		jrbSV.addActionListener(this);
		jrbKS.addActionListener(this);
		jcbb.addActionListener(this);
		jcbDB.addActionListener(this);
		jcbDS.addActionListener(this);
		jcbNN.addActionListener(this);

		// for frame
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 170);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Information("Input Frame");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String docBao = "";
		String docSach = "";
		String ngheNhac = "";
		String comBoBox = "";
		if (e.getSource() == jrbHS) {
			jcbb.removeAllItems();
			for (int i = 0; i < hocSinh.length; i++) {
				jcbb.addItem(hocSinh[i]);
			}
			text = "Học sinh ";
		}

		if (e.getSource() == jrbSV) {
			jcbb.removeAllItems();
			for (int i = 0; i < sinhVien.length; i++) {
				jcbb.addItem(sinhVien[i]);
			}
			text = "Sinh viên ";
		}

		if (e.getSource() == jrbKS) {
			jcbb.removeAllItems();
			for (int i = 0; i < kySU.length; i++) {
				jcbb.addItem(kySU[i]);
			}
			text = "Kỹ sư ";
		}

		for (int i = 0; i < 2; i++) {
			if (jcbb.getSelectedIndex() == i) {
				System.out.println(jcbb.getSelectedIndex());
				comBoBox = jcbb.getSelectedItem().toString();
				if (jcbDB.isSelected()) {
					docBao = " Đọc báo,";
				}
				if (jcbDS.isSelected()) {
					docSach = " Đọc sách,";
				}
				if (jcbNN.isSelected()) {
					ngheNhac = " Nghe nhạc,";
				}

				String st = text + comBoBox + " thích:" + docBao + docSach + ngheNhac;
				StringBuffer sb = new StringBuffer();
				char[] ch = st.toCharArray();
				for (int j = 0; j < ch.length; j++) {
					if (ch[ch.length - 1] == ',') {
						if (j < ch.length - 1) {
							sb.append(ch[j]);
						}
					} else
						sb.append(ch[j]);
				}
				jlbInf.setText(sb.toString());
			}
		}
	}
}
