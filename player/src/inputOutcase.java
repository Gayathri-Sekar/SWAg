
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

public class inputOutcase extends JFrame {

	private JPanel contentPane;
	private JTextField fna;
	private JTextField lan;
	private JTextField bir;
	private JTextField mail;
	private JTextArea ans;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inputOutcase frame = new inputOutcase();
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
	public inputOutcase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 783, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(373, 5, 10, 10);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("User Application");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setBounds(342, 45, 114, 14);
		panel.add(lblNewLabel);
		
		JLabel fn = new JLabel("First Name");
		fn.setFont(new Font("Times New Roman", Font.BOLD, 13));
		fn.setBounds(175, 122, 91, 14);
		panel.add(fn);
		
		JLabel ln = new JLabel("Last Name");
		ln.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ln.setBounds(175, 168, 66, 14);
		panel.add(ln);
		
		JLabel dob = new JLabel("Date of Birth");
		dob.setFont(new Font("Times New Roman", Font.BOLD, 13));
		dob.setBounds(175, 210, 91, 14);
		panel.add(dob);
		
		JLabel gen = new JLabel("Gender");
		gen.setFont(new Font("Times New Roman", Font.BOLD, 13));
		gen.setBounds(175, 246, 66, 14);
		panel.add(gen);
		
		JLabel id = new JLabel("Email ID");
		id.setFont(new Font("Times New Roman", Font.BOLD, 13));
		id.setBounds(175, 282, 91, 14);
		panel.add(id);
		
		fna = new JTextField();
		fna.setBounds(370, 116, 86, 20);
		panel.add(fna);
		fna.setColumns(10);
		
		lan = new JTextField();
		lan.setBounds(370, 162, 86, 20);
		panel.add(lan);
		lan.setColumns(10);
		
		bir = new JTextField();
		bir.setBounds(370, 207, 86, 20);
		panel.add(bir);
		bir.setColumns(10);
		
		JRadioButton m = new JRadioButton("male");
		buttonGroup.add(m);
		m.setBounds(367, 242, 109, 23);
		panel.add(m);
		
		JRadioButton f = new JRadioButton("female");
		buttonGroup.add(f);
		f.setBounds(522, 242, 109, 23);
		panel.add(f);
		
		mail = new JTextField();
		mail.setBounds(370, 279, 222, 20);
		panel.add(mail);
		mail.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=fna.getText();
				String b=lan.getText();
				String c=bir.getText();
	            String d=m.getText();
	            if(m.isSelected())
	            {
	            d="Gender\tMale"
	            		+ "\n";
	            }
	            
	            else
	            {
	            	d="Gender\tFemale"
	            	+ "\n";
	            }
	            String f=mail.getText();
	            
				ans.setText("Registration Successful ! ! Your details are:"+"\n"+"First Name\t"+a+"\n"+"Last Name\t"+b+"\n"+"Date of Birth\t"+c+"\n"+d+"Email ID\t"+f);
			}
		});
		btnSubmit.setBackground(Color.DARK_GRAY);
		btnSubmit.setForeground(Color.CYAN);
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnSubmit.setBounds(277, 329, 89, 23);
		panel.add(btnSubmit);
		
		ans = new JTextArea();
		ans.setBounds(61, 363, 573, 211);
		panel.add(ans);
	}
}
