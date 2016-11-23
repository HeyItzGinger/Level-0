
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration
 * information at the check-in counter and print their boarding pass. You need
 * to collect the following information: First name Last name Destination
 * airport Birthday (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
 * M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {

		String firstname = JOptionPane.showInputDialog("What is your first name?");
		String lastname = JOptionPane.showInputDialog("What is your last name?");
		String destination = JOptionPane.showInputDialog("Where is your destination?");
		String birthday = JOptionPane.showInputDialog("What is your date of birth?");
		String gender = JOptionPane.showInputDialog("Are you a male or female?");
		JOptionPane.showMessageDialog(null,
				"\n Here is your boarding pass information: " + " \nFirst Name: " + firstname + "\n Last Name: " + lastname
						+ "\n Destination: " + destination + "\n Birthday: " + birthday + "\n Gender: " + gender);
	}
}

/**
 * Extra Difficult Challenge: have the program repeat until plane is full (10
 * passenger plan) and print out the number of passengers after each boarding
 * pass.
 */
