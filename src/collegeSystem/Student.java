package collegeSystem;

import java.util.ArrayList;

public class Student extends Person
{

	private String firstName;
	private String lastName;
	private String matriculantStatus;
	private int sID;
	ArrayList MAX_NUM_COURSES=new ArrayList();

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

	public String getMatriculantStatus()
	{
		return matriculantStatus;
	}

	public void setMatriculantStatus(String matriculantStatus)
	{
		this.matriculantStatus = matriculantStatus;
	}

	public int getsID()
	{
		return sID;
	}

	public void setsID(int sID)
	{
		this.sID = sID;
	}

	public ArrayList getMAX_NUM_COURSES()
	{
		return MAX_NUM_COURSES;
	}

	public void setMAX_NUM_COURSES(String mAX_NUM_COURSES)
	{
		MAX_NUM_COURSES.add(mAX_NUM_COURSES);
	}

	public Student(String fName, String lName,String status,int ID,String courses)
	{
		super(fName, lName);
		firstName=fName;
		lastName=lName;
		matriculantStatus=status;
		sID=ID;
		MAX_NUM_COURSES.add(courses);
	}

}
