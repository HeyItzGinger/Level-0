
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		for(int j=0; j<10; j++){
		//1. ask the user if they like bananas
		String Banana = JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
		if (Banana.equals("no")){
			//tell them they are crazy
			JOptionPane.showMessageDialog(null, "You're crazy!!");
		
			//and end quiz
		break;
		}
		//3. if they say yes
		else if(Banana.equals("yes")){
		//	ask them what is their favorite hobby
			String Hobby = JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, Hobby + " is much better with bananas!!");
		}
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes” or “no”
		else{
		//	show a pop up that says “You are bananas!”
			JOptionPane.showMessageDialog(null, "You're Bananas!!");
		}
			
			
		}
	
	}

}
