import javax.swing.JOptionPane;

public class LetterGrade {
public static void main(String[] args) {
String score = JOptionPane.showInputDialog("What was your test score 0-100?");
	int scoreINT = Integer.parseInt(score);
	if(scoreINT <= 100 && scoreINT >= 93){
		JOptionPane.showMessageDialog(null, "You got an A!");
		
	}
	else if(scoreINT >= 90){
		JOptionPane.showMessageDialog(null, "Yoy got an A-!");
	}
	else if(scoreINT >= 87 && scoreINT >= 89){
		JOptionPane.showMessageDialog(null, "You got a B+");
	}
	else if(scoreINT >= 83){
		JOptionPane.showMessageDialog{
			JOptionPane.showMessageDialog(null, "You got a B!");
		}
		else{
			JOptionPane.showMessageDialog(null, "You FAILED!!");

		}
	}
}
}
