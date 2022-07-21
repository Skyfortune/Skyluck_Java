package Project_java_chapter_10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//익명클래스에 대해서 알아보자 (클래스 정의 + 인스턴스 생성)을 한번에 작성한다.

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		//익명 클래스로 Action 리스너 작성
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				setTitle(b.getText());
				//어나너미스클래스리스너의 멤버나 JFrame의 멤버를 호출가능
			}

		}); // 이렇게 부등호가 생기게 된다
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}
