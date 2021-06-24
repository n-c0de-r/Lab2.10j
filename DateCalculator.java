/**
 * The runner class of a calculator.
 * Based on earlier calculator versions.
 * 
 * @author	jonasblome
 * @author	n-c0de-r
 * @version	24.06.2021
 */

public class DateCalculator {
	private DateEngine engine;
	private DateGUI gui;

	/**
	 * Create a new calculator and show it.
	 */
	public DateCalculator() {
		engine = new DateEngine();
		gui = new DateGUI(engine);
	}

	/**
	 * In case the window was closed, show it again.
	 */
	public void show() {
		gui.setVisible(true);
	}

	public static void main(String[] args) {
		DateCalculator c = new DateCalculator();
	}
}
