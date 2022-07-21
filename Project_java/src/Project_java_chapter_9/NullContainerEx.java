package Project_java_chapter_9;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("NullContainerEx Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우 창 불러오기
		Container c = getContentPane();
		//컨테이너 불러오기
		c.setLayout(null);
		//컨테이너의 위치는 null
		JLabel la = new JLabel("Hellow, Press Buttons!");
				la.setLocation(130, 50);
				la.setSize(200,20);
				c.add(la);
			//라벨 생성, 위치 사이즈 추가 완료
				
				for(int i=1; i<9; i++) {
					JButton b = new JButton(Integer.toString(i)); //버튼생성
					b.setLocation(i*15, i*15); //15,15 부터 +15씩 늘어남
					b.setSize(50, 20); //사이즈는 이렇게 만듬
					c.add(b);//버튼을 컨텐트팬에 부착
				}
				setSize(300,200); //전체 프레임 사이즈
				setVisible(true);
	}
	public static void main(String[] arg) {
		new NullContainerEx();
	}
}
