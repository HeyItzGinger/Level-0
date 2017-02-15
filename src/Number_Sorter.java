import javax.swing.JOptionPane;

public class Number_Sorter {
	public static void main(String[] args) {

		String Num1 = JOptionPane.showInputDialog("Pick a number.");
		String Num2 = JOptionPane.showInputDialog("Pick a second number.");
		String Num3 = JOptionPane.showInputDialog("Pick a third number.");

		int a = Integer.parseInt(Num1);
		int b = Integer.parseInt(Num2);
		int c = Integer.parseInt(Num3);

		if ((a < b) && (a < c)) {
			System.out.println(a);
			if ((b < c)) {
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(b);
			}
		}
		if ((b < a) && (b < c)) {
			System.out.println(b);
			if((a<c)){
				System.out.println(a);
				System.out.println(c);
			}
			else{
				System.out.println(c);
				System.out.println(a);
			}
		}
		if ((c < a) && (c < b))

		{
			System.out.println(c);
			if((b<a)){
				System.out.println(b);
				System.out.println(a);
			}
			else{
				System.out.println(a);
				System.out.println(b);
			}
		}

	}
}
