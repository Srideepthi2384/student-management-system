package com.studentmanagementsystem.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.studentmanagementsystem.modal.UserModal;
import com.studentmanagementsystem.service.LoginService;
import com.studentmanagementsystem.service.UserService;

public class StudentDetailsComponent extends JPanel {
	
	JLabel userName ;

	private static StudentDetailsComponent studentDetailsComponent = new StudentDetailsComponent();
	
	public static StudentDetailsComponent getInstance() {
		return studentDetailsComponent;
	}
	/**
	 * Create the panel.
	 */
	private StudentDetailsComponent() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(117, 11, 156, 45);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 67, 440, 421);
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		userName = new JLabel("");
		
		userName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_userName = new GridBagConstraints();
		gbc_userName.gridx = 5;
		gbc_userName.gridy = 0;
		panel.add(userName, gbc_userName);
		
		setVisible(true);

	}
	
	
	public void setUser() {
		
		String userNameString = LoginService.currentLoggedInUsser;
		UserModal user = UserService.getInstance().getUserByUserName(userNameString);
		userName.setText(userNameString);
		
	}
}
