package qlttsv;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class StudentInfoTable extends JFrame{
	JPanel inputPane, operPane, listPane;
	JTable table;
	DefaultTableModel model;
	JTextField idText,nameText,scoreText;
	JTextArea listView;
	ArrayList<Student> list = new ArrayList<Student>();
	public StudentInfoTable(String title){
		super(title);
		list.add(new Student("111","Phan Vĩnh Thuần",9.0));
		list.add(new Student("222","Lê Phi Hùng",9.0));
		inputPane = new JPanel();
		setupInputPane();
		operPane = new JPanel();
		setupOperPane();
//		listPane = new JPanel();
//		setupListPane();
			
		model = new DefaultTableModel(){
			@Override
		    public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		};
		table = new JTable(model);
		setupTable();
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add(inputPane,BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(operPane,BorderLayout.NORTH);
//		JScrollPane scp = new JScrollPane(listPane);
		JScrollPane scp = new JScrollPane(table);
		p2.add(scp, BorderLayout.CENTER);
		
		getContentPane().add(p1, BorderLayout.NORTH);
		getContentPane().add(p2, BorderLayout.CENTER);
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
				case "ADD": add(); break;
				case "FIND": loadSt(); break;
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
	
//	private void setupListPane(){
//		listPane.removeAll();
//		listPane.setLayout(new GridLayout(1+list.size(), 3));
//		listPane.add(new JLabel("MSSV"));
//		listPane.add(new JLabel("Tên"));
//		listPane.add(new JLabel("Điểm TB"));
//		for(Student st:list){
//			listPane.add(new JLabel(st.id));
//			listPane.add(new JLabel(st.name));
//			listPane.add(new JLabel(""+st.score));
//		}
//
//	}
	private void setupTable(){
		String header[] = new String[] { "MSSV", "Họ và Tên", "Điểm TB"};
	    model.setColumnIdentifiers(header);
	    for(Student st:list) model.addRow(st.getRow());
	}
	 
	
	private Student find(String id){
		for (Student st:list) if (st.id.equalsIgnoreCase(id)) return st;
		return null;
	}
	private void add(){
		String id = idText.getText().trim();
		String name = nameText.getText().trim();
		double score = Double.parseDouble(scoreText.getText());
		
		if (find(id) == null){
			Student st = new Student(id, name, score);
			list.add(st);
			model.addRow(st.getRow());
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
		new StudentInfoTable("Quản lý thông tin sinh viên");

	}

}
