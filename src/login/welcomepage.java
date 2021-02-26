package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Dimension;

public class welcomepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomepage frame = new welcomepage();
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
	public welcomepage() {
		setTitle("TIC TAC TOE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 617);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new game().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(welcomepage.class.getResource("/images/x.png")));
		btnNewButton.setBounds(39, 71, 352, 361);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new game().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(welcomepage.class.getResource("/images/o.png")));
		btnNewButton_1.setBounds(401, 211, 335, 322);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("HELLO, WELCOME!");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 29));
		lblNewLabel_1.setBounds(24, 485, 266, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel XO = new JLabel("Click either X or O to play!");
		XO.setFont(new Font("Bahnschrift", Font.BOLD, 29));
		XO.setBounds(24, 520, 379, 47);
		contentPane.add(XO);
		
//		JLabel namee = new JLabel();
//		namee.setFont(new Font("Bahnschrift", Font.BOLD, 29));
//		namee.setBounds(134, 514, 276, 53);
//		contentPane.add(namee);
		
//		namee.setText(naglogin.textField.getText());
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(welcomepage.class.getResource("/images/xoro.png")));
		lblNewLabel.setBounds(0, 0, 775, 578);
		contentPane.add(lblNewLabel);

	}
}
