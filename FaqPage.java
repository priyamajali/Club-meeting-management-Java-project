package courseProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FaqPage extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FaqPage frame = new FaqPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public FaqPage() {
		setTitle("FAQ");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setPreferredSize(new Dimension(1800,1800));
		//pack();
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea.setBounds(21, 284, 556, 505);
		contentPane.add(textArea);
		JButton btnNewButton = new JButton("View Detials");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.append("Question: Who can become a member? "+"\n"+"Ans: Anyone with an interest in public speaking."+"\n");
				textArea.append("\n"+"Question: How many times are meetings conducted? "+"\n"+"Ans: Meetings happen once a week."+"\n");
				textArea.append("\n"+"Question: Why should I join the club?? "+"\n"+"Ans:To improve your communication and public speaking skills."+"\n");
				
			}
		});
		btnNewButton.setBounds(60, 214, 171, 33);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(370, 214, 171, 33);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priya\\Downloads\\fa (1).jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 809);
		contentPane.add(lblNewLabel);
		
		
	}
}
