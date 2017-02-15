import javax.swing.JOptionPane;

public class NintyNineBottles {
	public static void main(String[] args) {
		for (int j = 99; j > 0; j--) {
			JOptionPane.showMessageDialog(null, j+ " bottles of coke on the wall." +j+ " bottles of coke. Take one down and pass it around " +(j-1)+" bottles of coke on the wall");
		}
	}
}
