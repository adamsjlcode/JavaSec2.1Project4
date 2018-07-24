/**
 * ---------------------------------------------------------------------------
 * File name: Classification.java
 * Project name: rollManager
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 11, 2016
 * ---------------------------------------------------------------------------
 */



/**
 * Classification of Students 
 * 
 * <hr>
 * Date created: Feb 11, 2016
 * <hr>
 * Date Updated: Apr 4, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public enum Classification
{

	/** The freshman. */
	FRESHMAN("FRESHMAN"), 
	/** The sophomore. */
	SOPHOMORE("SOPHOMORE"), 
	/** The junior. */
	JUNIOR("JUNIOR"), 
	/** The senior. */
	SENIOR("SENIOR"), 
	/** The graduate. */
	GRADUATE("GRADUATE"), 
	/** The other. */
	OTHER("OTHER");
	
	/** The name. */
	private final String name;
	
	/**
	 * Instantiates a new classification.
	 *
	 * @param value the value
	 */
	private Classification(String value)
	{
		this.name = value;
	}//End Classification(String)

	/**
	 * Gets the values.
	 *
	 * @return the values
	 */
	public String getValues()
	{
		return name;
	}//End getValues()
}//End Classification
