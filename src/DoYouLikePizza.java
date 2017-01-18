import javax.swing.JOptionPane;

public class DoYouLikePizza {
	public static void main(String[] args) {
		String likesPizza = JOptionPane.showInputDialog("Do you like pizza?");
		if (likesPizza.equals("yes")) {
			// Green!
			String pepperoni = JOptionPane.showInputDialog("Do you like pepperoni on your pizza?");
			if (pepperoni.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Enjoy your pepperoni pizza!");
			} else if (pepperoni.equals("no")) {
				JOptionPane.showMessageDialog(null, "Enjoy your cheese pizza!");
			}
		} else {
			// Purple!
			String salad = JOptionPane.showInputDialog("Then do you like salad?");
			if(salad.equals("yes")){
				JOptionPane.showMessageDialog(null, "Enjoy your salad!");
			}
			else{
				JOptionPane.showMessageDialog(null, "Then go hungry!");
			}
		}
	}
}
