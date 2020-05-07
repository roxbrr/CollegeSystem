package collegeSystem;

public abstract class Employee extends Person
{
	private String firstName;
	private String lastName;
	private String deptName;
	private int eID;
	
	public Employee(String fName, String lName, String dName,int ID)
	{
		super(fName, lName);
		firstName=fName;
		lastName=lName;
		deptName=dName;
		eID=ID;
	}

	public abstract String getDeptName();

	public abstract void setDeptName(String deptName);

	public abstract int geteID();

	public abstract void seteID(int eID);

	@Override
	public abstract String getFirstName();

	@Override
	public abstract void setFirstName(String firstName);

	@Override
	public abstract String getLastName();

	@Override
	public abstract void setLastName(String lastName);

	
}
