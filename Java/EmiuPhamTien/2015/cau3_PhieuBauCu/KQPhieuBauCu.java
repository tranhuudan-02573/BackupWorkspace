package cau3_PhieuBauCu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class KQPhieuBauCu extends JPanel {
	private JPanel pnCol1;
	private JPanel pnCol2;
	private JPanel pnCol3;
	private JTextArea taPhuong;
	private JTextArea taQuan;
	private JTextArea taTP;
	private JButton jbtThoat;
	JFrame_PBC frame;

	public KQPhieuBauCu(JFrame_PBC frame) {
		this.frame = frame;
		setLayout(new BorderLayout());
		// title
		JLabel jlbTitle;
		add(jlbTitle = new JLabel("KẾT QUẢ PHIẾU BẦU", JLabel.LEFT), BorderLayout.NORTH);
		jlbTitle.setFont(new Font("", Font.BOLD, 30));

		// panel center
		JPanel pnCenter = new JPanel(new GridLayout(1, 3));
		add(pnCenter);
		Border border2 = BorderFactory.createLineBorder(Color.BLUE);
		Border borderPhuong = BorderFactory.createTitledBorder(border2, "PHƯỜNG");
		Border borderQuon = BorderFactory.createTitledBorder(border2, "QUẬN");
		Border borderTP = BorderFactory.createTitledBorder(border2, "THÀNH PHỐ");
		// panel col1
		pnCol1 = new JPanel(new BorderLayout());
		pnCenter.add(pnCol1);
		pnCol1.setBorder(borderPhuong);
		pnCol1.add(taPhuong = new JTextArea(PhieuBauCu.toString(PhieuBauCu.listPhuong)));
		taPhuong.setEditable(false);
		// panel col2
		pnCol2 = new JPanel(new BorderLayout());
		pnCenter.add(pnCol2);
		pnCol2.setBorder(borderQuon);
		pnCol2.add(taQuan = new JTextArea(PhieuBauCu.toString(PhieuBauCu.listQuan)));
		taQuan.setEditable(false);
		// panel col3
		pnCol3 = new JPanel(new BorderLayout());
		pnCenter.add(pnCol3);
		pnCol3.setBorder(borderTP);
		pnCol3.add(taTP = new JTextArea(PhieuBauCu.toString(PhieuBauCu.listTP)));
		taTP.setEditable(false);

		// button Thoat
		JPanel jpnRow3 = new JPanel();
		add(jpnRow3, BorderLayout.SOUTH);
		jpnRow3.add(jbtThoat = new JButton("THOÁT"));
		jbtThoat.setFont(new Font("", Font.BOLD, 18));

		jbtThoat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(frame.bauCu);
				frame.display();
			}
		});
	}
}
