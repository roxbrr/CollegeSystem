package collegeSystem;

import java.util.ArrayList;

public class Faculty extends Employee
{

	private String firstName;
	private String lastName;
	private String deptName;
	private int eID;
	ArrayList MAX_NUM_COURSES=new ArrayList();
	
	public Faculty(String fName, String lName, String dName, int ID, String arr)
	{
		super(fName, lName, dName, ID);
		firstName=fName;
		lastName=lName;
		deptName=dName;
		eID=ID;
		MAX_NUM_COURSES.add(arr);
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	
	public String getLastName()
	{
		return lastName;
	}
	
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	
	public String getDeptName()
	{
		return deptName;
	}
	
	
	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}
	
	
	public int geteID()
	{
		return eID;
	}
	
	
	public void seteID(int eID)
	{
		this.eID = eID;
	}
	
	
	public ArrayList getMAX_NUM_COURSES()
	{
		return MAX_NUM_COURSES;
	}
	
	
	public void setMAX_NUM_COURSES(ArrayList mAX_NUM_COURSES)
	{
		MAX_NUM_COURSES = mAX_NUM_COURSES;
	}
	
	
	
	

}
