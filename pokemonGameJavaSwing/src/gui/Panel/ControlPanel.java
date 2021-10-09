package gui.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import gui.Gui.Gui;
import gui.Gui.ICommon;
import gui.Gui.ITransControl;

public class ControlPanel extends JPanel implements ICommon {
	private static final long serialVersionUID = 7494278874396803784L;
	private ITransControl listener;
	private Thread threadCountDown;
	private JButton btnRestart;
	private JProgressBar prgCountDown;

	public ControlPanel() {
		initComp();
		addComp();
		addEvent();
	}

	@Override
	public void initComp() {
		setSize(Gui.WIDTH - 30, 50);
		setLocation(10, 10);
		setLayout(null);
	}

	@Override
	public void addComp() {
		btnRestart = new JButton("Choi lai");
		btnRestart.setBounds(10, 10, 100, 30);
		add(btnRestart);

		prgCountDown = new JProgressBar();
		prgCountDown.setMaximum(Gui.TIME);
		prgCountDown.setMinimum(0);
		prgCountDown.setBounds(150, 10, 500, 30);
		add(prgCountDown);
	}

	@Override
	public void addEvent() {
		threadCountDown = new Thread(runCountDown);
		threadCountDown.start();

		btnRestart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				restart();
			}
		});
	}

	public void addListener(ITransControl event) {
		listener = event;
	}

	private Runnable runCountDown = new Runnable() {
		@Override
		public void run() {
			try {
				int time = Gui.TIME;
				prgCountDown.setValue(time);
				while (time >= 0) {
					Thread.sleep(1000);
					prgCountDown.setValue(time--);

					// nếu chơi hết ô thì hiện dialog thắng và tạm dừng thread
					if (listener.getNumSquareIsShowed() == 0) {
						listener.showDialog(Gui.WIN);
						wait();
					}
				}
				// hết giờ thì hiện dialog thua
				listener.showDialog(Gui.LOSE);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	// khởi tạo lại bàn cờ, ngắt thread cũ và khởi tạo thread mới
	public void restart() {
		listener.renewBoardPanel();
		try {
			threadCountDown.interrupt();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		threadCountDown = new Thread(runCountDown);
		threadCountDown.start();
	}
}
