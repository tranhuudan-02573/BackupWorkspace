package gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import gui.Gui.ICommon;
import gui.Gui.ITrans;

import javax.swing.JButton;
import javax.swing.JLabel;

import logic.Board;
 
public class ControlPanel extends JPanel implements ICommon {
  private static final long serialVersionUID = 5219120377989554161L;
  public static final boolean STT_WIN = true;
  public static final boolean STT_LOSE = false;
  private JLabel lbNumSquareClosed;
  private JLabel lbNotify;
  private JButton btnRestart;
  private ITrans listener;
 
  public ControlPanel() {
    initComp();
    addComp();
    addEvent();
  }
 
  @Override
  public void initComp() {
    setLayout(null);
  }
 
  @Override
  public void addComp() {
    Font font = new Font("VNI", Font.PLAIN, 20);
 
    lbNumSquareClosed = new JLabel();
    lbNumSquareClosed.setFont(font);
    lbNumSquareClosed.setText("Số ô chưa mở: " + Board.NUM_ROWS * Board.NUM_COLUMNS);
    lbNumSquareClosed.setBounds(10, 10, 250, 40);
    add(lbNumSquareClosed);
 
    lbNotify = new JLabel();
    lbNotify.setFont(font);
    lbNotify.setBounds(270, 10, 200, 40);
    add(lbNotify);
 
    btnRestart = new JButton();
    btnRestart.setFont(font);
    btnRestart.setText("Chơi lại");
    btnRestart.setBounds(490, 10, 200, 40);
    add(btnRestart);
  }
 
  @Override
  public void addEvent() {
    btnRestart.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        listener.restart();
        lbNumSquareClosed.setText("Số ô chưa mở: " + Board.NUM_ROWS * Board.NUM_COLUMNS);
        lbNotify.setText("");
      }
    });
  }
 
  public void addListener(ITrans event) {
    listener = event;
  }
 
  public void updateStatus(int numSquareClosed) {
    lbNumSquareClosed.setText("Số ô chưa mở: " + numSquareClosed);
    if (numSquareClosed == Board.NUM_MINES) {
      lbNotify.setText("THẮNG");
      lbNotify.setForeground(Color.blue);
    } else if (numSquareClosed == 0) {
      lbNotify.setText("THUA");
      lbNotify.setForeground(Color.red);
    }
  }
}
