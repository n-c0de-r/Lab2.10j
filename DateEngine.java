import javax.naming.directory.AttributeInUseException;

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
	 * Unites two given Sets to a new Set.
	 * 
	 * @param setA	The main set.
	 * @param setB	The second set to merge to the first.
	 * @return		Resulting Set merged from the given two.
	 */
	public String weekday(String stringA) {
		A = toJulianDate(stringA);
		return A.getWeekday();
	}
	
	/**
	 * Intersects two given Sets to a new Set.
	 * 
	 * @param setA	The main set.
	 * @param setB	The second set to check for intersection with the first.
	 * @return		Resulting Set of intersecting from the given two.
	 */
//	public String intersection(String setA, String setB) {
//		A = toSet(setA);
//		B = toSet(setB);
//		res = A.intersection(B);
//		return res.toString();
//	}
	
	/**
	 * Subtracts one Set from another.
	 * 
	 * @param setA	The main set.
	 * @param setB	The second set to subtract from the first.
	 * @return		Resulting Set of subtracting from the given two.
	 */
	public String subtract(String strA, String strN) {
		A = toJulianDate(strA);
		int num = Integer.parseInt(strN);
		return "" + (A.getNumber()-num);
	}
	
	/**
	 * Getter method to return the number of elements of a Set.
	 * 
	 * @param set	Given Set to check the number of elements.
	 * @return		String containing the number of elements of a Set.
	 */
//	public String length(String str) {
//		A = toSet(str);
//		int len = A.length();
//		return Integer.toString(len);
//	}
	
	/**
	 * Setter method to turn given Strings to a Set
	 * 
	 * @param str	String to be converted.
	 * @return		Resulting Set of Characters of the input String.
	 */
	private JulianDate toJulianDate(String str) {
		String[] nums = str.split("\\.");
		System.out.println(nums.length);
		int year = Integer.parseInt(nums[0]);
		int month = Integer.parseInt(nums[1]);
		int day = Integer.parseInt(nums[2]);
		JulianDate jd = new JulianDate(year, month, day);
		return jd;
	}
}
