
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
		for(int e = 0; 0<3; e++){
		Tortoise.setSpeed(10);
		// 3. Make a variable to hold the number of sides and set it to 0
		int numSides = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or
		// pentagon)
		String shape = JOptionPane.showInputDialog("What do you want to spiral? A square, triangle or pentagon?");
		// 5. Set the number of sides depending on what the user entered
		// (multiple lines of code)
		if(shape.equals("square")){
			numSides = 4;
		}
		else if(shape.equals("triangle")){
			numSides = 3;
		}
		else if(shape.equals("pentagon")){
			numSides = 5;
		}
		// 6. If the user enters something else, say "Sorry, I don't know how to
		// draw a ..."

		// 1. Make the Tortoise draw a square spiral shape. If you get stuck,
		// use these instructions: http://bit.ly/YJUOkn
		drawShape(numSides);

		// 2. Change your code to turn the square spiral into a triangle spiral
		}
	}

	public static void drawShape(int numSides) {
		for (int i = 0; i < 80; i++) {
			Tortoise.move(4 * i);
			Tortoise.turn(360 / numSides);
		
		}
	}
}
