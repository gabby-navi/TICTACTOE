package login;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class createacc extends JFrame {

	private JPanel contentPane;
	public static JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createacc frame = new createacc();
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
	
	public createacc() {
		setTitle("TIC TAC TOE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 617);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CREATE ACCOUNT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(226, 167, 318, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TIC TAC TOE");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 36));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(226, 75, 318, 45);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();	
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField.getText().trim().toLowerCase().equals("username")) {
					textField.setText("");
					textField.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (textField.getText().trim().equals("") || 
					textField.getText().trim().toLowerCase().equals("username")) {
					textField.setText("username");
					textField.setForeground(new Color (153, 153, 153));
				}
			}
		});
		textField.setFont(new Font("Bell MT", Font.PLAIN, 17));
		textField.setText("username");
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setBounds(293, 198, 218, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				String pass = String.valueOf(passwordField.getPassword());
				
				if (pass.trim().toLowerCase().equals("password")) {
					passwordField.setText("");
					passwordField.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				String pass = String.valueOf(passwordField.getPassword());
				
				if (pass.trim().equals("") || pass.trim().toLowerCase().equals("password")) {
					passwordField.setText("password");
					passwordField.setForeground(new Color (153, 153, 153));
				}
			}
		});
		passwordField.setText("password");
		passwordField.setToolTipText("");
		passwordField.setOpaque(false);
		passwordField.setBorder(null);
		passwordField.setBounds(293, 248, 218, 37);
		contentPane.add(passwordField);
		
		JLabel validation = new JLabel("Username and password should at least have 9 characters");
		JLabel validation1 = new JLabel("cute lang pwede here");
		validation.setHorizontalAlignment(SwingConstants.CENTER);
		validation1.setHorizontalAlignment(SwingConstants.CENTER);
		validation.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		validation.setForeground(new Color(0, 139, 139));
		validation.setBounds(226, 348, 316, 33);
		validation1.setBounds(237, 364, 306, 33);
		validation1.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		validation1.setForeground(new Color(0, 139, 139));
		contentPane.add(validation);
		contentPane.add(validation1);
		
		JRadioButton radio1 = new JRadioButton("Yes / ???");
		radio1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		radio1.setContentAreaFilled(false);
		radio1.setBounds(342, 292, 169, 23);
		
		JRadioButton radio2 = new JRadioButton("No / ???");
		radio2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		radio2.setContentAreaFilled(false);
		radio2.setBounds(342, 318, 169, 23);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		
		contentPane.add(radio1);
		contentPane.add(radio2);
		
		JButton button = new JButton("");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name, pass;
				name = textField.getText();
				pass = passwordField.getText();
				
				if (name.length() > 8 && pass.length() > 8) {
					if (radio1.isSelected()) {
						new welcomepage().setVisible(true);
						dispose();
					}
					else {
						validation1.setForeground(new Color(255, 0, 0));
						validation1.setText("Invalid ----");
					}
				}
				else {
					validation.setForeground(new Color(255, 0, 0));
					validation.setText("Invalid username or password! Please try again!");
				}
			}
		});
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setIcon(new ImageIcon(createacc.class.getResource("/images/accbutton.png")));
		button.setBounds(477, 381, 110, 104);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(createacc.class.getResource("/images/Untitled-3.png")));
		btnNewButton.setBounds(402, 394, 128, 104);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("question");
		lblNewLabel_3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(268, 296, 68, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(createacc.class.getResource("/images/createacc.png")));
		lblNewLabel.setBounds(0, 0, 775, 578);
		contentPane.add(lblNewLabel);

	}

//	private Container contentPane() {
//		return null;
//	}
}
