package observer_util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SwingObserverExample {
	JFrame frame;
	public static void main(String[] args) {
		SwingObserverExample example=new SwingObserverExample();
		example.go();
	}
	public void go(){
		frame=new JFrame();
		JButton button=new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(button);
		frame.setVisible(true);
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	class AngelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do it,you might regret it!");
		}
		
	}
	
	class DevilListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on,do it!");
		}
		
	}
}
