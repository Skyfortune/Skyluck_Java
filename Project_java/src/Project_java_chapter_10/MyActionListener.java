package Project_java_chapter_10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
		// innerClassListener의 멤버나 JFrame의 멤버를 호출 할 수 있음
	//	InnerClassListener.this.setTitle(b.getText());//프레임 타이틀에 버튼 문자열 출력

	}

}
