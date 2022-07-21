package Project_java_chapter_9;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30,20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300,200); //프레임 크기 300x200 설정
		setVisible(true); //프레을 화면에 출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutEx();
	}

}
