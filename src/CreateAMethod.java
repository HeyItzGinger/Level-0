import javax.swing.JOptionPane;

public class CreateAMethod {
public static void main(String[] args) {
	name();
	age(11);
	mult(4, 3);
}
static void name(){
	String WhatsYourName = JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null,WhatsYourName + " is a cool name!");
}
static void age(int YourAge){
		JOptionPane.showMessageDialog(null, "You were born in " + (2017 - YourAge));
		
}
static void mult(int j, int o){
	JOptionPane.showMessageDialog(null, j +" times " + o +" equals " + (j*o));
	
}
}
