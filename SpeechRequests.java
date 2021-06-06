package courseProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

class Speech_request
{
	 String level;
	String title;
	String name;

	
	
	
	 Speech_request(String level,String title,String name) 
	 {
		 this.level=level;
		 this.title=title;
		 this.name=name;
	 }
		
	
	
	
	 
}
class request_list
{
	private static request_list single_instance = null;
	
	public static ArrayList<Speech_request> requests = new ArrayList<Speech_request>();
	private request_list() {}
	
	
	
	 public static request_list getInstance() 
	    { 
	        if (single_instance == null) 
	            single_instance = new request_list(); 
	  
	        return single_instance; 
	    } 
}



public class SpeechRequests extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpeechRequests frame = new SpeechRequests();
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
	
	/*public SpeechRequests() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Speech level");
		lblNewLabel.setBounds(35, 63, 68, 13);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(136, 59, 56, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Speech title");
		lblNewLabel_1.setBounds(34, 117, 69, 13);
		contentPane.add(lblNewLabel_1);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Ice Breaker(Introduction)", "Research and present", "Intermediate speech", "Advance speech"}));
		comboBox_1.setBounds(136, 113, 104, 21);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("request");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String level = comboBox.getSelectedItem().toString();
				String title = comboBox_1.getSelectedItem().toString();
				
				//Speech_request x = Speech_request.getInstance();
				
				//System.out.println(Speech_request.level+":"+Speech_request.name+":"+Speech_request.title);
				ApproveRequests a = new ApproveRequests();
				//a.setVisible(true);
				JOptionPane.showMessageDialog(null, "Request sent successfully!");
				
			}
		});
		btnNewButton.setBounds(40, 195, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(135, 195, 85, 21);
		contentPane.add(btnNewButton_1);
		
		approve_field = new JTextField();
		approve_field.setBounds(124, 157, 96, 19);
		contentPane.add(approve_field);
		approve_field.setColumns(10);
		
		approve_field.setText("Approved");
		
		lblNewLabel_2 = new JLabel("Status");
		lblNewLabel_2.setBounds(31, 160, 45, 13);
		contentPane.add(lblNewLabel_2);
		
	}*/
	
	
	public SpeechRequests(String name) {
		final String n=name;
		
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
		
		JLabel lblNewLabel = new JLabel("Speech level");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(999, 410, 135, 25);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(1182, 410, 56, 25);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Speech title");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(998, 468, 124, 21);
		contentPane.add(lblNewLabel_1);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Ice Breaker(Introduction)", "Research and present", "Intermediate speech", "Advance speech"}));
		comboBox_1.setBounds(1182, 468, 156, 31);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("request");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String level = comboBox.getSelectedItem().toString();
				String title = comboBox_1.getSelectedItem().toString();
				
				Speech_request sr = new Speech_request(level, title, n);
				request_list x = request_list.getInstance();
				x.requests.add(sr);
				
				
				ApproveRequests a = new ApproveRequests();
				//a.setVisible(true);
				JOptionPane.showMessageDialog(null, "Request sent successfully!");
				
			}
		});
		btnNewButton.setBounds(1019, 586, 124, 31);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(1169, 586, 95, 31);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\priya\\Downloads\\gif-talk (1).gif"));
		lblNewLabel_3.setBounds(0, 0, 1542, 857);
		contentPane.add(lblNewLabel_3);
	}
}
