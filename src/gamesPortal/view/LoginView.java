package gamesPortal.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gamesPortal.controller.Controller;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JButton btnLogin;


	private Controller controller;

	public LoginView(Controller controller) {

		this.controller = controller;

		Color background = new Color(255, 244, 229);
		Color orange = new Color(255, 140, 66);
		Color darkText = new Color(80, 50, 30);

		setTitle("Games Portal Login");
		setSize(750, 550);
		getContentPane().setLayout(null);
		getContentPane().setBackground(background);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JLabel lblTitle = new JLabel("Welcome to Games Portal");
		lblTitle.setBounds(235, 80, 350, 40);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitle.setForeground(darkText);
		getContentPane().add(lblTitle);

		JLabel lblSubtitle = new JLabel("Login to play dice games");
		lblSubtitle.setBounds(285, 120, 250, 25);
		lblSubtitle.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSubtitle.setForeground(darkText);
		getContentPane().add(lblSubtitle);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(250, 200, 100, 25);
		lblUsername.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsername.setForeground(darkText);
		getContentPane().add(lblUsername);

		txtUsername = new JTextField();
		txtUsername.setBounds(360, 200, 170, 28);
		getContentPane().add(txtUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(250, 250, 100, 25);
		lblPassword.setFont(new Font("Arial", Font.BOLD, 14));
		lblPassword.setForeground(darkText);
		getContentPane().add(lblPassword);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(360, 250, 170, 28);
		getContentPane().add(txtPassword);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(373, 325, 150, 45);
		btnLogin.setBackground(orange);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
		btnLogin.setFocusPainted(false);
		getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBackground(new Color(160, 82, 45));
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Arial", Font.BOLD, 12));
		btnRegister.setFocusPainted(false);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = new String(txtPassword.getPassword());

				controller.register(username, password);
			}
		});
		btnRegister.setBounds(376, 436, 150, 45);
		getContentPane().add(btnRegister);
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setForeground(new Color(80, 50, 30));
		lblOr.setFont(new Font("Arial", Font.PLAIN, 14));
		lblOr.setBounds(433, 395, 48, 25);
		getContentPane().add(lblOr);

		
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String username = txtUsername.getText();
				String password = new String(txtPassword.getPassword());

				if (controller.login(username, password)) {
					controller.openMenu(username);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Login failed");
				}
			}
		});

		setVisible(true);
	}
}