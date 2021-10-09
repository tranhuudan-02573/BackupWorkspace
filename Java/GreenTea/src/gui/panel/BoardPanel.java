package gui.panel;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

import gui.Gui.ICommon;
import gui.Gui.ITrans;
import logic.Board;
import logic.Square;
 
public class BoardPanel extends JPanel implements ICommon {
  private static final long serialVersionUID = -6403941308246651773L;
  private Label[][] lbSquare;
  private ITrans listener;
  private int numSquareClosed;
 
  public BoardPanel() {
    initComp();
    addComp();
    addEvent();
  }
 
  @Override
  public void initComp() {
    setLayout(new GridLayout(Board.NUM_ROWS, Board.NUM_COLUMNS));
  }
 
  @Override
  public void addComp() {
    Border border = BorderFactory.createLineBorder(Color.gray, 1);
    lbSquare = new Label[Board.NUM_ROWS][Board.NUM_COLUMNS];
    for (int i = 0; i < lbSquare.length; i++) {
      for (int j = 0; j < lbSquare[0].length; j++) {
        lbSquare[i][j] = new Label();
        lbSquare[i][j].setOpaque(true);
        lbSquare[i][j].setBackground(new Color(242, 242, 242));
        lbSquare[i][j].setBorder(border);
        lbSquare[i][j].setHorizontalAlignment(JLabel.CENTER);
        lbSquare[i][j].setVerticalAlignment(JLabel.CENTER);
        add(lbSquare[i][j]);
      }
    }
  }
 
  @Override
  public void addEvent() {
    for (int i = 0; i < lbSquare.length; i++) {
      for (int j = 0; j < lbSquare[0].length; j++) {
        lbSquare[i][j].x = i;
        lbSquare[i][j].y = j;
        lbSquare[i][j].addMouseListener(new MouseAdapter() {
          @Override
          public void mouseReleased(MouseEvent e) {
            Label label = (Label) e.getComponent();
            if (e.getButton() == MouseEvent.BUTTON1) {
              listener.play(label.x, label.y);
            } else if (e.getButton() == MouseEvent.BUTTON3) {
              listener.target(label.x, label.y);
            }
          }
        });
      }
    }
  }
 
  public void addListener(ITrans event) {
    listener = event;
  }
 
  // cập nhật hiển thị
  public void updateBoard() {
    Font font = new Font("VNI", Font.PLAIN, 20);
    numSquareClosed = 0;
    Square[][] listSquare = listener.getListSquare();
    for (int i = 0; i < listSquare.length; i++) {
      for (int j = 0; j < listSquare[0].length; j++) {
        lbSquare[i][j].setFont(font);
        if (!listSquare[i][j].isOpen()) {
          lbSquare[i][j].setBackground(new Color(242, 242, 242));
          lbSquare[i][j].setForeground(Color.black);
          numSquareClosed++;
          if (!listSquare[i][j].isTarget()) {
            lbSquare[i][j].setText("");
          } else {
            lbSquare[i][j].setText("\uD83D\uDEA9"); // ki tu 'flag'
          }
        } else {
          if (listSquare[i][j].isHasMine()) {
            lbSquare[i][j].setText("\uD83D\uDCA3"); // ki tu 'bomb'
          } else {
            int numMineAround = listSquare[i][j].getNumMineAround();
            if (numMineAround == 0) {
              lbSquare[i][j].setText("");
            } else {
              lbSquare[i][j].setText(numMineAround + "");
              // đặt màu số cho dễ nhìn
              switch (numMineAround) {
              case 1:
                lbSquare[i][j].setForeground(new Color(128, 128, 128));
                break;
              case 2:
                lbSquare[i][j].setForeground(new Color(255, 0, 0));
                break;
              case 3:
                lbSquare[i][j].setForeground(new Color(0, 204, 0));
                break;
              case 4:
                lbSquare[i][j].setForeground(new Color(102, 0, 255));
                break;
              case 5:
                lbSquare[i][j].setForeground(new Color(128, 128, 128));
                break;
              case 6:
                lbSquare[i][j].setForeground(new Color(255, 0, 0));
                break;
              case 7:
                lbSquare[i][j].setForeground(new Color(0, 204, 0));
                break;
              case 8:
                lbSquare[i][j].setForeground(new Color(102, 0, 255));
                break;
              }
            }
          }
          lbSquare[i][j].setBackground(Color.white);
        }
      }
    }
  }
 
  // tạo class con để mở rộng thuộc tính cho lớp JLabel
  // giúp lưu được chỉ số hàng, cột của label đó ở trong GridLayout
  // vì ko thể truyền giá trị i, j vào bên trong phương thức addMouseListener
  private class Label extends JLabel {
    private static final long serialVersionUID = 6099893043079770073L;
    private int x;
    private int y;
  }
   
  public int getNumSquareClosed() {
    return numSquareClosed;
  }
}
