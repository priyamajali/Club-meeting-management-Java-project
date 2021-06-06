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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Frame;
import java.awt.Font;
import java.awt.Color;


class member
{
	 
	String name,prof;
	int year;
	String speech_titles;
	String levels_completed;
	//ArrayList<String> speeches = new ArrayList<String>();
	
	
	member() {}
	member(String name,String prof, int year,String levels_completed)
	{
		this.name=name;
		this.prof=prof;
		this.year=year;
		this.levels_completed=levels_completed;
		
		
	}
	
	
	
	
	public String toString()
	{
		return "Name: "+name+"\n"+"Profession: "+prof+"\n"+"Year of joining: "+year+"\n"+"levels completed: "+levels_completed+"\n";
	}
}

class member_details
{
	private static member_details single_instance = null;
	public static ArrayList<member> member_list = new ArrayList<member>();
	//public static ArrayList<String> speech_list = new ArrayList<String>();
	
	private member_details() {}
	
	
	
	 public static member_details getInstance() 
	    { 
	        if (single_instance == null) 
	            single_instance = new member_details(); 
	  
	        return single_instance; 
	    } 
	 void add_details(member m)
		{
			member_list.add(m);
		}
	 void print_details()
	 {
	 for(member i:member_list)
		{
			System.out.println(i.name);
		}
	 }
}



public class AddMembers extends JFrame {
	
	
	
	private JPanel contentPane;
	private JTextField name;
	private JTextField profession;
	private JTextField year_of_join;
	private JButton btnNewButton_1;
	public static ArrayList<member> member_list = new ArrayList<member>();
	private JLabel lblNewLabel_3;
	private JTextField levels;


	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		
				EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMembers frame = new AddMembers();
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
	
	public AddMembers() {
		
		setTitle("Add member");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setPreferredSize(new Dimension(1800,1800));
		//pack();
		contentPane.setLayout(null);
		
		

		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(562, 582, 96, 19);
		contentPane.add(lblNewLabel);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		name.setBounds(684, 577, 126, 29);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Profession");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(561, 616, 113, 26);
		contentPane.add(lblNewLabel_1);
		
		profession = new JTextField();
		profession.setFont(new Font("Tahoma", Font.PLAIN, 20));
		profession.setBounds(684, 616, 126, 29);
		contentPane.add(profession);
		profession.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Year of Join");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(562, 656, 113, 19);
		contentPane.add(lblNewLabel_2);
		
		year_of_join = new JTextField();
		year_of_join.setFont(new Font("Tahoma", Font.PLAIN, 20));
		year_of_join.setBounds(684, 655, 126, 29);
		contentPane.add(year_of_join);
		year_of_join.setColumns(10);
		
		lblNewLabel_3 = new JLabel("levels completed");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(882, 618, 170, 24);
		contentPane.add(lblNewLabel_3);
		
		levels = new JTextField();
		levels.setFont(new Font("Tahoma", Font.PLAIN, 20));
		levels.setBounds(1062, 613, 142, 28);
		contentPane.add(levels);
		levels.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				String s2 = profession.getText();
				String s3 = year_of_join.getText();
				int year = Integer.parseInt(s3);
				
				String level = levels.getText();
				
				
				//System.out.println(s1+" "+s2+year);
				
				
				//member_list.add(new member(s1,s2,year));
				
				member m1 = new member(s1,s2,year,level);
				
				member_details x = member_details.getInstance();
				x.add_details(m1);
				//x.print_details();
				
				ViewMembers vm = new ViewMembers(member_details.member_list);
				//vm.setVisible(true);
				
				
				
				
				JOptionPane.showMessageDialog(null, "member added");
				
				
			}
					
			
		});
		
		
		
		
		btnNewButton.setBounds(694, 694, 95, 29);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(964, 694, 96, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\priya\\Downloads\\Add. (2).jpg"));
		lblNewLabel_4.setBounds(0, 0, 1552, 849);
		contentPane.add(lblNewLabel_4);
		
		
		
	}
	
}
