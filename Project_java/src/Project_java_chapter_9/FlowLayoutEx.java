package Project_java_chapter_9;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FLowLAyout Sample");
		//타이틀 이름 짓기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//디폴트값 불러오기, 종료해도 데이터가 남게함
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
									//정렬 위치, 가로 여백, 세로 여백
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEx();
	}

}
