

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Choice;
import java.awt.List;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlStatements extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField first;
	private JTextField name;
	private JTextField sec;
	private JTextField s;
	private JTable table_2;
	private JTable table_1;
	private JTable table_3;
	private JTextField cost;
	private JTextField nos;
	private JTextField tot;
	private JTextField dis;
	private JTextField gst;
	private JTextField np;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlStatements frame = new ControlStatements();
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
	public ControlStatements() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 860);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel db = new JPanel();
		contentPane.add(db, BorderLayout.CENTER);
		db.setLayout(null);
		
		JCheckBox o = new JCheckBox("");
		o.setBackground(Color.ORANGE);
		o.setBounds(79, 67, 26, 23);
		db.add(o);
		
		JCheckBox t = new JCheckBox("");
		t.setBackground(Color.ORANGE);
		t.setBounds(107, 67, 19, 23);
		db.add(t);
		
		JCheckBox th = new JCheckBox("");
		th.setBackground(Color.ORANGE);
		th.setBounds(79, 93, 26, 23);
		db.add(th);
		
		JCheckBox f = new JCheckBox("New check box");
		f.setBackground(Color.ORANGE);
		f.setBounds(107, 93, 19, 23);
		db.add(f);
		
		JCheckBox fi = new JCheckBox("");
		fi.setBackground(Color.ORANGE);
		fi.setFont(new Font("Tahoma", Font.PLAIN, 11));
		fi.setBounds(79, 119, 26, 23);
		db.add(fi);
		
		JCheckBox si = new JCheckBox("");
		si.setBackground(Color.ORANGE);
		si.setBounds(107, 119, 19, 23);
		db.add(si);
		
		JCheckBox se = new JCheckBox("");
		se.setBackground(Color.ORANGE);
		se.setBounds(79, 145, 26, 23);
		db.add(se);
		
		JCheckBox ei = new JCheckBox("");
		ei.setBackground(Color.ORANGE);
		ei.setBounds(107, 145, 19, 23);
		db.add(ei);
		
		table = new JTable();
		table.setBackground(Color.BLUE);
		table.setBounds(64, 55, 77, 127);
		db.add(table);
		
		JLabel lblNewLabel = new JLabel("SEATS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(79, 30, 62, 14);
		db.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BOOKING TICKETS");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(344, 11, 172, 14);
		db.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BOOKING DETAIL");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(252, 31, 137, 14);
		db.add(lblNewLabel_2);
		
		JLabel n = new JLabel("Name");
		n.setFont(new Font("Times New Roman", Font.BOLD, 15));
		n.setBounds(252, 67, 46, 14);
		db.add(n);
		
		JLabel DOB = new JLabel("Date of Birth");
		DOB.setFont(new Font("Times New Roman", Font.BOLD, 14));
		DOB.setBounds(252, 93, 108, 14);
		db.add(DOB);
		
		JCheckBox po = new JCheckBox("PHYSICALLY DISABLED");
		po.setFont(new Font("Times New Roman", Font.BOLD, 14));
		po.setBounds(252, 119, 194, 23);
		db.add(po);
		
		first = new JTextField();
		first.setBounds(252, 148, 86, 20);
		db.add(first);
		first.setColumns(10);
		
		name = new JTextField();
		name.setBounds(370, 67, 108, 20);
		db.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(252, 237, 46, 14);
		db.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date of Birth");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setBounds(252, 262, 86, 14);
		db.add(lblNewLabel_4);
		
		JCheckBox pop = new JCheckBox("PHYSICALLY DISABLED");
		pop.setFont(new Font("Times New Roman", Font.BOLD, 15));
		pop.setBounds(252, 289, 204, 23);
		db.add(pop);
		
		sec = new JTextField();
		sec.setBounds(252, 319, 86, 20);
		db.add(sec);
		sec.setColumns(10);
		
		s = new JTextField();
		s.setBounds(360, 235, 118, 20);
		db.add(s);
		s.setColumns(10);
		
		table_2 = new JTable();
		table_2.setBounds(228, 215, 1, 1);
		db.add(table_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(370, 93, 108, 20);
		db.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(370, 262, 108, 20);
		db.add(dateChooser_1);
		
		table_1 = new JTable();
		table_1.setBackground(Color.LIGHT_GRAY);
		table_1.setBounds(239, 55, 250, 120);
		db.add(table_1);
		
		table_3 = new JTable();
		table_3.setBackground(Color.LIGHT_GRAY);
		table_3.setBounds(239, 215, 250, 133);
		db.add(table_3);
		
		JLabel c1 = new JLabel("COST");
		c1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		c1.setBounds(569, 50, 55, 23);
		db.add(c1);
		
		JLabel lblNewLabel_5 = new JLabel("NOS");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_5.setBounds(569, 93, 46, 14);
		db.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("TOTAL");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_6.setBounds(569, 128, 55, 14);
		db.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("DISCOUNT");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_7.setBounds(569, 168, 94, 14);
		db.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("GST");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_8.setBounds(569, 202, 46, 14);
		db.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("NET PRICE");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_9.setBounds(569, 263, 94, 14);
		db.add(lblNewLabel_9);
		
		cost = new JTextField();
		cost.setBounds(673, 52, 86, 20);
		db.add(cost);
		cost.setColumns(10);
		
		nos = new JTextField();
		nos.setColumns(10);
		nos.setBounds(673, 93, 86, 20);
		db.add(nos);
		
		tot = new JTextField();
		tot.setColumns(10);
		tot.setBounds(673, 122, 86, 20);
		db.add(tot);
		
		dis = new JTextField();
		dis.setColumns(10);
		dis.setBounds(673, 162, 86, 20);
		db.add(dis);
		
		gst = new JTextField();
		gst.setColumns(10);
		gst.setBounds(673, 200, 86, 20);
		db.add(gst);
		
		np = new JTextField();
		np.setColumns(10);
		np.setBounds(673, 260, 86, 20);
		db.add(np);
		
		JLabel lblNewLabel_10 = new JLabel("RS");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_10.setBounds(794, 55, 46, 14);
		db.add(lblNewLabel_10);
		
		JLabel label = new JLabel("RS");
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(794, 128, 46, 14);
		db.add(label);
		
		JLabel label_1 = new JLabel("RS");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(794, 168, 46, 14);
		db.add(label_1);
		
		JLabel label_2 = new JLabel("RS");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_2.setBounds(794, 203, 46, 14);
		db.add(label_2);
		
		JLabel label_3 = new JLabel("RS");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_3.setBounds(794, 263, 46, 14);
		db.add(label_3);
		
		JButton print = new JButton("PRINT");
		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String select=null,select1=null;
				int count=0;
				if(o.isSelected())
				{
					select="Seat NO : 1";
					//select1="Seat NO : 1";
					count++;
					
				}
				 if(t.isSelected())
				{
					//select="Seat NO : 2";
					select1="Seat NO : 2";
					count++;
				}
				 if(th.isSelected())
				{
					select1="Seat NO : 3";
					count++;
				}
				else if(f.isSelected())
				{
					select1="Seat NO : 4";
					count++;
				}
				else if(fi.isSelected())
				{
					select1="Seat NO : 5";
					count++;
				}
				else if(si.isSelected())
				{
					select1="Seat NO : 6";
					count++;
				}
				else if(se.isSelected())
				{
					select1="Seat NO : 7";
					count++;
				}
				else if(ei.isSelected())
				{
					select1="Seat NO : 8";
					count++;
				}
				String name1=name.getText();
				String name2=s.getText();
				first.setText(select);
				sec.setText(select1);
				name.setText(name1);     
				s.setText(name2);
				float co=Float.parseFloat(cost.getText());
				nos.setText(String.valueOf(count)); //print
				Float to=co*(float)count;
				tot.setText(String.valueOf(to));     //print
				float disc=Float.parseFloat(dis.getText());
				float gis=Float.parseFloat(gst.getText());
				float fi=to-disc+gis;
				np.setText(String.valueOf(fi));
				JOptionPane.showMessageDialog(null, "Thanks for Booking!!!\nHave a HAPPY AND SAFE JOURNEY");
			}
		});
		print.setBackground(Color.CYAN);
		print.setForeground(Color.BLACK);
		print.setFont(new Font("Times New Roman", Font.BOLD, 15));
		print.setBounds(632, 337, 89, 23);
		db.add(print);
	}
}
