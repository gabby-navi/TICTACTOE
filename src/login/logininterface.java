package login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class logininterface {

	private JFrame frmTicTacToe;
	public static JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logininterface window = new logininterface();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	
	public logininterface() {
		initialize();
	}
	
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("TIC TAC TOE");
		frmTicTacToe.getContentPane().setBackground(Color.WHITE);
		frmTicTacToe.setBounds(100, 100, 791, 617);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.setLocationRelativeTo(null);
		frmTicTacToe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MEMBER LOGIN");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 21));
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_1.setBounds(422, 243, 276, 33);
		frmTicTacToe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TIC TAC TOE");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 38));
		lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2.setBounds(390, 125, 333, 33);
		frmTicTacToe.getContentPane().add(lblNewLabel_2);
		
		txtUsername = new JTextField();		
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtUsername.getText().trim().toLowerCase().equals("username")) {
					txtUsername.setText("");
					txtUsername.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtUsername.getText().trim().equals("") || 
					txtUsername.getText().trim().toLowerCase().equals("username")) {
					txtUsername.setText("username");
					txtUsername.setForeground(new Color (153, 153, 153));
				}
			}
		});
		
		txtUsername.setFont(new Font("Bell MT", Font.PLAIN, 15));
		txtUsername.setText("username");
		txtUsername.setOpaque(false);
		txtUsername.setBorder(null);
		txtUsername.setBounds(484, 277, 182, 27);
		frmTicTacToe.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				String pass = String.valueOf(pwdPassword.getPassword());
				
				if (pass.trim().toLowerCase().equals("password")) {
					pwdPassword.setText("");
					pwdPassword.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				String pass = String.valueOf(pwdPassword.getPassword());
				
				if (pass.trim().equals("") || pass.trim().toLowerCase().equals("password")) {
					pwdPassword.setText("password");
					pwdPassword.setForeground(new Color (153, 153, 153));
				}
			}
		});
		pwdPassword.setText("password");
		pwdPassword.setToolTipText("");
		pwdPassword.setOpaque(false);
		pwdPassword.setBorder(null);
		pwdPassword.setBounds(484, 321, 182, 27);
		frmTicTacToe.getContentPane().add(pwdPassword);
		
		JLabel validation = new JLabel("");
		validation.setHorizontalAlignment(SwingConstants.CENTER);
		validation.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		validation.setForeground(new Color(255, 0, 0));
		validation.setBounds(312, 505, 427, 33);
		frmTicTacToe.getContentPane().add(validation);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtUsername.getText().equals("User") && pwdPassword.getText().equals("Password")) {
					new welcomepage().setVisible(true);
					frmTicTacToe.dispose();
				}
				else {
					validation.setText("Invalid username or password! Please try again!");
				}
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setIcon(new ImageIcon(logininterface.class.getResource("/images/Untitled-2.png")));
		btnNewButton_1.setBounds(624, 387, 103, 104);
		frmTicTacToe.getContentPane().add(btnNewButton_1);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(logininterface.class.getResource("/images/Untitled-3.png")));
		btnNewButton.setBounds(560, 402, 89, 94);
		frmTicTacToe.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Don't have an account?");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new createacc().setVisible(true);
				frmTicTacToe.dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Bell MT", Font.PLAIN, 12));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(432, 360, 160, 23);
		frmTicTacToe.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel.setIcon(new ImageIcon(logininterface.class.getResource("/images/Untitled.png")));
		lblNewLabel.setBounds(0, 0, 804, 576);
		frmTicTacToe.getContentPane().add(lblNewLabel);
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
