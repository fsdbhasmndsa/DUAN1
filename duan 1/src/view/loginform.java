package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginform extends JFrame {
	private final Panel panel = new Panel();
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginform frame = new loginform();
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
	public loginform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 477, 441);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(loginform.class.getResource("/icon/logo-xe-day-1.jpeg")));
		label.setBounds(-228, 58, 695, 326);
		panel.add(label);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(25, 118, 211));
		panel_1.setBounds(471, 0, 420, 441);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 32));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 47, 408, 47);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Heloo! let's get started");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 97, 408, 29);
		panel_1.add(lblNewLabel_1);
		
		setUndecorated(true);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblUsername.setBounds(44, 137, 408, 29);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblPassword.setBounds(44, 225, 408, 29);
		panel_1.add(lblPassword);
		
		passwordField = new JPasswordField();
		
		passwordField.setBounds(44, 259, 264, 29);
		
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(loginform.class.getResource("/icon/icons8-user-36.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(328, 169, 59, 34);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(loginform.class.getResource("/icon/icons8-password-36.png")));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(328, 264, 59, 34);
		panel_1.add(lblNewLabel_2_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember Password ?");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(44, 309, 164, 23);
		panel_1.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setBackground(new Color(25, 118, 211));
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(44, 346, 331, 39);
		panel_1.add(btnNewButton);
		
		JLabel lblDontHave = new JLabel("Don't have an account ?  Sign Up");
		lblDontHave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(lblDontHave, "gay");
			}
		});
		lblDontHave.setHorizontalAlignment(SwingConstants.CENTER);
		lblDontHave.setForeground(Color.WHITE);
		lblDontHave.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblDontHave.setBounds(0, 396, 408, 29);
		panel_1.add(lblDontHave);
		
		JLabel lblForgetPassword = new JLabel("Forget Password ?");
		lblForgetPassword.setForeground(Color.WHITE);
		lblForgetPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblForgetPassword.setBounds(224, 305, 408, 29);
		panel_1.add(lblForgetPassword);
		
		JLabel lblNewLabel_3 = new JLabel("x");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 29));
		lblNewLabel_3.setBounds(362, -4, 69, 36);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("______________________________________");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(44, 200, 295, 14);
		panel_1.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(44, 177, 264, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("______________________________________");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setBounds(44, 281, 295, 14);
		panel_1.add(lblNewLabel_4_1);;
		
		
		setLocationRelativeTo(null);
	}
}
