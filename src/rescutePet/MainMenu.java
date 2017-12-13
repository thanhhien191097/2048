package rescutePet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class MainMenu {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 783, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
				
		//PLAY BUTTON//
		JButton button_2 = new JButton("Play");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource() == button_2){     //FUNCTION OF BUTTON PLAY//
					System.out.println("Played");
					
				}
			}
		});
		button_2.setIcon(new ImageIcon(MainMenu.class.getResource("/img/Menu Play.png")));
		button_2.setBounds(481, 187, 200, 51);
		frame.getContentPane().add(button_2);
		
		
		//SETTING BUTTON//
		JButton button = new JButton("Setting");
		button.setIcon(new ImageIcon(MainMenu.class.getResource("/img/Menu Setting.png")));
		button.setBounds(481, 255, 200, 51);
		frame.getContentPane().add(button);
		
		
		//QUIT BUTTON//
		JButton button_1 = new JButton("Quit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource() == button_1){		//FUNCTION OF BUTTON QUIT//
					System.exit(0);
				}
					
			}
		});
		button_1.setAction(action);
		button_1.setIcon(new ImageIcon(MainMenu.class.getResource("/img/Menu Quit.png")));
		button_1.setBounds(481, 326, 200, 51);
		frame.getContentPane().add(button_1);
		
		
		//BACKGROUND//
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MainMenu.class.getResource("/img/Menu Background.png")));
		label.setBounds(0, 0, 767, 422);
		frame.getContentPane().add(label);
				
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
