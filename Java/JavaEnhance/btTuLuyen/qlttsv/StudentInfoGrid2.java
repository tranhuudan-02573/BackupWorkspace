package qlttsv;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class StudentInfoGrid2 extends JFrame{
	JPanel inputPane, operPane, listPane;
	JTextField idText,nameText,scoreText;
	JScrollPane scrollPane;
	ArrayList<Student> list = new ArrayList<Student>();
	public StudentInfoGrid2(String title){
		super(title);
		list.add(new Student("111","Phan Vĩnh Thuần",9.0));
		list.add(new Student("222","Lê Phi Hùng",9.0));
		inputPane = new JPanel();
		setupInputPane();
		operPane = new JPanel();
		setupOperPane();
		listPane = new JPanel();
		scrollPane = new JScrollPane(listPane);	
		setupListPane();
			
		JPanel topPanel = new JPanel(new BorderLayout());
		topPanel.add(inputPane,BorderLayout.NORTH);
		topPanel.add(operPane,BorderLayout.SOUTH);
		
	    JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(scrollPane, BorderLayout.SOUTH);
		
	    getContentPane().add(mainPanel, BorderLayout.NORTH);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void setupInputPane(){
		JLabel label;
		inputPane.setBorder(BorderFactory.createTitledBorder("Nhập thông tin"));
		inputPane.setLayout(new GridLayout(3, 2));
		label = new JLabel("MSSV  ",JLabel.RIGHT);
		inputPane.add(label);
		inputPane.add(idText = new JTextField(20));
		
		label = new JLabel("Tên  ",JLabel.RIGHT);
		inputPane.add(label);
		inputPane.add(nameText = new JTextField(20));
		
		label = new JLabel("Điểm TB  ",JLabel.RIGHT);
		inputPane.add(label);
		inputPane.add(scoreText = new JTextField(20));
		
	}
	
	private void setupOperPane(){
		operPane.setBorder(BorderFactory.createTitledBorder("Thao tác"));
		JButton add, del, edit, find;
		
		ActionListener listener = new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				switch(command){
				case "ADD": addSt(); break;
				case "FIND": loadSt(); break;
				case "DELETE": deleteSt(); break;
				case "EDIT": editSt(); break;
				}
				
			}
		};
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
	
	private void setupListPane(){
		listPane.removeAll();
		listPane.setLayout(new GridLayout(0, 3));
		listPane.add(new JLabel("MSSV"));
		listPane.add(new JLabel("Tên"));
		listPane.add(new JLabel("Điểm TB"));
		for(Student st:list){
			listPane.add(new JLabel(st.id));
			listPane.add(new JLabel(st.name));
			listPane.add(new JLabel(""+st.score));
		}
	}
	
	private Student find(String id){
		for (Student st:list) if (st.id.equalsIgnoreCase(id)) return st;
		return null;
	}
	
	private void addSt(){
		String id = idText.getText().trim();
		String name = nameText.getText().trim();
		double score = Double.parseDouble(scoreText.getText());
		
		if (find(id) == null){
			Student st = new Student(id, name, score);
			list.add(st);
			setupListPane();
			pack();
		}
		
	}
	private void deleteSt(){
		String id = idText.getText().trim();
		Student st = null;
		if ((st = find(id)) != null){	
			list.remove(st);
			setupListPane();
			pack();
		}
	}
	
	private void editSt(){
		String id = idText.getText().trim();
		String name = nameText.getText().trim();
		double score = Double.parseDouble(scoreText.getText());
		Student st = null;
		if ((st = find(id)) != null){	
			st.setName(name);
			st.setScore(score);
			setupListPane();
			revalidate();
		}
	}
	private void loadSt() {
		Student st = find(idText.getText().trim());
		if (st == null) return;	
		nameText.setText(st.name);
		scoreText.setText(""+st.score);	
		revalidate();		
	}
	public static void main(String[] args) {
		new StudentInfoGrid2("Quản lý thông tin sinh viên");

	}

}
