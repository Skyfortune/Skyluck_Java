package Project_java_chapter_10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame {
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("Hello");
	
	FlyingTextEx() {
	setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(null);
	c.addKeyListener(new MykeyListener());
	
	la.setLocation(50, 50);
	la.setSize(100,20);
	c.add(la);
	setSize(300,300);
	setVisible(true);
	c.setFocusable(true);
	c.requestFocus();
	
	c.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			Component com = (Component)e.getSource();
			com.setFocusable(true);
			com.requestFocus();
		}
	
	});
		
	
	
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
