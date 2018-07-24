/**
 * ---------------------------------------------------------------------------
 * File name: RollManager.java 
 * Project name: rollManager
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail.etsu.edu Course:
 * CSCI 1260 Creation Date: Mar 24, 2016
 * ---------------------------------------------------------------------------
 */



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFileChooser;

/**
 * Specialized Class From Student
 * 
 * <hr>
 * Date created: Mar 24, 2016
 * <hr>
 * .
 *
 * @author Justin Adams
 */
public class RollManager extends Student
{

	/** The classroll. */
	private ArrayList <Student>	classRoll;
	
	/** The temp. */
	private Student temp;

	/** The course number. */
	private String				courseNumber;

	/** The course name. */
	private String				courseName;

	/** The instructor. */
	private String				instructor;

	/** The str user. */
	private String strUser;
	
	/** The know. */
	public Utility know = new Utility( );
	
	/** The file. */
	private File file = new File("Design_Docs\\test.txt");
	
	/** The select file. */
	private Scanner selectFile;
	
	/** The str info. */
	private String strInfo = "test.txt";

	private int iInput;

	private String srtInfo1;
	

	/**
	 * No Args Constructor
	 * 
	 * <hr>
	 * Date created: Mar 24, 2016.
	 */
	public RollManager ( )
	{
		super ( );
		this.courseNumber = "";
		this.courseName = "";
		this.instructor = "";
	}// End RollManager ( )

	/**
	 * Every Element Constructor (Testing)
	 * 
	 * <hr>
	 * Date created: Mar 24, 2016 .
	 *
	 * @param lastName the last name
	 * @param firstName the first name
	 * @param major the major
	 * @param hoursCompleted the hours completed
	 * @param gPA the g pa
	 * @param eTSUPhoto the e tsu photo
	 * @param Class the class
	 * @param courseNumber            the course number
	 * @param courseName            the course name
	 * @param instructor            the instructor
	 */

	public RollManager (String lastName, String firstName, String major,
						int hoursCompleted, double gPA, String eTSUPhoto,
						String Class,String courseNumber, String courseName,
						String instructor) 
	{

		temp = new Student(lastName,firstName,major,hoursCompleted,gPA,
							eTSUPhoto,Class);
		classRoll = new ArrayList <Student>();
		classRoll.add (temp);
		setCourseNumber (courseNumber);
		setCourseName (courseName);
		setInstructor (instructor);
	}//End RollManager(String,String,String,int,double,String,String,
	 //String,String,String)
	
	/**
	 * Course Constructor        
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016 .
	 *
	 * @param courseName the course name
	 * @param courseNumber the course number
	 * @param instructor the instructor
	 * @throws FileNotFoundException 
	 */
	public RollManager (String courseName,String courseNumber, String instructor)
	throws InputMismatchException, FileNotFoundException
	{
		super ( );
		classRoll = new ArrayList <Student>();
		setCourseNumber (courseNumber);
		setCourseName (courseName);
		setInstructor (instructor);
		addFile();
		classRollToFile();


	}//End RollManager (String,String,String,File)
	
	/**
	 * Gets the course number.
	 *
	 * @return the course number
	 */
	public String getCourseNumber ( )
	{
		return courseNumber;
	}//End getCourseNumber ( )

	/**
	 * Sets the course number.
	 *
	 * @param courseNumber
	 *            the courseNumber to set
	 */
	public void setCourseNumber (String courseNumber)
	{
		this.courseNumber = courseNumber;
	}//End setCourseNumber (String)

	/**
	 * Gets the course name.
	 *
	 * @return courseName
	 */
	public String getCourseName ( )
	{
		return courseName;
	}//End getCourseName ( )

	/**
	 * Sets the course name.
	 *
	 * @param courseName
	 *            the courseName to set
	 */
	public void setCourseName (String courseName)
	{
		this.courseName = courseName;
	}//End setCourseName (String)

	/**
	 * Gets the instructor.
	 *
	 * @return instructor
	 */
	public String getInstructor ( )
	{
		return instructor;
	}//End getInstructor ( )

