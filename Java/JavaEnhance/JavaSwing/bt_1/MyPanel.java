package bt_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MyPanel extends JPanel {
	JButton clearBtn, enterBtn;
	JTextArea textArea;
	JTextField textField;
	JPanel panelBot, panelBtn;

	public MyPanel() {
		panelBot = new JPanel();
		panelBot.setLayout(new BorderLayout());
		panelBtn = new JPanel();
		panelBtn.setLayout(new GridLayout());
		clearBtn = new JButton("Clear");
		enterBtn = new JButton("Enter");
		textField = new JTextField(15);
		textArea = new JTextArea("", 10, 10);
		enterBtn.setFocusable(false);
		clearBtn.setFocusable(false);
		enterBtn.setBackground(Color.white);
		clearBtn.setBackground(Color.white);
		textField.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		textArea.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		panelBtn.add(clearBtn);
		panelBtn.add(enterBtn);
		panelBot.add(textField, BorderLayout.CENTER);
		panelBot.add(panelBtn, BorderLayout.EAST);
		setLayout(new BorderLayout());
		add(textArea, BorderLayout.CENTER);
		add(panelBot, BorderLayout.SOUTH);
		MyAction myAction = new MyAction(textArea, textField);
		textField.addActionListener(myAction);
		enterBtn.addActionListener(myAction);
		clearBtn.addActionListener(myAction);

	}
}
