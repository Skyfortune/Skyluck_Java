package Project_java_chapter_14;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyModalDialog extends JDialog{
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");
	
	public MyModalDialog(JFrame frame, String title) {
		super(frame,title,true); //모달 다이얼로그로 설정
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
	}
	public String getinput() {
		if(tf.getText().length() == 0) return null;
		else return tf.getText();
	}

}
