// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		
		
		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int answer1 = JOptionPane.showConfirmDialog(null, "Is it a weekday?" );
		if(JOptionPane.YES_OPTION == answer1){
			int answer2 = JOptionPane.showConfirmDialog(null, "Are you on vacation?");
			
			if(JOptionPane.YES_OPTION == answer2){
				JOptionPane.showMessageDialog(null, "Sleep in!");
			}
			
			else{
				JOptionPane.showMessageDialog(null, "GET UP LAZY BONES!!!!");
			}
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Sleep in!");
		}

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}

