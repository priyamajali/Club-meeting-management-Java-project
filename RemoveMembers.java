package courseProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;

public class RemoveMembers extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField reason;
	private final JLabel lblNewLabel_3 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveMembers frame = new RemoveMembers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RemoveMembers() {
		setTitle("Remove members");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setPreferredSize(new Dimension(1800,1800));
		//pack();
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Remove Member");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(297, 230, 170, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(297, 299, 64, 34);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		name.setBounds(371, 299, 152, 31);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Reason");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(297, 343, 78, 28);
		contentPane.add(lblNewLabel_2);
		
		reason = new JTextField();
		reason.setFont(new Font("Tahoma", Font.PLAIN, 20));
		reason.setBounds(371, 340, 152, 31);
		contentPane.add(reason);
		reason.setColumns(10);
		
		JButton btnNewButton = new JButton("Remove");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				String s2 = reason.getText();
				int count =0;
				for(member i:member_details.member_list)
				{
					if(s1.equals(i.name))
					{
						member_details.member_list.remove(count);
						JOptionPane.showMessageDialog(null, "member removed");
						break;
					}
					count++;
					
				}
				
			}
		});
		btnNewButton.setBounds(297, 415, 109, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(434, 415, 89, 31);
		contentPane.add(btnNewButton_1);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\priya\\Downloads\\rem (1).gif"));
		lblNewLabel_3.setBounds(0, 10, 1546, 863);
		contentPane.add(lblNewLabel_3);
	}
}
