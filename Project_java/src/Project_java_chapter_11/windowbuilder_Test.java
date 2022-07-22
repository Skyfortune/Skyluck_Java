package Project_java_chapter_11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class windowbuilder_Test {

	private JFrame frame;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JScrollPane scrollPane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowbuilder_Test window = new windowbuilder_Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public windowbuilder_Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		scrollPane.setBounds(77, 183, 54, 31);
		frame.getContentPane().add(scrollPane);
		tabbedPane.setBounds(28, 98, 203, 95);
		frame.getContentPane().add(tabbedPane);
	}
}
