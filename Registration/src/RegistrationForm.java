import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class RegistrationForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtBirth;
	private JTextField txtUSN;
	private JTextField txtBranch;
	private JTextField txtSem;
	private JTextField txtModile;
	private JTextField txtEmail;
	private JTextField txtUser;
	private JPasswordField txtPass;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
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
	public RegistrationForm() {
		setForeground(new Color(246, 255, 242));
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/maazbobat/Desktop/user.png"));
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 718);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(246, 255, 242));
		contentPane.setBackground(new Color(63, 66, 62));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setForeground(new Color(246, 255, 242));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel.setBounds(20, 6, 50, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gender:");
		lblNewLabel_1.setForeground(new Color(246, 255, 242));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 46, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Birth Date:");
		lblNewLabel_2.setForeground(new Color(246, 255, 242));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_2.setBounds(20, 86, 81, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("USN:");
		lblNewLabel_3.setForeground(new Color(246, 255, 242));
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_3.setBounds(20, 126, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Branch:");
		lblNewLabel_4.setForeground(new Color(246, 255, 242));
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_4.setBounds(20, 166, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sem:");
		lblNewLabel_5.setForeground(new Color(246, 255, 242));
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_5.setBounds(20, 206, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Hostel/Day Scholar:");
		lblNewLabel_6.setForeground(new Color(246, 255, 242));
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_6.setBounds(20, 246, 147, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Mobile:");
		lblNewLabel_7.setForeground(new Color(246, 255, 242));
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_7.setBounds(20, 286, 61, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Email:");
		lblNewLabel_8.setForeground(new Color(246, 255, 242));
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_8.setBounds(20, 326, 61, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Address:");
		lblNewLabel_9.setForeground(new Color(246, 255, 242));
		lblNewLabel_9.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_9.setBounds(20, 366, 61, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Username:");
		lblNewLabel_10.setForeground(new Color(246, 255, 242));
		lblNewLabel_10.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_10.setBounds(20, 450, 81, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Password:");
		lblNewLabel_11.setForeground(new Color(246, 255, 242));
		lblNewLabel_11.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_11.setBounds(20, 500, 81, 16);
		contentPane.add(lblNewLabel_11);
		
		txtName = new JTextField();
		txtName.setForeground(new Color(0, 0, 0));
		txtName.setFont(UIManager.getFont("TextField.font"));
		txtName.setBounds(218, 2, 230, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JRadioButton rdMale = new JRadioButton("Male");
		rdMale.setForeground(new Color(246, 255, 242));
		buttonGroup.add(rdMale);
		rdMale.setBounds(218, 43, 61, 23);
		contentPane.add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("Female");
		rdFemale.setForeground(new Color(246, 255, 242));
		buttonGroup.add(rdFemale);
		rdFemale.setBounds(295, 43, 81, 23);
		contentPane.add(rdFemale);
		
		txtBirth = new JTextField();
		txtBirth.setForeground(new Color(0, 0, 0));
		txtBirth.setFont(UIManager.getFont("TextField.font"));
		txtBirth.setBounds(218, 82, 130, 26);
		contentPane.add(txtBirth);
		txtBirth.setColumns(10);
		
		txtUSN = new JTextField();
		txtUSN.setForeground(new Color(0, 0, 0));
		txtUSN.setFont(UIManager.getFont("TextField.font"));
		txtUSN.setBounds(218, 122, 230, 26);
		contentPane.add(txtUSN);
		txtUSN.setColumns(10);
		
		txtBranch = new JTextField();
		txtBranch.setForeground(new Color(0, 0, 0));
		txtBranch.setFont(UIManager.getFont("TextField.font"));
		txtBranch.setBounds(218, 162, 230, 26);
		contentPane.add(txtBranch);
		txtBranch.setColumns(10);
		
		txtSem = new JTextField();
		txtSem.setForeground(new Color(0, 0, 0));
		txtSem.setFont(UIManager.getFont("TextField.font"));
		txtSem.setBounds(218, 202, 230, 26);
		contentPane.add(txtSem);
		txtSem.setColumns(10);
		
		JRadioButton rdHostel = new JRadioButton("Hostel");
		rdHostel.setForeground(new Color(246, 255, 242));
		buttonGroup_1.add(rdHostel);
		rdHostel.setBounds(218, 243, 73, 23);
		contentPane.add(rdHostel);
		
		JRadioButton rdDay = new JRadioButton("Day Scholar");
		rdDay.setForeground(new Color(246, 255, 242));
		buttonGroup_1.add(rdDay);
		rdDay.setBounds(307, 243, 106, 23);
		contentPane.add(rdDay);
		
		txtModile = new JTextField();
		txtModile.setForeground(new Color(0, 0, 0));
		txtModile.setFont(UIManager.getFont("TextField.font"));
		txtModile.setBounds(218, 282, 230, 26);
		contentPane.add(txtModile);
		txtModile.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(new Color(0, 0, 0));
		txtEmail.setFont(UIManager.getFont("TextField.font"));
		txtEmail.setBounds(218, 322, 230, 26);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JTextArea txtAddr = new JTextArea();
		txtAddr.setForeground(new Color(0, 0, 0));
		txtAddr.setFont(UIManager.getFont("TextField.font"));
		txtAddr.setBounds(218, 367, 230, 70);
		contentPane.add(txtAddr);
		
		txtUser = new JTextField();
		txtUser.setForeground(new Color(0, 0, 0));
		txtUser.setFont(UIManager.getFont("TextField.font"));
		txtUser.setBounds(218, 446, 230, 26);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JPasswordField();
		txtPass.setForeground(new Color(0, 0, 0));
		txtPass.setFont(UIManager.getFont("TextField.font"));
		txtPass.setBounds(218, 496, 230, 26);
		contentPane.add(txtPass);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(100, 101, 101));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtUSN.setText("");
				txtBirth.setText("");
				txtBranch.setText("");
				txtSem.setText("");
				txtModile.setText("");
				txtEmail.setText("");
				txtAddr.setText("");
				txtUser.setText("");
				txtPass.setText("");
				buttonGroup.clearSelection();
				buttonGroup_1.clearSelection();
			}
		});
		btnReset.setForeground(new Color(246, 255, 242));
		btnReset.setBounds(130, 600, 117, 29);
		contentPane.add(btnReset);
		
		JButton btnValidate = new JButton("Register");
		btnValidate.setBackground(new Color(100, 101, 101));
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root", "");
					String query = "insert registration values(?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1, txtName.getText());
					if(rdMale.isSelected())
						ps.setString(2, rdMale.getText());
					else
						ps.setString(2, rdFemale.getText());
					ps.setString(3, txtUSN.getText());
					ps.setString(4, txtBirth.getText());
					ps.setString(5, txtBranch.getText());
					ps.setString(6, txtSem.getText());
					if(rdHostel.isSelected())
						ps.setString(7, rdHostel.getText());
					else
						ps.setString(7, rdDay.getText());
					ps.setString(8, txtModile.getText());
					ps.setString(9, txtEmail.getText());
					ps.setString(10, txtAddr.getText());
					ps.setString(11, txtUser.getText());
					ps.setString(12, txtPass.getText());
					
					int i = ps.executeUpdate();
					
					JOptionPane.showMessageDialog(btnValidate, i+" Record Added Successfully!");
					
					ps.close();
					con.close();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnValidate.setForeground(new Color(246, 255, 242));
		btnValidate.setBounds(280, 600, 117, 29);
		contentPane.add(btnValidate);
		
		JLabel lblNewLabel_12 = new JLabel("YYYY-MM-DD");
		lblNewLabel_12.setForeground(new Color(251, 252, 255));
		lblNewLabel_12.setBounds(350, 87, 98, 16);
		contentPane.add(lblNewLabel_12);
	}
}
