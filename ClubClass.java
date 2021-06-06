package courseProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ClubClass extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	private JTextField estd;
	private JTextField mem_count;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClubClass frame = new ClubClass();
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
	public ClubClass() {
		setTitle("Speech Request");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setPreferredSize(new Dimension(1800,1800));
		//pack();
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Club Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(95, 100, 139, 41);
		contentPane.add(lblNewLabel);
		
		Name = new JTextField();
		Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Name.setBounds(261, 100, 174, 41);
		contentPane.add(Name);
		Name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Established");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(95, 200, 139, 35);
		contentPane.add(lblNewLabel_1);
		
		estd = new JTextField();
		estd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		estd.setBounds(261, 197, 174, 41);
		contentPane.add(estd);
		estd.setColumns(10);
		
		JButton btnNewButton = new JButton("Member_count");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = member_details.member_list.size();
				String s=String.valueOf(len);
				mem_count.setText(s);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(44, 308, 196, 41);
		contentPane.add(btnNewButton);
		
		mem_count = new JTextField();
		mem_count.setBounds(260, 312, 175, 41);
		contentPane.add(mem_count);
		mem_count.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("View Members");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ViewMembers viewMem = new ViewMembers(member_details.member_list);
				viewMem.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(44, 413, 190, 35);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("View Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Name.setText("Easy Speak");
				estd.setText("2000");
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(44, 37, 161, 35);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(299, 413, 122, 35);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\priya\\Downloads\\club (1).jpg"));
		lblNewLabel_2.setBounds(0, 0, 1540, 811);
		contentPane.add(lblNewLabel_2);
	}
}
