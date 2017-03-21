import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		for (int j = 0; j < 20; j++) {
			int Start = JOptionPane.showOptionDialog(null,
					"You are walking on a path alone on one of the paths there is a pack on wolves waiting for you.  The other path will lead you forward. Choose your path wisely.",
					"Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Left Path", "Right Path" },
					null);
			if (Start == 0) {
				int Left = JOptionPane.showOptionDialog(null,
						"You went the wrong way! You encountered the pack of wolves. You can either defend yourself or run.",
						"Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Run", "Fight", }, null);
				if (Left == 0) {
				JOptionPane.showMessageDialog(null,"Good choice. You sucsessfully got away from the wolves! ");
				}
				else if(Left ==1){
					JOptionPane.showMessageDialog(null, "You tried to fight but failed. There were too many wolves. Sorry, but you died.");
					break;
				}
			} else if (Start == 1) {
				int Right = JOptionPane.showOptionDialog(null,
						"Nice Choice! Now you reach another fork in the road. The road stright ahead is sunny and bright while the road directly to your left is dark and scary. One road will bring you forward. Be smart with your choice.",
						"Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Sunny road ahead", "Dark road to the left", }, null);
				if(Right == 0){
					JOptionPane.showMessageDialog(null, "Sorry but bees attack you and you die from being stung so many times.");
					break;
				}
				else{
					JOptionPane.showMessageDialog(null, "Suprisingly, you sucsessfully got through the dark and scary road.");
					break;
				}

			}
		}
	}
}