	/**
	 * Sets the instructor.
	 *
	 * @param instructor
	 *            the instructor to set
	 */
	public void setInstructor (String instructor)
	{
		this.instructor = instructor;
	}//End setInstructor (String)
	
	/**
	 * Gets the course number.
	 *
	 * @param lastName the last name
	 * @param firstName the first name
	 * @param major the major
	 * @param hoursCompleted the hours completed
	 * @param gPA the gpa
	 * @param eTSUPhoto the etsu photo
	 * @param Class the class
	 * @throws FileNotFoundException the file not found exception
	 * @throws NullPointerException the null pointer exception
	 */
	public void addStudent(String lastName, String firstName, String major,
							int hoursCompleted, double gPA, String eTSUPhoto, 
							String Class) 
									throws InputMismatchException, 
									FileNotFoundException, 
									NullPointerException
	{
		temp = new Student(lastName,firstName,major,hoursCompleted,gPA,
							eTSUPhoto,Class);
		classRoll.add (temp);	
	}//End addStudent(String,String,String,int,double,Sting,String)
	
	/**
	 * Edits the student.
	 *
	 * @param input the input
	 * @param selection the selection
	 * @param info the info
	 * @param i the i
	 * @param d the d
	 * @throws FileNotFoundException the file not found exception
	 */
	public void editStudent(int input,int selection,String info,
	                        int i, double d) 
	                        				throws FileNotFoundException, 
											InputMismatchException,
											NullPointerException
	{	
		temp = (classRoll.get (input));
		switch (selection)
		{
			case 1:
				temp.setLastName (info);
				break;
			case 2:
				temp.setFirstName (info);
				break;
			case 3:
				temp.setMajor(info);
				break;
			case 4:
				temp.setHoursCompleted (i);
				break;
			case 5:
				temp.setGPA (d);
				break;
			case 6:
				temp.setETSUPhoto (info);
				break;
			case 7:
				temp.setClassified (info);
				break;
			default:
				break;
		}
		classRoll.set (input,temp);
	}//End editStudent(int,int,String,int,double)
	
	/**
	 * Enter method description here         
	 * 
	 * <hr>
	 * Date created: Mar 26, 2016
	 * 
	 * <hr>.
	 *
	 * @param input the input
	 */
	public void removeStudent (int input) 
	{
		classRoll.remove (input);
	}//End removeStudent (int)
	
	/**
	 * Search by name.
	 *
	 * @param lastName the last name
	 * @param firstName the first name
	 * @return the string
	 */
	public String searchByName(String lastName, String firstName)
	{		
		
		boolean exists = false;
		strInfo = ""; 	//Variable to Hold Student toString
		for (int index=0;index<classRoll.size ( );index++)
		{
			if (classRoll.get(index).getLastName ( ).contains 
					(lastName.toUpperCase()))
			{
				if (classRoll.get(index).getFirstName ( ).contains 
							(firstName.toUpperCase()))
				{
					exists = true;
					 strInfo +=classRollToSting(index);
				}
			}		
		}
		if (exists == false)
		{
			return "Student Does Not Exists";	
		}
		return strInfo;
	}//End searchByName(String,String)
	
	/**
	 * Classification to string.
	 *
	 * @param Class the class
	 * @return the string
	 */
	public String classificationToString(String Class) throws 
								IllegalArgumentException
	{
		strUser = "";	//Variable to Hold Student toString
		for (int index=0;index<classRoll.size ( );index++)
		{
			if (classRoll.get(index).getClassified ( )==
					(Classification.valueOf(Class.toUpperCase())))
			{
				strUser += classRollToSting(index);
			}
		}
		return strUser;
	}//End classificationToString(String)
	
	/**
	 * Sort by name.
	 */
	public void sortByName () 
	{
		Student temp;	//Object to hold Student class info

		for (int index=0;index<classRoll.size ( );index++)
		{
			for (int sort=0;sort<classRoll.size ( );sort++)
			{
				strInfo = classRoll.get(index).getLastName()
				.concat(classRoll.get(index).getFirstName());
				srtInfo1 = classRoll.get(sort).getLastName()
				.concat(classRoll.get(sort).getFirstName());
				if (strInfo.compareTo (srtInfo1)<0)
				{
					temp = classRoll.get (index);
					classRoll.set (index, classRoll.get (sort));
					classRoll.set (sort,temp);
				}
			}
		}
	}//End sortByName ()
	
