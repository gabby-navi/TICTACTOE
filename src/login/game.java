package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class game extends JFrame { 
	private Container pane; 
	private String currentPlayer; 
	private JButton [][] board; 
	private boolean hasWinner; 
	private JMenuBar menuBar; 
	private JMenu menu;
	private JMenuItem quit;
	private JMenuItem newGame;
	
	public game () { 
		super();
		pane = getContentPane();
		pane.setLayout(new GridLayout(3, 3)); 
		setTitle("TIC TAC TOE");
		setSize(617, 617);
		setResizable(false); 
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setVisible(true); 
		
		currentPlayer = "X"; 
		board = new JButton[3][3]; 
		hasWinner = false; 
		initializeBoard();
		intializeMenuBar();
	}
	private void intializeMenuBar() {
		menuBar = new JMenuBar(); 
		menu = new JMenu("File"); 
		
		newGame = new JMenuItem("New Game"); 
		newGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetBoard(); 
			}
		});
		quit = new JMenuItem("Quit");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});
		menu.add(newGame);
		menu.add(quit);
		menuBar.add(menu);
		setJMenuBar(menuBar); 
	}	
	private void resetBoard() { 
		currentPlayer = "X";
		hasWinner = false;
		for (int i = 0; i < 3; i++) { 
			for (int j = 0; j < 3; j++) {
				board[i][j].setText(""); 
			}
		}
	}
	private void initializeBoard() { 
		for (int i = 0; i < 3; i++) { 
			for (int j = 0; j < 3; j++) { 
				JButton btn = new JButton();
				btn.setFont(new Font(Font.SERIF, Font.BOLD, 100));
				btn.setBackground(new Color(255, 240, 245));
				board[i][j] = btn; 
				btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (((JButton)e.getSource()).getText().equals("") &&
						hasWinner == false) {
							btn.setText(currentPlayer);
							hasWinner(); 
							togglePlayer(); 
						}
					}
				});
				pane.add(btn);
			}
		}
	}
	private void togglePlayer() { 
		if (currentPlayer.equals("X"))
			currentPlayer = "O";
		else
			currentPlayer = "X";
	}
	private void hasWinner() { 
		
		ImageIcon kitty = new ImageIcon("C:\\Users\\PC\\OneDrive\\Desktop\\school\\cat.png");
		JLabel icon = new JLabel(kitty);
		JLabel text = new JLabel("Congratulations!", JLabel.CENTER);
		JLabel text2 = new JLabel("PLAYER " + currentPlayer + " WON!", JLabel.CENTER);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(icon, BorderLayout.CENTER);
		panel.add(text, BorderLayout.NORTH);
		panel.add(text2, BorderLayout.SOUTH);
		
		Object[] options = {"Thank you!"};
		
		
		if (board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) { 
			JOptionPane.showOptionDialog(panel, panel, "Congratulations", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
			hasWinner = true; 
		}
		else if (board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer)) {
			JOptionPane.showOptionDialog(panel, panel, "Congratulations", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
			hasWinner = true;
		}
		else if (board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
			JOptionPane.showOptionDialog(panel, panel, "Congratulations", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
			hasWinner = true;
		}
		else if (board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer)) {
			JOptionPane.showOptionDialog(panel, panel, "Congratulations", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
			hasWinner = true;
		}
		else if (board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer)) {
			JOptionPane.showOptionDialog(panel, panel, "Congratulations", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
			hasWinner = true;
		}
		else if (board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
			JOptionPane.showOptionDialog(panel, panel, "Congratulations", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
			hasWinner = true;
		}
	}
}

