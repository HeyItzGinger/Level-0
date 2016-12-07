import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.show();
		Tortoise.penDown();
		drawSquare();
		drawTriangle();
		drawCircle();
		drawShape(1);
	}

	static void drawSquare() {
		for (int square = 0; square < 4; square++) {
			Tortoise.move(50);
			Tortoise.turn(360/4);
		}
	}
	static void drawTriangle() {
		for(int triangle = 0; triangle <3; triangle++){
			Tortoise.move(50);
			Tortoise.turn(360/3);
			
		}
	}
	static void drawCircle() {
		for(int circle = 0; circle<360; circle++){
			Tortoise.move(1);
			Tortoise.turn(360/360);
		}
	}
	static void drawShape(int numSides) {
		for(int shape = 0; shape < numSides; shape++){
			Tortoise.move(2);
		Tortoise.turn(360/numSides);
		}
	}
}