	/**
	 * Sort by gpa.
	 */
	public void sortByGpa ()
	{
		for (int index=0;index<classRoll.size ( );index++)
		{
			for (int sort=0;sort+1<classRoll.size ( );sort++)
			{
				if (classRoll.get(index).getGPA ( ) >= 
					classRoll.get (sort).getGPA ( ))
				{
				temp = classRoll.get (index);
				classRoll.set (index, classRoll.get (sort));
				classRoll.set (sort,temp);
				}
			}
		}
	}//End sortByGpa ()
	
	/**
	 * Class roll to sting.
	 *
	 * @return the string
	 */
	public String classRollToSting() throws NullPointerException
	{
		strInfo = "";
		for (int i = 0; i < classRoll.size ( ); i++ )
		{
			strInfo+="\nStudent # "+(i+1)+classRoll.get(i);
		}
		return strInfo;	
	}//End classRollToSting(int)
	
	/**
	 * Class roll to sting.
	 *
	 * @param index the index
	 * @return the string
	 */
	public String classRollToSting(int index)
	{
		strInfo = "\nStudent # "+(index+1)+classRoll.get(index);
		return strInfo;
	}//End classRollToSting(int)
	
	/**
	 * Gets the classRoll size.
	 *
	 * @return the size
	 */
	public int getSize()
	{
		return classRoll.size();
	}//End getSize()
	
	/**
	 * Class roll to file.
	 *
	 * @throws FileNotFoundException the file not found exception
	 */
	public void classRollToFile() throws FileNotFoundException
	{
			Scanner upFile = new Scanner(file); //File writer for file
			while (upFile.hasNext ( ))
			{
				String strLine = upFile.nextLine ( );
				String[] strInfo = strLine.split ("\\|");
				Student temp = new Student(strInfo[0],strInfo[1],strInfo[2],
				Integer.parseInt(strInfo[3]),
				Double.parseDouble(strInfo[4]),
				strInfo[5],strInfo[6]);
				classRoll.add (temp);
			}
			upFile.close ( );
	}//End classRollToFile()
	
	/**
	 * Updated file.
	 *
	 * @return the file
	 * @throws FileNotFoundException the file not found exception
	 */
	public void updatedFile() throws FileNotFoundException 
	{
		PrintWriter pw = new PrintWriter(file); //Over rights File 
		for (Student c : classRoll)
			pw.println (c.getLastName ( )+"|"+c.getFirstName ( )+"|"+
						c.getMajor ( )+"|"+ c.getHoursCompleted ( )+"|"+
						c.getGPA ( )+"|"+c.getETSUPhoto ( )+"|"+
						c.getClassified ( ));
		pw.close ( );
	}//End File updatedFile()
	
	/**
	 * Adds the file.
	 *
	 * @throws FileNotFoundException the file not found exception
	 */
	public void addFile() throws FileNotFoundException
	{
		System.out.println("Choose a file to upload");
		JFileChooser jFile = new JFileChooser ("Design_Doc");
		iInput = jFile.showOpenDialog (null);
		file = jFile.getSelectedFile ( );
		selectFile = new Scanner(file);
	}
	
	/**
	 * toSwing Method         
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		strInfo = "";
		for (int i = 0; i < classRoll.size ( ); i++ )
		{
			strInfo+="\nStudent # "+(i+1)+classRoll.get(i);
		}

			return "\t\t\tRollManager App\n\n\n"+
					"  Course Number: " + getCourseNumber ( ) +
					"\n  Course Name: " + getCourseName ( ) + 
					"\n   Instructor: " + getInstructor ( ) +
					"\n\n\tStudent Info \n\n" + strInfo;
			
	}//End toString()
	
}//End RollManager
