
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String Julia = "Can move things with mind!";
		String Alex = "Hands can heat up, when he touches things they get hot.";
		String Olivia = "Can turn down peoples voices.";
		String Camron = "Can shrink and grow to any size.";
		String Eli = "Has laser eyes.";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String Power = JOptionPane.showInputDialog("Enter a name (Names: Julia, Alex, Olivia, Camron, Eli");

		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (Power.equals("Julia")) {
			JOptionPane.showMessageDialog(null, Julia);
		}
		else if (Power.equals("Alex")){
			JOptionPane.showMessageDialog(null, Alex);
		}
		else if (power.equals("Olivia")){
			JOptionPane.showMessageDialog(null, Olivia);
		}
		else if (power.equals("Camron")){
			JoptionPane.showMessageDialog(null,Camron);
		}
		else if (power.equals("Eli")){
			JOptionPane.showMessageDialog(null, Eli);
		}
	}
}
