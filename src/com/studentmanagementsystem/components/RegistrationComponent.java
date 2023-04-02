package com.studentmanagementsystem.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.studentmanagementsystem.modal.UserModal;
import com.studentmanagementsystem.service.UserService;

public class RegistrationComponent extends JPanel {
	private JTextField userName;
	private JTextField password;
	private JTextField doj;

	Map<String, List<String>> branchSubjectsMap = new HashMap<>();
	JPanel registrationPanel;
	
	private static RegistrationComponent registrationComponent = new RegistrationComponent();
	
	public static RegistrationComponent getInstance() {
		return registrationComponent;
	}

	public void init() {
		branchSubjectsMap.put("CSC", Arrays.asList("C", "C++", "Java", "Python"));
		branchSubjectsMap.put("IT", Arrays.asList("C", "C++", "Java", "Python"));
		branchSubjectsMap.put("ECE", Arrays.asList("C", "C++", "Java", "Electronics"));
		branchSubjectsMap.put("EEE", Arrays.asList("C", "C++", "Java", "Circuits"));
		branchSubjectsMap.put("CIVIL", Arrays.asList("C", "Structures"));
		branchSubjectsMap.put("MECH", Arrays.asList("C", "Engineering Mechanics"));
	}

	/**
	 * Create the panel.
	 */
	public RegistrationComponent() {
		setBackground(Color.LIGHT_GRAY);
		init();
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Registration Page");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
		lblNewLabel.setBounds(148, 10, 203, 35);
		
		add(lblNewLabel);

		registrationPanel = new JPanel();
		registrationPanel.setBackground(Color.LIGHT_GRAY);
		registrationPanel.setBounds(10, 80, 465, 600);
		add(registrationPanel);
		GridBagLayout gbl_registrationPanel = new GridBagLayout();
		gbl_registrationPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_registrationPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_registrationPanel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_registrationPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		registrationPanel.setLayout(gbl_registrationPanel);

		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_userNameLabel = new GridBagConstraints();
		gbc_userNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_userNameLabel.anchor = GridBagConstraints.EAST;
		gbc_userNameLabel.gridx = 1;
		gbc_userNameLabel.gridy = 1;
		registrationPanel.add(userNameLabel, gbc_userNameLabel);

		userName = new JTextField();
		userName.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_userName = new GridBagConstraints();
		gbc_userName.gridwidth = 3;
		gbc_userName.fill = GridBagConstraints.HORIZONTAL;
		gbc_userName.insets = new Insets(0, 0, 5, 0);
		gbc_userName.ipadx = 30;
		gbc_userName.ipady = 20;
		gbc_userName.gridx = 2;
		gbc_userName.gridy = 1;
		registrationPanel.add(userName, gbc_userName);
		userName.setColumns(20);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_passwordLabel = new GridBagConstraints();
		gbc_passwordLabel.anchor = GridBagConstraints.EAST;
		gbc_passwordLabel.ipady = 30;
		gbc_passwordLabel.ipadx = 30;
		gbc_passwordLabel.insets = new Insets(0, 0, 5, 5);
		gbc_passwordLabel.gridx = 1;
		gbc_passwordLabel.gridy = 2;
		registrationPanel.add(passwordLabel, gbc_passwordLabel);

		password = new JTextField();
		password.setFont(new Font("SansSerif", Font.PLAIN, 16));
		password.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_password = new GridBagConstraints();
		gbc_password.gridwidth = 3;
		gbc_password.fill = GridBagConstraints.HORIZONTAL;
		gbc_password.insets = new Insets(0, 0, 5, 0);
		gbc_password.ipady = 20;
		gbc_password.ipadx = 30;
		gbc_password.gridx = 2;
		gbc_password.gridy = 2;
		registrationPanel.add(password, gbc_password);
		password.setColumns(20);

		JLabel addressLabel = new JLabel("Address");
		addressLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		addressLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_addressLabel = new GridBagConstraints();
		gbc_addressLabel.ipadx = 30;
		gbc_addressLabel.insets = new Insets(0, 0, 5, 5);
		gbc_addressLabel.gridx = 1;
		gbc_addressLabel.gridy = 3;
		registrationPanel.add(addressLabel, gbc_addressLabel);

		JTextArea address = new JTextArea();
		address.setRows(5);
		address.setColumns(20);
		address.setFont(new Font("SansSerif", Font.PLAIN, 16));

		JScrollPane areaScrollPane = new JScrollPane(address);
		areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_areaScrollPane = new GridBagConstraints();
		gbc_areaScrollPane.fill = GridBagConstraints.HORIZONTAL;
		gbc_areaScrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_areaScrollPane.gridy = 3;
		gbc_areaScrollPane.gridwidth = 3;
		gbc_areaScrollPane.gridx = 2;
		registrationPanel.add(areaScrollPane, gbc_areaScrollPane);
		JLabel dojLabel = new JLabel("DOJ");
		dojLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		dojLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_dojLabel = new GridBagConstraints();
		gbc_dojLabel.insets = new Insets(0, 0, 5, 5);
		gbc_dojLabel.ipady = 30;
		gbc_dojLabel.ipadx = 30;
		gbc_dojLabel.anchor = GridBagConstraints.EAST;
		gbc_dojLabel.gridx = 1;
		gbc_dojLabel.gridy = 4;
		registrationPanel.add(dojLabel, gbc_dojLabel);

		doj = new JTextField();
		doj.setFont(new Font("SansSerif", Font.PLAIN, 16));
		GridBagConstraints gbc_doj = new GridBagConstraints();
		gbc_doj.gridwidth = 3;
		gbc_doj.insets = new Insets(0, 0, 5, 0);
		gbc_doj.ipady = 20;
		gbc_doj.ipadx = 30;
		gbc_doj.fill = GridBagConstraints.HORIZONTAL;
		gbc_doj.gridx = 2;
		gbc_doj.gridy = 4;
		registrationPanel.add(doj, gbc_doj);
		doj.setColumns(10);

		JCheckBox isStaff = new JCheckBox("is Staff");
		isStaff.setBackground(Color.LIGHT_GRAY);
		isStaff.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_isStaff = new GridBagConstraints();
		gbc_isStaff.insets = new Insets(0, 0, 5, 5);
		gbc_isStaff.gridx = 2;
		gbc_isStaff.gridy = 5;
		registrationPanel.add(isStaff, gbc_isStaff);

		JLabel courseLabel = new JLabel("Course");
		courseLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_courseLabel = new GridBagConstraints();
		gbc_courseLabel.anchor = GridBagConstraints.EAST;
		gbc_courseLabel.insets = new Insets(0, 0, 5, 5);
		gbc_courseLabel.gridx = 1;
		gbc_courseLabel.gridy = 6;
		registrationPanel.add(courseLabel, gbc_courseLabel);

		JComboBox course = new JComboBox();
		course.setBackground(Color.WHITE);
		course.setModel(new DefaultComboBoxModel(new String[] { "Engineering" }));
		course.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_course = new GridBagConstraints();
		gbc_course.gridwidth = 3;
		gbc_course.insets = new Insets(0, 0, 5, 0);
		gbc_course.fill = GridBagConstraints.HORIZONTAL;
		gbc_course.gridx = 2;
		gbc_course.gridy = 6;
		registrationPanel.add(course, gbc_course);

		JLabel branchLabel = new JLabel("Branch");
		branchLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_branchLabel = new GridBagConstraints();
		gbc_branchLabel.anchor = GridBagConstraints.EAST;
		gbc_branchLabel.insets = new Insets(0, 0, 5, 5);
		gbc_branchLabel.gridx = 1;
		gbc_branchLabel.gridy = 7;
		registrationPanel.add(branchLabel, gbc_branchLabel);
		JList<String> subjects = new JList();
		JComboBox branch = new JComboBox();
		branch.setBackground(Color.WHITE);
		branch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		branch.setModel(new DefaultComboBoxModel(new String[] { "CSC", "IT", "ECE", "EEE", "CIVIL", "MECH" }));
		branch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> values = branchSubjectsMap.get(branch.getSelectedItem());
				subjects.setModel(new AbstractListModel() {
					public int getSize() {
						return values.size();
					}

					public Object getElementAt(int index) {
						return values.get(index);
					}
				});
				subjects.validate();
				subjects.repaint();
			}
		});

		GridBagConstraints gbc_branch = new GridBagConstraints();
		gbc_branch.gridwidth = 3;
		gbc_branch.fill = GridBagConstraints.HORIZONTAL;
		gbc_branch.insets = new Insets(0, 0, 5, 0);
		gbc_branch.gridx = 2;
		gbc_branch.gridy = 7;
		registrationPanel.add(branch, gbc_branch);

		JLabel sectionLabel = new JLabel("Section");
		sectionLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_sectionLabel = new GridBagConstraints();
		gbc_sectionLabel.anchor = GridBagConstraints.EAST;
		gbc_sectionLabel.insets = new Insets(0, 0, 5, 5);
		gbc_sectionLabel.gridx = 1;
		gbc_sectionLabel.gridy = 8;
		registrationPanel.add(sectionLabel, gbc_sectionLabel);

		JComboBox section = new JComboBox();
		section.setBackground(Color.WHITE);
		section.setFont(new Font("Tahoma", Font.PLAIN, 16));
		section.setModel(new DefaultComboBoxModel(new String[] { "Section 1", "Section 2", "Section 3" }));
		GridBagConstraints gbc_section = new GridBagConstraints();
		gbc_section.gridwidth = 3;
		gbc_section.insets = new Insets(0, 0, 5, 0);
		gbc_section.fill = GridBagConstraints.HORIZONTAL;
		gbc_section.gridx = 2;
		gbc_section.gridy = 8;
		registrationPanel.add(section, gbc_section);

		JLabel lblNewLabel_8 = new JLabel("Subjects");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.ipady = 90;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 9;
		registrationPanel.add(lblNewLabel_8, gbc_lblNewLabel_8);

		subjects.setVisibleRowCount(4);
		subjects.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_subjects = new GridBagConstraints();
		gbc_subjects.gridwidth = 3;
		gbc_subjects.gridheight = 2;
		gbc_subjects.ipady = 50;
		gbc_subjects.insets = new Insets(0, 0, 5, 0);
		gbc_subjects.fill = GridBagConstraints.BOTH;
		gbc_subjects.gridx = 2;
		gbc_subjects.gridy = 9;
		JScrollPane subjectsScrollPane = new JScrollPane(subjects);
		subjectsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		registrationPanel.add(subjectsScrollPane, gbc_subjects);

		JButton registerBtn = new JButton("Register User");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserModal userModal = new UserModal();
				userModal.setUserName(userName.getText());
				userModal.setPassword(password.getText());
				userModal.setAddress(address.getText());
				userModal.setDoj(doj.getText());
				userModal.setIsStaff(isStaff.getSelectedObjects() == null ? false : true);
				userModal.setSubjects(subjects.getSelectedValuesList());
				if (isStaff.getSelectedObjects() != null) {
					userModal.setBranch((String) branch.getSelectedItem());
					userModal.setCourse((String) course.getSelectedItem());
					userModal.setSection((String) section.getSelectedItem());

				}
				System.out.println(userModal);
				UserService.getInstance().saveUser(userModal);
				ContentComponent.getInstance().addComponent("login");
				
			}
		});
		registerBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_registerBtn = new GridBagConstraints();
		gbc_registerBtn.insets = new Insets(0, 0, 0, 5);
		gbc_registerBtn.gridx = 2;
		gbc_registerBtn.gridy = 11;
		registrationPanel.add(registerBtn, gbc_registerBtn);

		isStaff.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					courseLabel.setVisible(false);
					course.setVisible(false);
					branchLabel.setVisible(false);
					branch.setVisible(false);
					sectionLabel.setVisible(false);
					section.setVisible(false);
				} else {
					courseLabel.setVisible(true);
					course.setVisible(true);
					branchLabel.setVisible(true);
					branch.setVisible(true);
					sectionLabel.setVisible(true);
					section.setVisible(true);
				}
				registrationPanel.validate();
				registrationPanel.repaint();
			}
		});

	}
}
