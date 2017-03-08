import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String num1 = JOptionPane.showInputDialog("Pick a number.");
		String num2 = JOptionPane.showInputDialog("Pick another number.");
		int num1INT = Integer.parseInt(num1);
		int num2INT = Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide
		// operations.
		int operation = JOptionPane.showOptionDialog(null, "Do you want to...", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" }, null);

		// 5. Call the methods created in steps 3 and 4 to perform the
		// appropriate operation.
		if(operation == 0){
			add(num1INT, num2INT);
		}
		else if (operation == 1){
			subtract(num1INT, num2INT);
		}
		else if (operation == 2){
			multiply(num1INT, num2INT);
		}
		else{
			divide(num1INT, num2INT);
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator
		// operations
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25
	// = 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static void add (int j, int o){
		JOptionPane.showMessageDialog(null, j +" + " + o + " = " + (j+o));
	}
	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract (int a, int d){
		JOptionPane.showMessageDialog(null, a + " - " + d + " = " + (a-d));
	}
	static void multiply (int g, int w){
		JOptionPane.showMessageDialog(null, g + " x " + w + " = " + (g*w));
	}
	static void divide (int s, int c){
		JOptionPane.showMessageDialog(null, s + " / " + c + " = " +(s/c));
	}
}
