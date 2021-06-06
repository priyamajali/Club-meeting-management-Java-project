package courseProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;

class meeting
{
	String meeting_number;
	String speaker1;
	String speaker2;
	String evaluator1;
	String evaluator2;
	String type;
	
	meeting(String meeting_number,String speaker1,String speaker2,String evaluator1,String evaluator2,String type)
	{
		this.meeting_number=meeting_number;
		this.speaker1=speaker1;
		this.speaker2=speaker2;
		this.evaluator1=evaluator1;
		this.evaluator2=evaluator2;
		this.type=type;
	}
}

class online_meet extends meeting
{
	String platform;
	online_meet(String meeting_number, String speaker1, String speaker2, String evaluator1, String evaluator2,String type,String platform) {
		super(meeting_number, speaker1, speaker2, evaluator1, evaluator2,type);
		this.platform=platform;
		
	}
	
}

class offline_meet extends meeting
{
	double budget;
	offline_meet(String meeting_number, String speaker1, String speaker2, String evaluator1, String evaluator2,String type,double budget) {
		super(meeting_number, speaker1, speaker2, evaluator1,evaluator2,type);
		// TODO Auto-generated constructor stub
		this.budget=budget;
	}
	
}

class meeting_list
{
	private static meeting_list single_instance = null;
	public static ArrayList<meeting> list = new ArrayList<meeting>();
	
	private meeting_list() {}
	
	
	
	 public static meeting_list getInstance() 
	    { 
	        if (single_instance == null) 
	            single_instance = new meeting_list(); 
	  
	        return single_instance; 
	    }



	
		
	}

	 

public class CreateMeeting extends JFrame {

	private JPanel contentPane;
	private JTextField meet_no;
	private JTextField sp1;
	private JTextField desp;
	private JTextField sp2;
	private JTextField el1;
	private JTextField el2;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateMeeting frame = new CreateMeeting();
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
	public CreateMeeting() {
		setTitle("Create meetings");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setPreferredSize(new Dimension(1800,1800));
		//pack();
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Meeting number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(710, 35, 161, 27);
		contentPane.add(lblNewLabel);
		
		meet_no = new JTextField();
		meet_no.setFont(new Font("Tahoma", Font.PLAIN, 20));
		meet_no.setBounds(881, 38, 129, 27);
		contentPane.add(meet_no);
		meet_no.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Speaker 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(710, 75, 113, 27);
		contentPane.add(lblNewLabel_1);
		
		sp1 = new JTextField();
		sp1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sp1.setBounds(881, 75, 129, 27);
		contentPane.add(sp1);
		sp1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Speaker 2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(710, 112, 101, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Evaluator 1");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(710, 149, 113, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("evaluator 2");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(710, 189, 101, 27);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Platform");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Enter platform");
				String s = meet_no.getText();
				String s1 = sp1.getText();
				String s2 = sp2.getText();
				String ev1 = el1.getText();
				String ev2 = el2.getText();
				String pl = desp.getText();
				
				online_meet om = new online_meet(s,s1,s2,ev1,ev2,"online",pl);
				meeting_list.list.add(om);
				
			}
		});
		btnNewButton.setBounds(694, 242, 129, 27);
		contentPane.add(btnNewButton);
		
		desp = new JTextField();
		desp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		desp.setBounds(881, 242, 129, 27);
		contentPane.add(desp);
		desp.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("create meeting");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Meeting created!");
				
			}
		});
		btnNewButton_2.setBounds(1057, 355, 172, 27);
		contentPane.add(btnNewButton_2);
		
		sp2 = new JTextField();
		sp2.setBounds(881, 112, 129, 27);
		contentPane.add(sp2);
		sp2.setColumns(10);
		
		el1 = new JTextField();
		el1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		el1.setBounds(881, 149, 129, 27);
		contentPane.add(el1);
		el1.setColumns(10);
		
		el2 = new JTextField();
		el2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		el2.setBounds(881, 189, 129, 27);
		contentPane.add(el2);
		el2.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(1085, 139, 298, 206);
		contentPane.add(textArea);
		
		JButton btnNewButton_3 = new JButton("approved");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
				for(String i:approve.approved_members)
				{
					
					textArea.append("Speaker list: "+i+"\n");
				}
			}
		});
		btnNewButton_3.setBounds(1075, 96, 122, 27);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("evaluators");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
				for(member i:member_details.member_list)
				{
					for (String element : approve.approved_members){
				         if (element.contains(i.name)){
				               continue;
				         }
				         else
				         {
					textArea.append("Member name: "+i.name+"\n");
				         }
				}
			}
				
			}
		});
		btnNewButton_4.setBounds(1207, 96, 129, 27);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("back");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_5.setBounds(896, 355, 136, 27);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\priya\\Downloads\\NoMeetingDay-1 (1).gif"));
		lblNewLabel_5.setBounds(0, 0, 1553, 849);
		contentPane.add(lblNewLabel_5);
	}

}
