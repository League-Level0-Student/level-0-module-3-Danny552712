package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy{
	public static void main(String[] args) {	
		
	int completeLoop = 0;
	while(completeLoop < 1) {
	
	//First Message
	int firstAnswer = JOptionPane.showInternalConfirmDialog(null, "Are you happy?");
	System.out.print(firstAnswer);
		
	//Second Question
	if(firstAnswer == 2) {
		JOptionPane.showMessageDialog(null, "Choose another answer");
	} else if(firstAnswer == 0) {
		JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
		completeLoop++;
	} else if (firstAnswer == 1) {
		int secondAnswer = JOptionPane.showInternalConfirmDialog(null, "Do you want to be happy?");
	if (secondAnswer == 2) {
		JOptionPane.showMessageDialog(null, "Choose another answer");
	} else if(secondAnswer == 0) {
			JOptionPane.showMessageDialog(null, "Then change something.");
			completeLoop++;
		} else if (secondAnswer == 1) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
			completeLoop++;
		}
	}
	}
	
	
}
}