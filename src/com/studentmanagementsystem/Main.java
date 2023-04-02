package com.studentmanagementsystem;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.studentmanagementsystem.components.ContentComponent;
import com.studentmanagementsystem.components.MenuComponent;

public class Main {

	private JFrame frame;

	public MenuComponent menuComponent;
	public ContentComponent contentComponent;

	private static Main main;

	public static Main getInstance() {
		return main;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main = new Main();
					main.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0, screen.width - 500, screen.height - 300);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		frame.getContentPane().add(MenuComponent.getInstance());

		frame.getContentPane().add(ContentComponent.getInstance());
		ContentComponent.getInstance().setLayout(null);
	}

}
