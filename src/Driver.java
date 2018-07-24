
/**
 * ---------------------------------------------------------------------------
 * File name: Driver.java
 * Project name: rollManager
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Mar 25, 2016
 * ---------------------------------------------------------------------------
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * Create Custom Roll Manager App
 * 
 * <hr>
 * Date created: Mar 25, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Driver
{
		/** The course. */
		static RollManager course = new RollManager();
		
		//Start Student 
		/** The last name. */
		static String lastName;
		/** The first name. */
		static String firstName;
		/** The major. */
		static String major;
		/**
		 * The Enum Classification.
		 */
		static Classification grad;
		/** The hours completed. */
		static int hoursCompleted;
		/** The GPA of Student. */
		static double GPA;
		/** The ETSU photo. */
		static String ETSUPhoto;
		/** The String Value Of Classification. */
		static String Class;
		//End Student
		
		/** The know. */
		static Utility know = new Utility();	

		/** The Interger input. */
		static Scanner clear = new Scanner(System.in);				

		/** The String input. */
		static Scanner input = new Scanner(System.in);

		/** The file. */
		static File file = new File("");

		/** The new print. */
		static PrintWriter newPrint;	
				
		/** The c redo. */
		static char cRedo;
		
		/** The bln truth. */
		static boolean blnTruth;
		
		/** The i menu input. */
		static int iMenuInput;
		
		/** The str input. */
		static String strInput;

		/**  Index Reference *. */
		static int iInput;

				
		/** The str message integer. */
		static String strMessageInteger = "\nNeed To Be An Integer\nTry Again\n"
				+ "Press Enter To Continue";
		
		/** The str message exist. */
		static String strMessageExist = "\nDoes Not Exist\nTry Again\n";
		
		/** The str re. */
		static String strRe = "\nWould Change Something Else\n";

		/** The str mess empty. */
		static String strMessEmpty = "\nCan not be empty or a negitive number"+
										"\nTry Again";
		
		/** The str valid. */
		static String strValid = "\nNot A Valid Response\nTry Again\n";	
		
		/** The sort g. */
		static String sortG = "\nThe class was sorted";
		
		/** The sortb. */
		static String sortB = "\nThe class was not sorted";
	
	/**
	 * Main Method For RollManager Class         
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016
	 * 
	 * <hr>.
	 *
	 * @param args the arguments
	 */
	public static void main (String [ ] args)
	{
		
		/** Store The User Name **/
		String strUserName = "";

		/** Welcome Message For User **/
		String strWelcome = "\n*************ROLLBOOK****************\n\n"+
								"Welcome to the Driver Program\n"+
							"\n*************************************\n\n";
		/** Menu Message For User **/
		String strMenu;
		

		JOptionPane.showMessageDialog (null,
			"<html><div style='text-align: center;'>"+
			know.theProgrammerInfo ( ) + "<br>" + "</html>.",
				"Welcome To The Student Driver",
					JOptionPane.INFORMATION_MESSAGE);
		
		System.out.println(strWelcome);
		System.out.println("What is Your Name");
		strUserName = input.nextLine ( );
		strMenu =		"\nWelcome " + strUserName +
						"\nProject3: Student Menu\n" +
						"\n-------------------------------\n" +
						"\n1.  Create a new Course" +
						"\n2.  Create a new Student" +
						"\n3.  Edit a Student" +
						"\n4.  Drop a Student from the classRoll" +
						"\n5.  Display all Students on the classRoll" +
						"\n6.  Find And Display By Name" +
						"\n7.  Display all Students on the classRoll of a" + 
							" given Classification" +
						"\n8.  Sort the Students by name (last, first)" +
						"\n9.  Sort the Students by GPA" +
						"\n10. End the Program";

		while(blnTruth == false||iInput <= 10||iInput >0)
		{
			know.clearScreen ( );	
			System.out.println(strMenu);
			System.out.println("\n\nChoose an option between 1 and 10");
			
			try 
			{
				iInput = clear.nextInt ( );
				blnTruth= true;
			}
			catch (InputMismatchException e) 
			{
				blnTruth= false;
				System.out.println(strValid);
				know.pressEnterToContinue();
				clear.nextLine();
			}
			switch(iInput)
			{
				case 1:
					Option1 ();
					break;
				case 2:
					Option2 ();
					break;
				case 3:
					Option3 ();
					break;
				case 4:
					Option4 ();
					break;
				case 5: 
					Option5 ();
					break;
				case 6:
					Option6 ();
					break;
				case 7:
					Option7 ();
					break;
				case 8:
					Option8 ();
					break;
				case 9:
					Option9 ();
					break;
				case 10:
					try 
					{
						course.updatedFile();	
					} 
					catch (FileNotFoundException e) 
					{
						System.out.print("File was not updated");
					}
					System.exit(0);
						
			}
		}
	}//End main (String[])
	
	/**
	 * Switch Option 1 Add A Course
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016
	 * 
	 * <hr>.
	 */

	public static void Option1 ()
	{
		/** The course name. */
		String	courseName = "";

		/** The course number. */
		String	courseNumber = "";

		/** The instructor. */
		String	instructor = "";

		blnTruth = true;
		do
		{
				System.out.print ("\nCreate a new Course\n\n" +
									"Please push enter to continue\n");
				input.nextLine ( );
				System.out.print ("What Is The Course Name ");
				courseName = input.nextLine();
				System.out.print ("What Is The Course Number ");
				courseNumber = input.nextLine();
				System.out.print ("What Is The Course Instructor ");
				instructor = input.nextLine();
				try 
				{
					course = new RollManager(courseName,courseNumber,instructor);
					blnTruth = true;
				} 
				catch (InputMismatchException e) 
				{
					System.out.print(strValid);
					blnTruth = false;
				} 
				catch (FileNotFoundException e) 
				{
					System.out.print("File Was Not Found");
					blnTruth = false;
				}	
				catch (NullPointerException e) 
				{
					System.out.println("Suck My Balls");
					blnTruth = false;
				}	
				
		}while (blnTruth == false);
		
	}//End Option1()
	
	/**
	 * Switch Option 2 Add A Student        
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016
	 * 
	 * <hr>.
	 */
	public static void Option2 ()
	{
		blnTruth = true;
		System.out.print ("\nCreate a new Student\n\n" + 
							"Please push enter to continue\n");
		input.nextLine ( );
		do
		{
			System.out.println ("What the Students Last Name? ");
			lastName = input.nextLine ( ).toUpperCase ( );

			System.out.println ("What the Students First Name? ");
			firstName = input.nextLine ( ).toUpperCase ( );
		do
		{
			System.out.println ("How Many Hours Does The Student Have Completed ");
			try
			{
				hoursCompleted =clear.nextInt ( );
				blnTruth = true;
			}
			catch (Exception e)
			{
				clear.nextLine();
				System.out.println (strMessageInteger);
				clear.nextLine();
				blnTruth = false;
			}
		}while (blnTruth == false);
		do
		{
			System.out.println ("What Is The GPA Of The Student ");
			try
			{
				GPA = clear.nextDouble ( );
				blnTruth = true;
			}
			catch (Exception e)
			{
				clear.nextLine();
				System.out.println (strMessageInteger);
				clear.nextLine();
				blnTruth = false;
			}
		}while (blnTruth == false);
		do
		{
			System.out.println ("What is the Students Major? " +
							"\nNeeds to be only four characters long");
			try
			{
				major = input.nextLine ( ).toUpperCase ( );
				blnTruth = true;
				if (major.isEmpty ( ))
				{
					System.out.print (strMessEmpty);
					blnTruth = false;
				}
				else if(major.length ( )>4||major.length ( )<4)
				{
					System.out.println ("Needs to be exactly four characters long");
					blnTruth = false;
				}
			}
			catch (Exception e)
			{
				System.out.print("Please Try Again");
				blnTruth = false;
			}
		}while (blnTruth == false);
		System.out.println ("What the Students Photo Name? ");
		ETSUPhoto = input.nextLine ( );
		System.out.println ("What is the Students Classification? ");
		Class = input.nextLine ( ).toUpperCase ( );	
		try
		{
			course.addStudent (lastName,firstName,major,hoursCompleted,GPA,
			ETSUPhoto,Class);
		}
		catch (InputMismatchException e)
		{
			System.out.println(strValid);
			blnTruth = false;
		}		
		catch (FileNotFoundException e)
		{
			System.out.println("File was not found.");
			blnTruth = false;
		}
		catch (NullPointerException e)
		{
			System.out.println("Need to create a course first");
			blnTruth = true;
		}
		}while(blnTruth == false);

	}

	/**
	 * Switch Option 3 Edit A Student
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016
	 * 
	 * <hr>.
	 */
	public static void Option3 ( )
	{
		
		String strEditMenu = "Edit A Student\n\n\nWhat would you like to edit? " +
							"\n1.Last Name" +
							"\n2.First Name" +
							"\n3.Major" +
							"\n4.Hours Completed" +
							"\n5.GPA" +
							"\n6.ETSU Photo File Name" +
							"\n7.Classification";
		blnTruth = true;
		System.out.print ("\nEdit A Student\n\nPlease push enter to continue\n");
		input.nextLine ( );		
		do
		{
			try 
			{
				System.out.println (course.classRollToSting ( ));

			} 
			catch (NullPointerException e) 
			{
				System.out.println("Need to create a course first");
				blnTruth = true;
				return;
			}			
			System.out.println ("Which Would You To Edit");
			try
			{
				iInput = clear.nextInt ();
				blnTruth = true;
			}
			catch (Exception e)
			{
				System.out.print (strMessageInteger);
				clear.nextLine();
				blnTruth = false;
			}
		}while (iInput < 0 || blnTruth == false || iInput > course.getSize ( ));
		do
		{
			try
			{
				System.out.println(course.classRollToSting (iInput-1));
				System.out.println("Is this the student you want to edit?"+
									"\nYes or No\n");
				try
				{
					cRedo = input.next ( ).toUpperCase ( ).charAt (0);
					blnTruth = true;
				}
				catch (Exception e)
				{
					System.out.print(strValid);
					cRedo = 'N';
				}	

			}
			catch (Exception e)
			{
				System.out.print(strMessageExist);
				blnTruth = false;
			}
			if (cRedo == 'N')Option3();
		}while (iInput < 0 || blnTruth == false);
		do
		{
			System.out.println (strEditMenu);
			try
			{
				iMenuInput = clear.nextInt ( );
				blnTruth = true;
			}
			catch (Exception e)
			{
				System.out.print (strMessageInteger);
				blnTruth = false;
			}
			switch (iMenuInput)
			{	
				case 1:
					input.nextLine ( );
					do
					{
						System.out.println ("What the Students Last Name? ");
						try
						{
							lastName = input.nextLine ( ).toUpperCase ( );
							blnTruth = true;
							if(lastName.isEmpty ( ))
							{
								System.out.print (strMessEmpty);
								blnTruth = false;
							}
							else
							{
								GPA = 0.0;
								hoursCompleted = 0;
								course.editStudent ((iInput-1), iMenuInput, 
														lastName, 
														hoursCompleted,GPA);
								System.out.println (strRe);
								try
								{
									cRedo = input.next ( ).toUpperCase ( )
																.charAt (0);

								}
								catch (Exception e)
								{
									System.out.print(strValid);
									cRedo = 'N';
								}							
							}
						}
						catch (Exception e)
						{
							System.out.print("Please Try Again");
							blnTruth = false;
						}
					}while (blnTruth==false);
					break;
				case 2:
					input.nextLine ( );
					do
					{
						input.nextLine ( );
						System.out.println ("What the Students First Name? ");
						try
						{
							firstName = input.nextLine ( ).toUpperCase ( );
							blnTruth = true;
							if(firstName.isEmpty ( ))
							{
								System.out.print (strMessEmpty);
								blnTruth = false;
							}
							else
							{
								GPA = 0.0;
								hoursCompleted = 0;
								course.editStudent ((iInput-1), iMenuInput,
															firstName,
															hoursCompleted,GPA);
								System.out.println (strRe);
								try
								{
									cRedo = input.next ( ).toUpperCase ( )
																	.charAt (0);

								}
								catch (Exception e)
								{
									System.out.print(strValid);
									cRedo = 'N';
								}							
							}
						}
						catch (Exception e)
						{
							System.out.print(strValid);
							blnTruth = false;
						}
					}while (blnTruth==false);
					break;
				case 3:
					input.nextLine ( );
					do
					{
						System.out.println ("What is the Students Major? " +
										"\nNeeds to be only four characters long");
						try
						{
							major = input.nextLine ( ).toUpperCase ( );
							blnTruth = true;
							
							if (major.isEmpty ( ))
							{
								System.out.print (strMessEmpty);
								blnTruth = false;
							}
							else if(major.length ( )>4||major.length ( )<4)
							{
								System.out.println ("Needs to be exactly "+
													"four characters long");
								blnTruth = false;
							}
							else
							{
								GPA = 0.0;
								hoursCompleted = 0;
								course.editStudent ((iInput-1), iMenuInput, 
																	major,
																	hoursCompleted,GPA);
								System.out.println (strRe);
								try
								{
									cRedo = input.next ( ).toUpperCase ( )
																	.charAt (0);

								}
								catch (Exception e)
								{
									System.out.print(strValid);
									cRedo = 'N';
								}							
							}
						}
						catch (Exception e)
						{
							System.out.print("Please Try Again");
							blnTruth = false;
						}
					}while (blnTruth==false);
					break;
				case 4:
					input.nextLine ( );
					do
					{
						System.out.println ("How Many Hours Does The "+
											"Student Have Completed ");
						try
						{
							hoursCompleted =clear.nextInt ( );
							blnTruth = true;
							if (hoursCompleted < 0)
							{
								System.out.print (strMessEmpty);
								blnTruth = false;
								clear.nextLine();
							}
							else
							{
								GPA = 0.0;
								major="";
								course.editStudent ((iInput-1), iMenuInput, major,
													hoursCompleted,GPA);
								System.out.println (strRe);
								try
								{
									cRedo = input.next ( ).toUpperCase ( )
																	.charAt (0);

								}
								catch (Exception e)
								{
									System.out.print(strValid);
									cRedo = 'N';
									input.nextLine();
								}							
							}
						}
						catch (Exception e)
						{
							System.out.print("Please Try Again");
							blnTruth = false;
							clear.nextLine();
						}
					}while (blnTruth==false);
					break;
				case 5:
					input.nextLine ( );
					do
					{
						System.out.println ("What Is The GPA Of The Student ");
						try
						{
							GPA = clear.nextDouble ( );
							blnTruth = true;
							if (GPA < 0)
							{
								System.out.print (strMessEmpty);
								blnTruth = false;
								clear.nextLine();
							}
							else
							{
								major="";
								hoursCompleted = 0;
								course.editStudent ((iInput-1), iMenuInput, 
													major, 
													hoursCompleted, GPA);
								System.out.println (strRe);
								try
								{
									cRedo = input.next ( ).toUpperCase ( )
																.charAt (0);

								}
								catch (Exception e)
								{
									System.out.print(strValid);
									cRedo = 'N';
									input.nextLine();
								}							
							}
						}
						catch (Exception e)
						{
							System.out.print("Please Try Again");
							blnTruth = false;
							clear.nextLine();
						}
					}while (blnTruth==false);
					break;
				case 6:
					input.nextLine ( );
					do
					{
						System.out.println ("What the Students Photo Name? ");
						try
						{
							ETSUPhoto = input.nextLine ( );
							blnTruth = true;
							if (hoursCompleted < 0)
							{
								System.out.print (strMessEmpty);
								blnTruth = false;
							}
							else
							{
								GPA = 0.0;
								hoursCompleted = 0;
								course.editStudent ((iInput-1), iMenuInput, 
																ETSUPhoto, 
																hoursCompleted,GPA);
								System.out.println (strRe);
								try
								{
									cRedo = input.next ( ).toUpperCase ( )
																	.charAt (0);

								}
								catch (Exception e)
								{
									System.out.print(strValid);
									cRedo = 'N';
								}							
							}
						}
						catch (Exception e)
						{
							System.out.print(strValid);
							blnTruth = false;
						}
					}while (blnTruth==false);
					break;
				case 7:
					input.nextLine ( );
					do
					{
						System.out.println ("What is the Students Classification? ");
						Class = input.nextLine ( ).toUpperCase ( );
							try 
							{								
							GPA = 0.0;
							hoursCompleted = 0;
								
								course.editStudent ((iInput-1), iMenuInput, 
																Class,
																hoursCompleted,GPA);
							}
							catch (Exception e)
							{
								System.out.print(strValid);
								cRedo = 'N';
							}	
							System.out.println (strRe);
							cRedo = input.next ( ).toUpperCase ( ).charAt (0);
					}while (blnTruth == false);
					break;

				default:
					System.out.println("\nPlease Try Again\n");
					break;
			}
		}while ( blnTruth == false || cRedo == 'Y');
	}//End Option3 ()

	/**
	 * Switch Option 4         
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016
	 * 
	 * <hr>.
	 */
	public static void Option4 ( )//Drop a Student from the classRoll
	{

		System.out.println ("Remove A Student");
		try 
		{
			System.out.println (course.classRollToSting ( ));

		} 
		catch (NullPointerException e) 
		{
			System.out.println("Need to create a course first");
			blnTruth = true;
			return;
		}		do
		{
			System.out.println ("Which Would You To Remove");
			try
			{
				iInput = clear.nextInt ( );
				know.pressEnterToContinue();
				strInput = course.classRollToSting (iInput);
				System.out.println("\nStudent Was Removed\n");
				know.pressEnterToContinue();
			}
			catch (IndexOutOfBoundsException e)
			{
				System.out.print (strMessageExist);
				clear.nextLine();
			}
			catch (Exception e)
			{
				System.out.print (strMessageInteger);
				clear.nextLine();
			}
		}while (iInput < 0||iInput > course.getSize());
		course.removeStudent(iInput);
	}//End Option4()

	/**
	 * Switch Option 5 Display all Students on the classRoll        
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016
	 * 
	 * <hr>.
	 */
	public static void Option5 ()
	{
		try 
		{
			System.out.print (course.toString ( ));
		}		
		catch (NullPointerException e) 
		{
			System.out.println("Need to create a course first");
			blnTruth = true;
			return;
		}		
		know.pressEnterToContinue();
	}//End Option5()

	/**
	 * Switch Option 6 Find And Display By Name        
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016
	 * 
	 * <hr>.
	 */
	public static void Option6 ()
	{
			System.out.print ("What the Students Last Name? ");
			lastName = input.nextLine ( ).toUpperCase ( );
			System.out.print ("What the Students First Name? ");
			firstName = input.nextLine ( ).toUpperCase ( );
			try
			{
				System.out.println(course.searchByName(lastName,firstName));
			}
			
			catch (NullPointerException e) 
			{
				System.out.println("Need to create a course first");
				blnTruth = true;
				return;
			}			
			know.pressEnterToContinue();
	}//End Option6 ()

	/**
	 * Switch Option 7 Display all Students on the 
	 * classRoll of a given Classification        
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016
	 * 
	 * <hr>.
	 */
	public static void Option7 ()
	{
		do
		{
		strInput = "";
		System.out.print ("What Classification Would You Like Displayed ");
		strInput = input.nextLine ( ).toUpperCase ( );
		try 
		{
			System.out.println(course.classificationToString(strInput));
			blnTruth = true;
		} 
		catch (IllegalArgumentException e) 
		{
			blnTruth = false;
		}
		catch (NullPointerException e) 
		{
			System.out.println("Need to create a course first");
			blnTruth = true;
			return;
		}	
		}while (blnTruth == false);		
		know.pressEnterToContinue();
	}//End Option7 ()
	
	/**
	 * Switch Option 8 Sort the Students by name (last, first)        
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016
	 * 
	 * <hr>.
	 */
	public static void Option8 ()
	{
		try
		{
			course.sortByName ();
		}
		catch (NullPointerException e) 
		{
			System.out.println("Need to create a course first");
			blnTruth = true;
			return;
		}	
		catch (Exception e)
		{
			System.out.print (sortB);
		}
		System.out.print (sortG);
		System.out.println(course.classRollToSting ( ));
		know.pressEnterToContinue();
	}// Option8 ()
	
	/**
	 * Switch Option 9 Sort the Students by GPA       
	 * 
	 * <hr>
	 * Date created: Mar 25, 2016
	 * 
	 * <hr>.
	 */
	public static void Option9 ()
	{
		try
		{
			course.sortByGpa ();
		}
		
		catch (NullPointerException e) 
		{
			System.out.println("Need to create a course first");
			blnTruth = true;
			return;
		}	
		catch (Exception e)
		{
			System.out.print (sortB);
		}
		System.out.print (sortG);
		System.out.println(course.classRollToSting ( ));
		know.pressEnterToContinue();
	}//End Option9 ()
	
}
