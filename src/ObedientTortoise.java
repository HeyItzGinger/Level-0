import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.penDown();
		drawSquare();
	}

	static void drawSquare() {
		for (int square = 0; square < 4; square++) {
			Tortoise.move(50);
			Tortoise.turn(90);
		}
	}
}
