import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
	String Pet = JOptionPane.showInputDialog("What pet do you want to buy? Pick only one pet.");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int j = 0; j < 4; j++){
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Do you want to...", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed/Give Water", "Take a Walk", "Groom Fur"}, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0){
				cuddle();
			}
			else if (task == 1){
				feedGetWater();
			}
			else if (task == 2){
				walk();
			}
			else{
				groom();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void cuddle(){
		JOptionPane.showMessageDialog(null, "I love cuddling!!");
		happinessLevel ++;
	}
	static void feedGetWater(){
		JOptionPane.showMessageDialog(null,  "Thank you!");
		happinessLevel ++;
	}
	static void walk(){
		JOptionPane.showMessageDialog(null, "YAY!");
		happinessLevel ++;
	}
	static void groom(){
		JOptionPane.showMessageDialog(null, "That feels good!");
		happinessLevel ++;
	}
}
