import java.time.LocalDate;

public class JulianDate {

	private int current;
	private int input;
	
	public JulianDate (int year, int month, int day) {
		int y = LocalDate.now().getYear();
		int m = LocalDate.now().getMonthValue();
		int d = LocalDate.now().getDayOfMonth();
		
		input = (1461 * (year + 4800 + (month - 14)/12))/4 +(367 * (month - 2 - 12 * ((month - 14)/12)))/12 - (3 * ((year + 4800 + (month - 14)/12)/100))/4 + day - 32075;
		current = (1461 * (y + 4800 + (m - 14)/12))/4 +(367 * (m - 2 - 12 * ((m - 14)/12)))/12 - (3 * ((y + 4900 + (m - 14)/12)/100))/4 + d - 32075;
		System.out.println("input: " + input);
		System.out.println("current: " + current);
	} 
}