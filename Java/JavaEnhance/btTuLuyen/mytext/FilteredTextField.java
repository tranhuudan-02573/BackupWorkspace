package mytext;

import javax.swing.*;
import javax.swing.text.*;

public class FilteredTextField extends JTextField {
	int defaultLenght;

	public FilteredTextField(String text) {
		super(text);
		defaultLenght = text.length();
		((AbstractDocument) getDocument()).setDocumentFilter(new MyFilter());
	}

	public FilteredTextField(String text, int col) {
		super(text, col);
		defaultLenght = text.length();
		((AbstractDocument) getDocument()).setDocumentFilter(new MyFilter());
	}

	class MyFilter extends DocumentFilter {
		public void insertString(DocumentFilter.FilterBypass fb, int offset, String str, AttributeSet attr)
				throws BadLocationException {
			char[] source = str.toCharArray();
			char[] result = new char[source.length];
			int j = 0;
			for (int i = 0; i < result.length; i++) {
				if ((Character.isDigit(source[i])) || (source[i] == ','))
					result[j++] = source[i];
			}
			if ((j > 0) && (offset >= defaultLenght))
				fb.insertString(offset, new String(result), attr);
		}

		public void remove(DocumentFilter.FilterBypass fb, int offset, int length) throws BadLocationException {

			// if (fb.getDocument().getLength()>defaultLenght) fb.remove(offset,1);
			if (offset >= defaultLenght)
				fb.remove(offset, length);
		}

		public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
				throws BadLocationException {
			char[] source = text.toCharArray();
			char[] result = new char[source.length];
			int j = 0;
			for (int i = 0; i < result.length; i++) {
				if ((Character.isDigit(source[i])) || (source[i] == ','))
					result[j++] = source[i];
			}
			if ((j > 0) && (offset >= defaultLenght))
				fb.replace(offset, length, new String(result), attrs);
		}

	}
}
