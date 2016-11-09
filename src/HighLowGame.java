
 import java.util.Random;

import javax.swing.JOptionPane;


// Copyright Wintriss Technical Schools 2013
public class HighLowGame {


	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int j = 0; j<10; j++){
			// 1. ask the user for a guess using a pop-up window, and save their response 
String guess = JOptionPane.showInputDialog("Pick a number between 1-100.");


			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int stringAsInt = Integer.parseInt(guess);    
					
			// 5. if the guess is correct
			if (stringAsInt==random){
				
			
				// 6. win
			JOptionPane.showMessageDialog(null,"Awesome job you got the correct answer!!");
	}
			// 7. if the guess is high
			// 8. tell them it's too high
			else if (stringAsInt>random){
				JOptionPane.showMessageDialog(null,"Sorry, too high!! Try again!");
			}
			
			// 9. if the guess is low
				// 10. tell them it's too low
			else if (stringAsInt<random){
				JOptionPane.showMessageDialog(null,"Too Low! Try Again!!");
			}

		// 12. tell them they lose
		}	
	}


}




