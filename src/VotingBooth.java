import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int ageAsINT = Integer.parseInt(age);
	if(ageAsINT < 11){
		JOptionPane.showMessageDialog(null, "HEY! Sorry you're too young to vote!!");
	}
	else{
		JOptionPane.showInputDialog("Who do you vote for President? Donald Trump or Hillary Clinton?");
	}
}
}
