import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			Robot rob = new Robot();
			// 3. ask the user what color they would like the Robot to draw
			String Color = JOptionPane.showInputDialog("Would you like the color to be pink or blue?");
			// 4. use an if/else statement to set the pen color that the user
			// requested (minimum of 2 colors)
			if (Color.equals("pink")) {
				rob.setPenColor(java.awt.Color.pink);
			} else if (Color.equals("blue")) {
				rob.setPenColor(java.awt.Color.blue);
			} else {
				JOptionPane.showMessageDialog(null, "Pick a real color.");
			}

			// 2. set the pen width to 10
			rob.setPenWidth(10);
			// 1. make the Robot draw a shape
			rob.setSpeed(10);
			rob.penDown();
			for (int i = 0; i < 4; i++) {
				rob.move(200);
				rob.turn(90);
			}
		}

	}

}
