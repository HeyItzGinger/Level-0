import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String Cat = JOptionPane.showInputDialog("How many cats do ya'll have?");
		// 2. Convert their answer into an int
		int catAsInt = Integer.parseInt(Cat);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
		if (catAsInt > 3){
			JOptionPane.showMessageDialog(null, "You're a CRAZY CAT LADY! (Though I would like to have more >:3) ");
		}
		// 4. If they have 3 or less, call the method below to show them a cat
		// video
		if (catAsInt < 3){
			playVideo("https://www.youtube.com/watch?v=Djyc-acnhCY");
		}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like
		// a Human
		if (catAsInt == 0){
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
