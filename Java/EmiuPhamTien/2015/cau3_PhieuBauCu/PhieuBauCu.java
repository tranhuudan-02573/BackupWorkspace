package cau3_PhieuBauCu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PhieuBauCu extends JPanel implements ActionListener {
	private JButton jbtBoPhieu;
	private String[] namePhuong = { "Nguyễn Tấn Khôi", "Nguyễn Xí", "Nguyễn Xuân An", "Hồ Thanh Hà" };
	private String[] nameQuan = { "Vũ Thái Hòa", "Đỗ Thị Thanh Hương", "Lâm Quốc Quân", "Hồ Thị Lan", "Nguyễn Văn Kiên",
			"Nguyễn Tấn Phát" };
	private String[] nameTP = { "Lê Vũ Chương", "Nguyễn Hữu Thịnh", "Huỳnh Thành An", "Phạm Văn Cảnh", "Tạ Thị Kim Chi",
			"Đặng Quốc Cường", "Trần Quốc Đạo" };
	private JCheckBox[] cbPhuong = new JCheckBox[namePhuong.length];
	private JCheckBox[] cbQuan = new JCheckBox[nameQuan.length];
	private JCheckBox[] cbTP = new JCheckBox[nameTP.length];
	private JLabel lbPhuong, lbQuan, lbTP;
	private JPanel pnCol1, pnCol2, pnCol3;

	static ArrayList<String> listPhuong = new ArrayList<String>();
	static ArrayList<String> listQuan = new ArrayList<String>();
	static ArrayList<String> listTP = new ArrayList<String>();

	JFrame_PBC frame;

	public PhieuBauCu(JFrame_PBC frame) {
		this.frame = frame;
		setLayout(new BorderLayout());
		// title
		JLabel jlbTitle;
		add(jlbTitle = new JLabel("PHIẾU BẦU CỬ CÁC CẤP", JLabel.CENTER), BorderLayout.NORTH);
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		jlbTitle.setBorder(border1);
		jlbTitle.setBackground(Color.YELLOW);
		jlbTitle.setOpaque(true);

		// panel center
		JPanel pnCenter = new JPanel(new GridLayout(1, 3));
		add(pnCenter);
		Border border2 = BorderFactory.createLineBorder(Color.BLUE);
		Border borderPhuong = BorderFactory.createTitledBorder(border2, "CẤP PHƯỜNG(Chọn 3)");
		Border borderQuon = BorderFactory.createTitledBorder(border2, "CẤP QUẬN(Chọn 4)");
		Border borderTP = BorderFactory.createTitledBorder(border2, "CẤP THÀNH PHỐ(Chọn 5)");
		// panel col1
		pnCol1 = new JPanel();
		pnCenter.add(pnCol1);
		pnCol1.setBorder(borderPhuong);
		// panel col2
		pnCol2 = new JPanel();
		pnCenter.add(pnCol2);
		pnCol2.setBorder(borderQuon);
		// panel col3
		pnCol3 = new JPanel();
		pnCenter.add(pnCol3);
		pnCol3.setBorder(borderTP);

		createJCheckBoxLabel();

		// button Bỏ phiếu
		JPanel jpnRow3 = new JPanel(new BorderLayout());
		add(jpnRow3, BorderLayout.SOUTH);
		jpnRow3.add(jbtBoPhieu = new JButton("Bỏ Phiếu"), BorderLayout.EAST);
		jbtBoPhieu.setFont(new Font("", Font.BOLD, 20));
		// setContentPane Kết quả phiếu bầu
		jbtBoPhieu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				KQPhieuBauCu kqPhieuBauCu = new KQPhieuBauCu(frame);
				frame.setContentPane(kqPhieuBauCu);
				frame.display();
			}
		});

		// list mặc định
		listPhuong.add("Phiếu không hợp lệ");
		listQuan.add("Phiếu không hợp lệ");
		listTP.add("Phiếu không hợp lệ");
	}

	private void createJCheckBoxLabel() {
		// create CheckBox Phường
		pnCol1.setLayout(new GridLayout((namePhuong.length + 1), 1));
		for (int i = 0; i < namePhuong.length; i++) {
			pnCol1.add(cbPhuong[i] = new JCheckBox(namePhuong[i]));
			cbPhuong[i].addActionListener(this);
		}
		pnCol1.add(lbPhuong = new JLabel("Số người đã chọn: 0"));

		// create CheckBox Quận
		pnCol2.setLayout(new GridLayout((nameQuan.length + 1), 1));
		for (int i = 0; i < nameQuan.length; i++) {
			pnCol2.add(cbQuan[i] = new JCheckBox(nameQuan[i]));
			cbQuan[i].addActionListener(this);
		}
		pnCol2.add(lbQuan = new JLabel("Số người đã chọn: 0"));

		// create CheckBox TP
		pnCol3.setLayout(new GridLayout((nameTP.length + 1), 1));
		for (int i = 0; i < nameTP.length; i++) {
			pnCol3.add(cbTP[i] = new JCheckBox(nameTP[i]));
			cbTP[i].addActionListener(this);
		}
		pnCol3.add(lbTP = new JLabel("Số người đã chọn: 0"));
	}

	public static String toString(ArrayList<String> lst) {
		StringBuffer sb = new StringBuffer();
		for (String lt : lst) {
			sb.append(lt + "\n");
		}
		return sb.toString();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Phường
		int count1 = 0;
		listPhuong.clear();
		for (int i = 0; i < cbPhuong.length; i++) {
			if (cbPhuong[i].isSelected()) {
				count1++;
				listPhuong.add(cbPhuong[i].getText());
			}
		}
		lbPhuong.setText("Số người đã chọn: " + count1);

		// Quận
		int count2 = 0;
		listQuan.clear();
		for (int i = 0; i < cbQuan.length; i++) {
			if (cbQuan[i].isSelected()) {
				count2++;
				listQuan.add(cbQuan[i].getText());
			}
		}
		lbQuan.setText("Số người đã chọn: " + count2);

		// Thành phố
		int count3 = 0;
		listTP.clear();
		for (int i = 0; i < cbTP.length; i++) {
			if (cbTP[i].isSelected()) {
				count3++;
				listTP.add(cbTP[i].getText());
			}
		}
		lbTP.setText("Số người đã chọn: " + count3);

		// Phiếu hợp lệ??
		if (count1 != 3 || count2 != 4 || count3 != 5) {
			listPhuong.clear();
			listQuan.clear();
			listTP.clear();
			listPhuong.add("Phiếu không hợp lệ");
			listQuan.add("Phiếu không hợp lệ");
			listTP.add("Phiếu không hợp lệ");
		}
	}
}
