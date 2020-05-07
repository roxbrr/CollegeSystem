package collegeSystem;

public class Courses
{
	private String courseID;
	private String CourseName;
	private String matriculantStatus;

	public String getCourseID()
	{
		return courseID;
	}
	public void setCourseID(String courseID)
	{
		courseID = courseID;
	}
	public String getCourseName()
	{
		return CourseName;
	}
	public void setCourseName(String courseName)
	{
		CourseName = courseName;
	}
	public String getMatriculantStatus()
	{
		return matriculantStatus;
	}
	public void setMatriculantStatus(String matriculantStatus)
	{
		this.matriculantStatus = matriculantStatus;
	}
	public Courses(String ID,String Name,String status)
	{
		courseID=ID;
	    CourseName=Name;
	    matriculantStatus=status;
	}

}
