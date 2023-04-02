package com.studentmanagementsystem.components;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuComponent extends JPanel {

	JButton loginBtn, studentDetailsBtn, reportsBtn, staffDetailsBtn, logoutBtn;

	private static MenuComponent menuComponent = new MenuComponent();
	
	public static MenuComponent getInstance() {
		return menuComponent;
	}
	

	/**
	 * Create the panel.
	 */
	private MenuComponent() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(10, 10, screen.width, 50);
		loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContentComponent.getInstance().addComponent("login");
			}
		});
		add(loginBtn);
		studentDetailsBtn = new JButton("Student Details");
		studentDetailsBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ContentComponent.getInstance().addComponent("studentDetails");
			}
		});
		reportsBtn = new JButton("Staff Details");
		staffDetailsBtn = new JButton("Reports");
		logoutBtn = new JButton("Logout");
		
	}

	public void logout() {
		this.removeAll();
		this.add(loginBtn);
		this.revalidate();
		this.repaint();
		ContentComponent.getInstance().addComponent("login");
	}

	public void login() {
		this.removeAll();

		add(studentDetailsBtn);
		add(reportsBtn);
		add(staffDetailsBtn);

		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logout();
			}
		});
		add(logoutBtn);
		
		ContentComponent.getInstance().addComponent("");
		this.revalidate();
		this.repaint();
	}

}
