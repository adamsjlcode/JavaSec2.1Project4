import java.util.InputMismatchException;

/**
 * ---------------------------------------------------------------------------
 * File name: Student.java
 * Project name: rollManager
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 11, 2016
 * ---------------------------------------------------------------------------
 */
/**
 * Student Class For Different Programs
 * 
 * <hr>
 * Date created: Feb 11, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Student
{
	
	/** The last name. */
	private String lastName;
	
	/** The first name. */
	private String firstName;
	
	/** The major. */
	private String major;
	
	/**
	 * The Enum Classification.
	 */
	protected Classification grad;
	
	/** The hours completed. */
	private int hoursCompleted;
	
	/** The GPA of Student. */
	private double GPA;
	
	/** The ETSU photo. */
	private String ETSUPhoto;

	/**
	 * No Args Constructor        
	 * 
	 * <hr>
	 * Date created: Feb 11, 2016 .
	 */
	public Student ( )
	{
		lastName = "";
		firstName = "";
		major = "";
		hoursCompleted = 0;
		GPA = 0.0;
		ETSUPhoto = "";
	}//End Student()
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Mar 24, 2016 
	 *
	 * 
	 * @param lastName
	 * @param firstName
	 * @param major
	 * @param grad
	 * @param hoursCompleted
	 * @param gPA
	 * @param eTSUPhoto
	 * @param grad
	 * @param blnGrad
	 */
	public Student (String lastName, String firstName, String major,
					int hoursCompleted, double gPA, String eTSUPhoto,String grad)
					throws InputMismatchException
	{	
		setLastName (lastName);
		setFirstName (firstName);
		setMajor (major);
		setHoursCompleted (hoursCompleted);
		setGPA(gPA);
		setETSUPhoto (eTSUPhoto);
		setClassified (grad);
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return lastName
	 */
	public String getLastName ( )
	{
		return lastName;
	}//End getLastName ( )
	
	/**
	 * Sets the last name.
	 *
	 * @param lastName the lastName to set
	 */
	public void setLastName (String lastName) throws InputMismatchException
	{
		this.lastName = lastName.toUpperCase();
	}//End setLastName (String)
	
	/**
	 * Gets the first name.
	 *
	 * @return firstName
	 */
	public String getFirstName ( )
	{
		return firstName;
	}//End getFirstName ( )
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the firstName to set
	 */
	public void setFirstName (String firstName) throws InputMismatchException
	{
		this.firstName = firstName.toUpperCase();
	}//End setFirstName (String)
	
	/**
	 * Gets the major.
	 *
	 * @return major
	 */
	public String getMajor ( )
	{
		return major;
	}//End getMajor ( )
	
	/**
	 * Sets the major.
	 *
	 * @param major the major to set
	 */
	public void setMajor (String major) throws InputMismatchException
	{
		this.major = major.toUpperCase();
	}//End setMajor (String)
	
	/**
	 * Gets the hours completed.
	 *
	 * @return the hours completed
	 */
	public int getHoursCompleted ( ) 
	{
		return hoursCompleted;
	}//End getHoursCompleted ( )

	/**
	 * Sets the hours completed.
	 *
	 * @param hoursCompleted the new hours completed
	 */
	public void setHoursCompleted (int hoursCompleted) throws InputMismatchException
	{
		this.hoursCompleted = hoursCompleted;
	}//End setHoursCompleted (int)

	/**
	 * Gets the gpa.
	 *
	 * @return the gpa
	 */
	public double getGPA ( ) 
	{
			return GPA;
	}//End getGPA ( ) 

	/**
	 * Sets the gpa.
	 *
	 * @param gPA the new gpa
	 */
	public void setGPA(double gPA) throws InputMismatchException
	{
			GPA = gPA;
	}//End setGPA (double)

	/**
	 * Gets the ETSU photo.
	 *
	 * @return the ETSU photo
	 */
	public String getETSUPhoto ( )
	{
		return ETSUPhoto;
	}//End getETSUPhoto ( )

	/**
	 * Sets the ETSU photo.
	 *
	 * @param string the new ETSU photo
	 */
	public void setETSUPhoto (String string) throws InputMismatchException
	{
		this.ETSUPhoto = string;	
	}//End setETSUPhoto (String)

	/**
	 * Sets the Class.
	 * @param Class 
	 * 
	 */
	public void setClassified(String Class) throws InputMismatchException
	{
		try 
		{
			this.grad = Classification.valueOf(Class.toUpperCase());
		} 
		catch (Exception e) 
		{
			this.grad = Classification.OTHER;
		}	
	}//End setClassified()
	public Classification getClassified()
	{
		return grad;
	}//End getClassified()

	/**
	 * toString Method         
	 * 
	 * <hr>
	 * Date created: Feb 11, 2016 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString()
	{
		String strString = ("\tName: " + getLastName() + " , " + getFirstName() +
					 		"\tMajor: \t" + getMajor() + 
					 		"\tClass: \t" + getClassified()+
						    "\tHours: \t" + getHoursCompleted() + "\tGPA: \t" +
							getGPA() +
							"\tETSU Photo: " + getETSUPhoto());
		return strString;
	}//End toString()
}//End Student
