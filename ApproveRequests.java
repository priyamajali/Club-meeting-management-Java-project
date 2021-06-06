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
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;

class approve
{
private static approve single_instance = null;
	
	public static ArrayList<String> approved_members = new ArrayList<String>();
	private approve() {}
	
	
	
	 public static approve getInstance() 
	    { 
	        if (single_instance == null) 
	            single_instance = new approve(); 
	  
	        return single_instance; 
	    } 
}
public class ApproveRequests extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField name;
	private JTextField title;
	private JTextField level;
	private JButton btnNewButton;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApproveRequests frame = new ApproveRequests();
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
	public ApproveRequests() {
		
		
		setTitle("Approve request");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setPreferredSize(new Dimension(1800,1800));
		//pack();
		contentPane.setLayout(null);
		
		
		
		btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(487, 342, 121, 30);
		contentPane.add(btnNewButton_1);
		
		textArea = new JTextArea();
		textArea.setBounds(326, 61, 469, 271);
		contentPane.add(textArea);
		
		btnNewButton_2 = new JButton("request list");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(request_list.requests.isEmpty())
				{
					textArea.setText(" ");
					JOptionPane.showMessageDialog(null, "No requests left!");
				}
				else
				{
					textArea.setText(" ");
				for(Speech_request i:request_list.requests)
				{
					textArea.append(i.name+" "+i.level+" "+i.title+"\n");
				}
				}
			}
		});
		btnNewButton_2.setBounds(344, 21, 137, 30);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel = new JLabel("Approved List");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(856, 32, 156, 30);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(859, 77, 63, 26);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("title");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(859, 131, 66, 19);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("level");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(863, 185, 96, 19);
		contentPane.add(lblNewLabel_3);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		name.setBounds(984, 77, 121, 30);
		contentPane.add(name);
		name.setColumns(10);
		
		title = new JTextField();
		title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		title.setBounds(984, 127, 121, 33);
		contentPane.add(title);
		title.setColumns(10);
		
		level = new JTextField();
		level.setFont(new Font("Tahoma", Font.PLAIN, 20));
		level.setBounds(984, 185, 121, 30);
		contentPane.add(level);
		level.setColumns(10);
		
		btnNewButton = new JButton("Approve");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				String s2 = title.getText();
				String s3 = level.getText();
				for(member i:member_details.member_list)
				{
					if((i.name).equals(s1))
					{
					String s = i.levels_completed;
					int level = Integer.parseInt(s);
					level++;
					String st =String.valueOf(level);
					i.levels_completed=st;
					}
					
				}
				approve.approved_members.add(s1);
				int count = 0;
				
				
				
				for(Speech_request i:request_list.requests)
				{
					if((i.name).equals(s1))
					{
						request_list.requests.remove(count);
						break;
					}
					count++;
				}
				
				
			}
		});
		btnNewButton.setBounds(927, 245, 113, 33);
		contentPane.add(btnNewButton);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\priya\\Downloads\\req (1).gif"));
		lblNewLabel_4.setBounds(0, 0, 1545, 857);
		contentPane.add(lblNewLabel_4);
		
		
		
	}

}
