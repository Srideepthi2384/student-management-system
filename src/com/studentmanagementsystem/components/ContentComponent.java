package com.studentmanagementsystem.components;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class ContentComponent extends JPanel {
	
	LoginComponent loginComponent;
	RegistrationComponent registrationComponent;
	
	private static ContentComponent contentComponent = new ContentComponent();
	
	
	public static ContentComponent getInstance() {
		return contentComponent;
	}
	private ContentComponent() {
		FlowLayout flowLayout = (FlowLayout) getLayout();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(50, 70, screen.width-100,screen.height - 150);
		
		
		LoginComponent.getInstance().setBounds(this.getWidth()/2-250, 0, 500, 500);
		
		RegistrationComponent.getInstance().setBounds(this.getWidth()/2-250, 0, 500, 650);
		
	}
	
	public void addComponent(String name) {
		this.removeAll();
		switch(name) {
		case "login":
			this.add(loginComponent.getInstance());
			break;
		case "registration":
			this.add(registrationComponent.getInstance());
			break;
		case "details":
			break;
		default:
			this.add(loginComponent.getInstance());
		}

		this.revalidate();
		this.repaint();
	}

}
