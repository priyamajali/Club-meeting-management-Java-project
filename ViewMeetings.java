package courseProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;

public class ViewMeetings extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMeetings frame = new ViewMeetings();
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
	public ViewMeetings() {
		setTitle("View meetings");
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
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea.setBounds(147, 311, 263, 297);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(meeting i:meeting_list.list)
				{
					if(i.type.equals("online"))
					{
						textArea.append("Speaker 1 :" +i.speaker1+"\n"+"Speaker 2 :" +i.speaker2+"\n"+"Evaluator 1 :" +i.evaluator1+"\n"+"evaluator 2 :" +i.evaluator2+"\n");
					}
				}
				
				
				
			}
		});
		btnNewButton.setBounds(18, 379, 119, 27);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel = new JLabel("Meeting list");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(147, 274, 137, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(18, 453, 113, 32);
		contentPane.add(btnNewButton_2);
	}

}
