import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SiebenSegmente implements ActionListener {

	public static Button[] buttons = new Button[7];
	public static boolean[] isPressed = new boolean[7];
	public static SiebenSegmente instance;

	public static void main(String[] args) {

		instance = new SiebenSegmente();

		final int WIDTH = 800, HEIGHT = 600;

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		panel.setLayout(null);

		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		panel.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		panel.setMinimumSize(new Dimension(WIDTH, HEIGHT));

		initButtons();
		addButtons(panel);

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	public static void initButtons() {
		buttons[0] = new Button();
		buttons[0].setText("a");
		buttons[1] = new Button();
		buttons[1].setText("b");
		buttons[2] = new Button();
		buttons[2].setText("c");
		buttons[3] = new Button();
		buttons[3].setText("d");
		buttons[4] = new Button();
		buttons[4].setText("e");
		buttons[5] = new Button();
		buttons[5].setText("f");
		buttons[6] = new Button();
		buttons[6].setText("g");

		buttons[0].setBounds(300, 100, 150, 50);
		buttons[1].setBounds(460, 150, 50, 150);
		buttons[2].setBounds(460, 310, 50, 150);
		buttons[3].setBounds(300, 460, 150, 50);
		buttons[4].setBounds(240, 150, 50, 150);
		buttons[5].setBounds(240, 310, 50, 150);
		buttons[6].setBounds(300, 280, 150, 50);

		for (int i = 0; i <= 6; i++) {
			buttons[i].addActionListener(instance);
			buttons[i].setBackground(Color.BLACK);
		}
	}

	public static void addButtons(JPanel panel) {
		panel.add(buttons[0]);
		panel.add(buttons[1]);
		panel.add(buttons[2]);
		panel.add(buttons[3]);
		panel.add(buttons[4]);
		panel.add(buttons[5]);
		panel.add(buttons[6]);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button temp = (Button) e.getSource();
		if (temp.isActive() == true) {
			temp.setActive(false);
			temp.setBackground(Color.BLACK);
		} else {
			temp.setActive(true);
			temp.setBackground(Color.RED);
		}

	}
}
