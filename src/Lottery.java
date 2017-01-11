import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
String s = "Winning numbers are...";
for(int j = 0; j<5; j++ ){
	int random = new Random().nextInt(50) + 1;
	s += random + " ";
	
}
	JOptionPane.showMessageDialog(s);
}
}
