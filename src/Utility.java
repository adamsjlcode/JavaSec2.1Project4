/**
 * ---------------------------------------------------------------------------
 * File name: Utility.java
 * Project name: rollManager1
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 4, 2015
 * ---------------------------------------------------------------------------
 */



import java.util.Scanner;

/**
 *         
 * Method Purpose: Utility Program For Programmer
 * 
 * <hr>
 * Date created: Nov 4, 2015
 * <hr>
 * Date updated: Apr 4, 2016
 * <hr>
 * @param Assign
 * 
 */
public class Utility
{
	Scanner kbInput = new Scanner(System.in);		//User input from keyboard
	GetCurrentDateAndTime date = new GetCurrentDateAndTime();
	public String theProgrammerInfo()
	{
			
			return  ("<html>Program Name: \tDriver.java" +
					"<br>     Programmer: \tJustin Adams" +
					"<br>          Class: \tCSCI 1260-003" +
					"<br><br>" + date.date()+"<br><br></html>");		
	}//End theProgrammerInfo(String)
	/** 
	* Method Name: pressEnterToContinue <br>
	* Method Purpose: Pause Display For User 
	* <hr>
	* Date created: 09/23/2015
	* <hr>
	* Notes:
	* <hr>
	*
	*/
	public void pressEnterToContinue()
	{
		System.out.println("\nPress Enter To Continue\n");
		kbInput.nextLine();	
	}//End pressEnterToContinue()
	/**
	 * Method to start program over         
	 *
	 * <hr>
	 * Date created: Nov 7, 2015
	 *
	 * <hr>
	 * 
	 */
	public char startOver()
	{
		
		char cOver;					//Hold The Char To End Or Start Programs
		String strStart;			//User input For Starting Over The Program
		System.out.println("\n\nWould You Like To Restart The Program" + 
							" Add New Values.\nEnter Y For Yes Or N For No");
		strStart = kbInput.nextLine();
		cOver = strStart.charAt(0);	//Turning User Input Into A Char
		return cOver;
	}//End startOver()
	/**
	 * Menu interface for user        
	 *
	 * <hr>
	 * Date created: Nov 5, 2015
	 *
	 * <hr>
	 * @return iMenu
	 */
	public int menu ( )
	{
		int iMenu;				//Holds integer for menu
		System.out.println  ("\n1. Change Book Order"
							+"\n2. Change Grade"
							+"\n3. Set/Change Percent"
							+"\n4. View Averages"     
							+"\n5. View Course Average"
							+"\n6. Set Class Info");
		iMenu = kbInput.nextInt();

		return iMenu;
		
	}//End menu()
	/**
	 * Method to clear screen for user        
	 *
	 * <hr>
	 * Date created: Nov 11, 2015
	 *
	 * <hr>
	 */
	public void clearScreen ( )
	{
		for(int i =1;i<40;i++)
		{
			System.out.print ("\n");
		}	
	}//End clearScreen()

}//End Utility()
