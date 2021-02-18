package model;

/**
 * @author Tom Sorteberg - tsorteberg
 * CIS175 - Spring 2021
 * Feb 18, 2021
 */
public class TempConverter {
	
	// Instance variable declaration and initialization.
	private double userTempInitial;
	private double userTempFinal = 0;
	private String userScaleInitial;
	private String userScaleFinal;
	
	/**
	 * Default constructor.
	 */
	public TempConverter() {
		super();
	}
	
	public TempConverter(double userTempInitial, String userScaleInitial, String userScaleFinal) {
		super();
		setUserTemp(userTempInitial);
		setUserScaleInitial(userScaleInitial);
		setUserScaleFinal(userScaleFinal);
		
		// Method call
		convertTemp();
	}

	/**
	 * Get method for userTempInitial instance.
	 * @return: Returns a double.
	 */
	public double getUserTempInitial() {
		return userTempInitial;
	}
	
	/**
	 * Get method for userTempFinal instance.
	 * @return: Returns a double.
	 */
	public double getUserTempFinal() {
		return userTempFinal;
	}
	
	/**
	 * Get method for userScaleInitial instance.
	 * @return: Returns a string.
	 */
	public String getUserScaleInitial() {
		return userScaleInitial;
	}
	
	/**
	 * Get method for userScaleFinal instance.
	 * @return: Returns a string.
	 */
	public String getUserScaleFinal() {
		return userScaleFinal;
	}
	
	/**
	 * Set method for userTemp instance.
	 * @param userTemp: Required double.
	 */
	public void setUserTemp(double userTemp) {
		this.userTempInitial = userTemp;
	}
	
	/**
	 * Set method for userScaleInitial instance.
	 * @param userScaleInitial: Required string.
	 */
	public void setUserScaleInitial(String userScaleInitial) {
		this.userScaleInitial = userScaleInitial;
	}
	
	/**
	 * Set method for userScale
	 * @param userScaleFinal: Required string.
	 */
	public void setUserScaleFinal(String userScaleFinal) {
		this.userScaleFinal = userScaleFinal;
	}
	
	/**
	 * Helper function to convert temperature.
	 */
	private void convertTemp() {
		if (userScaleInitial.equals(userScaleFinal)) {
			userTempFinal = userTempInitial;
		} 
		else if (userScaleInitial.equals("F")) {
			if (userScaleFinal.equals("C")) {
				userTempFinal = (userTempInitial - 32) * .5556;
			} 
			else if (userScaleFinal.contentEquals("K") ) {
				userTempFinal = ((userTempInitial - 32) * .5556) + 273.15;
			}
		}
		else if (userScaleInitial.equals("C")) {
			if (userScaleFinal.equals("F")) {
				userTempFinal = (userTempInitial * 1.8) + 32;
			}
			else if (userScaleFinal.equals("K")) {
				userTempFinal = userTempInitial + 273.15;
			}
		}
		else if (userScaleInitial.equals("K")) {
			if (userScaleFinal.equals("F")) {
				userTempFinal = ((userTempInitial - 273.15) * 1.8) + 32;
			}
			else if (userScaleFinal.equals("C")) {
				userTempFinal = userTempInitial - 273.15;
			}
		}
	}
	
	@Override
	public String toString() {
		return "Initial Temperature: " + String.format("%.2f", userTempInitial) + userScaleInitial + 
				" Final Temperature: " + String.format("%.2f", userTempFinal) + userScaleFinal;
	}
	

}
