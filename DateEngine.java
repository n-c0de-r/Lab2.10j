
/**
 * The main part doing the calculations based on former labs.
 * 
 * @author	jonasblome
 * @author	n-c0de-r &
 * @version	24.06.21
 */

public class DateEngine {

	private JulianDate A;
	private JulianDate B;
	
	/**
	 * Constructor of the SetEngine class.
	 */
	public DateEngine() {
		A = new	JulianDate(0);
		B = new JulianDate(0);
	}
	
	/**
	 * Gets a weekday from a JulianDate.
	 * 
	 * @param date	The date to convert and check as String.
	 * @return		Resulting day name as String.
	 */
	public String weekday(String date) {
		A = toJulianDate(date);
		return A.getWeekday();
	}
	
	/**
	 * Adds one number to a given JulianDate.
	 * 
	 * @param setA	The date as String
	 * @param strN	Number to add as String.
	 * @return		Resulting number as String.
	 */
	public String add(String strA, String strN) {
		A = toJulianDate(strA);
		int num = Integer.parseInt(strN);
		return "" + (A.getNumber()+num);
	}
	
	/**
	 * Subtracts one number from a given JulianDate.
	 * 
	 * @param setA	The date as String
	 * @param strN	Number to subtract as String.
	 * @return		Resulting number as String.
	 */
	public String subtract(String strA, String strN) {
		A = toJulianDate(strA);
		int num = Integer.parseInt(strN);
		return "" + (A.getNumber()-num);
	}
	
	/**
	 * Subtracts one JulianDate from another.
	 * 
	 * @param strA	The first date as String.
	 * @param strB	The second date as String.
	 * @return		Resulting difference/distance of two dates in days as absolute Integer.
	 */
	public String difference(String strA, String strB) {
		A = toJulianDate(strA);
		B = toJulianDate(strB);
		int num = A.getNumber()-B.getNumber();
		return "" + Math.abs(num);
	}
	
	/**
	 * Setter method to turn given Strings to a JulianDate
	 * 
	 * @param str	String to be converted.
	 * @return		Resulting JulianDate objet of the input String.
	 */
	private JulianDate toJulianDate(String str) {
		String[] nums = str.split("\\.");
		int day = Integer.parseInt(nums[0]);
		int month = Integer.parseInt(nums[1]);
		int year = Integer.parseInt(nums[2]);
		JulianDate jd = new JulianDate(year, month, day);
		return jd;
	}
}
