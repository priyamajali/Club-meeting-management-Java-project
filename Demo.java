package courseProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;

public class Demo extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
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
	
	public Demo() {
		
		setTitle("Demo");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setPreferredSize(new Dimension(1800,1800));
		//pack();
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add members");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMembers am = new AddMembers();
				am.setVisible(true);
			}
		});
		btnNewButton.setBounds(411, 605, 178, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View members");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMembers viewMem = new ViewMembers(member_details.member_list);
				viewMem.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(411, 648, 178, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remove members");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveMembers rm  = new RemoveMembers();
				rm.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(599, 606, 267, 31);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Appprove Speech requests");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApproveRequests ar = new ApproveRequests();
				ar.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(599, 649, 267, 31);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("create meetings");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateMeeting cm = new CreateMeeting();
				cm.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(892, 605, 187, 33);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.setBackground(Color.RED);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_5.setBounds(696, 704, 109, 31);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("View meetings");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMeetings vm = new ViewMeetings();
				vm.setVisible(true);
						
			}
		});
		btnNewButton_6.setBounds(892, 649, 189, 30);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priya\\Downloads\\product-demo-video (1).gif"));
		lblNewLabel.setBounds(0, 0, 1543, 856);
		contentPane.add(lblNewLabel);
	}
}
