
// Copyright Wintriss Technical Schools 2014
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge.
 */

public class TortoiseWalkOfFame {

	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		for (int h = 1; h < 1000; h+= 1) {
			// 1. Set the X position of the Tortoise so that it starts on the
			// left. You also need to show the Tortoise to see the result of
			// this line.
			Tortoise.setX(h);
			Tortoise.setPenColor(Colors.getRandomColor());
			
			Tortoise.show();
			// 2. Make the Tortoise draw a star shape. Hint: 144.
			for (int j = 5; j > 0; j--) {
				Tortoise.turn(144);
				Tortoise.move(100);
			}
			// 3. Set the size of the star to 30.

			/** THE CHALLENGE: **/
			/*
			 * Make the Tortoise draw a line of stars like this:
			 * http://bit.ly/walk-of-fame
			 * 
			 * Hint: The distance between stars is 50.
			 */
			
		}
	}

}
