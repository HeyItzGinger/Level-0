

	// Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;
	import java.awt.Color;
	import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

	public class Tortoise_Color_Chooser {
		public static void main(String[] args) {

			//3. ask the user what color they would like the tortoise to draw
			String name = JOptionPane.showInputDialog("Pick a color.");
			//4. use an if/else statement to set the pen color that the user requested
if(name.equals("pink")){
	Tortoise.setPenColor(Color.pink);	
}
else if(name.equals("yellow")){
    Tortoise.setPenColor(Color.yellow);
}
else if(name.equals("green")){
    Tortoise.setPenColor(Color.green);
}
	//5. if the user doesn’t enter anything, choose a random color
else{ 
	Tortoise.setPenColor(PenColors.getRandomColor());
	
}
	

	//6. put a loop around your code so that you keep asking the user for more colors & drawing them
			
			//2. set the pen width to 10
			Tortoise.setPenWidth(10);
		    Tortoise.setSpeed(10);
		//1. make the tortoise draw a shape (this will take more than one line of code)
for(int shape = 0; shape < 5; shape ++){

	Tortoise.penDown(); 
	Tortoise.move(100);
	Tortoise.turn(360/5);
	
}

		}
	}





