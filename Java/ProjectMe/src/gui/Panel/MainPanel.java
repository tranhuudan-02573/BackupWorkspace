package gui.Panel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import gui.Gui.ICommon;

public class MainPanel extends JPanel implements ICommon {
	private JButton btnCount;
	private JLabel lbCount;
	private int count;
	private JButton clearBtn, choseColorBtn;
	private JToggleButton pencilBtn, deleteBtn, drawLineBtn;
	static JSlider slider;
	private DrawArea drawArea;
	private JLabel label;
	private JPanel panelMain, panelFunc;
	public MainPanel() {
		count = 0;
		initComp();
		addComp();
		addEvent();
	}

	@Override
	public void initComp() {
		// cài đặt ban đầu cho Panel
		setLayout(null);
	}

	@Override
	public void addComp() {
		// cài đặt và thêm Button btnCount vào Panel
		btnCount = new JButton();
		btnCount.setText("Click");
		btnCount.setSize(100, 50);
		btnCount.setLocation(10, 10);
		add(btnCount);

		// cài đặt và thêm Label lbCount vào Panel
		lbCount = new JLabel();
		lbCount.setText(count + "");
		lbCount.setSize(100, 50);
		lbCount.setLocation(120, 10);
		add(lbCount);
		
		
		slider = new JSlider(1, 50);
		label = new JLabel();
//gach
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(4);
// don vi cach nhau moi vach
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(6);
// so hien thi
		slider.setPaintLabels(true);

		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		label.setText("*Size= " + slider.getValue());

		
		// create controls to apply colors and call clear feature
		choseColorBtn = new JButton("Choose Color");
		pencilBtn = new JToggleButton("Pencil");
		deleteBtn = new JToggleButton("eraser");
		drawLineBtn = new JToggleButton("draw line");
		clearBtn = new JButton("Clear");
		panelFunc.add(clearBtn);
		panelFunc.add(choseColorBtn);
		panelFunc.add(pencilBtn);
		panelFunc.add(deleteBtn);
		panelFunc.add(drawLineBtn);
//		panelMain.add(label);
//		panelMain.add(panelFunc);
		panelMain.add(label, BorderLayout.NORTH);
		panelMain.add(slider, BorderLayout.CENTER);
	}

	@Override
	public void addEvent() {
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				label.setText("*Size= " + slider.getValue());
			}
		});
		pencilBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (pencilBtn.isSelected() == true) {
					drawLineBtn.setSelected(false);
					drawArea.pencil();
				} else {
					drawArea.noPencil();
				}
				deleteBtn.setSelected(false);
				drawLineBtn.setSelected(false);
			}
		});
		deleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				drawArea.noPencil();
				pencilBtn.setSelected(false);
			}
		});
		choseColorBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				drawArea.color();
				if (pencilBtn.isSelected() == true) {
					drawArea.pencil();
				} else {
					drawArea.noPencil();
				}
			}
		});
	
		clearBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				drawArea.clear();
				if (pencilBtn.isSelected() == true) {
					drawArea.pencil();
				} else {
					drawArea.noPencil();
				}
			}
		});
		drawLineBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (drawLineBtn.isSelected() == true) {
					new DrawLine();
				} else {
					drawArea.noPencil();
				}
				pencilBtn.setSelected(false);
			}
		});
		
		btnCount.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				lbCount.setText("" + count);
			}
		});
	}
}
