package collegeSystem;

import java.util.ArrayList;

public class Staff extends Employee
{

	private String firstName;
	private String lastName;
	private String deptName;
	private int eID;
	ArrayList ARRAY_DUTIES=new ArrayList();
	
	public Staff(String fName, String lName, String dName, int ID, String duty)
	{
		super(fName, lName, dName, ID);
		firstName=fName;
		lastName=lName;
		deptName=dName;
		eID=ID;
		ARRAY_DUTIES.add(duty);
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
	
	
	public ArrayList getARRAY_DUTIES()
	{
		return ARRAY_DUTIES;
	}
	
	
	public void setARRAY_DUTIES(ArrayList duties)
	{
		ARRAY_DUTIES = duties;
	}


}
