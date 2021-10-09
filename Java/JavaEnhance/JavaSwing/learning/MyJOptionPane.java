package learning;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyJOptionPane {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.ERROR_MESSAGE);
		
		System.out.println(JOptionPane.showConfirmDialog(null, "do you even code","this is my tittle",JOptionPane.YES_NO_CANCEL_OPTION ));
		int answer = JOptionPane.showConfirmDialog(null, "do you even code","this is my tittle",JOptionPane.YES_NO_CANCEL_OPTION );
		String name = JOptionPane.showInputDialog("what is your name ? ");
		System.out.println("hello " + name);
		
		
		String[] responses = {"you are dog","thanks you","blush"};
		ImageIcon icon = new ImageIcon("./src/learning/row.png");
		JOptionPane.showOptionDialog(null, "you are awesome", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
		
		
	}
}
 