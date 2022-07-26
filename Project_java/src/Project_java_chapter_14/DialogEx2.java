package Project_java_chapter_14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DialogEx2 extends JFrame {
	private MyModalDialog dialog;

	public DialogEx2() {
		super("DialogEX2 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal Dialog");

		dialog = new MyModalDialog(this, "Test Modal Dialog");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);

				String text = dialog.getinput();

				if (text == null)
					return;
				JButton btn = (JButton) e.getSource();
				btn.setText(text);
			}

		});
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DialogEx2();
	}

}
