package collegeSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class homeGUI
{
	JFrame frame;
	JPanel coursePanel,staffPanel,facultyPanel,studentPanel;

	ArrayList<Courses> cours=new ArrayList();
	ArrayList<Staff> stf=new ArrayList();
	ArrayList<Faculty> faculty=new ArrayList();
	ArrayList<Student> stdnt=new ArrayList();

	private JTextField cIdTxt;
	private JTextField cNameTxt;
	private JTextField cStatusTxt;
	private JTextField fNameTxt;
	private JTextField lNameTxt;
	private JTextField dNameTxt;
	private JTextField eIdTxt;
	private JTextField dutiesTxt;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	
	public homeGUI(String name)
	{
	frame = new JFrame(name);				//sets windows details
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocation(350, 200);
	frame.setSize(700,500);
	frame.getContentPane().setBackground(Color.white);
	frame.getContentPane().setLayout(null);
	
	JButton courseBtn = new JButton("Course");
	courseBtn.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			coursePanel.setVisible(true);
			studentPanel.setVisible(false);
			facultyPanel.setVisible(false);
			staffPanel.setVisible(false);
			
		}
	});
	
	JButton staffBtn = new JButton("Staff");
	staffBtn.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			staffPanel.setVisible(true);
			studentPanel.setVisible(false);
			facultyPanel.setVisible(false);
			coursePanel.setVisible(false);
		}
	});

	staffBtn.setBounds(180, 10, 154, 32);
	frame.getContentPane().add(staffBtn);
	courseBtn.setBounds(10, 10, 154, 32);
	frame.getContentPane().add(courseBtn);
	
	JButton facultyBtn = new JButton("Faculty");
	facultyBtn.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			facultyPanel.setVisible(true);
			studentPanel.setVisible(false);
			staffPanel.setVisible(false);
			coursePanel.setVisible(false);
		}
	});
	facultyBtn.setBounds(355, 10, 154, 32);
	frame.getContentPane().add(facultyBtn);
	
	JButton studentBtn = new JButton("Student");
	studentBtn.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			studentPanel.setVisible(true);
			facultyPanel.setVisible(false);
			staffPanel.setVisible(false);
			coursePanel.setVisible(false);
		}
	});
	studentBtn.setBounds(520, 10, 154, 32);
	frame.getContentPane().add(studentBtn);
	
	JPanel mainPanel = new JPanel();
	mainPanel.setBounds(10, 49, 664, 401);
	frame.getContentPane().add(mainPanel);
	mainPanel.setLayout(null);
	
	studentPanel = new JPanel();
	studentPanel.setBounds(0, 0, 664, 401);
	mainPanel.add(studentPanel);
	studentPanel.setLayout(null);
	
	JLabel label_4 = new JLabel("First Name");
	label_4.setBounds(142, 37, 190, 26);
	studentPanel.add(label_4);
	
	textField_5 = new JTextField();
	textField_5.setColumns(10);
	textField_5.setBounds(310, 37, 190, 26);
	studentPanel.add(textField_5);
	
	JLabel label_5 = new JLabel("Last Name");
	label_5.setBounds(142, 88, 190, 26);
	studentPanel.add(label_5);
	
	textField_6 = new JTextField();
	textField_6.setColumns(10);
	textField_6.setBounds(310, 88, 190, 26);
	studentPanel.add(textField_6);
	
	JLabel lblMatriculantStatus_1 = new JLabel("Matriculant Status");
	lblMatriculantStatus_1.setBounds(142, 144, 190, 26);
	studentPanel.add(lblMatriculantStatus_1);
	
	textField_7 = new JTextField();
	textField_7.setColumns(10);
	textField_7.setBounds(310, 144, 190, 26);
	studentPanel.add(textField_7);
	
	JLabel lblStudentId = new JLabel("Student ID");
	lblStudentId.setBounds(142, 203, 190, 26);
	studentPanel.add(lblStudentId);
	
	textField_8 = new JTextField();
	textField_8.setColumns(10);
	textField_8.setBounds(310, 203, 190, 26);
	studentPanel.add(textField_8);
	
	JLabel label_8 = new JLabel("Courses");
	label_8.setBounds(142, 259, 190, 26);
	studentPanel.add(label_8);
	
	textField_9 = new JTextField();
	textField_9.setColumns(10);
	textField_9.setBounds(310, 259, 190, 26);
	studentPanel.add(textField_9);
	
	JButton button_4 = new JButton("ADD");
	button_4.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{

			Student std=new Student(textField_5.getText(), textField_6.getText(), textField_7.getText(), Integer.parseInt(textField_8.getText()), textField_9.getText());
			stdnt.add(std);
		    textField_5.setText("");
		    textField_6.setText("");
		    textField_7.setText("");
		    textField_8.setText("");
		    textField_9.setText("");
		
		}
	});
	button_4.setBounds(91, 317, 114, 26);
	studentPanel.add(button_4);
	
	JButton button_5 = new JButton("UPDATE");
	button_5.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{

			for(int i=0;i<stdnt.size();i++)
			{
				if(stdnt.get(i).getFirstName().equals(textField_5.getText()) || stdnt.get(i).getLastName().equals(textField_6.getText())  ||stdnt.get(i).getMatriculantStatus().equals(textField_7.getText()) || stdnt.get(i).getsID()==Integer.parseInt(textField_8.getText()))
			{
					stdnt.remove(i);
					Student st=new Student(textField_5.getText(), textField_6.getText(), textField_7.getText(), Integer.parseInt(textField_8.getText()), textField_9.getText());
					stdnt.add(st);
			}
			else
			{
				    textField_5.setText("");
				    textField_6.setText("");
				    textField_7.setText("");
				    textField_8.setText("");
				    textField_9.setText("");
			}
			}
		
	
	
		}
	});
	button_5.setBounds(215, 317, 114, 26);
	studentPanel.add(button_5);
	
	JButton button_6 = new JButton("DISPLAY");
	button_6.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{


			for(int i=0;i<stdnt.size();i++)
			{
				if(stdnt.get(i).getFirstName().equals(textField_5.getText()) || stdnt.get(i).getLastName().equals(textField_6.getText())  ||stdnt.get(i).getMatriculantStatus().equals(textField_7.getText()) || stdnt.get(i).getsID()==Integer.parseInt(textField_8.getText()))
			{
					 textField_5.setText(stdnt.get(i).getFirstName());
					    textField_6.setText(stdnt.get(i).getLastName());
					    textField_7.setText(stdnt.get(i).getMatriculantStatus());
					    textField_8.setText(Integer.toString(stdnt.get(i).getsID()));
					    textField_9.setText(stdnt.get(i).getMAX_NUM_COURSES().toString());
			}
			else
			{
				    textField_5.setText("");
				    textField_6.setText("");
				    textField_7.setText("");
				    textField_8.setText("");
				    textField_9.setText("");
			}
			}
		
	
	
		
		}
	});

	button_6.setBounds(339, 317, 114, 26);
	studentPanel.add(button_6);
	
	JButton button_7 = new JButton("DELETE");
	button_7.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{

			for(int i=0;i<stdnt.size();i++)
			{
				if(stdnt.get(i).getFirstName().equals(textField_5.getText()) || stdnt.get(i).getLastName().equals(textField_6.getText())  ||stdnt.get(i).getMatriculantStatus().equals(textField_7.getText()) || stdnt.get(i).getsID()==Integer.parseInt(textField_8.getText()))
			{
					stdnt.remove(i);
					 textField_5.setText("");
					 textField_6.setText("");
					 textField_7.setText("");
					 textField_8.setText("");
					 textField_9.setText("");
					
			}
			else
			{
				    textField_5.setText("");
				    textField_6.setText("");
				    textField_7.setText("");
				    textField_8.setText("");
				    textField_9.setText("");
			}
			}
		
	
	
		
		}
	});

	button_7.setBounds(463, 317, 114, 26);
	studentPanel.add(button_7);
	
	JButton btnNewButton_1 = new JButton("Register Course");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			JFrame frame = new JFrame("Register");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setLocation(550, 300);
			frame.setSize(500,300);
			frame.getContentPane().setBackground(Color.white);
			frame.getContentPane().setLayout(null);
			
			textField = new JTextField();
			textField.setBounds(197, 25, 148, 25);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("Student ID");
			lblNewLabel.setBounds(74, 12, 200, 50);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblCourse = new JLabel("Course");
			lblCourse.setBounds(74, 70, 200, 50);
			frame.getContentPane().add(lblCourse);
			
			final JComboBox comboBox = new JComboBox();
			comboBox.setBounds(197, 85, 148, 20);
			frame.getContentPane().add(comboBox);

			for(int i=0;i<cours.size();i++)
			{
				comboBox.addItem(cours.get(i).getCourseID());
			}
			
			JButton btnNewButton = new JButton("Register");
			btnNewButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					if(stdnt.size()>0)
					for(int i=0;i<stdnt.size();i++)
					{
					if(stdnt.get(i).getsID()==Integer.parseInt(textField.getText()))
					{
						if(stdnt.get(i).getMatriculantStatus().equals("u") || stdnt.get(i).getMatriculantStatus().equals("U"))
						{
							if(((String)comboBox.getSelectedItem()).startsWith("u") || ((String)comboBox.getSelectedItem()).startsWith("U"))
							{
								stdnt.get(i).setMAX_NUM_COURSES((String) comboBox.getSelectedItem());
							}
						}
						

						else if(stdnt.get(i).getMatriculantStatus().equals("g") || stdnt.get(i).getMatriculantStatus().equals("G"))
						{
							if(((String)comboBox.getSelectedItem()).startsWith("g") || ((String)comboBox.getSelectedItem()).startsWith("G"))
							{
								stdnt.get(i).setMAX_NUM_COURSES((String) comboBox.getSelectedItem());
							}
						}
						
						else
						{
							JOptionPane.showMessageDialog(null, "Course Code incorrect", "Course Code Incorrect to Register. Must Start with 'g' or 'u'", 0);
						}
					
					}
					
					else
						JOptionPane.showMessageDialog(null, "Student ID not Fount", "Student ID not in the list", 0);
					}
					
					else
						JOptionPane.showMessageDialog(null, "Enter Data", "Please Enter Data First", 0);
						
				}
			});

			btnNewButton.setBounds(197, 140, 101, 20);
			frame.getContentPane().add(btnNewButton);
			frame.setVisible(true);
		}
	});
	btnNewButton_1.setBounds(240, 351, 190, 26);
	studentPanel.add(btnNewButton_1);
	studentPanel.setVisible(false);
	
	facultyPanel = new JPanel();
	facultyPanel.setBounds(0, 0, 664, 401);
	mainPanel.add(facultyPanel);
	facultyPanel.setLayout(null);
	
	textField = new JTextField();
	textField.setColumns(10);
	textField.setBounds(284, 35, 190, 26);
	facultyPanel.add(textField);
	
	JLabel label = new JLabel("First Name");
	label.setBounds(116, 35, 190, 26);
	facultyPanel.add(label);
	
	JLabel label_1 = new JLabel("Last Name");
	label_1.setBounds(116, 86, 190, 26);
	facultyPanel.add(label_1);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(284, 86, 190, 26);
	facultyPanel.add(textField_1);
	
	JLabel label_2 = new JLabel("Department Name");
	label_2.setBounds(116, 142, 190, 26);
	facultyPanel.add(label_2);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(284, 142, 190, 26);
	facultyPanel.add(textField_2);
	
	JLabel label_3 = new JLabel("Employee ID");
	label_3.setBounds(116, 201, 190, 26);
	facultyPanel.add(label_3);
	
	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(284, 201, 190, 26);
	facultyPanel.add(textField_3);
	
	JLabel lblCourses = new JLabel("Courses");
	lblCourses.setBounds(116, 257, 190, 26);
	facultyPanel.add(lblCourses);
	
	textField_4 = new JTextField();
	textField_4.setColumns(10);
	textField_4.setBounds(284, 257, 190, 26);
	facultyPanel.add(textField_4);
	
	JButton button = new JButton("ADD");
	button.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			Faculty fac=new Faculty(textField.getText(), textField_1.getText(), textField_2.getText(), Integer.parseInt(textField_3.getText()), textField_4.getText());
		    faculty.add(fac);
		    textField.setText("");
		    textField_1.setText("");
		    textField_2.setText("");
		    textField_3.setText("");
		    textField_4.setText("");
		}
	});
	button.setBounds(65, 315, 114, 26);
	facultyPanel.add(button);
	
	JButton button_1 = new JButton("UPDATE");
	button_1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
				for(int i=0;i<faculty.size();i++)
				{
					if(faculty.get(i).getFirstName().equals(textField.getText()) || faculty.get(i).getLastName().equals(textField_1.getText())  ||faculty.get(i).getDeptName().equals(textField_2.getText()) || faculty.get(i).geteID()==Integer.parseInt(textField_3.getText()))
				{
					faculty.remove(i);
					Faculty fc=new Faculty(textField.getText(), textField_1.getText(), textField_2.getText(), Integer.parseInt(textField_3.getText()), textField_4.getText());
					faculty.add(fc);
				}
				else
				{
					    textField.setText("");
					    textField_1.setText("");
					    textField_2.setText("");
					    textField_3.setText("");
					    textField_4.setText("");
				}
				}
			
		
		}
	});
	button_1.setBounds(189, 315, 114, 26);
	facultyPanel.add(button_1);
	
	JButton button_2 = new JButton("DISPLAY");
	button_2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{


			for(int i=0;i<faculty.size();i++)
			{
				if(faculty.get(i).getFirstName().equals(textField.getText()) || faculty.get(i).getLastName().equals(textField_1.getText())  ||faculty.get(i).getDeptName().equals(textField_2.getText()) || faculty.get(i).geteID()==Integer.parseInt(textField_3.getText()))
			{
				textField.setText(faculty.get(i).getFirstName());
			    textField_1.setText(faculty.get(i).getLastName());
			    textField_2.setText(faculty.get(i).getDeptName());
			    textField_3.setText(Integer.toString(faculty.get(i).geteID()));
			    textField_4.setText(faculty.get(i).getMAX_NUM_COURSES().toString());
			}
			else
			{
				    textField.setText("");
				    textField_1.setText("");
				    textField_2.setText("");
				    textField_3.setText("");
				    textField_4.setText("");
			}
			}
		
	
	
			
		
		}
	});
	button_2.setBounds(313, 315, 114, 26);
	facultyPanel.add(button_2);
	
	JButton button_3 = new JButton("DELETE");
	button_3.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{

			for(int i=0;i<faculty.size();i++)
			{
			if(faculty.get(i).getFirstName().equals(textField.getText()) || faculty.get(i).getLastName().equals(textField_1.getText())  ||faculty.get(i).getDeptName().equals(textField_2.getText()) || faculty.get(i).geteID()==Integer.parseInt(textField_3.getText()))
			{
				faculty.remove(i);
				textField.setText("");
			    textField_1.setText("");
			    textField_2.setText("");
			    textField_3.setText("");
			    textField_4.setText("");
			}
			else
			{
				    textField.setText("");
				    textField_1.setText("");
				    textField_2.setText("");
				    textField_3.setText("");
				    textField_4.setText("");
			}
			}
		
	
	
			
		}
	});
	button_3.setBounds(437, 315, 114, 26);
	facultyPanel.add(button_3);
	facultyPanel.setVisible(false);
	
	staffPanel = new JPanel();
	staffPanel.setBounds(0, 0, 664, 401);
	mainPanel.add(staffPanel);
	staffPanel.setLayout(null);
	
	fNameTxt = new JTextField();
	fNameTxt.setBounds(294, 24, 190, 26);
	staffPanel.add(fNameTxt);
	fNameTxt.setColumns(10);
	
	lNameTxt = new JTextField();
	lNameTxt.setColumns(10);
	lNameTxt.setBounds(294, 75, 190, 26);
	staffPanel.add(lNameTxt);
	
	dNameTxt = new JTextField();
	dNameTxt.setColumns(10);
	dNameTxt.setBounds(294, 131, 190, 26);
	staffPanel.add(dNameTxt);
	
	eIdTxt = new JTextField();
	eIdTxt.setColumns(10);
	eIdTxt.setBounds(294, 190, 190, 26);
	staffPanel.add(eIdTxt);
	
	dutiesTxt = new JTextField();
	dutiesTxt.setColumns(10);
	dutiesTxt.setBounds(294, 246, 190, 26);
	staffPanel.add(dutiesTxt);
	
	JLabel lblNewLabel_1 = new JLabel("First Name");
	lblNewLabel_1.setBounds(126, 24, 190, 26);
	staffPanel.add(lblNewLabel_1);
	
	JLabel lblLastName = new JLabel("Last Name");
	lblLastName.setBounds(126, 75, 190, 26);
	staffPanel.add(lblLastName);
	
	JLabel lblDepartmentName = new JLabel("Department Name");
	lblDepartmentName.setBounds(126, 131, 190, 26);
	staffPanel.add(lblDepartmentName);
	
	JLabel lblEmployeeId = new JLabel("Employee ID");
	lblEmployeeId.setBounds(126, 190, 190, 26);
	staffPanel.add(lblEmployeeId);
	
	JLabel lblDuties = new JLabel("Duties");
	lblDuties.setBounds(126, 246, 190, 26);
	staffPanel.add(lblDuties);
	
	JButton btnNewButton = new JButton("ADD");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Staff staf=new Staff(fNameTxt.getText(), lNameTxt.getText(), dNameTxt.getText(), Integer.parseInt(eIdTxt.getText()), dutiesTxt.getText());
			// Staff staf=new Staff(fNameTxt.getText(),lNameTxt.getText(),dNameTxt.getText(),Integer.parseInt(eIdTxt.getText()),dutiesTxt.getText());
			    stf.add(staf);
			    fNameTxt.setText("");
				lNameTxt.setText("");
				dNameTxt.setText("");
				eIdTxt.setText("");
				dutiesTxt.setText("");
		}
	});
	btnNewButton.setBounds(75, 304, 114, 26);
	staffPanel.add(btnNewButton);
	
	JButton btnUpdate_1 = new JButton("UPDATE");
	btnUpdate_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

			for(int i=0;i<stf.size();i++)
			{
			if(stf.get(i).getFirstName().equals(fNameTxt.getText()) || stf.get(i).getLastName().equals(lNameTxt.getText())  ||stf.get(i).getDeptName().equals(dNameTxt.getText()) || stf.get(i).geteID()==Integer.parseInt(eIdTxt.getText()))
			{
				stf.remove(i);
				Staff st=new Staff(fNameTxt.getText(), lNameTxt.getText(), dNameTxt.getText(), Integer.parseInt(eIdTxt.getText()), dutiesTxt.getText());
			    stf.add(st);
			}
			else
			{
				fNameTxt.setText("");
				lNameTxt.setText("");
				dNameTxt.setText("");
				eIdTxt.setText("");
				dutiesTxt.setText("");
			}
			}
		
		}
	});
	btnUpdate_1.setBounds(199, 304, 114, 26);
	staffPanel.add(btnUpdate_1);
	
	JButton btnDisplay = new JButton("DISPLAY");
	btnDisplay.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			for(int i=0;i<stf.size();i++)
			{
			if(stf.get(i).getFirstName().equals(fNameTxt.getText()) || stf.get(i).getLastName().equals(lNameTxt.getText())  ||stf.get(i).getDeptName().equals(dNameTxt.getText()) || stf.get(i).geteID()==Integer.parseInt(eIdTxt.getText()))
			{
				fNameTxt.setText(stf.get(i).getFirstName());
				lNameTxt.setText(stf.get(i).getLastName());
				dNameTxt.setText(stf.get(i).getDeptName());
				eIdTxt.setText(Integer.toString(stf.get(i).geteID()));
				dutiesTxt.setText(stf.get(i).getARRAY_DUTIES().toString());
			}
			else
			{
				fNameTxt.setText("");
				lNameTxt.setText("");
				dNameTxt.setText("");
				eIdTxt.setText("");
				dutiesTxt.setText("");
			}
			}
		
		
		
		}
	});
	btnDisplay.setBounds(323, 304, 114, 26);
	staffPanel.add(btnDisplay);
	
	JButton btnDelete_1 = new JButton("DELETE");
	btnDelete_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {


			for(int i=0;i<stf.size();i++)
			{
			if(stf.get(i).getFirstName().equals(fNameTxt.getText()) || stf.get(i).getLastName().equals(lNameTxt.getText())  ||stf.get(i).getDeptName().equals(dNameTxt.getText()) || stf.get(i).geteID()==Integer.parseInt(eIdTxt.getText()))
			{
				stf.remove(i);
			}
			}
			
			fNameTxt.setText("");
			lNameTxt.setText("");
			dNameTxt.setText("");
			eIdTxt.setText("");
			dutiesTxt.setText("");
		
		
		}
	});
	btnDelete_1.setBounds(447, 304, 114, 26);
	staffPanel.add(btnDelete_1);
	staffPanel.setVisible(false);
	
	coursePanel = new JPanel();
	coursePanel.setBounds(0, 0, 664, 401);
	mainPanel.add(coursePanel);
	coursePanel.setLayout(null);
	coursePanel.setVisible(false);
	
	cIdTxt = new JTextField();
	cIdTxt.setBounds(267, 11, 191, 28);
	coursePanel.add(cIdTxt);
	cIdTxt.setColumns(10);
	
	cNameTxt = new JTextField();
	cNameTxt.setColumns(10);
	cNameTxt.setBounds(267, 63, 191, 28);
	coursePanel.add(cNameTxt);
	
	cStatusTxt = new JTextField();
	cStatusTxt.setColumns(10);
	cStatusTxt.setBounds(267, 114, 191, 28);
	coursePanel.add(cStatusTxt);
	
	JLabel lblNewLabel = new JLabel("Course ID");
	lblNewLabel.setBounds(77, 11, 200, 28);
	coursePanel.add(lblNewLabel);
	
	JLabel lblCourseName = new JLabel("Course Name");
	lblCourseName.setBounds(77, 63, 200, 28);
	coursePanel.add(lblCourseName);
	
	JLabel lblMatriculantStatus = new JLabel("Matriculant Status");
	lblMatriculantStatus.setBounds(77, 114, 200, 28);
	coursePanel.add(lblMatriculantStatus);
	
	JButton btnAdd = new JButton("ADD");
	btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    Courses course=new Courses(cIdTxt.getText(),cNameTxt.getText(),cStatusTxt.getText());
		    cours.add(course);
		    cIdTxt.setText("");
			cNameTxt.setText("");
			cStatusTxt.setText("");
		}
	});
	btnAdd.setBounds(77, 179, 118, 28);
	coursePanel.add(btnAdd);
	
	JButton btnUpdate = new JButton("Update");
	btnUpdate.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			for(int i=0;i<cours.size();i++)
			{
			if(cours.get(i).getCourseID().equals(cIdTxt.getText()) || cours.get(i).getCourseName().equals(cNameTxt.getText())  || cours.get(i).getMatriculantStatus().equals(cStatusTxt.getText()))
			{
				cours.remove(i);
				Courses cour=new Courses(cIdTxt.getText(),cNameTxt.getText(),cStatusTxt.getText());
			    cours.add(cour);
			}
			
			else
			{
				cIdTxt.setText("");
				cNameTxt.setText("");
				cStatusTxt.setText("");
			}
			}
		}
	});
	btnUpdate.setBounds(205, 179, 118, 28);
	coursePanel.add(btnUpdate);
	
	JButton btnDelete = new JButton("Display");
	btnDelete.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			for(int i=0;i<cours.size();i++)
			{
			if(cours.get(i).getCourseID().equals(cIdTxt.getText()) || cours.get(i).getCourseName().equals(cNameTxt.getText())  || cours.get(i).getMatriculantStatus().equals(cStatusTxt.getText()))
			{
				cIdTxt.setText(cours.get(i).getCourseID());
				cNameTxt.setText(cours.get(i).getCourseName());
				cStatusTxt.setText(cours.get(i).getMatriculantStatus());
			}
			
			else
			{
				cIdTxt.setText("");
				cNameTxt.setText("");
				cStatusTxt.setText("");
			}
				
			}
		}
	});
	btnDelete.setBounds(333, 179, 118, 28);
	coursePanel.add(btnDelete);
	
	JButton btnRemove = new JButton("Remove");
	btnRemove.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

			for(int i=0;i<cours.size();i++)
			{
			if(cours.get(i).getCourseID().equals(cIdTxt.getText()) || cours.get(i).getCourseName().equals(cNameTxt.getText())  || cours.get(i).getMatriculantStatus().equals(cStatusTxt.getText()))
			{
				cours.remove(i);
				
			}
			}
		
			cIdTxt.setText("");
			cNameTxt.setText("");
			cStatusTxt.setText("");
		}
	});
	btnRemove.setBounds(457, 179, 118, 28);
	coursePanel.add(btnRemove);
	frame.setVisible(true);
	}
	}
