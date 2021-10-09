package MyPaint;


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyAction implements KeyListener {
	DrawingPanel drawingPanel;
	StatusBar statusBar;

	public KeyAction(DrawingPanel drawingPanel) {
		// TODO Auto-generated constructor stub
		this.drawingPanel = drawingPanel;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you released key code: " + e.getKeyCode());
		System.out.println("you released key char: " + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode();
		System.out.println(code);
		if (e.isControlDown()) {
			switch (code) {
			case KeyEvent.VK_R:
				drawingPanel.color = Color.RED;
				break;
			case KeyEvent.VK_G:
				drawingPanel.color = Color.GREEN;
				break;
			case KeyEvent.VK_B:
				drawingPanel.color = Color.BLUE;
				break;
			case KeyEvent.VK_Z:
				if (drawingPanel.shapes.size() >= 0)
					drawingPanel.shapes.remove(drawingPanel.shapes.size() - 1);
				break;
			}
		}

	}

}
