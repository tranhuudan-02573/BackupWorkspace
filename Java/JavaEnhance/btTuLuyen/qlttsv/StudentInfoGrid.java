package qlttsv;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

public class StudentInfoGrid extends JFrame {
	JPanel inputPane, operPane, listPane;
	JTextField idText, nameText, scoreText;
	JScrollPane scrollPane;
	ArrayList<Student> list = new ArrayList<Student>();

	private Student findById(String id) {
		for (Student st : list)
			if (st.id.equalsIgnoreCase(id))
				return st;
		return null;
	}

	private boolean deleteById(String id) {
		Student st = findById(id);
		if (st == null)
			return false;
		this.list.remove(st);
		return true;
	}

	public StudentInfoGrid(String title) {
		super(title);
		list.add(new Student("111", "Phan Vĩnh Thuần", 9.0));
		list.add(new Student("222", "Lê Phi Hùng", 9.0));
		inputPane = new JPanel();
		setupInputPane();
		operPane = new JPanel();
		setupOperPane();
		listPane = new JPanel();
		scrollPane = new JScrollPane(listPane);
		setupListPane();

		JPanel topPanel = new JPanel(new BorderLayout());
		topPanel.add(inputPane, BorderLayout.NORTH);
		topPanel.add(operPane, BorderLayout.SOUTH);

		getContentPane().add(topPanel, BorderLayout.NORTH);
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void setupInputPane() {
		JLabel label;
		inputPane.setBorder(BorderFactory.createTitledBorder("Nhập thông tin"));
		inputPane.setLayout(new GridLayout(3, 2));
		label = new JLabel("MSSV  ", JLabel.RIGHT);
		inputPane.add(label);
		inputPane.add(idText = new JTextField(20));

		label = new JLabel("Tên  ", JLabel.RIGHT);
		inputPane.add(label);
		inputPane.add(nameText = new JTextField(20));

		label = new JLabel("Điểm TB  ", JLabel.RIGHT);
		inputPane.add(label);
		inputPane.add(scoreText = new JTextField(20));

	}

	private void setupOperPane() {
		operPane.setBorder(BorderFactory.createTitledBorder("Thao tác"));
		JButton add, del, edit, find;
		KeyListener key = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {
				case 10:
					addSt();
					idText.setText("");
					nameText.setText("");
					scoreText.setText("");

				}
			}
		};
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				switch (command) {
				case "ADD":
					addSt();
					idText.setText("");
					nameText.setText("");
					scoreText.setText("");

					break;
				case "FIND":
					loadSt();
					break;
				case "DELETE":
					deleteSt();
					break;
				case "EDIT":
					editSt();
					break;
				}

			}
		};
		idText.addKeyListener(key);
		nameText.addKeyListener(key);
		scoreText.addKeyListener(key);
		add = new JButton("Thêm");
		add.addActionListener(listener);
		add.setActionCommand("ADD");
		operPane.add(add);

		del = new JButton("Xóa");
		del.addActionListener(listener);
		del.setActionCommand("DELETE");
		operPane.add(del);

		edit = new JButton("Sửa");
		edit.addActionListener(listener);
		edit.setActionCommand("EDIT");
		operPane.add(edit);

		find = new JButton("Find");
		find.addActionListener(listener);
		find.setActionCommand("FIND");
		operPane.add(find);

	}

	private void setupListPane() {
		listPane.removeAll();
		listPane.setLayout(new GridLayout(0, 3));
		listPane.add(new JLabel("MSSV"));
		listPane.add(new JLabel("Tên"));
		listPane.add(new JLabel("Điểm TB"));
		for (Student st : list) {
			listPane.add(new JLabel(st.id));
			listPane.add(new JLabel(st.name));
			listPane.add(new JLabel("" + st.score));
		}
	}

	private void addSt() {
		String id = idText.getText().trim();
		String name = nameText.getText().trim();
		double score = Double.parseDouble(scoreText.getText());

		if (findById(id) == null) { // Chưa tồn tại
			Student st = new Student(id, name, score);
			list.add(st);
			setupListPane(); // update
			pack();
		} else { // đã tồn tại
			JOptionPane.showMessageDialog(this, "Mã số sinh viên đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}

	}

	private void deleteSt() {
		String id = idText.getText().trim();
		Student st = null;
		if ((st = findById(id)) != null) {
			list.remove(st);
			setupListPane();
			pack();
		} else {
			JOptionPane.showMessageDialog(this, "Mã số sinh viên không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void editSt() {
		String id = idText.getText().trim();
		String name = nameText.getText().trim();
		double score = Double.parseDouble(scoreText.getText());
		Student st = null;
		if ((st = findById(id)) != null) {
			st.setName(name);
			st.setScore(score);
			setupListPane();
			revalidate();
		}
	}

	private void loadSt() {
		Student st = findById(idText.getText().trim());
		if (st == null)
			return;
		nameText.setText(st.name);
		scoreText.setText("" + st.score);
		revalidate();
	}

	public static void main(String[] args) {
		new StudentInfoGrid("Quản lý thông tin sinh viên");

	}

}
