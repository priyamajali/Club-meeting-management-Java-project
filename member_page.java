package courseProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

public class member_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					member_page frame = new member_page("pii");
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
	public member_page(String name) {
		final String n=name;
		setTitle("Member page");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setPreferredSize(new Dimension(1800,1800));
		//pack();
		contentPane.setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(283, 254, 520, 486);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(51, 684, 181, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View members");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMembers vm = new ViewMembers(member_details.member_list);
				vm.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(51, 254, 181, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("my Profile");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(member i:member_details.member_list)
				{
					if(n.equals((i.name)))
							{
						textArea.append("Name: "+i.name+"\n"+"Profession: "+i.prof+"\n"+"Year of joining: "+i.year+"\n"+"Levels completed: "+i.levels_completed+"\n");
							}
							
				}
			}
		});
		btnNewButton_2.setBounds(51, 531, 181, 33);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Request Speech");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SpeechRequests sr = new SpeechRequests(n);
				sr.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(51, 345, 181, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("View meetings");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMeetings vm = new ViewMeetings();
				vm.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(51, 611, 181, 33);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("FAQ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FaqPage fq = new FaqPage();
				fq.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBounds(51, 442, 181, 33);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("About Club");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClubClass cc = new ClubClass();
				cc.setVisible(true);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6.setBounds(51, 165, 181, 45);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priya\\Downloads\\New-Images6 (1).gif"));
		lblNewLabel.setBounds(0, 0, 1540, 835);
		contentPane.add(lblNewLabel);
		
		
	}
}
