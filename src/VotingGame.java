import javax.swing.JOptionPane;

public class VotingGame {
	public static void main(String[] args) {
		// 2. Create and initialize variables to hold the score
		// for each of your buttons
		int Labradoodle = 0;
		int Goldendoodle = 0;
		int Labrador = 0;
		// 4. Add a loop of 1000 to allow lots of votes!
		for (int i = 0; i < 1000; i++) {
			// 1. Use showOptionDialog to ask a question that you want
			// the students in your class to vote on.
			// Fill in the button text to make a multiple choice answer.
			// Keep the 'Get score' button as your last button.
			int answer = JOptionPane.showOptionDialog(null, "What kind of dog do I have?", "Two Lies and One Truth", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Labradoodle", "Goldendoodle", "Labrador Retriver", "Get score!" }, null);

			// 3. Increment the score variable for the button that was pressed.
			if (answer == 0) {
				Labradoodle += 1;

			} else if (answer == 1) {
				Goldendoodle += 1;
			} else if (answer == 2) {
				Labrador += 1;
			} else {
				break;
			}
		}
		// 5. When the 'Get score' button is pressed, break out of the loop

		// 6. Once the voting is done, use a pop-up to show the results.
		// Format it to look nice.
		// Reminder: \n inside your string will add a new line.
		JOptionPane.showMessageDialog(null, "The Labradoodle got " + Labradoodle + "\n The Goldendoodle got " + Goldendoodle + 
				"\n The Lab got " + Labrador);
	}
}
