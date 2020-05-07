package collegeSystem;

public abstract class Person
{

	private String firstName;
	private String lastName;

	public Person(String fName,String lName)
	{
		firstName=fName;
		lastName=lName;
	}

	public abstract String getFirstName();
	public abstract void setFirstName(String firstName);
	public abstract String getLastName();
	public abstract void setLastName(String lastName);

}
