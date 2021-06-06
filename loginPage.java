package courseProject;

import java.awt.BorderLayout;
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

public class loginPage extends JFrame {

	private JPanel contentPane;
	private JTextField admin_un;
	private JTextField admin_pass;
	private JTextField member_un;
	private JTextField member_pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginPage frame = new loginPage();
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
	public loginPage() {
		setTitle("LOGIN PAGE");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setPreferredSize(new Dimension(1800,1800));
		//pack();
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(254, 268, 103, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(206, 356, 115, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(206, 413, 91, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Members");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(1138, 273, 125, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("UserName");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(1119, 357, 103, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(1119, 415, 103, 35);
		contentPane.add(lblNewLabel_5);
		
		admin_un = new JTextField();
		admin_un.setFont(new Font("Tahoma", Font.PLAIN, 20));
		admin_un.setBounds(382, 355, 117, 26);
		contentPane.add(admin_un);
		admin_un.setColumns(10);
		
		admin_pass = new JTextField();
		admin_pass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		admin_pass.setBounds(382, 415, 117, 31);
		contentPane.add(admin_pass);
		admin_pass.setColumns(10);
		
		member_un = new JTextField();
		member_un.setFont(new Font("Tahoma", Font.PLAIN, 20));
		member_un.setBounds(1300, 356, 125, 26);
		contentPane.add(member_un);
		member_un.setColumns(10);
		
		member_pass = new JTextField();
		member_pass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		member_pass.setBounds(1301, 409, 124, 35);
		contentPane.add(member_pass);
		member_pass.setColumns(10);
		
		JButton login = new JButton("login");
		login.setBackground(Color.GREEN);
		login.setForeground(Color.DARK_GRAY);
		login.setFont(new Font("Tahoma", Font.PLAIN, 20));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String um = admin_un.getText();
				String pass = admin_pass.getText();
				if((um.equals("admin")) && (pass.equals("admin123")))
				{
					Demo d = new Demo();
					d.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid credentials. Try Again!!");
				}
			}
		});
		login.setBounds(298, 496, 91, 35);
		contentPane.add(login);
		
		JButton login_member = new JButton("login member");
		login_member.setBackground(Color.GREEN);
		login_member.setForeground(Color.DARK_GRAY);
		login_member.setFont(new Font("Tahoma", Font.PLAIN, 20));
		login_member.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = member_un.getText();
				String pass = member_pass.getText();
				int flag=0;
				
				for(member i : member_details.member_list)
				{
					if(i.name.equals(name))
					{
						if(pass.equals(name))
						{
							flag=1;
							member_page mp = new member_page(name);
							//AddMembers d = new AddMembers();
							mp.setVisible(true);
						}
					}
				}
				
				
				if(flag==0)
				{
					JOptionPane.showMessageDialog(null, "Invalid credentials. Try Again!!");
				}
			}
		});
		login_member.setBounds(1187, 496, 170, 32);
		contentPane.add(login_member);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\priya\\Downloads\\Corporate-CEO (2).gif"));
		lblNewLabel_6.setBounds(10, 0, 1537, 844);
		contentPane.add(lblNewLabel_6);
	}

}
