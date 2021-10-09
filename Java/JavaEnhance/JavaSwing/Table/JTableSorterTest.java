package Table;

import java.awt.*;
import javax.swing.*;

class JTableSorterTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setTitle("JTableHeaderHide Test");
		String[] columnNames = { "Name", "Age", "City" };
		Object[][] data = { { "Raja", "35", "Hyderabad" }, { "Adithya", "25", "Chennai" }, { "Vineet", "23", "Mumbai" },
				{ "Archana", "32", "Pune" }, { "Krishna", "30", "Kolkata" } };
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);

		// Cho phep table sap xep
		table.setAutoCreateRowSorter(true);

		jFrame.add(scrollPane, BorderLayout.CENTER);
		jFrame.setSize(375, 250);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
	}
}
