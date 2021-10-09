package cau3_ArtGui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import cau2_Art.ArtObject;
import cau2_Art.Painting;

public class ArtGui extends JFrame implements ActionListener {

	private JLabel jlbTitle, jlbYear, jlbPaintType, jlbStyle, jlbArtist;
	private JTextField jtfTitle, jtfYear;
	private JComboBox jcbPaintType, jcbStyle, jcbArtist;
	private Dimension dimensionForLabel = new Dimension(105, 30);
	private Dimension dimensionForJTextField = new Dimension(300, 20);
	private String[] comboPaintType = { "Sơn dầu", "Sơn mài", "Gốm", "Đơn sắc", "Men", "Thủy mặc" };
	private String[] comboStyle = { "Cổ điển", "Hiện đại" };
	private String[] comboArtist = { "Fernando Botero", "Leonardo Da Vinci", "Vincent Vangogh", "Pablo Ruiz Picasso" };
	private JButton jbtAdd, jbtSort;
	private JTextArea jta;
	private List<Painting> listPaint = new ArtObject() {
	}.lstPainting;

	public ArtGui(String title) {
		super(title);
		setLayout(new GridLayout(2, 1));
		panelInput();
		panelView();

		// event
		jbtAdd.addActionListener(this);
		jbtSort.addActionListener(this);
		// for jframe
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		// setResizable(false);
		setLocationRelativeTo(null);
	}

	public void panelInput() {
		JPanel jpnInput = new JPanel();
		add(jpnInput);
		jpnInput.setLayout(new BoxLayout(jpnInput, BoxLayout.Y_AXIS));
		Icon iconAdd = new ImageIcon(getClass().getResource("/image/cong.PNG"));
		Icon iconSort = new ImageIcon(getClass().getResource("/image/sx.PNG"));
		// title
		jpnInput.add(new JLabel("QUẢN LÝ TÁC PHẨM HỘI HỌA"));
		// row 1
		JPanel jpnRow1 = new JPanel();
		jpnInput.add(jpnRow1);
		jpnRow1.add(jlbTitle = new JLabel("Tên tác phẩm:"));
		jpnRow1.add(jtfTitle = new JTextField());
		jlbTitle.setPreferredSize(dimensionForLabel);
		jtfTitle.setPreferredSize(dimensionForJTextField);

		// row 2
		JPanel jpnRow2 = new JPanel();
		jpnInput.add(jpnRow2);
		jpnRow2.add(jlbYear = new JLabel("Năm sáng tác:"));
		jpnRow2.add(jtfYear = new JTextField());
		jlbYear.setPreferredSize(dimensionForLabel);
		jtfYear.setPreferredSize(dimensionForJTextField);

		// row 3
		JPanel jpnRow3 = new JPanel();
		jpnInput.add(jpnRow3);
		jpnRow3.add(jlbPaintType = new JLabel("Loại tranh:"));
		jpnRow3.add(jcbPaintType = new JComboBox(comboPaintType));
		jlbPaintType.setPreferredSize(dimensionForLabel);
		jcbPaintType.setPreferredSize(dimensionForJTextField);

		// row 4
		JPanel jpnRow4 = new JPanel();
		jpnInput.add(jpnRow4);
		jpnRow4.add(jlbStyle = new JLabel("Phong cách:"));
		jpnRow4.add(jcbStyle = new JComboBox(comboStyle));
		jlbStyle.setPreferredSize(dimensionForLabel);
		jcbStyle.setPreferredSize(dimensionForJTextField);

		// row 5
		JPanel jpnRow5 = new JPanel();
		jpnInput.add(jpnRow5);
		jpnRow5.add(jlbArtist = new JLabel("Tác giả:"));
		jpnRow5.add(jcbArtist = new JComboBox(comboArtist));
		jlbArtist.setPreferredSize(dimensionForLabel);
		jcbArtist.setPreferredSize(dimensionForJTextField);

		// row 6

		JPanel jpnRow6 = new JPanel();
		jpnInput.add(jpnRow6);
		jpnRow6.add(jbtAdd = new JButton("Thêm", iconAdd));
		jpnRow6.add(jbtSort = new JButton("Sắp Xếp", iconSort));
		jbtAdd.setPreferredSize(dimensionForLabel);
		jbtSort.setPreferredSize(dimensionForLabel);

	}

	public void panelView() {
		// jpnText.setBord
		add(jta = new JTextArea());
		jta.setEditable(false);
		// jta.setEnabled(false);
		JScrollPane jScrollPane = new JScrollPane(jta);
		add(jScrollPane);
		viewPaintingList();
	}

	private void viewPaintingList() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < listPaint.size(); i++) {
			Painting painting = listPaint.get(i);
			sb.append((i + 1) + "-" + painting.toString() + "\n");
		}
		jta.setText(sb.toString());
	}

	public static void main(String[] args) {
		new ArtGui("Art Management");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtAdd) {
			Painting painting = new Painting();
			if (jtfTitle.getText().length() != 0 && jtfYear.getText().length() != 0) {
				if (jtfYear.getText().matches("\\d+$")) {
					painting.setArtist(jcbArtist.getSelectedItem().toString());
					painting.setPaintType(jcbPaintType.getSelectedItem().toString());
					painting.setStyle(jcbStyle.getSelectedItem().toString());
					painting.setTitle(jtfTitle.getText());
					painting.setYear(Integer.parseInt(jtfYear.getText()));

					listPaint.add(painting);
					jtfTitle.setText("");
					jtfYear.setText("");
					viewPaintingList();
				} else
					JOptionPane.showMessageDialog(rootPane, "\"Năm sáng tác\" phải là số nguyên!");
			} else
				JOptionPane.showMessageDialog(rootPane, "Mời bạn nhập đủ thông tin");
		}
		if (e.getSource() == jbtSort) {
			Collections.sort(listPaint, new Comparator<Painting>() {
				@Override
				public int compare(Painting o1, Painting o2) {
					return (o1.getTitle()).compareToIgnoreCase(o2.getTitle());
				}
			});
			viewPaintingList();
		}

	}
}
