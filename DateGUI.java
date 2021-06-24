import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * GUI for the calculator, based on the former labs.
 * 
 * @author	jonasblome
 * @author	n-c0de-r 
 * @version	24.06.2021
 */
public class DateGUI implements ActionListener {

	private DateEngine calc;
	private JFrame frame;
	private JTextField dateA;
	private JTextField dateB;
	private JTextField number;
	private JTextField result;

	public DateGUI(DateEngine engine) {
		calc = engine;
		makeFrame();
		frame.setVisible(true);
	}

	/**
	 * Set the visibility of the interface.
	 * 
	 * @param visible true if the interface is to be made visible, false otherwise.
	 */
	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}

	private void makeFrame() {
		frame = new JFrame("Date Calculator");

		JPanel contentPane = (JPanel) frame.getContentPane();
		contentPane.setLayout(new BorderLayout(8, 8));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

		JPanel inputPanel = new JPanel(new GridLayout(2, 1));
		
		dateA = new JTextField("Input a date in format: DD.MM.YYYY");
		inputPanel.add(dateA, BorderLayout.NORTH);
		dateB = new JTextField("Input a second date to calculate difference.");
		inputPanel.add(dateB, BorderLayout.SOUTH);

		contentPane.add(inputPanel, BorderLayout.NORTH);
		
		JPanel buttonPanel = new JPanel(new GridLayout(2, 2));

		addButton(buttonPanel, "Weekday");
		addButton(buttonPanel, "Days between");
		
		addButton(buttonPanel, "Add number");
		addButton(buttonPanel, "Subtract number");

		contentPane.add(buttonPanel, BorderLayout.CENTER);
		
		result = new JTextField();
		contentPane.add(result, BorderLayout.SOUTH);
		result.setEditable(false);

		frame.pack();
	}

	/**
	 * Performs an action according to the String labeling a button.
	 * 
	 * @param event	The event causing the action, a button click.
	 */
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		String A = dateA.getText();
		String B = dateB.getText();
		String str = "";
		if (command.equals("Weekday")) {
			str = calc.weekday(A);
		} else if (command.equals("Days between")) {
			str =  calc.difference(A, B);
		} else if (command.equals("Add number")) {
			str = calc.add(A, B);
		} else if (command.equals("Subtract number")) {
			str =  calc.subtract(A, B);
		} else if (command.equals("Clear Fields")) {
			clear();
		}
		result.setText(str);
	}

	/**
	 * Add a button to the button panel.
	 * 
	 * @param panel      The panel to receive the button.
	 * @param buttonText The text for the button.
	 */
	protected void addButton(Container panel, String buttonText) {
		JButton button = new JButton(buttonText);
		button.addActionListener(this);
		panel.add(button);
	}
	
	/**
	 * Clears all input and output fields.
	 */
	private void clear() {
		dateA.setText("Input a date in format: DD.MM.YYYY");
		dateB.setText("Input a second date to calculate difference.");
		number.setText("");
		result.setText("");
	}
}
