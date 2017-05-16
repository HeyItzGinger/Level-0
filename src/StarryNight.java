import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.PenColors;

public class StarryNight {
	// 1. Create a new Robot.
	Robot star = new Robot();

	public StarryNight() {
		// 2. Using your robot name, print the window width and height to the console
		//    robotname.getWindow().getWidth(), robotname.getWindow().getHeight()
		System.out.println(star.getWindow().getWidth() + " " + star.getWindow().getHeight());
		// 3. Set the robot's speed to draw FAST!
		star.setSpeed(10);
		// 10. Do steps 7, 8 and 9 100 times.
		
			// 7. Move your robot to a random position using the method created
//     in step 5. Use the random method to get the new X and Y positions.
			//    The syso in step 2 should help you determine how big your canvas is.
		XY(1000, 100);
			// 8. Set your robot pen color to be random, using the method 
//      created in step 6.

			// 9. Draw a star by calling your method created in step 4.
			//    Use the random method to make the size of your star random.
		drawStar(100);

		// 11. Hide your robot so that you can see your beautiful starry sky!!
	}

	// 4. Create a method that draws a star. It should have an int parameter 
	//    that determines the size of the star.
	//    Hint: 144 degrees
	public void drawStar(int length){
		for(int i = 0; i<5; i++){
			star.penDown();
			star.move(length);
			star.turn(144);
		}	
	}
	
	// 5. Create a method that moves the robot using setX and setY.
	//    The method should have 2 int parameters for the X and Y position.
public void XY (int x, int y){
	star.setX(x);
	star.setY(y);
}

	// 6. Create a method that RETURNS a random number.
	//    The method should have 2 int parameters for the minimum and maximum values
//     of the random number.
public int randomNum(){
	int ran = new Random().nextInt(100);
	return ran;
}
	
	public static void main(String[] args) {
		StarryNight night = new StarryNight();
		night.drawStar(100);
		
	}
}


