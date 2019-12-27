
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class addNum extends JFrame {

	private JPanel contentPane;
	private JTextField f1;
	private JTextField f2;
	private JTextField add;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addNum frame = new addNum();
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
	public addNum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel firstip = new JLabel("num1");
		firstip.setFont(new Font("Times New Roman", Font.BOLD, 15));
		firstip.setBounds(62, 44, 46, 14);
		panel.add(firstip);
		
		JLabel secondip = new JLabel("");
		secondip.setBounds(314, 44, 46, 14);
		panel.add(secondip);
		
		f1 = new JTextField();
		f1.setBounds(62, 104, 86, 20);
		panel.add(f1);
		f1.setColumns(10);
		
		f2 = new JTextField();
		f2.setBounds(314, 104, 86, 20);
		panel.add(f2);
		f2.setColumns(10);
		
		JButton plus = new JButton("ADD");
		plus.setBackground(Color.CYAN);
		plus.setFont(new Font("Tahoma", Font.BOLD, 15));
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(f1.getText());
				int b=Integer.parseInt(f2.getText());
				int ans=a+b;
				add.setText(String.valueOf(ans));
			}
		});
		plus.setBounds(186, 132, 89, 23);
		panel.add(plus);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f1.setText("");
				f2.setText("");
				add.setText("");
				JOptionPane.showMessageDialog(null, "Everthing is cleared");
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(62, 217, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(311, 217, 89, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("num2");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(324, 45, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblAns = new JLabel("Ans");
		lblAns.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAns.setBounds(72, 175, 46, 14);
		panel.add(lblAns);
		
		add = new JTextField();
		add.setBounds(168, 173, 86, 20);
		panel.add(add);
		add.setColumns(10);
	}
}
