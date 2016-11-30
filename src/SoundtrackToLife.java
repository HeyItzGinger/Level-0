
import java.net.URI;


import javax.swing.JOptionPane;


public class SoundtrackToLife {


	public static void main(String[] args) {


		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "Choose Wiseley..", "Step One", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "0", "1", "2" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
		JOptionPane.showMessageDialog(null, "Are you sure you want to choose " +  userMood );

		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
		if(userMood == 2){
			JOptionPane.showMessageDialog("You're Stressed. Here's something that may help you..");
	
		}

		// 4. Play different songs for other moods.
		else if(userMood == 1){
			JOptionPane.showMessgaeDialog(null, "You're Happy!");
		}
		else if(userMood == 0){
			JOptionPane.showMessageDialog(null, "You don't know what to do with yourself!")

		// If you are seeing ads at the beginning of your videos, install Adblock.


	}


	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}







/**
* If you can’t think of any, here are some you can use...
*	bit.ly/video-for-happy
*	bit.ly/video-for-sad
*	bit.ly/video-for-angry
**/


