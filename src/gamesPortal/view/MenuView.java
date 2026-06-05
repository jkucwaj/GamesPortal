package gamesPortal.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import gamesPortal.controller.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuView extends JFrame {

	private static final long serialVersionUID = 1L;

	private Controller controller;

	public MenuView(Controller controller, String username) {

		this.controller = controller;

		//main colours for gui
		Color background = new Color(255, 244, 229);
		Color orange = new Color(255, 140, 66);
		Color darkText = new Color(80, 50, 30);

		setTitle("Games Portal Menu");
		setSize(750, 550);
		getContentPane().setLayout(null);
		getContentPane().setBackground(background);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		//welcome text
		JLabel lblWelcome = new JLabel("Welcome, " + username);
		lblWelcome.setBounds(280, 70, 300, 30);
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 18));
		lblWelcome.setForeground(darkText);
		getContentPane().add(lblWelcome);
		
		//highest score label
		JLabel lblHighScore = new JLabel("Highest Score: " + controller.getHighestScore());

		lblHighScore.setBounds(280, 100, 250, 25);
		lblHighScore.setFont(new Font("Arial", Font.BOLD, 14));
		lblHighScore.setForeground(darkText);

		getContentPane().add(lblHighScore);

		//small title
		JLabel lblTitle = new JLabel("Choose your dice game");
		lblTitle.setBounds(280, 144, 250, 25);
		lblTitle.setFont(new Font("Arial", Font.ITALIC, 14));
		lblTitle.setForeground(darkText);
		getContentPane().add(lblTitle);

		//throw six btn
		JButton btnThrowSix = new JButton("Throw Six");
		btnThrowSix.setBounds(285, 180, 180, 40);
		btnThrowSix.setBackground(orange);
		btnThrowSix.setForeground(Color.WHITE);
		btnThrowSix.setFont(new Font("Arial", Font.BOLD, 13));
		btnThrowSix.setFocusPainted(false);
		getContentPane().add(btnThrowSix);
		
		btnThrowSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.playThrowSix();
			}
		});

		//double dice btn
		JButton btnDoubleDice = new JButton("Double Dice");
		btnDoubleDice.setBounds(285, 240, 180, 40);
		btnDoubleDice.setBackground(orange);
		btnDoubleDice.setForeground(Color.WHITE);
		btnDoubleDice.setFont(new Font("Arial", Font.BOLD, 13));
		btnDoubleDice.setFocusPainted(false);
		getContentPane().add(btnDoubleDice);
		
		btnDoubleDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.playDoubleDice();
			}
		});

		//two player btn
		JButton btnTwoPlayer = new JButton("Two Player Game");
		btnTwoPlayer.setBounds(285, 300, 180, 40);
		btnTwoPlayer.setBackground(orange);
		btnTwoPlayer.setForeground(Color.WHITE);
		btnTwoPlayer.setFont(new Font("Arial", Font.BOLD, 13));
		btnTwoPlayer.setFocusPainted(false);
		getContentPane().add(btnTwoPlayer);
		
		btnTwoPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.playTwoPlayerGame();
			}
		});

		//logout button
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(285, 380, 180, 40);
		btnLogout.setBackground(darkText);
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Arial", Font.BOLD, 13));
		btnLogout.setFocusPainted(false);
		getContentPane().add(btnLogout);
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LoginView(controller);
			}
		});

		setVisible(true);
		
		//score history button
		JButton btnScores = new JButton("Show Score History");
		btnScores.setBounds(285, 440, 180, 40);
		btnScores.setBackground(orange);
		btnScores.setForeground(Color.WHITE);
		btnScores.setFont(new Font("Arial", Font.BOLD, 13));
		btnScores.setFocusPainted(false);
		getContentPane().add(btnScores);
		
		btnScores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				controller.showScoreHistory();
			}
		});
		
	}
}