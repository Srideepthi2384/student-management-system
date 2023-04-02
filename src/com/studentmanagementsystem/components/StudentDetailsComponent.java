package com.studentmanagementsystem.components;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudentDetailsComponent extends JPanel {

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
		
		setVisible(true);

	}
}
