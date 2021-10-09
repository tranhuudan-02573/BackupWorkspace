package StManagement;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.JTableHeader;

public class View {
	JFrame frame;
	JPanel panelMain, panelLeft, panelRight;
	JTable table;
	JLabel labelName, labelId;
	JTextField textFieldName, textFieldId;
	SpringLayout springLayout;
	JScrollPane scrollPane;

	View() {
		frame = new JFrame("Quan ly Sv");
		panelMain = new JPanel();
		panelMain.setLayout(new BorderLayout());
		panelLeft = new JPanel();
		springLayout = new SpringLayout();
		panelLeft.setLayout(springLayout);
		panelRight = new JPanel();
		String[][] data = { { "Anand Jha", "6014", "IT" }, { "Anand Jha", "6014", "IT" }, { "Anand Jha", "6014", "IT" },
				{ "Anand Jha", "6014", "IT" }, { "Anand Jha", "6014", "" } };
		// Column Names
		String[] columnNames = { "Id", "Name", "BirthDate" };
		table = new JTable(data, columnNames);
		labelName = new JLabel();
		labelId = new JLabel();
		
		labelName.setText("Name");
		labelId.setText("Id");
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		scrollPane.setPreferredSize(new Dimension(480, 300));
		textFieldName = new JTextField(16);
		textFieldId = new JTextField(16);
		panelRight.add(scrollPane);
		panelLeft.add(labelId);
		panelLeft.add(textFieldId);
		panelLeft.add(labelName);
		panelLeft.add(textFieldName);

		springLayout.putConstraint(SpringLayout.WEST, labelName, 5, SpringLayout.WEST, panelLeft);
		springLayout.putConstraint(SpringLayout.NORTH, labelName, 50, SpringLayout.NORTH, panelLeft);

		springLayout.putConstraint(SpringLayout.WEST, textFieldName, 50, SpringLayout.WEST, panelLeft);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldName, 50, SpringLayout.NORTH, panelLeft);

		springLayout.putConstraint(SpringLayout.WEST, labelId, 5, SpringLayout.WEST, panelLeft);
		springLayout.putConstraint(SpringLayout.NORTH, labelId, 20, SpringLayout.NORTH, panelLeft);

		springLayout.putConstraint(SpringLayout.WEST, textFieldId, 50, SpringLayout.WEST, panelLeft);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldId, 20, SpringLayout.NORTH, panelLeft);

		panelMain.add(panelRight, BorderLayout.EAST);
		panelMain.add(panelLeft, BorderLayout.CENTER);

		frame.add(panelMain);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new View();
	}

}
