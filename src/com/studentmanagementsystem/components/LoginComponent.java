package com.studentmanagementsystem.components;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.studentmanagementsystem.service.LoginService;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginComponent extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanel panel;
	JLabel errorUserName, errorPassword;

	private static LoginComponent loginComponent = new LoginComponent();

	public static LoginComponent getInstance() {
		return loginComponent;
	}

	
	private LoginComponent() {
		setBackground(Color.LIGHT_GRAY);
		this.setSize(500, 500);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 84, 84 };
		gbl_panel.rowHeights = new int[] { 10, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0 };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

		this.setLayout(gbl_panel);

		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.ipady = 30;
		gbc_lblNewLabel_1.ipadx = 50;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		this.add(lblNewLabel_1, gbc_lblNewLabel_1);

		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.ipady = 30;
		gbc_textField.ipadx = 50;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		this.add(textField, gbc_textField);
		textField.setColumns(15);

		errorUserName = new JLabel("Please enter user name");
		errorUserName.setForeground(Color.RED);
		errorUserName.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		errorUserName.setVisible(false);
		add(errorUserName, gbc_lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.ipady = 50;
		gbc_lblNewLabel.ipadx = 30;
		gbc_lblNewLabel.anchor = GridBagConstraints.BASELINE;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		this.add(lblNewLabel, gbc_lblNewLabel);

		passwordField = new JPasswordField();
		passwordField.setColumns(15);
		passwordField.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.ipady = 30;
		gbc_passwordField.ipadx = 30;
		gbc_passwordField.gridwidth = 0;
		gbc_passwordField.anchor = GridBagConstraints.BASELINE;
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 2;
		this.add(passwordField, gbc_passwordField);

		errorPassword = new JLabel("Please enter password");
		errorPassword.setForeground(Color.RED);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		errorPassword.setVisible(false);
		add(errorPassword, gbc_lblNewLabel_3);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Admin");
		chckbxNewCheckBox.setBackground(Color.LIGHT_GRAY);
		chckbxNewCheckBox.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.ipady = 30;
		gbc_chckbxNewCheckBox.ipadx = 30;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 4;
		this.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText() != null && !textField.getText().isEmpty()) {
					errorUserName.setVisible(false);
					if (passwordField.getText() != null && !passwordField.getText().isEmpty()) {
						errorPassword.setVisible(false);
						if (LoginService.getInstance().isValidUser(textField.getText(), passwordField.getText())) {
							MenuComponent.getInstance().login();
							textField.setText(null);
							passwordField.setText(null);

						} else {
							System.out.println("not a valid user");
						}
					} else {
						errorPassword.setVisible(true);
					}
				} else {
					errorUserName.setVisible(true);
					System.out.println("username not entered");
				}
			}
		});

		JButton newUser = new JButton("New User");
		newUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContentComponent.getInstance().addComponent("registration");
			}
		});
		newUser.setBackground(Color.GREEN);
		newUser.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.ipady = 30;
		gbc_btnNewButton_1.ipadx = 30;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 5;
		add(newUser, gbc_btnNewButton_1);
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.ipady = 30;
		gbc_btnNewButton.ipadx = 50;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 5;
		this.add(btnNewButton, gbc_btnNewButton);

	}

}
